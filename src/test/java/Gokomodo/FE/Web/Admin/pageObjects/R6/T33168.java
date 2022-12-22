package Gokomodo.FE.Web.Admin.pageObjects.R6;

import Gokomodo.FE.Web.LoginManager.Admin.pageObjects.pages.AdminLoginCommerce1PageObject;
import Gokomodo.GlobalMethod.AllureReport.AllureAttachments;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Base64;

public class T33168  extends AdminLoginCommerce1PageObject {
    //============== Login ==================//
    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]")
    private WebElement txtLogin;
    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/form[1]/div[2]/input[1]")
    private WebElement pwdLogin;
    @FindBy(xpath = "//button[contains(text(),'Login')]")
    private WebElement btnLogin;
    //============== Step ==================//
    @FindBy(xpath = "/html/body/div/nav/div/ul[1]/li[4]/div/a")
    private WebElement HeaderMenu;
    @FindBy(xpath = "/html/body/div/nav/div/ul[1]/li[4]/div/div/div/a[3]/button")
    private WebElement sbhdrmn;
    @FindBy(xpath = "/html/body/div/main/div/div/div/div[2]/div/div[3]/div[1]/div/div/div[2]/div/div[1]/div[1]/div[2]/button[2]")
    private WebElement btnEditlstmn;
    @FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/form/div[3]/div/div[2]/button")
    private WebElement expectedT33168;

    //============== Action Login ==================//
    @Step("As a user already input email")
    public T33168 InputEmail() throws InterruptedException {
        Thread.sleep(1000);
        AllureAttachments.saveWebElement(getWebDriver(),txtLogin);
        highlightElement(txtLogin);
        txtLogin.sendKeys(decryptData(appConfig.getUserAdmin()));
        return this;
    }

    @Step("As a user already input password")
    public T33168 InputPassword(){

        highlightElement(pwdLogin);
        pwdLogin.sendKeys(decryptData(appConfig.getPasswordAccount()));
        return this;
    }

    @Step("As a user click button submit")
    public T33168 btnLogin(){
        highlightElement(btnLogin);
        btnLogin.click();
        return this;
    }
    //============== Action Login ==================//
    @Step("As a user want to click header")
    public T33168 hdrmn() {
        highlightElement(HeaderMenu);
        AllureAttachments.saveWebElement(getWebDriver(), HeaderMenu);
        HeaderMenu.click();
        return this;
    }
    @Step("As a user want to click sub header menu")
    public T33168 subhdrmn() {
        highlightElement(sbhdrmn);
        AllureAttachments.saveWebElement(getWebDriver(), sbhdrmn);
        sbhdrmn.click();
        return this;
    }
    @Step("As a user want to click button edit list menu")
    public T33168 btnEdit() {

        highlightElement(btnEditlstmn);
        AllureAttachments.saveWebElement(getWebDriver(), btnEditlstmn);
        JSclick(btnEditlstmn);
//      btnEditlstmn.click();
        return this;
    }
    @Step("T33168 - The Admin should be able to see Add New Brand section")
    public T33168 expectedT33168() throws Exception {
        highlightElement(expectedT33168);
        Thread.sleep(3000);
        robotScreenCapture("ExpectedT33168");
        robotScreenCapture("");
        Thread.sleep(3000);
        AllureAttachments.saveWebElement(getWebDriver(), expectedT33168);
        Thread.sleep(3000);
        return this;
    }

}
