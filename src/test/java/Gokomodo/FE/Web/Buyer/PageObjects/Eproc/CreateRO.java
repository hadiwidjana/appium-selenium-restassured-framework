package Gokomodo.FE.Web.Buyer.PageObjects.Eproc;

import Gokomodo.FE.Web.LoginManager.Buyer.pageObjects.pages.BuyerLoginNauseee1PageObject;
import Gokomodo.GlobalMethod.AllureReport.AllureAttachments;
import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.Base64;

public class CreateRO extends BuyerLoginNauseee1PageObject {

    //============== Login ==================//
    @FindBy(id = "email-login")
    private WebElement txtLogin;
    @FindBy(id = "password-login")
    private  WebElement pwdLogin;
    @FindBy(id = "submit-login")
    private WebElement btnLogin;


    //=======================================//


    //============= Create RO ==============//
    @FindBy(id = "btn-createNew")
    private WebElement createNewRO;
    @FindBy(xpath = "/html/body/div[1]/div/header/div/nav/ul[3]/li/li/div/div[3]/a")
    private WebElement createNewRObtn;
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[2]/div[1]/div[2]/div/label")
    private WebElement rdBtnProductName;
    @FindBy(id = "react-select-3-input")
    private WebElement inputProdNameTbox;
    @FindBy(id = "react-select-3-option-1")
    private WebElement chooseProdNameTbox;
    @FindBy(xpath = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[2]/div[3]/div[1]/button[1]")
    private WebElement btnSearchProd;
    //
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[2]/h4")
    private WebElement lblSearchResult;
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[2]/div[4]/div[4]/div[2]/div/div[2]/div/div/div[2]/div")
    private WebElement DeliveryMethodBulk;
    @FindBy(id = "react-select-5-option-1")
    private WebElement chooseDeliveryMethodbulk;
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[2]/div[4]/div[5]/div[9]/label/span")
    private WebElement checklistbtnLem;
    @FindBy(xpath = "/html/body/div[3]/div/div[1]/div/div/div[3]/button")
    private WebElement btnPopUpProd;
    @FindBy(id = "btn-NextandDelv")
    private WebElement btnNextProdDelv;
    //
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[2]/div[1]/div[2]/div/div[2]/div[1]/label/span")
    private WebElement checklistVendorNausee;
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[2]/div[1]/div[2]/div/div[2]/div[1]/div/div/div[1]/div[1]/div[1]/div[2]/div/button")
    private WebElement editBtnProd;
    //
    //add products
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[3]/div/div[4]/h5")
    private WebElement lblAddProd;
    //
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[3]/div/div[3]/div[2]/div[1]/div[2]/div[1]/div/label/span")
    private WebElement checklistItem1;
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[3]/div/div[4]/div[2]/div[1]/div[2]/div[11]/input")
    private WebElement inputPRID;
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[3]/div/div[4]/div[2]/div[1]/div[2]/div[12]/input")
    private WebElement inputPRItemID;
//    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[3]/div/div[3]/div[2]/div[1]/div[2]/div[13]/div/div/div[2]/div")
//    private WebElement clickSelectSubsidiary;
//    @FindBy(id = "react-select-10-option-0")
//    private WebElement chooseSelectSubsidiary;
//    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[3]/div/div[3]/div[2]/div[1]/div[2]/div[6]/div/input")
//    private WebElement inputQuantity;
    @FindBy(id = "btn-SaveProdbtn")
    private WebElement btnSaveProd;
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/div/div[1]/div[1]/div[1]/div[1]/h5")
    private WebElement lblProd2;
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[2]/div[3]/div/button[2]")
    private WebElement btnNextPage3;
    //------------------------//
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[2]/div[3]/div/input")
    private WebElement inputSubject;
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[2]/div[4]/div/div/div/div[2]/div")
    private WebElement clickDepartment;
    @FindBy(id = "react-select-14-option-0")
    private WebElement chooseDepartmentName;
    @FindBy(id = "startDate")
    private WebElement inputDateStart;
    @FindBy(id = "endDate")
    private WebElement inputDateFinish;
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[2]/div[6]/div/div/div/div[2]/div")
    private WebElement clickTermsOfPayment;
    @FindBy(id = "react-select-15-option-1")
    private WebElement chooseTermsOfPayment;
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[2]/div[7]/div/textarea")
    private WebElement inputNotes;
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[2]/div[8]/div[1]/div/label")
    private WebElement withoutApproval;
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[2]/div[9]/div/button[3]")
    private WebElement buttonCreate;
    @FindBy(xpath = "/html/body/div[3]/div/div[1]/div/div/div/div/div[3]/button[2]")
    private WebElement buttoncreatePopUp;
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[2]/div[5]/label")
    private WebElement lblscroll;

    @FindBy(xpath = "/html/body/div[1]/div/main/div/div/div/div/div/div[1]/h4")
    private WebElement lblSuccess;




    //=====================================//

    @Step("As a user already input email")
    public CreateRO InputEmail() throws InterruptedException {
        Thread.sleep(1000);
        AllureAttachments.saveWebElement(getWebDriver(),txtLogin);
        highlightElement(txtLogin);
        txtLogin.sendKeys(decryptData(appConfig.getUsrNauseee1()));
        return this;
    }

    @Step("As a user already input password")
    public CreateRO InputPassword(){
        highlightElement(pwdLogin);
        pwdLogin.sendKeys(decryptData(appConfig.getPasswordAccount()));
        return this;
    }

    @Step("As a user click button submit")
    public CreateRO btnLogin(){
        highlightElement(btnLogin);
        btnLogin.click();
        return this;
    }

    @Step("As a user click create new")
    public CreateRO createNewROBuyer(){
        highlightElement(createNewRO);
        createNewRO.click();
        return this;
    }

    @Step("As a user click create new Reapet Order")
    public CreateRO createNewRObtnBuyer(){
        highlightElement(createNewRObtn);
        createNewRObtn.click();
        return this;
    }

    @Step("As a user click create new Reapet Order")
    public CreateRO rdBtnProductNameBuyerRO(){
        highlightElement(rdBtnProductName);
        rdBtnProductName.click();
        return this;
    }

    @Step("As a user input product name")
    public CreateRO inputProdNameTboxBuyerRO(){
        highlightElement(inputProdNameTbox);
        inputProdNameTbox.sendKeys("laptop");
        return this;
    }

    @Step("As a user input product name")
    public CreateRO chooseProdNameTboxBuyerRO(){
        highlightElement(chooseProdNameTbox);
        chooseProdNameTbox.click();
        return this;
    }

    @Step("As a user click button search button")
    public CreateRO btnSearchProdBuyerRO(){
        highlightElement(btnSearchProd);
        btnSearchProd.click();
        return this;
    }

    @Step("As a user click delivery button")
    public CreateRO DeliveryMethodBulkBuyerRO() throws InterruptedException {
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblSearchResult);
        highlightElement(DeliveryMethodBulk);
        DeliveryMethodBulk.click();
        return this;
    }

