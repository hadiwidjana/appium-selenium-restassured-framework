package frmwrk.fe.web.pageobjects;

import frmwrk.fe.web.BaseMethod;
import frmwrk.fe.web.WebDriverFactory;
import frmwrk.globalmethod.allurereport.AllureAttachments;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyerLoginPage extends BaseMethod {

    public BuyerLoginPage() {
        PageFactory.initElements(driver, this);
    }



    @FindBy(id = "email-login")
    private  WebElement txtLogin;
    @FindBy(id = "password-login")
    private  WebElement pwdLogin;
    @FindBy(id = "submit-login")
    private WebElement btnLogin;

    @Step("As a user already input email")
    public BuyerLoginPage InputEmail() throws InterruptedException {
        Thread.sleep(1000);
        AllureAttachments.saveWebElement(getWebDriver(),txtLogin);
        highlightElement(txtLogin);
        txtLogin.sendKeys(decryptData(appConfig.getProduction1()));
        return this;
    }

    @Step("As a user already input password")
    public BuyerLoginPage InputPassword(){

        highlightElement(pwdLogin);
        pwdLogin.sendKeys(decryptData(appConfig.getPasswordProd()));
        return this;
    }

    @Step("As a user click button submit")
    public BuyerLoginPage btnLogin(){
        highlightElement(btnLogin);
        btnLogin.click();
        return this;
    }
}
