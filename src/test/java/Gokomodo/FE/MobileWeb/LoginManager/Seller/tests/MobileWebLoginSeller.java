package Gokomodo.FE.MobileWeb.LoginManager.Seller.tests;


import Gokomodo.FE.MobileWeb.LoginManager.Seller.pageObjects.initializePageObjects.MobileWebSellerPageLoginInitializer;
import io.qameta.allure.Description;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class MobileWebLoginSeller extends MobileWebSellerPageLoginInitializer {


    @Description("Login Test")
    @Test(description = "Mobile seller web login Test")
    public void validUserName() {
        LoginPageTest().InputEmail().InputPassword().pressLoginButton();
    }
}
