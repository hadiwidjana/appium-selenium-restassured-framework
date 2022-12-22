package Gokomodo.FE.Mobile.LoginManager.Buyer.tests;

import Gokomodo.FE.Mobile.LoginManager.Buyer.pageObjects.MobileBuyerLoginPage;
import Gokomodo.FE.Mobile.MobileDriverFactory;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.qameta.allure.Description;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class MobileLoginBuyer extends MobileDriverFactory{
    @BeforeClass
    public void beforeClass() {
        //Select APP
        appSelect = "buyer";
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), MobileBuyerLoginPage.class);

    }


    @Description("Login Test")
    @Test(description = "Mobile buyer login test")
    public void mobileBuyerLogin() throws InterruptedException {
        MobileBuyerLoginPage mobileBuyerLoginPage = new MobileBuyerLoginPage();
        mobileBuyerLoginPage.InputEmail().InputPassword().pressLoginButton();
    }

}