    @Step("As a user choose product")
    public CreateRO chooseDeliveryMethoBulkBuyerRO(){
        highlightElement(chooseDeliveryMethodbulk);
        chooseDeliveryMethodbulk.click();
        return this;
    }

    @Step("As a user click checklist lem")
    public CreateRO checklistbtnLemBuyerRO(){
        highlightElement(checklistbtnLem);
        checklistbtnLem.click();
        return this;
    }

    @Step("As a user click understand btn on pop up")
    public CreateRO btnPopUpProdBuyerRO(){
        highlightElement(btnPopUpProd);
        btnPopUpProd.click();
        return this;
    }

    @Step("As a user click next page button")
    public CreateRO btnNextProdDelvBuyerRO() throws InterruptedException {
        Thread.sleep(5000);
        highlightElement(btnNextProdDelv);
        btnNextProdDelv.click();
        return this;
    }

    @Step("As a user click checklist button nausee")
    public CreateRO checklistVendorNauseeBuyerRO(){
        highlightElement(checklistVendorNausee);
        checklistVendorNausee.click();
        return this;
    }

    @Step("As a user click checklist button edit product")
    public CreateRO editBtnProdBuyerRO() throws InterruptedException {
        highlightElement(editBtnProd);
        editBtnProd.click();
        Thread.sleep(5000);
        return this;
    }


