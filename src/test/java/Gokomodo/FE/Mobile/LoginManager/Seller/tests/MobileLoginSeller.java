package Gokomodo.FE.Mobile.LoginManager.Seller.tests;

import Gokomodo.FE.Mobile.LoginManager.Buyer.pageObjects.MobileBuyerLoginPage;
import Gokomodo.FE.Mobile.LoginManager.Seller.pageObjects.MobileSellerLoginPage;
import Gokomodo.FE.Mobile.MobileDriverFactory;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.qameta.allure.Description;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class MobileLoginSeller extends MobileDriverFactory {

    @BeforeClass
    public void beforeClass() {
        //Select APP
        appSelect = "seller";
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), MobileBuyerLoginPage.class);

    }

    @Description("Login Test")
    @Test(description = "Mobile seller login test")
    public void mobileSellerLogin() {
        MobileSellerLoginPage mobileSellerLoginPage = new MobileSellerLoginPage();
        mobileSellerLoginPage.InputEmail().InputPassword().pressLoginButton();
    }
}
