package frmwrk.fe.mobile;

import frmwrk.globalmethod.propertiesreader.ApplicationConfigReader;
import frmwrk.globalmethod.utils.EnvironmentSetup;
import com.automation.remarks.video.enums.RecorderType;
import com.automation.remarks.video.enums.RecordingMode;
import com.automation.remarks.video.enums.VideoSaveMode;
import com.automation.remarks.video.recorder.VideoRecorder;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.URL;
import java.util.HashMap;


public class MobileDriverFactory extends ApplicationConfigReader {

    public static ThreadLocal<AppiumDriver> driver = new ThreadLocal<AppiumDriver>();

    protected static AppiumDriverLocalService server;
    private HashMap<String, String> environment;
    private DesiredCapabilities desiredCapabilities;

    public AppiumDriverLocalService getAppiumService() {
        environment = new HashMap<String, String>();
        environment.put("PATH", "/Library/Internet Plug-Ins/JavaAppletPlugin.plugin/Contents/Home/bin:/Users/"+System.getProperty("user.name")+"/Library/Android/sdk/tools:/Users/"+System.getProperty("user.name")+"/Library/Android/sdk/platform-tools:/usr/local/bin:/usr/bin:/bin:/usr/sbin:/sbin:/Library/Apple/usr/bin" + System.getenv("PATH"));
        environment.put("ANDROID_HOME", "/Users/"+System.getProperty("user.name")+"/Library/Android/sdk");
        return AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
                .usingDriverExecutable(new File("/usr/local/bin/node"))
                .withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js"))
                .usingPort(4723)
                .withArgument(GeneralServerFlag.SESSION_OVERRIDE)
                .withArgument(GeneralServerFlag.BASEPATH, "/wd/hub/")
                .withArgument(() -> "--allow-insecure", "chromedriver_autodownload")
                .withEnvironment(environment)
                .withLogFile(new File("ServerLogs/server.log")));
    }

    public boolean checkIfAppiumServerIsRunnning(int port) throws Exception {
        boolean isAppiumServerRunning = false;
        ServerSocket socket;
        try {
            socket = new ServerSocket(port);
            socket.close();
        } catch (IOException e) {
            System.out.println("1");
            isAppiumServerRunning = true;
        } finally {
            socket = null;
        }
        return isAppiumServerRunning;
    }
    public AppiumDriverLocalService getAppiumServerDefault() {
        return AppiumDriverLocalService.buildDefaultService();
    }


    public AppiumDriver getDriver() {
        return driver.get();
    }

    public void setDriver(AppiumDriver driver2) {
        driver.set(driver2);
    }

    @BeforeSuite
    public void beforeSuite() throws Exception {
        server = getAppiumService();
        if (!checkIfAppiumServerIsRunnning(4723)) {
            server.start();
            server.clearOutPutStreams();
        }
    }

    @BeforeMethod
    @Parameters({"platformName"})
    public void beforeMethod(String platformName) throws Exception {
        setDriver(createDriver(platformName));
        if (videoFeature.toLowerCase().contains("enabledfailed")) {
            setupVideoRecordingFailedOnly();
        } else if (videoFeature.toLowerCase().contains("enabledall")) {
            setupVideoRecordingAll();
        }
    }


    public AppiumDriver createDriver(String platformName) throws Exception {
        AppiumDriver driver;
        URL url;
        try {
            desiredCapabilities = new DesiredCapabilities();

            url = new URL(appiumURL);

            switch (platformName.toLowerCase()) {
                case "android_web":
                    desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, androidDeviceName);
                    desiredCapabilities.setCapability(AndroidMobileCapabilityType.AVD, androidDeviceName);
                    desiredCapabilities.setCapability(AndroidMobileCapabilityType.IS_HEADLESS, androidHeadless);
                    desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, androidAutomationName);
                    desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
                    desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID.toString());
                    driver = new AppiumDriver(url, desiredCapabilities);
                    driver.get(getURL);
                    break;
                case "android_app":
                    desiredCapabilities.setCapability(AndroidMobileCapabilityType.AVD, androidDeviceName);
                    desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, androidDeviceName);
                    desiredCapabilities.setCapability(AndroidMobileCapabilityType.IS_HEADLESS, androidHeadless);
                    desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, androidAutomationName);
                    desiredCapabilities.setCapability(MobileCapabilityType.UDID, androidUDID);
                    desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID.toString());
                    desiredCapabilities.setCapability(AndroidMobileCapabilityType.ANDROID_INSTALL_TIMEOUT, "600000");
                    File androidParentDirectoryPath = new File(androidAppLocation);
                    File androidAppUrl;
                    switch (appSelect){
                        case "buyer":
                            androidAppUrl = new File(androidParentDirectoryPath, androidBuyerAppName);
                            desiredCapabilities.setCapability(MobileCapabilityType.APP, androidAppUrl.getAbsolutePath());
                            desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, androidBuyerAppPackage);
                            desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, androidBuyerAppActivity);
                            break;
                        case"seller":
                            androidAppUrl = new File(androidParentDirectoryPath, androidSellerAppName);
                            desiredCapabilities.setCapability(MobileCapabilityType.APP, androidAppUrl.getAbsolutePath());
                            desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, androidSellerAppPackage);
                            desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, androidSellerAppActivity);
                            break;
                    }
                    driver = new AppiumDriver(url, desiredCapabilities);
                    break;
                case "ios_web":
                    desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, iOSDeviceName);
                    desiredCapabilities.setCapability(XCUITestOptions.IS_HEADLESS_OPTION,iOSHeadless);
                    desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, iOSAutomationName);
                    desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, iOSPlatformVersion);
                    desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Safari");
                    desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.IOS.toString());
                    driver = new IOSDriver(url, desiredCapabilities);
                    driver.get(getURL);
                    break;
                case "ios_app":
                    desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, iOSDeviceName);
                    desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, iOSAutomationName);
                    desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, iOSPlatformVersion);
                    desiredCapabilities.setCapability(MobileCapabilityType.UDID, iOSUDID);
                    desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.IOS.toString());
                    File iOSParentDirectoryPath = new File(iOSAppLocation);
                    File iOSAppUrl;
                    switch (appSelect){
                        case "buyer":
                            iOSAppUrl = new File(iOSParentDirectoryPath, iOSBuyerAppName);
                            desiredCapabilities.setCapability(MobileCapabilityType.APP, iOSAppUrl.getAbsolutePath());
                            desiredCapabilities.setCapability(IOSMobileCapabilityType.BUNDLE_ID, iOSBuyerBundleId);
                            break;
                        case "seller":
                            iOSAppUrl = new File(iOSParentDirectoryPath, iOSSellerAppName);
                            desiredCapabilities.setCapability(MobileCapabilityType.APP, iOSAppUrl.getAbsolutePath());
                            desiredCapabilities.setCapability(IOSMobileCapabilityType.BUNDLE_ID, iOSSellerBundleId);
                            break;
                    }
                    driver = new IOSDriver(url, desiredCapabilities);
                    break;
                default:
                    throw new Exception("Invalid platform! - " + platformName);
            }
        } catch (Exception e){throw e;}
        return driver;
    }



    public void setupVideoRecordingFailedOnly() {
        VideoRecorder.conf()
                .withVideoFolder("./src/test/resources/Videos")                         // Default is ${user.dir}/video.
                .videoEnabled(true)                                                     // Disabled video globally
                .withVideoSaveMode(VideoSaveMode.FAILED_ONLY)                           // Save videos ONLY FAILED tests
                .withRecorderType(RecorderType.MONTE)                                   // Monte is Default recorder
                .withRecordMode(RecordingMode.ALL);                                     // Record video only for tests with @Video
    }

    public void setupVideoRecordingAll() {
        VideoRecorder.conf()
                .withVideoFolder("./src/test/resources/Videos")                         // Default is ${user.dir}/video.
                .videoEnabled(true)                                                     // Disabled video globally
                .withVideoSaveMode(VideoSaveMode.ALL)                                   // Save videos All tests
                .withRecorderType(RecorderType.MONTE)                                   // Monte is Default recorder
                .withRecordMode(RecordingMode.ALL);                                     // Record video only for tests with @Video
    }


    @AfterMethod(alwaysRun = true)
    public void afterMethod() throws Exception {
        Thread.sleep(2000);
    }

    //Stop appium driver
    @AfterClass
    public void afterClass() {
        EnvironmentSetup.environmentSetup();
        getDriver().quit();
    }

    //Stop appium server
    @AfterSuite
    public void afterSuite() {
        server.stop();
    }
}
