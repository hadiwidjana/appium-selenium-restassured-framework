package frmwrk.fe.mobileweb.tests;


import frmwrk.fe.mobile.MobileDriverFactory;
import frmwrk.fe.mobileweb.pageobjects.MobileWebAdminLoginPage;
import io.qameta.allure.Description;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class MobileWebLoginAdmin extends MobileDriverFactory {

    @BeforeClass
    public void beforeClass() {
        //Set website URL
        getURL = WebsiteURLAdmin;
    }

    @Description("Login Test")
    @Test(description = "Mobile web admin login test")
    public void mobileWebAdminLogin() {
        MobileWebAdminLoginPage mobileWebAdminLoginPage = new MobileWebAdminLoginPage();
        mobileWebAdminLoginPage.InputEmail().InputPassword().pressLoginButton();
    }
}
