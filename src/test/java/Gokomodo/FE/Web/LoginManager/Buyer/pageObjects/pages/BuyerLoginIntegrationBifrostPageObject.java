package Gokomodo.FE.Web.LoginManager.Buyer.pageObjects.pages;

import Gokomodo.FE.Web.BaseMethod;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Base64;

import static Gokomodo.BE.Rest.controllers.IntegrationBaseMethod.env;


public class BuyerLoginIntegrationBifrostPageObject extends BaseMethod {

    @FindBy(id = "email-login")
    private WebElement txtLogin;
    @FindBy(id = "password-login")
    private  WebElement pwdLogin;
    @FindBy(id = "submit-login")
    private WebElement btnLogin;


    @Step("As a user, I want to input email")
    public BuyerLoginIntegrationBifrostPageObject InputEmail() throws InterruptedException {
        getWebDriver().get(env.IntegrationURLBuyer());
        Thread.sleep(1000);
//        BuyerAllureAttachments.saveWebElement(getWebDriver(),txtLogin);
        highlightElement(txtLogin);
        txtLogin.sendKeys(decryptData(env.IntegrationBuyerEmail()));
        return this;
    }

    @Step("As a user, I want to input password")
    public BuyerLoginIntegrationBifrostPageObject InputPassword(){

        highlightElement(pwdLogin);
        pwdLogin.sendKeys(decryptData(env.IntegrationBuyerPassword()));
        return this;
    }

    @Step("As a user, I want to click submit button")
    public BuyerLoginIntegrationBifrostPageObject btnLogin(){
        highlightElement(btnLogin);
        btnLogin.click();
        return this;
    }
}
