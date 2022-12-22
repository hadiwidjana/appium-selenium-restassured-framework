package Gokomodo.FE.Web.Buyer.PageObjects.Eproc;

import Gokomodo.FE.Web.LoginManager.Buyer.pageObjects.pages.BuyerLoginNauseee1PageObject;
import Gokomodo.GlobalMethod.AllureReport.AllureAttachments;
import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.Base64;

public class CreateTC extends BuyerLoginNauseee1PageObject {

    //============== Login ==================//
    @FindBy(id = "email-login")
    private WebElement txtLogin;
    @FindBy(id = "password-login")
    private  WebElement pwdLogin;
    @FindBy(id = "submit-login")
    private WebElement btnLogin;
    //=======================================//

    //================ Create TC =================//

    @FindBy(id = "btn-createNew")
    private WebElement createNewTc;
    @FindBy(xpath = "//a[contains(text(),'Trade Confirmation')]")
    private WebElement createNewTcChoose;
    @FindBy(xpath = "//label[contains(text(),'Gokomodo Vendor')]")
    private WebElement rdBtnGkVendor;

    @FindBy(id = "react-select-6-input")
    private WebElement clickVendor;
//    @FindBy(id = "react-select-7-input")
//    private WebElement inputVendor;
    @FindBy(id = "react-select-6-option-2")
    private WebElement chooseVendor;
    //
    @FindBy(xpath = "//strong[contains(text(),'Purchase Information')]")
    private WebElement lblPurchase;
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[2]/div[4]/input")
    private WebElement SubjectTC;
    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[2]/div[5]/div/div/div/div[1]")
    private WebElement clickCategory;
    @FindBy(id = "react-select-3-option-0")
    private WebElement chooseCategory;
    //
    @FindBy(xpath = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[2]/div[6]/div[1]/div[1]/div[1]/div[1]")
    private WebElement clickDepartment;
    @FindBy(id = "react-select-4-option-0")
    private WebElement chooseDepartment;
    //
    @FindBy(xpath = "//strong[contains(text(),'Products and Deliveries')]")
    private WebElement lblDate;
    //
    @FindBy(id = "tcDirect-startDeadline")
    private WebElement inputStartDate;
    @FindBy(id = "tcDirect-endDeadline")
    private WebElement inputFinishDate;
    //
    @FindBy(xpath = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[2]/div[8]/div[1]/div[1]/div[1]/div[1]")
    private WebElement clickTermsPayment;
    @FindBy(id = "react-select-5-option-0")
    private WebElement chooseTermsPayment;
    //
    @FindBy(xpath = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[2]/div[9]/div[1]/textarea[1]")
    private WebElement inputNotesTC;
    //
    @FindBy(xpath = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[2]/div[10]/div[1]/div[1]/div[1]/div[2]/div[2]/input[1]")
    private WebElement AddAttachTC;
    //
    @FindBy(xpath = "//label[contains(text(),'Choose Delivery Method')]")
    private WebElement lblDeliveryMethod;
    //BULK
    @FindBy(xpath = "//label[contains(text(),'Bulk Delivery')]")
    private WebElement rdBtnDelivered;
    //
    //----- add product -----//
    @FindBy(xpath = "//button[contains(text(),'Add products and deliveries')]")
    private WebElement btnAddProduct;
    @FindBy(xpath = "//body/div[@id='root']/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
    private WebElement clickCompanybox;
    @FindBy(id = "react-select-7-option-0")
    private WebElement chooseCompany;
    @FindBy(xpath = "/html/body/div[1]/div/main/div[2]/div[2]/div/div/div[2]/div/div/div[1]")
    private WebElement clickCompLoc;
    @FindBy(id = "react-select-8-option-0")
    private WebElement chooseCompLoc;
    @FindBy(xpath = "/html/body/div[1]/div/main/div[2]/div[3]/div/div/div[1]")
    private WebElement addNewProdManualbtn;
    //product add
    @FindBy(id = "react-select-9-input")
    private WebElement inputProductName1;
    @FindBy(id = "react-select-9-option-0")
    private WebElement inputProductName2;
    @FindBy(xpath = "/html/body/div[1]/div/main/div[2]/div[3]/div/div/div[1]/div/div[11]/input")
    private WebElement inputProductBrand;
//    @FindBy(xpath = "/html/body/div[1]/div/main/div[2]/div[3]/div/div/div[1]/div/div[12]/input")
//    private WebElement inputProductNoMaterial;
    @FindBy(xpath = "/html/body/div[1]/div/main/div[2]/div[3]/div/div/div[1]/div/div[13]/div/input")
    private WebElement inputProductQuantity;
    @FindBy(id = "react-select-20-input")
    private WebElement clickUoM;
    @FindBy(id = "react-select-20-option-3")
    private WebElement chooseUoM;
    @FindBy(xpath = "/html/body/div[1]/div/main/div[2]/div[3]/div/div/div[1]/div/div[15]/input")
    private WebElement inputUnitCost;
    @FindBy(id = "react-select-11-input")
    private WebElement clickDiscount;
    @FindBy(id = "react-select-11-option-0")
    private WebElement chooseDiscount;
    @FindBy(xpath = "/html/body/div[1]/div/main/div[2]/div[3]/div/div/div[1]/div/div[17]/input")
    private WebElement inputDiscount;
    @FindBy(xpath = "/html/body/div[1]/div/main/div[2]/div[3]/div/div/div[1]/div/div[25]/input")
    private WebElement inputPRID;
    @FindBy(xpath = "/html/body/div[1]/div/main/div[2]/div[3]/div/div/div[1]/div/div[26]/input")
    private WebElement inputPRItemID;
    @FindBy(xpath = "/html/body/div[1]/div/main/div[2]/div[3]/div/div/div[1]/div/div[27]/div/div/div/div[2]/div")
    private WebElement clickSubsidiary;
    @FindBy(id = "react-select-12-option-0")
    private WebElement chooseSubsidiary;
    @FindBy(xpath = "/html/body/div[1]/div/main/div[2]/div[3]/div/div/div[1]/div/div[28]/div/div/div/div[2]/div")
    private WebElement clickLocSubsidiary;
    @FindBy(id = "react-select-13-option-0")
    private WebElement chooseLocSubsidiary;
    @FindBy(xpath = "/html/body/div[1]/div/main/div[2]/div[3]/div/div/div[1]/div/div[29]/input")
    private WebElement inputInitialUnitCost;
    @FindBy(xpath = "/html/body/div[1]/div/main/div[2]/div[3]/div/div/div[4]/div/div[3]/div/div[2]/input")
    private WebElement inputDelivCOst;
    @FindBy(xpath = "/html/body/div[1]/div/main/div[2]/div[3]/h5")
    private WebElement lblProducts;
    @FindBy(xpath = "/html/body/div[1]/div/main/div[2]/div[5]/div/button[2]")
    private WebElement btnSaveProducts;
    //finish add products
    //----------------------//

    //
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[2]/div[14]/div[1]/div/label")
    private WebElement rdBtnWithoutApproval;
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[5]/div/button[2]")
    private WebElement createTCbtn;
    @FindBy(xpath = "/html/body/div[3]/div/div[1]/div/div/div[3]/button[2]")
    private WebElement createTCPopUpBtn;
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[2]/div[12]/div/div/div/div/div[1]/div[1]/div[1]/div[1]/h5")
    private WebElement lblLanausee;
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[3]/a[1]/button")
    private WebElement backHomebtn;

    @FindBy(xpath = "/html/body/div[1]/div/main/div/div/div/div/div/div[1]/h4")
    private WebElement lblSuccess;


    //============================================//


    @Step("As a user already input email")
    public CreateTC InputEmail() throws InterruptedException {
        Thread.sleep(1000);
        AllureAttachments.saveWebElement(getWebDriver(),txtLogin);
        highlightElement(txtLogin);
        txtLogin.sendKeys(decryptData(usrNausee));
        return this;
    }

    @Step("As a user already input password")
    public CreateTC InputPassword(){

        highlightElement(pwdLogin);
        pwdLogin.sendKeys(decryptData(appConfig.getPasswordAccount()));
        return this;
    }

    @Step("As a user click button submit")
    public CreateTC btnLogin(){
        highlightElement(btnLogin);
        btnLogin.click();
        return this;
    }

    @Step("As a user click Create New")
    public CreateTC createNewTcBuyer(){
        highlightElement(createNewTc);
        createNewTc.click();
        return this;
    }

    @Step("As a user click Create New TC")
    public CreateTC createNewTcChooseBuyer(){
        highlightElement(createNewTcChoose);
        createNewTcChoose.click();
        return this;
    }

    @Step("As a user click vendor box")
    public CreateTC rdBtnGkVendorBuyer(){
        highlightElement(rdBtnGkVendor);
        rdBtnGkVendor.click();
        return this;
    }

    @Step("As a user click Select Vendor")
    public CreateTC clickVendorBuyer(){
        highlightElement(clickVendor);
        clickVendor.sendKeys("PT Komodo");
        return this;
    }

    @Step("As a user choose Vendor")
    public CreateTC chooseVendorBuyer(){
        highlightElement(chooseVendor);
        chooseVendor.click();
        return this;
    }

    @Step("As a user input subject")
    public CreateTC SubjectTCBuyer() throws InterruptedException {
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblPurchase);
        highlightElement(SubjectTC);
        SubjectTC.sendKeys("Test OOP Automate");
        return this;
    }

    @Step("As a user Click Category")
    public CreateTC clickCategoryBuyer(){
        highlightElement(clickCategory);
        clickCategory.click();
        return this;
    }

    @Step("As a user choose Category")
    public CreateTC chooseCategoryBuyer(){
        highlightElement(chooseCategory);
        chooseCategory.click();
        return this;
    }

    @Step("As a user input click Department")
    public CreateTC clickDepartmentBuyerTC(){
        highlightElement(clickDepartment);
        clickDepartment.click();
        return this;
    }

    @Step("As a user input choose Department")
    public CreateTC chooseDepartmentBuyerTC(){
        highlightElement(chooseDepartment);
        chooseDepartment.click();
        return this;
    }

    @Step("As a user input start date")
    public CreateTC inputStartDateTCBuyer() throws InterruptedException {
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblDate);
        highlightElement(inputStartDate);
        inputStartDate.sendKeys("30 September '22");
        return this;
    }

    @Step("As a user input finish date")
    public CreateTC inputFinishDateTCBuyer() {
        highlightElement(inputFinishDate);
        inputFinishDate.sendKeys("25 October '22");
        return this;
    }

    @Step("As a user click Terms of payments")
    public CreateTC clickTermsPaymentTCBuyer(){
        highlightElement(clickTermsPayment);
        clickTermsPayment.click();
        return this;
    }

    @Step("As a user choose Terms of payments")
    public CreateTC chooseTermsPaymentTCBuyer(){
        highlightElement(chooseTermsPayment);
        chooseTermsPayment.click();
        return this;
    }

    @Step("As a user input notes TC")
    public CreateTC inputNotestcBuyerTC(){
        highlightElement(inputNotesTC);
        inputNotesTC.sendKeys("Test Automate Checking!");
        return this;
    }

    @Step("As a user input notes TC")
    public CreateTC AddAttachtcBuyerTC(){
        highlightElement(AddAttachTC);
        AddAttachTC.sendKeys(appConfig.getAttachemntEproc1());
        return this;
    }

    @Step("As a user choose delivered radio")
    public CreateTC rdBtnDeliveredBuyerTC() throws InterruptedException {
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblDeliveryMethod);
        highlightElement(rdBtnDelivered);
        rdBtnDelivered.click();
        return this;
    }

    @Step("As a user add product")
    public CreateTC btnAddProductBuyerTC() throws InterruptedException {
        highlightElement(btnAddProduct);
        btnAddProduct.click();
        Thread.sleep(3000);
        return this;
    }

    @Step("As a user click products box")
    public CreateTC clickCompanyboxBuyerTC() {
        highlightElement(clickCompanybox);
        clickCompanybox.click();
        return this;
    }

    @Step("As a user choose products box")
    public CreateTC chooseCompanyBuyerTC() {
        highlightElement(chooseCompany);
        chooseCompany.click();
        return this;
    }

    @Step("As a user click company location")
    public CreateTC clickCompLocBuyerTC() {
        highlightElement(clickCompLoc);
        clickCompLoc.click();
        return this;
    }

    @Step("As a user choose company location")
    public CreateTC chooseCompLocBuyerTC() {
        highlightElement(chooseCompLoc);
        chooseCompLoc.click();
        return this;
    }

    @Step("As a user add new Product")
    public CreateTC addNewProdManualbtnBuyerTC() throws InterruptedException {
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblProducts);
        highlightElement(addNewProdManualbtn);
        addNewProdManualbtn.click();
        return this;
    }

    @Step("As a user input Product Name")
    public CreateTC inputProductName1BuyerTC() {
        highlightElement(inputProductName1);
        inputProductName1.sendKeys("Leptop");
        return this;
    }

    @Step("As a user input Product Name")
    public CreateTC inputProductName2BuyerTC() {
        highlightElement(inputProductName2);
        inputProductName2.click();
        return this;
    }


    @Step("As a user input Product brand")
    public CreateTC inputProductBrandBuyerTC() {
        highlightElement(inputProductBrand);
        inputProductBrand.sendKeys("Lenovo");
        return this;
    }

    @Step("As a user input quantity")
    public CreateTC inputProductQuantityBuyerTC() {
        highlightElement(inputProductQuantity);
        inputProductQuantity.sendKeys("100");
        return this;
    }

//    @Step("As a user click Product UoM")
//    public CreateTC clickUoMBuyerTC() {
//        highlightElement(clickUoM);
//        clickUoM.click();
//        return this;
//    }
//
//    @Step("As a user input Product UoM")
//    public CreateTC chooseUoMBuyerTC() {
//        highlightElement(chooseUoM);
//        chooseUoM.click();
//        return this;
//    }

    @Step("As a user input Unit cost")
    public CreateTC inputUnitCostBuyerTC() {
        highlightElement(inputUnitCost);
        inputUnitCost.sendKeys("5000000");
        return this;
    }

    @Step("As a user choose the discount")
    public CreateTC clickDiscountBuyerTC() {
        highlightElement(clickDiscount);
        clickDiscount.click();
        return this;
    }

    @Step("As a user input Unit cost")
    public CreateTC chooseDiscountBuyerTC() {
        highlightElement(chooseDiscount);
        chooseDiscount.click();
        return this;
    }

    @Step("As a user input Unit cost")
    public CreateTC inputDiscountBuyerTC() {
        highlightElement(inputDiscount);
        inputDiscount.sendKeys("4");
        return this;
    }

    @Step("As a user input PR ID")
    public CreateTC inputPRIDBuyerTC() {
        highlightElement(inputPRID);
        inputPRID.sendKeys("ABC111");
        return this;
    }

    @Step("As a user input PR item ID")
    public CreateTC inputPRItemIDBuyerTC() {
        highlightElement(inputPRItemID);
        inputPRItemID.sendKeys("112233");
        return this;
    }

    @Step("As a user click subsidiary")
    public CreateTC clickSubsidiaryBuyerTC() {
        highlightElement(clickSubsidiary);
        clickSubsidiary.click();
        return this;
    }

    @Step("As a user choose subsidiary")
    public CreateTC chooseSubsidiaryBuyerTC() {
        highlightElement(chooseSubsidiary);
        chooseSubsidiary.click();
        return this;
    }

    @Step("As a user click Loc subsidiary")
    public CreateTC clickLocSubsidiaryBuyerTC() {
        highlightElement(clickLocSubsidiary);
        clickLocSubsidiary.click();
        return this;
    }

    @Step("As a user choose Loc subsidiary")
    public CreateTC chooseLocSubsidiaryBuyerTC() {
        highlightElement(chooseLocSubsidiary);
        chooseLocSubsidiary.click();
        return this;
    }

    @Step("As a user input initial unit cost")
    public CreateTC inputInitialUnitCostBuyerTC() {
        highlightElement(inputInitialUnitCost);
        inputInitialUnitCost.sendKeys("4500000");
        return this;
    }

    @Step("As a user input delivery cost")
    public CreateTC inputDelivCOstBuyerTC() {
        highlightElement(inputDelivCOst);
        inputDelivCOst.sendKeys("4000000");
        return this;
    }

    @Step("As a user click Loc subsidiary")
    public CreateTC btnSaveProductsBuyerTC() {
        highlightElement(btnSaveProducts);
        btnSaveProducts.click();
        return this;
    }


    @Step("As a user click without approval")
    public CreateTC rdBtnWithoutApprovalBuyerTC() throws InterruptedException {
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblLanausee);
        highlightElement(rdBtnWithoutApproval);
        rdBtnWithoutApproval.click();
        return this;
    }

    @Step("As a user click create TC")
    public CreateTC createTCbtnBuyerTC() {
        highlightElement(createTCbtn);
        createTCbtn.click();
        return this;
    }

    @Step("As a user click create TC Pop Up")
    public CreateTC createTCPopUpBtnBuyerTC() {
        highlightElement(createTCPopUpBtn);
        createTCPopUpBtn.click();
        return this;
    }

    @Step("As a user click back to menu")
    public CreateTC backHomebtnBuyerTC() {
        highlightElement(backHomebtn);
        backHomebtn.click();
        return this;
    }

    @Step("As user already created TC")
    public CreateTC lblSuccessCreateTC() throws Exception {
        highlightElement(lblSuccess);
        String Actualstatus = lblSuccess.getText();
        String Expectstatus = "Lapellaa Nausee1";
        Assert.assertEquals(Actualstatus,Expectstatus);
        System.out.println("Welcome" + Actualstatus);
        Thread.sleep(300);
        robotScreenCapture("Create TC Succeed");
        return this;
    }


}
