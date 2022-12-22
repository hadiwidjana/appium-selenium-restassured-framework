package Gokomodo.FE.Web.Seller.pageObjects.Corpcom;

import Gokomodo.FE.Web.LoginManager.Seller.pageObjects.initializePageObjects.SellerPageLoginInitializer;
import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Base64;

public class SendQuoCorpComm extends SellerPageLoginInitializer {

    //============================ Login ================================//
    @FindBy(xpath = "/html/body/div/div/main/div/div/div[1]/div[2]/form/div[1]/input")
    private WebElement txtLogin;
    @FindBy(xpath = "/html/body/div/div/main/div/div/div[1]/div[2]/form/div[2]/div/input")
    private  WebElement pwdLogin;
    @FindBy(xpath = "/html/body/div/div/main/div/div/div[1]/div[2]/form/div[3]/button")
    private WebElement btnLogin;


    //=====================================================================//

    //=====================================================================//

    @FindBy(xpath = "//header/div[1]/nav[1]/ul[1]/li[1]/a[1]/div[1]")
    private WebElement inquirylistBtn;
    @FindBy(xpath = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[2]/input[1]")
    private WebElement inputInquiryName;
    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/table/tbody/tr/td[1]")
    private WebElement clickTheInquiry;
    @FindBy(xpath = "//tbody/tr[1]/td[3]")
    private WebElement clickTheInquiryRFQ;
    @FindBy(xpath = "//button[contains(text(),'Buat Penawaran')]")
    private WebElement clickSendQuoCorpcomm;
    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
    private WebElement clickChoosePICbox;
    @FindBy(id = "react-select-7-option-0")
    private WebElement clickPICbox;
    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")
    private WebElement inputSubjectName;
    @FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div/div/div[3]/div/div/div/div[1]")
    private WebElement clickCategoryBox;
    @FindBy(xpath = "//label[contains(text(),'Estimasi Pengiriman')]")
    private WebElement lblPengiriman;
    @FindBy(id = "react-select-8-option-1")
    private WebElement clickCategory;
    //
    @FindBy(xpath = "//input[@id='tcDirect-startDeadline']")
    private WebElement inputStartDate;
    @FindBy(xpath = "//input[@id='tcDirect-endDeadline']")
    private WebElement inputFinishDate;
    //
    @FindBy(id = "tcDirect-termsOfPayment")
    private WebElement clickMethodPayment;
    @FindBy(id = "react-select-10-option-1")
    private WebElement chooseMeethodPayment;
    @FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div/div/div[8]/div/div/div/div[2]/div/div[2]/input")
    private WebElement addAttchbtn;
    //
    @FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div/div/div[9]/div/div/div/div[2]/button")
    private WebElement addProdbtn;
    @FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div/div/h5[3]")
    private WebElement lblProduct;
    //
    @FindBy(xpath = "//*[text()=\"Pilih Perusahaan\"]")
    private WebElement clickOffice;
    @FindBy(id = "react-select-13-option-1")
    private WebElement chooseOffice;
    @FindBy(xpath = "/html/body/div[3]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div[2]/div/div/div[1]")
    private WebElement clickLocOffice;
    @FindBy(id = "react-select-14-option-0")
    private WebElement chooseLocOffice;
    @FindBy(xpath = "/html/body/div[3]/div/div[1]/div/div/div/div[2]/div[3]/h5")
    private WebElement lblProduct2;
    @FindBy(xpath = "/html/body/div[3]/div/div[1]/div/div/div/div[2]/div[4]/input")
    private WebElement addProdXls;
    @FindBy(xpath = "//button[contains(text(),'Simpan')]")
    private WebElement btnSaveProd;
    @FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div/div/div[9]/div/div/button")
    private WebElement lblProduct3;
    //
    @FindBy(id = "tcDirect-dateDeadline")
    private WebElement inputDateline;
    //
    @FindBy(xpath = "//*[text()=\"Waktu\"]")
    private WebElement clickTime;
    //
    @FindBy(xpath = "//*[text()=\"02:30\"]")
    private WebElement chooseTime;
    //
    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[13]/div[1]/button[2]")
    private WebElement btnCreateRFQ;
    @FindBy(xpath = "//button[contains(text(),'Kirim Penawaran')]")
    private WebElement btnCreateRFQPopUp;




    //=====================================================================//

    @Step("As a user already input email")
    public SendQuoCorpComm InputEmailSeller() throws InterruptedException {
        Thread.sleep(2000);
        highlightElement(txtLogin);
        txtLogin.sendKeys(decryptData(appConfig.getUsrSeller()));
        return this;
    }

    @Step("As a user already input password")
    public SendQuoCorpComm InputPasswordSeller(){

        highlightElement(pwdLogin);
        pwdLogin.sendKeys(decryptData(appConfig.getPasswordAccount()));
        return this;
    }

    @Step("As a user click button submit login")
    public SendQuoCorpComm btnLoginSeller(){
        highlightElement(btnLogin);
        btnLogin.click();
        return this;
    }

    @Step("As a user click inquiry button")
    public SendQuoCorpComm inquirylistButtonCorpcomm(){
        highlightElement(inquirylistBtn);
        inquirylistBtn.click();
        return this;
    }

    // RRFQ/2022/09/104
    @Step("As a user input inquiry button")
    public SendQuoCorpComm inputlistButtonCorpcomm() throws InterruptedException {
        highlightElement(inputInquiryName);
        inputInquiryName.sendKeys("RFQ/2022/09/104");
        Thread.sleep(40000);
        return this;
    }

    @Step("As a user click RFQ RFQ/2022/09/104")
    public SendQuoCorpComm clickTheInquiryRFQCorpcomm() throws InterruptedException {
        highlightElement(clickTheInquiryRFQ);
        clickTheInquiryRFQ.click();
        Thread.sleep(4000);
        return this;
    }

    @Step("As a user click Buat penawaran")
    public SendQuoCorpComm clickSendQuotationCorpcomm(){
        highlightElement(clickSendQuoCorpcomm);
        clickSendQuoCorpcomm.click();
        return this;
    }

    @Step("As a user click PIC")
    public SendQuoCorpComm clickChoosePICboxCorpcomm(){
        highlightElement(clickChoosePICbox);
        clickChoosePICbox.click();
        return this;
    }

    @Step("As a user Choose PIC")
    public SendQuoCorpComm clickPICboxCorpcomm(){
        highlightElement(clickPICbox);
        clickPICbox.click();
        return this;
    }

    @Step("As a user Input Subject")
    public SendQuoCorpComm inputSubjectNameCorpcomm(){
        highlightElement(inputSubjectName);
        inputSubjectName.sendKeys("Automated test");
        return this;
    }

    @Step("As a user click subject box")
    public SendQuoCorpComm clickCategoryBoxCorpcomm(){
        highlightElement(clickCategoryBox);
        clickCategoryBox.click();
        return this;
    }

//    Thread.sleep(3000);
//    JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
//        js.executeScript("arguments[0].scrollIntoView();", lblDate);

    @Step("As a user click category")
    public SendQuoCorpComm clickCategoryCorpcomm(){
        highlightElement(clickCategory);
        clickCategory.click();
        return this;
    }

    @Step("As a user Input start date")
    public SendQuoCorpComm inputStartDateCorpcomm(){
        highlightElement(inputStartDate);
        inputStartDate.sendKeys("25 September '22");
        return this;
    }

    @Step("As a user Input Finish date")
    public SendQuoCorpComm inputFinishDateCorpcomm() throws InterruptedException {
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblPengiriman);
        highlightElement(inputFinishDate);
        inputFinishDate.sendKeys("25 October '22");
        return this;
    }

