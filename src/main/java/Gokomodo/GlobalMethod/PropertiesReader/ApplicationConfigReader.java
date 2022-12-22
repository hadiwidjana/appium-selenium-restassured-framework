package Gokomodo.GlobalMethod.PropertiesReader;

import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.asserts.SoftAssert;
import ru.qatools.properties.Property;
import ru.qatools.properties.PropertyLoader;
import ru.qatools.properties.Resource;

import java.awt.*;
import java.io.File;
import java.net.URI;


@Resource.Classpath("ApplicationConfig.properties")
public class ApplicationConfigReader 
{

	public static ApplicationConfigReader appConfig = new ApplicationConfigReader();
	
	public ApplicationConfigReader()
	{
		PropertyLoader.newInstance().populate(this);
	}


	//========================================================================//
	//================================ Account ===============================//
	//========================================================================//

	//Buyer
	@Property(value = "UsrNausee")
	private String UsrNausee;
	public String getUsrNauseee1(){return UsrNausee;}
	public static String usrNausee = appConfig.getUsrNauseee1();

	@Property(value = "UsrNausee5")
	private String userNausee5;
	public String getUserNausee5(){return userNausee5;}
	public static String Usrnausee5 = appConfig.getUserNausee5();

	@Property(value = "Usrcommerce1")
	private String Usrcommerce1;
	public String getUserCommerce1(){return Usrcommerce1;}
	public static String usrcommerce1 = appConfig.getUserCommerce1();

	@Property(value = "Production1")
	private String production1;
	public String getProduction1() {return production1;}

	@Property(value = "BuyerIntegration")
	private String BuyerIntegration;
	public String getBuyerIntegration() {return BuyerIntegration;}
	@Property(value = "BuyerIntegrationBifrost2")
	private String BuyerIntegrationBifrost2;
	public String getBuyerIntegrationBifrost2() {return BuyerIntegrationBifrost2;}
	@Property(value = "BuyerIntegrationBifrost")
	private String BuyerIntegrationBifrost;
	public String getBuyerIntegrationBifrost () {return BuyerIntegrationBifrost;}


	//Seller
	@Property(value = "UsrSeller")
	private String UsrSeller;
	public String getUsrSeller(){return UsrSeller;}
	public static String usrSeller = appConfig.getUsrSeller();

	@Property(value = "UsrSeller2")
	private String UsrSeller2;
	public String getUsrSeller2(){return UsrSeller2;}
	public static String usrSeller2 = appConfig.getUsrSeller2();

	@Property(value = "SellerProd1")
	private String sellerprod1;
	public String getSellerprod1(){return sellerprod1;}

	@Property(value = "SellerIntegrationBifrost")
	private String SellerIntegrationBifrost;
	public String getSellerIntegrationBifrost() {return SellerIntegrationBifrost;}

	@Property(value = "SellerIntegration")
	private String SellerIntegration;
	public String getSellerIntegration() {return SellerIntegration;}

	//Admin
	@Property(value = "AdminArum")
	private String userAdmin;
	public String getUserAdmin() { return userAdmin;}
	public static String UserAdmin = appConfig.getUserAdmin();

	@Property(value = "AdminDeny")
	private String userAdmin2;
	public String getUserAdmin2() {return userAdmin2;}
	public static String UserAdmin2 = appConfig.getUserAdmin2();


	//Password
	@Property(value = "Password")
	private String Password;
	public String getPasswordAccount() {return Password;}
	public static String PasswordAccount =appConfig.getPasswordAccount();

	@Property(value = "PasswordProd")
	private String passwordProd;
	public String getPasswordProd(){return passwordProd;}
	@Property(value = "passwordProdSeller1")
	private String passwordprodseller1;
	public String getPasswordprodseller1(){return passwordprodseller1;}
	@Property(value = "Password2")
	private String passAdmin2;
	public String getPassAdmin2() {return passAdmin2;}
	public static String PassAdmin2 = appConfig.getPassAdmin2();




	//========================================================================//
	//================================= URL ==================================//
	//========================================================================//

	//Buyer
	@Property(value="UrlBuyer")
	private String WebsiteUrlBuyer;
	public String getWebsiteUrlBuyer() {
		return WebsiteUrlBuyer;
	}
	public static String WebsiteURLBuyer = appConfig.getWebsiteUrlBuyer();

	@Property(value = "IntegrationUrlBuyer")
	private String IntegrationUrlBuyer;
	public String getIntegrationUrlBuyer() {return IntegrationUrlBuyer;}

	//Seller
	@Property(value = "IntegrationUrlSeller")
	private String IntegrationUrlSeller;
	public String getIntegrationUrlSeller() {return IntegrationUrlSeller;}

