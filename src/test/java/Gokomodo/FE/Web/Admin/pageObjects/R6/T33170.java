package Gokomodo.FE.Web.Admin.pageObjects.R6;

import Gokomodo.FE.Web.LoginManager.Admin.pageObjects.pages.AdminLoginCommerce1PageObject;
import Gokomodo.GlobalMethod.AllureReport.AllureAttachments;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Base64;

public class T33170 extends AdminLoginCommerce1PageObject {
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
    @FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/form/div[3]/div/div[2]/button")
    private WebElement btnAddNewBrand;
   @FindBy (xpath = "//div[@class='mb-3']//input[@class='form-control']")
   private WebElement txtbrndname;
   @FindBy (xpath = "//textarea[@class='form-control css-5d6l6w']")
   private WebElement txtareabrndnm;
    @FindBy(xpath = "//label[@for='brand_attachments']")
    private WebElement lblattachment;
   @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/input[1]")
   private WebElement upldImg1;
   @FindBy(xpath = "//div[@class='text-center m2-3']//input[@type='file']")
   private WebElement upldImg2;
   @FindBy(xpath = "//button[contains(text(),'Add Brand')]")
   private WebElement btnAddBrand;
   @FindBy(xpath = "/html/body/div[3]/div/div[1]/div/div/div[3]/button[2]")
   private WebElement expectedT33170;


    //============== Action Login ==================//
    @Step("As a user already input email")
    public T33170 InputEmail() throws InterruptedException {
        Thread.sleep(1000);
        AllureAttachments.saveWebElement(getWebDriver(),txtLogin);
        highlightElement(txtLogin);
        txtLogin.sendKeys(decryptData(appConfig.getUserAdmin()));
        return this;
    }

    @Step("As a user already input password")
    public T33170 InputPassword(){

        highlightElement(pwdLogin);
        pwdLogin.sendKeys(decryptData(appConfig.getPasswordAccount()));
        return this;
    }

    @Step("As a user click button submit")
    public T33170 btnLogin() throws InterruptedException {
        highlightElement(btnLogin);
        btnLogin.click();
        Thread.sleep(5000);
        return this;
    }
    //============== Action Login ==================//
    @Step("As a user want to click header")
    public T33170 hdrmn() throws InterruptedException {
        highlightElement(HeaderMenu);
        AllureAttachments.saveWebElement(getWebDriver(), HeaderMenu);
        HeaderMenu.click();
        Thread.sleep(5000);
        return this;
    }
    @Step("As a user want to click sub header menu")
    public T33170 subhdrmn() throws InterruptedException {
        highlightElement(sbhdrmn);
        AllureAttachments.saveWebElement(getWebDriver(), sbhdrmn);
        sbhdrmn.click();
        Thread.sleep(12000);
        return this;
    }
    @Step("As a user want to click button edit list menu")
    public T33170 btnEdit() throws InterruptedException {
        highlightElement(btnEditlstmn);
        AllureAttachments.saveWebElement(getWebDriver(), btnEditlstmn);
        JSclick(btnEditlstmn);
//        btnEditlstmn.click();
        Thread.sleep(5000);
        return this;
    }
    @Step("As a user want to click add new brand")
    public T33170 addnewbrand() throws InterruptedException {
        highlightElement(btnAddNewBrand);
        AllureAttachments.saveWebElement(getWebDriver(), btnAddNewBrand);
        btnAddNewBrand.click();
        Thread.sleep(5000);
        return this;
    }
    @Step("As a user input textbox brand name")
    public T33170 txtbrndNm() {
        highlightElement(txtbrndname);
        AllureAttachments.saveWebElement(getWebDriver(), txtbrndname);
        txtbrndname.sendKeys("Automation Inject Brand");
        return this;
    }
    @Step("As a user input TextArea brand name")
    public T33170 txtareabrndNm() throws InterruptedException {
        highlightElement(txtareabrndnm);
        AllureAttachments.saveWebElement(getWebDriver(), txtareabrndnm);
        txtareabrndnm.sendKeys("Automation Inject Brand");
        scrollDown100();
        Thread.sleep(5000);
        return this;
    }
    @Step("As a user want to upload image")
    public T33170 upldfile() {
        highlightElement(upldImg1);
       // AllureAttachments.saveWebElement(getWebDriver(), upldImg1);
        upldImg1.sendKeys("/Users/iwanmac/Documents/BranchGithub/QA-AutomationFramework/srcUploadedFile/foto.jpg");
        return this;
    }
    @Step("As a user want to upload attachment")
    public T33170 upldfile2() {
        highlightElement(upldImg2);
       // AllureAttachments.saveWebElement(getWebDriver(), upldImg1);
        upldImg2.sendKeys("/Users/iwanmac/Documents/BranchGithub/QA-AutomationFramework/srcUploadedFile/komodo-rfq-excel-template.xlsx");
        return this;
    }
    @Step("As a user want to Add brand")
    public T33170 btnaddbrand() {
        highlightElement(btnAddBrand);
        AllureAttachments.saveWebElement(getWebDriver(), btnAddBrand);
        return this;
    }
    @Step("T33170 - The Admin should be able to input only mandatory fieldAnd save the New Brand")
    public T33170 ExpectedT33170() throws Exception {
        highlightElement(expectedT33170);
        AllureAttachments.saveWebElement(getWebDriver(), expectedT33170);
        Thread.sleep(2000);
        expectedT33170.click();
        Thread.sleep(4000);
        robotScreenCapture("ExpectedT33170");
        Thread.sleep(4000);
        return this;
    }


}
