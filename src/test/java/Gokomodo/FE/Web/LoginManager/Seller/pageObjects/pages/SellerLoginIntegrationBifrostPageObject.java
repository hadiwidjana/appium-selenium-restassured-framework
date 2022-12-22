package Gokomodo.FE.Web.LoginManager.Seller.pageObjects.pages;


import Gokomodo.FE.Web.BaseMethod;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Base64;

import static Gokomodo.BE.Rest.controllers.IntegrationBaseMethod.env;


public class SellerLoginIntegrationBifrostPageObject extends BaseMethod {
    @FindBy(xpath = "//input[@data-testid='email']")
    private WebElement txtLogin;
    @FindBy(xpath = "//input[@data-testid='password']")
    private  WebElement pwdLogin;
    @FindBy(xpath = "//button[@data-testid='submit-login']")
    private WebElement btnLogin;


    @Step("As a seller, I want to input email")
    public SellerLoginIntegrationBifrostPageObject InputEmail() throws InterruptedException {
        getWebDriver().get(env.IntegrationURLSeller());
        Thread.sleep(1000);
//        BuyerAllureAttachments.saveWebElement(getWebDriver(),txtLogin);
        highlightElement(txtLogin);
        txtLogin.sendKeys(decryptData(env.IntegrationSellerEmail()));
        return this;
    }

    @Step("As a seller, I want to input password")
    public SellerLoginIntegrationBifrostPageObject InputPassword(){
        highlightElement(pwdLogin);
        pwdLogin.sendKeys(decryptData(env.IntegrationSellerPassword()));
        return this;
    }

    @Step("As a seller, I want to click submit button")
    public SellerLoginIntegrationBifrostPageObject btnLogin(){
        highlightElement(btnLogin);
        btnLogin.click();
        return this;
    }
}