	@Property(value="UrlSeller")
	private String WebsiteUrlSeller;
	public String getWebsiteUrlSeller() {
		return WebsiteUrlSeller;
	}
	public static String WebsiteURLSeller = appConfig.getWebsiteUrlSeller();

	//Admin
	@Property(value="UrlAdmin")
	private String WebsiteUrlAdmin;
	public String getWebsiteUrlAdmin() {
		return WebsiteUrlAdmin;
	}
	public static String WebsiteURLAdmin = appConfig.getWebsiteUrlAdmin();


	//========================================================================//
	//========================== Browser Selection ===========================//
	//========================================================================//
	@Property(value = "Browser")
	private String Browser;
	public String getBrowser() {return Browser;}
	public static String browser = appConfig.getBrowser();



	//========================================================================//
	//============================== Utilities ===============================//
	//========================================================================//
	@Property(value="MaxPageLoadTime")
	private int MaxPageLoadTime;
	public int getMaxPageLoadTime() {
		return MaxPageLoadTime;
	}
	public static int maxPageLoadTime = appConfig.getMaxPageLoadTime();

	@Property(value="ImplicitlyWait")
	private int ImplicitlyWait;
	public int getImplicitlyWait() {
		return ImplicitlyWait;
	}
	public static int implicitlyWait = appConfig.getImplicitlyWait();

	@Property(value="VideoFeature")
	private String VideoFeature;
	public String getVideoFeature() {
		return VideoFeature;
	}
	public static String videoFeature = appConfig.getVideoFeature();

	public static String FS = File.separator;

	//Get Environment
	public static String OSName = System.getProperty("os.name");
	public static String OSArchitecture = System.getProperty("os.arch");
	public static String OSVersion = System.getProperty("os.version");
	public static String OSBit = System.getProperty("sun.arch.data.model");
	public static String ProjectWorkingDirectory = System.getProperty("user.dir");

	//File Location
	public static String ExcelFiles = "./src/test/resources/Excel Files/";
	public static String TestData = "./src/test/resources/TestData/";
	public static String PropertiesFiles = "./src/test/resources/Properties Files";
	public static String Reports = "./src/test/resources/Reports";
	public static String srcRFQTemplate = "./src/test/resources/Excel Files/komodo-rfq-excel-template.xlsx";
    public static String srcImg = "./src/test/resources/Excel Files/foto.jpg";

	//Global Variable
	public static Robot re;
	public static Alert al;
	public static String robotImageName;
	public static Select se;
	public static String FileToUpload;
	public static Actions ac;
	public static ITestResult testResult;
	public static SoftAssert softAssert;
	public static ITestResult result;
	public static URI uri;
	public static String getURL;
	public static String appSelect;


	//========================================================================//
	//============================== Attachment ==============================//
	//========================================================================//
	//Alam
	@Property(value = "Attachment1Eproc")
	private String Attachment1Eproc;
	public String getAttachemntEproc1() {return Attachment1Eproc;}
	public static String AttachemntEproc1 = appConfig.getAttachemntEproc1();

	@Property(value = "Attachment1Corpcomm")
	private String Attachment1Corpcomm;
	public String getAttachment1Corpcomm() {return Attachment1Corpcomm;}
	public static String AttachmentCorpcomm1 = appConfig.getAttachment1Corpcomm();


	@Property(value = "Attachment1Foto")
	private String AttachemntFoto1;
	public String getAttachemntFoto1() {return AttachemntFoto1;}
	public static String AttachemntImg1 = appConfig.getAttachemntFoto1();


	//Iwan
	@Property(value = "Attachment2Eproc")
	private String Attachment2Eproc;
	public String getAttachemntEproc2() {return Attachment2Eproc;}
	public static String AttachemntEproc2 = appConfig.getAttachemntEproc2();


	@Property(value = "Attachment2Corpcomm")
	private String Attachment2Corpcomm;
	public String getAttachemntCorpcomm2() {return Attachment2Corpcomm;}
	public static String AttachemntCorpcomm2 = appConfig.getAttachemntCorpcomm2();

	@Property(value = "Attachment2Foto")
	private String AttachemntFoto2;
	public String getAttachemntFoto2() {return AttachemntFoto2;}
	public static String AttachemntImg2 = appConfig.getAttachemntFoto2();


	//========================================================================//
	//================================ Mobile ================================//
	//========================================================================//

	@Property(value = "AppiumURL")
	private String AppiumURL;
	public String getAppiumURL() { return AppiumURL;}
	public static String appiumURL = appConfig.getAppiumURL();

	//Android
	@Property(value = "AndroidDeviceName")
	private String AndroidDeviceName;
	public String getAndroidDeviceName() {return AndroidDeviceName;}
	public static String androidDeviceName = appConfig.getAndroidDeviceName();

