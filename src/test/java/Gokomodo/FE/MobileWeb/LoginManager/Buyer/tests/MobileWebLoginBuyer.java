package Gokomodo.FE.MobileWeb.LoginManager.Buyer.tests;



import Gokomodo.FE.MobileWeb.LoginManager.Buyer.pageObjects.initializePageObjects.MobileWebBuyerPageLoginInitializer;
import io.qameta.allure.Description;
import org.testng.annotations.Test;


public class MobileWebLoginBuyer extends MobileWebBuyerPageLoginInitializer {

    @Description("Login Test")
    @Test(description = "Mobile web admin login test")
    public void validUserName() {
        LoginPageTest().InputEmail().InputPassword().pressLoginButton();
    }
}
