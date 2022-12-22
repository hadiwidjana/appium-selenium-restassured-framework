package Gokomodo.FE.Web.Buyer.PageObjects.Corpcom;

import Gokomodo.FE.Web.LoginManager.Buyer.pageObjects.pages.BuyerLoginCommerce1PageObject;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Base64;

public class CorpcomCreateRFQ extends BuyerLoginCommerce1PageObject {


    //============== Login ==================//
    @FindBy(xpath = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")
    private WebElement inputEmail;
    @FindBy(xpath = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/input[1]")
    private WebElement inputPassword;
    @FindBy(xpath = "//button[contains(text(),'Masuk')]")
    private WebElement btnLoginCorpcom;

    //============== Create RFQ ============//
    @FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[1]/button/span")
    private WebElement btnClosePopupPenawaran;

    @FindBy(xpath = "//button[@class='btn btn-outline-primary mr-3 py-0 pr-3 d-flex align-items-center css-1fzkik5']") //Firefox
    //@FindBy(xpath = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[4]/button[1]") //Chrome
    private WebElement createRFQCorpcom;
    @FindBy(xpath = "//*[text()=\"Fruit\"]")
    private WebElement CreateRFQCforCategory;
    @FindBy(xpath = "//*[text()=\"General\"]")
    private WebElement ChangeCategoryRFQ;
    @FindBy(xpath = "//div[@class='text-center m2-3']//input[@type='file']")
    private WebElement UploadFileRFQ;
    @FindBy(xpath = "//button[contains(text(),'Send RFQ')]")
    private WebElement BtnSendRFQEnglish;
    @FindBy(xpath = "//button[contains(text(),'Kirim RFQ')]")
    private WebElement BtnSendRFQIndo;
    @FindBy(xpath = "//button[@class='btn btn-primary px-3 css-2olbfq']")
    private WebElement BtnPopUpSendRFQ;
    //==== Finish! ====//

    //=== back to homepage ===//
    @FindBy(xpath = "//button[@class='btn btn-primary mr-3 px-4']")
    private WebElement BtnToHomepage;


    @Step("As a user already input email")
    public CorpcomCreateRFQ InputEmail() throws InterruptedException {
        Thread.sleep(1000);
        highlightElement(inputEmail);
        inputEmail.sendKeys(decryptData(appConfig.getUserCommerce1()));
        return this;
    }

    @Step("As a user already input password")
    public CorpcomCreateRFQ InputPassword() {
        highlightElement(inputPassword);
        inputPassword.sendKeys(decryptData(appConfig.getPasswordAccount()));
        return this;
    }

    @Step("As a user click button login")
    public CorpcomCreateRFQ BtnLoginCorp() throws InterruptedException {
        highlightElement(btnLoginCorpcom);
        btnLoginCorpcom.click();
        Thread.sleep(5000);
        return this;
    }


//    @Step("As user close button Pop-Up Penawaran baru")
//    public CorpcomCreateRFQ btnClosePenawaran() {
//        highlightElement(btnClosePopupPenawaran);
//        btnClosePopupPenawaran.click();
//        return this;
//    }

    @Step("As user click RFQ button")
    public CorpcomCreateRFQ btnCreateRFQCorpComm(){
        highlightElement(createRFQCorpcom);
        createRFQCorpcom.click();
        return this;
    }


    @Step("As user click category")
    public CorpcomCreateRFQ btnClickCategory() {
        highlightElement(CreateRFQCforCategory);
        CreateRFQCforCategory.click();
        return this;
    }

    @Step("As user change the category")
    public CorpcomCreateRFQ txtChangeCategory() {
        highlightElement(ChangeCategoryRFQ);
        ChangeCategoryRFQ.click();
        return this;
    }

    @Step("As user upload the file")
    public CorpcomCreateRFQ btnUploadFile() {
  //      highlightElement(UploadFileRFQ);
        UploadFileRFQ.sendKeys(appConfig.getAttachment1Corpcomm());
    return this;
    }

    @Step("As user send the RFQ by click button RFQ")
    public CorpcomCreateRFQ btnSendRFQCorpcom() throws InterruptedException {
        Thread.sleep(5000);
            highlightElement(BtnSendRFQEnglish);
            JSclick(BtnSendRFQEnglish);
        return this;
    }

    @Step("As user click the yes button pop up send RFQ")
    public CorpcomCreateRFQ btnSendRFQPopUp() {
        highlightElement(BtnPopUpSendRFQ);
        BtnPopUpSendRFQ.click();
        return this;
    }

    @Step("As user back to beranda")
    public CorpcomCreateRFQ btnBacktoBeranda() {
        highlightElement(BtnToHomepage);
        BtnToHomepage.click();
        return this;
    }

}
