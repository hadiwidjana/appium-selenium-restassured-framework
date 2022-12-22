package Gokomodo.FE.MobileWeb.LoginManager.Admin.tests;


import Gokomodo.FE.MobileWeb.LoginManager.Admin.pageObjects.initializePageObjects.MobileWebAdminPageLoginInitializer;
import io.qameta.allure.Description;
import org.testng.annotations.Test;


public class MobileWebLoginAdmin extends MobileWebAdminPageLoginInitializer {

    @Description("Login Test")
    @Test(description = "Mobile web admin login test")
    public void mobileWebAdminLogin() {
        LoginPageTest().InputEmail().InputPassword().pressLoginButton();
    }
}
