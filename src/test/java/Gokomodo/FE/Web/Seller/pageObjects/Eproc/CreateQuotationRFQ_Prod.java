package Gokomodo.FE.Web.Seller.pageObjects.Eproc;

import Gokomodo.FE.Web.LoginManager.Seller.pageObjects.initializePageObjects.SellerPageLoginInitializer;
import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Base64;

public class CreateQuotationRFQ_Prod extends SellerPageLoginInitializer {

    //============================ Login ================================//
    @FindBy(xpath = "/html/body/div/div/main/div/div/div[1]/div[2]/form/div[1]/input")
    private WebElement txtLogin;
    @FindBy(xpath = "/html/body/div/div/main/div/div/div[1]/div[2]/form/div[2]/div/input")
    private  WebElement pwdLogin;
    @FindBy(xpath = "/html/body/div/div/main/div/div/div[1]/div[2]/form/div[3]/button")
    private WebElement btnLogin;


    //======================================================================//

    //============================== Create RFQ Seller =====================//
    //
    @FindBy(xpath = "//div[contains(text(),'Quotation')]")
    private WebElement QuotationListbtn;
    //
    @FindBy(xpath = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")
    private WebElement QuotationInput;
    //
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]")
    private WebElement clickTheQuotation;
    @FindBy(xpath= "//h5[contains(text(),'Update Quotations')]")
    private WebElement lblUpdateQuotation;
    //
//    @FindBy(xpath = "//*[@id=\"navBottomInquiry\"]/div[2]/button[2]")
//    private WebElement createRFQbutton;
//    @FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div/div[2]/button[2]")
//    private WebElement createRFQPopUp;
    // XLS
    @FindBy(xpath = "/html/body/div/div/main/div/div[1]/div[2]/div[4]/div/div[2]/div/input")
    private WebElement radioBtnUsingXls;
    @FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[3]/button[2]")
    private WebElement btnPopUpSure;
    @FindBy(xpath = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[1]/div[2]/div[5]/input[1]")
    private WebElement uploadXls;
    // manual
//    @FindBy(xpath = "/html/body/div/div/main/div/div[1]/div[2]/div[5]/div/div[2]/table/thead/tr/th[1]/div/label/span")
//    private WebElement checklistAll;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[1]/div[2]/h5[1]")
    private WebElement lblQuotation;
    @FindBy(xpath = "//button[contains(text(),'Select Origin of Shipment')]")
    private WebElement btnOriginShipment;
    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]")
    private WebElement btnChooseOriginShipment;
    @FindBy(xpath = "//button[contains(text(),'Select Address')]")
    private WebElement btnSaveAdd;
    @FindBy(xpath = "//label[contains(text(),'Attachments')]")
    private WebElement lblAttachment;
    @FindBy(xpath = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[1]/div[2]/div[9]/div[2]/textarea[1]")
    private WebElement inputNotes;
    //
    @FindBy(id = "btn-SendQuotation")
    private WebElement btnSendQuo;
    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/button[2]")
    private WebElement btnSendQuoPopUp;


    //=======================================================================//

    @Step("As a user already input email")
    public CreateQuotationRFQ_Prod InputEmailSeller() throws InterruptedException {
        Thread.sleep(1000);
        highlightElement(txtLogin);
        txtLogin.sendKeys(decryptData(appConfig.getSellerprod1()));
        return this;
    }

    @Step("As a user already input password")
    public CreateQuotationRFQ_Prod InputPasswordSeller(){

        highlightElement(pwdLogin);
        pwdLogin.sendKeys(decryptData(appConfig.getPasswordprodseller1()));
        return this;
    }

    @Step("As a user click button submit")
    public CreateQuotationRFQ_Prod btnLoginSeller(){
        highlightElement(btnLogin);
        btnLogin.click();
        return this;
    }

    @Step("As a user click button Quotation")
    public CreateQuotationRFQ_Prod QuotationListbtnSeller(){
        highlightElement(QuotationListbtn);
        QuotationListbtn.click();
        return this;
    }

    @Step("As a user input RFQ/2022/09/1576 in Quotation list box")
    public CreateQuotationRFQ_Prod QuotationInputSeller() throws InterruptedException {
        highlightElement(QuotationInput);
        QuotationInput.sendKeys("RFQ/2022/09/1576");
        Thread.sleep(2000);
        return this;
    }

    @Step("As a user click button Quotation list box")
    public CreateQuotationRFQ_Prod clickTheQuotationSeller() {
        highlightElement(clickTheQuotation);
        clickTheQuotation.click();
        return this;
    }

    @Step("As a user click Radio button upload RFQ Xls")
    public CreateQuotationRFQ_Prod radioBtnUsingXlsSeller() throws InterruptedException {
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblUpdateQuotation);
        Thread.sleep(3000);
        highlightElement(radioBtnUsingXls);
        radioBtnUsingXls.click();
        return this;
    }

    @Step("As a user click Radio button upload RFQ Xls Pop Up")
    public CreateQuotationRFQ_Prod btnPopUpSureSeller() {
        highlightElement(btnPopUpSure);
        btnPopUpSure.click();
        return this;
    }

    @Step("As a user upload RFQ Xls button")
    public CreateQuotationRFQ_Prod uploadXlsSeller() throws InterruptedException {
        scrollDown700();
        highlightElement(uploadXls);
        uploadXls.sendKeys("/Users/nazaralamgokomodo/GATE-Automation/QA-AutomationFramework/src/test/resources/Excel Files/RFQ_2022_09_1576 - Quotation_Prod.xlsx");
        Thread.sleep(4000);
        return this;
    }

    @Step("User choose button Origin Shipment")
    public CreateQuotationRFQ_Prod btnOriginShipmentSeller() throws InterruptedException {
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblQuotation);
        highlightElement(btnOriginShipment);
        btnOriginShipment.click();
        return this;
    }

    @Step("As a user Choose one of area Origin Shipment")
    public CreateQuotationRFQ_Prod btnChooseOriginShipmentSeller() {
        highlightElement(btnChooseOriginShipment);
        btnChooseOriginShipment.click();
        return this;
    }

    @Step("As a user click save address button Origin Shipment")
    public CreateQuotationRFQ_Prod btnSaveAddressSeller() {
        highlightElement(btnSaveAdd);
        btnSaveAdd.click();
        return this;
    }

    @Step("As a user input notes")
    public CreateQuotationRFQ_Prod inputNotesSeller() throws InterruptedException {
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblAttachment);
        highlightElement(inputNotes);
        inputNotes.sendKeys("OK! Good! Nice!");
        return this;
    }

    @Step("As a user click send quotation")
    public CreateQuotationRFQ_Prod btnSaveAddSeller() {
        highlightElement(btnSaveAdd);
        btnSaveAdd.click();
        return this;
    }

    public CreateQuotationRFQ_Prod btnSendQuoSeller() {
        highlightElement(btnSendQuo);
        btnSendQuo.click();
        return this;
    }

    public CreateQuotationRFQ_Prod btnSendQuoPopUpSeller() {
        highlightElement(btnSendQuoPopUp);
        btnSendQuoPopUp.click();
        return this;
    }
}