    @Step("As a user click method payment")
    public SendQuoCorpComm clickMethodPaymentCorpcomm(){
        highlightElement(clickMethodPayment);
        clickMethodPayment.click();
        return this;
    }

    @Step("As a user choose method payment")
    public SendQuoCorpComm chooseMeethodPaymentCorpcomm(){
        highlightElement(chooseMeethodPayment);
        chooseMeethodPayment.click();
        return this;
    }

    @Step("As a user choose method payment")
    public SendQuoCorpComm addAttchbtnCorpcomm(){
        highlightElement(addAttchbtn);
        addAttchbtn.sendKeys("/Users/nazaralamgokomodo/QA-Automation/QA-AutomationFramework/srcUploadedFile/foto.jpg");
        return this;
    }

    @Step("As a user Click add product button")
    public SendQuoCorpComm addProdbtnCorpcomm() throws InterruptedException {
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblProduct);
        highlightElement(addProdbtn);
        addProdbtn.click();
        return this;
    }

    @Step("As a user click office box")
    public SendQuoCorpComm clickOfficeCorpcomm(){
        highlightElement(clickOffice);
        clickOffice.click();
        return this;
    }

    @Step("As a user choose office box")
    public SendQuoCorpComm chooseOfficeCorpcomm(){
        highlightElement(chooseOffice);
        chooseOffice.click();
        return this;
    }

    @Step("As a user Click Location office")
    public SendQuoCorpComm clickLocOfficeCorpcomm(){
        highlightElement(clickLocOffice);
        clickLocOffice.click();
        return this;
    }

    @Step("As a user choose Location office")
    public SendQuoCorpComm chooseLocOfficeCorpcomm(){
        highlightElement(chooseLocOffice);
        chooseLocOffice.click();
        return this;
    }

    @Step("As a user input product using Xls")
    public SendQuoCorpComm addProdXlsCorpcomm() throws InterruptedException {
        highlightElement(addProdXls);
        addProdXls.sendKeys("/Users/nazaralamgokomodo/QA-Automation/QA-AutomationFramework/srcUploadedFile/gokomodo-virtual-quotation-excel-template.xlsx");
        Thread.sleep(4000);
        return this;
    }

    @Step("As a user click save button for products")
    public SendQuoCorpComm btnSaveProdCorpcomm(){
        highlightElement(btnSaveProd);
        btnSaveProd.click();
        return this;
    }

    @Step("As a user input dateline")
    public SendQuoCorpComm inputDatelineCorpcomm() throws InterruptedException {
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblProduct3);
        highlightElement(inputDateline);
        inputDateline.sendKeys("25 September 2022");
        return this;
    }

    @Step("As a user click time deadline box")
    public SendQuoCorpComm clickTimeCorpComm(){
        highlightElement(clickTime);
        clickTime.click();
        return this;
    }

    @Step("As a user choose time deadline box")
    public SendQuoCorpComm chooseTimeCorpcomm(){
        highlightElement(chooseTime);
        chooseTime.click();
        return this;
    }

    @Step("As a user click create RFQ")
    public SendQuoCorpComm btnCreateRFQCorpcomm(){
        highlightElement(btnCreateRFQ);
        btnCreateRFQ.click();
        return this;
    }

    @Step("As a user click create RFQ Pop Up")
    public SendQuoCorpComm btnCreateRFQPopUpCorpcomm(){
        highlightElement(btnCreateRFQPopUp);
        btnCreateRFQPopUp.click();
        return this;
    }


}
