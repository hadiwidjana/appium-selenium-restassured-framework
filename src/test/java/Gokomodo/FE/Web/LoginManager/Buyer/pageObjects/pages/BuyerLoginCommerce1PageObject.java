package Gokomodo.FE.Web.LoginManager.Buyer.pageObjects.pages;

import Gokomodo.FE.Web.LoginManager.Buyer.pageObjects.initializePageObjects.BuyerPageLoginInitializerBuyer;
import Gokomodo.GlobalMethod.AllureReport.AllureAttachments;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Base64;

public class BuyerLoginCommerce1PageObject extends BuyerPageLoginInitializerBuyer {

    @FindBy(id = "email-login")
    private  WebElement txtLogin;
    @FindBy(id = "password-login")
    private  WebElement pwdLogin;
    @FindBy(id = "submit-login")
    private WebElement btnLogin;

    @Step("As a user already input email")
    public BuyerLoginCommerce1PageObject InputEmail() throws InterruptedException {
        Thread.sleep(1000);
        AllureAttachments.saveWebElement(getWebDriver(),txtLogin);
        highlightElement(txtLogin);
        txtLogin.sendKeys(decryptData(appConfig.getUserCommerce1()));
        return this;
    }

    @Step("As a user already input password")
    public BuyerLoginCommerce1PageObject InputPassword(){

        highlightElement(pwdLogin);
        pwdLogin.sendKeys(decryptData(appConfig.getPasswordAccount()));
        return this;
    }

    @Step("As a user click button submit")
    public BuyerLoginCommerce1PageObject btnLogin(){
        highlightElement(btnLogin);
        btnLogin.click();
        return this;
    }
}