	@Property(value = "AndroidUDID")
	private String AndroidUDID;
	public String getAndroidUDID() {return AndroidUDID;}
	public static String androidUDID = appConfig.getAndroidUDID();

	@Property(value = "AndroidAutomationName")
	private String AndroidAutomationName;
	public String getAndroidAutomationName() {return AndroidAutomationName;}
	public static String androidAutomationName = appConfig.getAndroidAutomationName();

	@Property(value = "AndroidBuyerAppPackage")
	private String AndroidBuyerAppPackage;
	public String getAndroidBuyerAppPackage() {return AndroidBuyerAppPackage;}
	public static String androidBuyerAppPackage = appConfig.getAndroidBuyerAppPackage();

	@Property(value = "AndroidBuyerAppActivity")
	private String AndroidBuyerAppActivity;
	public String getAndroidBuyerAppActivity() {return AndroidBuyerAppActivity;}
	public static String androidBuyerAppActivity = appConfig.getAndroidBuyerAppActivity();

	@Property(value = "AndroidBuyerAppName")
	private String AndroidBuyerAppName;
	public String getAndroidBuyerAppName(){return AndroidBuyerAppName;}
	public static String androidBuyerAppName = appConfig.getAndroidBuyerAppName();

	@Property(value = "AndroidSellerAppPackage")
	private String AndroidSellerAppPackage;
	public String getAndroidSellerAppPackage() {return AndroidSellerAppPackage;}
	public static String androidSellerAppPackage = appConfig.getAndroidSellerAppPackage();

	@Property(value = "AndroidSellerAppActivity")
	private String AndroidSellerAppActivity;
	public String getAndroidSellerAppActivity() {return AndroidSellerAppActivity;}
	public static String androidSellerAppActivity = appConfig.getAndroidSellerAppActivity();

	@Property(value = "AndroidSellerAppName")
	private String AndroidSellerAppName;
	public String getAndroidSellerAppName(){return AndroidSellerAppName;}
	public static String androidSellerAppName = appConfig.getAndroidSellerAppName();

	@Property(value = "AndroidAppLocation")
	private String AndroidAppLocation;
	public String getAndroidAppLocation(){return AndroidAppLocation;}
	public static String androidAppLocation = appConfig.getAndroidAppLocation();

	@Property(value = "AndroidHeadless")
	private String AndroidHeadless;
	public String getAndroidHeadless(){ return AndroidHeadless;}
	public static String androidHeadless = appConfig.getAndroidHeadless();

	//IOS

	@Property(value = "IOSDeviceName")
	private String IOSDeviceName;
	public String getIOSDeviceName(){return IOSDeviceName;}
	public static String iOSDeviceName = appConfig.getIOSDeviceName();

	@Property(value = "IOSUDID")
	private String IOSUDID;
	public String getIOSUDID() {return IOSUDID;}
	public static String iOSUDID = appConfig.getIOSUDID();

	@Property(value = "IOSAutomationName")
	private String IOSAutomationName;
	public String getIOSAutomationName() {return IOSAutomationName;}
	public static String iOSAutomationName = appConfig.getIOSAutomationName();

	@Property(value = "IOSAppLocation")
	private String IOSAppLocation;
	public String getIOSAppLocation() {return IOSAppLocation;}
	public static String iOSAppLocation = appConfig.getIOSAppLocation();

	@Property(value = "IOSBuyerBundleId")
	private String IOSBuyerBundleId;
	public String getIOSBuyerBundleId() {return IOSBuyerBundleId;}
	public static String iOSBuyerBundleId = appConfig.getIOSBuyerBundleId();

	@Property(value = "IOSBuyerAppName")
	private String IOSBuyerAppName;
	public String getIOSBuyerAppName() {return IOSBuyerAppName;}
	public static String iOSBuyerAppName = appConfig.getIOSBuyerAppName();

	@Property(value = "IOSSellerBundleId")
	private String IOSSellerBundleId;
	public String getIOSSellerBundleId() {return IOSSellerBundleId;}
	public static String iOSSellerBundleId = appConfig.getIOSSellerBundleId();

	@Property(value = "IOSSellerAppName")
	private String IOSSellerAppName;
	public String getIOSSellerAppName() {return IOSSellerAppName;}
	public static String iOSSellerAppName = appConfig.getIOSSellerAppName();

	@Property(value = "IOSHeadless")
	private String IOSHeadless;
	public String getIOSHeadless() {return IOSHeadless;}
	public static String iOSHeadless = appConfig.getIOSHeadless();

	@Property(value = "IOSPlatformVersion")
	private String IOSPlatformVersion;
	public String getIOSPlatformVersion() {return IOSPlatformVersion;}
	public static String iOSPlatformVersion = appConfig.getIOSPlatformVersion();

}
