package Gokomodo.FE.Web.Seller.pageObjects.Corpcom;

import Gokomodo.FE.Web.LoginManager.Seller.pageObjects.initializePageObjects.SellerPageLoginInitializer;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.Base64;

public class Status_PODetail_TCtoPO extends SellerPageLoginInitializer {

    //============================ Login ================================//
    @FindBy(xpath = "/html/body/div/div/main/div/div/div[1]/div[2]/form/div[1]/input")
    private WebElement txtLogin;
    @FindBy(xpath = "/html/body/div/div/main/div/div/div[1]/div[2]/form/div[2]/div/input")
    private  WebElement pwdLogin;
    @FindBy(xpath = "/html/body/div/div/main/div/div/div[1]/div[2]/form/div[3]/button")
    private WebElement btnLogin;


    //=====================================================================//

    @FindBy(xpath = "/html/body/div/div/header/div/nav/ul/li[4]/a/div")
    private WebElement clickTCbtn;

    @FindBy(xpath = "/html/body/div/div/main/div/div[1]/div[1]/div/div[2]/input")
    private WebElement inputTCName;
    @FindBy(xpath = "/html/body/div/div/main/div/table/tbody/tr/td[1]")
    private WebElement clicktheTCList;
    @FindBy(xpath = "/html/body/div/div/main/div/div[1]/div[2]/div/div[3]/div[2]/div[1]/button")
    private WebElement clickUploadDocbtn;
    @FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div[2]/div/div[2]/input")
    private WebElement inputAttachment;
    @FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[3]/button[2]")
    private WebElement saveBtnUploadDoc;
    @FindBy(xpath = "/html/body/div/div/main/div/div[1]/div[1]/div[2]/ul/li[2]/a")
    private WebElement moveToQuo;

    @FindBy(xpath="//div[contains(text(),'Purchase Order')]")
    private WebElement lblstatus;

    //=====================================================================//

    //=====================================================================//

    @Step("As a user already input email")
    public Status_PODetail_TCtoPO InputEmailSeller() throws InterruptedException {
        Thread.sleep(2000);
        highlightElement(txtLogin);
        txtLogin.sendKeys(decryptData(appConfig.getUsrSeller()));
        return this;
    }

    @Step("As a user already input password")
    public Status_PODetail_TCtoPO InputPasswordSeller(){

        highlightElement(pwdLogin);
        pwdLogin.sendKeys(decryptData(appConfig.getPasswordAccount()));
        return this;
    }

    @Step("As a user click button submit login")
    public Status_PODetail_TCtoPO btnLoginSeller(){
        highlightElement(btnLogin);
        btnLogin.click();
        return this;
    }

    @Step("As a user click TC button")
    public Status_PODetail_TCtoPO clickTCbtnCorpcomm(){
        highlightElement(clickTCbtn);
        clickTCbtn.click();
        return this;
    }

    @Step("As a user input RFQ name (TCO/2022/09/90)")
    public Status_PODetail_TCtoPO inputTCNameCorpcomm(){
        highlightElement(inputTCName);
        inputTCName.sendKeys("TCO/2022/09/90");
        return this;
    }

    @Step("As a user click TC list input")
    public Status_PODetail_TCtoPO clicktheTCListCorpcomm(){
        highlightElement(clicktheTCList);
        clicktheTCList.click();
        return this;
    }

    @Step("As a user click Upload Document button")
    public Status_PODetail_TCtoPO clickUploadDocbtnCorpcomm(){
        highlightElement(clickUploadDocbtn);
        clickUploadDocbtn.click();
        return this;
    }

    @Step("As a user click Add Attachment Document")
    public Status_PODetail_TCtoPO inputAttachmentCorpcomm() throws InterruptedException {
        highlightElement(inputAttachment);
        inputAttachment.sendKeys("/Users/nazaralamgokomodo/GATE-Automation/QA-AutomationFramework/srcUploadedFile/foto.jpg");
        Thread.sleep(4000);
        return this;
    }

    @Step("As a user click Save button")
    public Status_PODetail_TCtoPO saveBtnUploadDocCorpcomm() throws InterruptedException {
        highlightElement(saveBtnUploadDoc);
        saveBtnUploadDoc.click();
        Thread.sleep(3000);
        return this;
    }

    @Step("As a user click Quotation button")
    public Status_PODetail_TCtoPO moveToQuoCorpcomm(){
        highlightElement(moveToQuo);
        moveToQuo.click();
        return this;
    }

    @Step("As a user refresh web and change into Purchase Order")
    public Status_PODetail_TCtoPO SttsPOLater() throws Exception {
        highlightElement(lblstatus);
        String Actualstatus = lblstatus.getText();
        String Expectstatus = "Purchase Order";
        Assert.assertEquals(Actualstatus,Expectstatus);
        System.out.println(Actualstatus);
        Thread.sleep(3000);
        robotScreenCapture("Expected status PO in Seller");
        Thread.sleep(3000);
        return this;
    }







}
