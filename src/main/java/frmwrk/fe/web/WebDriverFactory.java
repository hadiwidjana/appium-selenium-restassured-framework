package frmwrk.fe.web;

import frmwrk.globalmethod.utils.EnvironmentSetup;
import com.automation.remarks.video.enums.RecorderType;
import com.automation.remarks.video.enums.RecordingMode;
import com.automation.remarks.video.enums.VideoSaveMode;
import com.automation.remarks.video.recorder.VideoRecorder;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;


public class WebDriverFactory extends BrowserFactory {
    public static ThreadLocal<WebDriver> wd = new ThreadLocal<WebDriver>();





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

    public void setWebDriver(WebDriver driver) {
        wd.set(driver);
    }

    public static WebDriver getWebDriver() {
        return wd.get();
    }

//    @BeforeClass
//    public void beforeClass() {
//        //Set website URL
//        getURL = WebsiteURLSeller;
//    }

    @BeforeMethod
    public void beforeMethod() throws Exception {
//        System.out.println("Browser: " + browser);
//        System.out.println("WebsiteURL: " + WebsiteURLSeller);
        new WebDriverFactory();
        WebDriver driver = createDriver();
        setWebDriver(driver);

        if (videoFeature.toLowerCase().contains("enabledfailed")) {
            setupVideoRecordingFailedOnly();
        } else if (videoFeature.toLowerCase().contains("enabledall")) {
            setupVideoRecordingAll();
        }
    }

    @BeforeTest(alwaysRun = true)
    public static void suiteSetup() {
        switch (browser.toLowerCase()) {
            case "chrome":
            case "chrome_headless":
                WebDriverManager.chromedriver().setup();

//            case "opera":
//                WebDriverManager.operadriver().setup();
//                break;

            case "firefox":
            case "firefox_headless":
                WebDriverManager.firefoxdriver().arch64().setup();
                break;

            case "ie":
            case "internet explorer":
                WebDriverManager.iedriver().setup();
                break;

            case "edge":
                WebDriverManager.edgedriver().setup();
                break;

            case "safari":
                WebDriverManager.safaridriver();
                break;

            default:
                throw new NotFoundException("Browser Not Found. Please Provide a Valid Browser");
        }
    }

    @AfterTest
    public void afterTest() throws Exception
    {
        EnvironmentSetup.environmentSetup();
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod() throws Exception {
        Thread.sleep(2000);
        getWebDriver().quit();
    }
}