    @Step("As a user input PR ID item 1")
    public CreateRO inputPRIDBuyerRO1() throws InterruptedException {
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblAddProd);
        highlightElement(inputPRID);
        inputPRID.sendKeys("ABX123");
        return this;
    }

    @Step("As a user input PR ID Item")
    public CreateRO inputPRItemIDBuyerRO1(){
        highlightElement(inputPRItemID);
        inputPRItemID.sendKeys("332211");
        return this;
    }

    @Step("As a user click save button")
    public CreateRO btnSaveProdBuyerRO(){
        highlightElement(btnSaveProd);
        btnSaveProd.click();
        return this;
    }

    @Step("As a user click next button")
    public CreateRO btnNextPage3BuyerRO() throws InterruptedException {
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblProd2);
        highlightElement(btnNextPage3);
        btnNextPage3.click();
        return this;
    }

    @Step("As a user input subject")
    public CreateRO inputSubjectBuyerRO(){
        highlightElement(inputSubject);
        inputSubject.sendKeys("Automated RO");
        return this;
    }

    @Step("As a user click department")
    public CreateRO clickDepartmentBuyerRO(){
        highlightElement(clickDepartment);
        clickDepartment.click();
        return this;
    }

    @Step("As a user choose department")
    public CreateRO chooseDepartmentNameBuyerRO(){
        highlightElement(chooseDepartmentName);
        chooseDepartmentName.click();
        return this;
    }

    @Step("As a user input start date")
    public CreateRO inputDateStartBuyerRO(){
        highlightElement(inputDateStart);
        inputDateStart.sendKeys("30 September '22");
        return this;
    }

    @Step("As a user input finish date")
    public CreateRO inputDateFinishBuyerRO() {
        highlightElement(inputDateFinish);
        inputDateFinish.sendKeys("25 October '22");
        return this;
    }

    @Step("As a user click Terms of payment")
    public CreateRO clickTermsOfPaymentBuyerRO(){
        highlightElement(clickTermsOfPayment);
        clickTermsOfPayment.click();
        return this;
    }

    @Step("As a user choose Terms of payment")
    public CreateRO chooseTermsOfPaymentBuyerRO(){
        highlightElement(chooseTermsOfPayment);
        chooseTermsOfPayment.click();
        return this;
    }

    @Step("As a user input start date")
    public CreateRO inputNotesBuyerRO(){
        highlightElement(inputNotes);
        inputNotes.sendKeys("Good Quality, Order again!");
        return this;
    }

    @Step("As a user click without approval")
    public CreateRO withoutApprovalBuyerRO() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblscroll);
        Thread.sleep(2000);
        highlightElement(withoutApproval);
        withoutApproval.click();
        return this;
    }

    @Step("As a user click create RO")
    public CreateRO buttonCreateBuyerRO(){
        highlightElement(buttonCreate);
        buttonCreate.click();
        return this;
    }

    @Step("As a user click create RO Pop Up")
    public CreateRO buttoncreatePopUpBuyerRO(){
        highlightElement(buttoncreatePopUp);
        buttoncreatePopUp.click();
        return this;
    }

    @Step("As user already created TC")
    public CreateRO lblSuccessCreateRO() throws Exception {
        highlightElement(lblSuccess);
        String Actualstatus = lblSuccess.getText();
        String Expectstatus = "Lapellaa Nausee1";
        Assert.assertEquals(Actualstatus,Expectstatus);
        System.out.println("Welcome" + Actualstatus);
        Thread.sleep(300);
        robotScreenCapture("Create RO Succeed");
        return this;
    }





}
