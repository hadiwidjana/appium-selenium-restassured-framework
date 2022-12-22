package Gokomodo.FE.Web.LoginManager.Admin.pageObjects.pages;

import Gokomodo.FE.Web.LoginManager.Admin.pageObjects.initializePageObjects.AdminPageLoginInitializerBuyer;
import Gokomodo.GlobalMethod.AllureReport.AllureAttachments;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Base64;

public class AdminLoginDenny extends AdminPageLoginInitializerBuyer {

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]")
    private  WebElement txtLogin;
    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/form[1]/div[2]/input[1]")
    private  WebElement pwdLogin;
    @FindBy(xpath = "//button[contains(text(),'Login')]")
    private WebElement btnLogin;

    @Step("As a user already input email")
    public AdminLoginDenny InputEmail() throws InterruptedException {
        Thread.sleep(1000);
        AllureAttachments.saveWebElement(getWebDriver(),txtLogin);
        highlightElement(txtLogin);
        txtLogin.sendKeys(decryptData(appConfig.getUserAdmin2()));
        return this;
    }

    @Step("As a user already input password")
    public AdminLoginDenny InputPassword(){

        highlightElement(pwdLogin);
        pwdLogin.sendKeys(decryptData(appConfig.getPassAdmin2()));
        return this;
    }

    @Step("As a user click button submit")
    public AdminLoginDenny btnLogin() throws InterruptedException {
        highlightElement(btnLogin);
        btnLogin.click();
        return this;
    }
}
