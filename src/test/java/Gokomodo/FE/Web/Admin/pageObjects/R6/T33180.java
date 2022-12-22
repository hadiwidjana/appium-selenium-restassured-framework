package Gokomodo.FE.Web.Admin.pageObjects.R6;

import Gokomodo.FE.Web.LoginManager.Admin.pageObjects.pages.AdminLoginCommerce1PageObject;
import Gokomodo.GlobalMethod.AllureReport.AllureAttachments;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Base64;

public class T33180 extends AdminLoginCommerce1PageObject {
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
    @FindBy(xpath = "/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/button[2]")
    private WebElement btnEditlstmn;
    @FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/form/div[3]/div/div[2]/div[1]/div/div[3]/button[1]/i")
    private WebElement Btnedit;
    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/input[1]")
    private WebElement upldImg1;
    @FindBy (xpath = "/html/body/div[3]/div/div[1]/div/div/div[3]/button[1]")
    private WebElement btncancel;
    @FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div")
    private WebElement ExpetedT33180;
    @FindBy (xpath = "//textarea[@class='form-control css-5d6l6w']")
    private WebElement txtareabrndnm;

    @FindBy(xpath = "/html/body/div[3]/div/div[1]/div/div")
    private WebElement ExpetedT33178;

    //============== Action Login ==================//
    @Step("As a user already input email")
    public T33180 InputEmail() throws InterruptedException {
        Thread.sleep(1000);
        AllureAttachments.saveWebElement(getWebDriver(),txtLogin);
        highlightElement(txtLogin);
        txtLogin.sendKeys(decryptData(appConfig.getUserAdmin()));
        return this;
    }

    @Step("As a user already input password")
    public T33180 InputPassword(){

        highlightElement(pwdLogin);
        pwdLogin.sendKeys(decryptData(appConfig.getPasswordAccount()));
        return this;
    }

    @Step("As a user click button submit")
    public T33180 btnLogin() throws InterruptedException {
        highlightElement(btnLogin);
        btnLogin.click();
        Thread.sleep(5000);
        return this;
    }
    //============== Action Login ==================//
    @Step("As a user want to click header")
    public T33180 hdrmn() throws InterruptedException {
        highlightElement(HeaderMenu);
        AllureAttachments.saveWebElement(getWebDriver(), HeaderMenu);
        HeaderMenu.click();
        Thread.sleep(5000);
        return this;
    }
    @Step("As a user want to click sub header menu")
    public T33180 subhdrmn() throws InterruptedException {
        highlightElement(sbhdrmn);
        AllureAttachments.saveWebElement(getWebDriver(), sbhdrmn);
        sbhdrmn.click();
        Thread.sleep(12000);
        return this;
    }
    @Step("As a user want to click button edit list menu")
    public T33180 btnEdit() throws InterruptedException {
        highlightElement(btnEditlstmn);
        AllureAttachments.saveWebElement(getWebDriver(), btnEditlstmn);
        JSclick(btnEditlstmn);
//        btnEditlstmn.click();
        Thread.sleep(5000);
        return this;
    }
    @Step("As a user want to click edit new brand")
    public T33180 Btnedit() throws InterruptedException {
        highlightElement(Btnedit);
        AllureAttachments.saveWebElement(getWebDriver(), Btnedit);
        Btnedit.click();
        Thread.sleep(5000);
        return this;
    }
    @Step("As a user input textbox brand name")
    public T33180 btncancel() {
        highlightElement(btncancel);
        AllureAttachments.saveWebElement(getWebDriver(), btncancel);
        btncancel.click();
        return this;
    }

    @Step(" T33180 - The Admin should be able to close the new brand popup")
    public T33180 ExpetedT33180() throws Exception {
        highlightElement(ExpetedT33180);
        Thread.sleep(3000);
        AllureAttachments.saveWebElement(getWebDriver(), ExpetedT33180);
        Thread.sleep(3000);
        robotScreenCapture("ExpetedT33180");
        Thread.sleep(2000);
        return this;
    }


}
