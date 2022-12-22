package frmwrk.fe.web.tests;

import frmwrk.fe.web.WebDriverFactory;
import frmwrk.fe.web.pageobjects.BuyerLoginPage;
import io.qameta.allure.Description;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginBuyer extends WebDriverFactory {

    @BeforeClass
    public void beforeClass() {
        //Set website URL
        getURL = WebsiteURLBuyer;
    }

    @Description("Login Nausee1")
    @Test(description = "Login Nausee1")
    public void Testloginbuyer()throws Exception{
        BuyerLoginPage buyerLoginPage = new BuyerLoginPage();
        buyerLoginPage.InputEmail().InputPassword().btnLogin();
    }




}
