package Gokomodo.FE.Web.Buyer.PageObjects.Eproc.Tender;

import Gokomodo.FE.Web.LoginManager.Buyer.pageObjects.pages.BuyerLoginNauseee1PageObject;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Base64;

public class CreateRFQ_For_Tender extends BuyerLoginNauseee1PageObject {

    //======= Xpath & ID ======//
    @FindBy(xpath = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")
    private WebElement inputEmail;
    @FindBy(xpath = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/input[1]")
    private  WebElement inputPassword;
    @FindBy(xpath = "//button[contains(text(),'Masuk')]")
    private WebElement btnLoginEproc;


    //==========================================================================//

    @FindBy(id = "btn-createNew")
    private WebElement btnCreateNewRFQ;
    //
    //
    @FindBy(xpath = "/html/body/div[1]/div/header/div/nav/ul[3]/li/li/div/div[1]/a")
    private WebElement btnSubCreateNewRFQ;
    //=======================================//

    //============ Page 1 ===================//
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[3]/div/div/div[1]/input")
    private WebElement SubjectRFQbox;
    //
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[3]/div/div/div[2]/div/div/div/div[1]")
    private WebElement SelectCategory;
    //
    @FindBy(id = "react-select-3-option-2")
    private WebElement SelectMenuDropdownCategory;
    //
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[3]/div/div/div[2]/div[2]/div/div/div/div/div[1]")
    private WebElement SelectSubCategory;
    //
    @FindBy(id = "react-select-5-option-0")
    private WebElement SelectMenuDropdownSubCategory;
    //
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[3]/div/div/div[2]/div[2]/div/div/div[2]/div[1]/label/span")
    private WebElement CheckbuttonPilihSemua;
    //
    //--
    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[3]/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[12]/label/div")
    private WebElement Scroll1;
    //--
    //
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[3]/div/div/div[4]/div[1]/div/div/div[1]")
    private WebElement SelectDepartment;
    //
    @FindBy(id = "react-select-4-option-0")
    private WebElement SelectDepartmentDropdownList;
    //
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[3]/div/div/div[5]/div[2]/label/input")
    private WebElement RdPriority;
    //
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[3]/div/div/div[6]/div/div/button[2]")
    private WebElement btntoSecondPage;
    //=================================================================================//

    //======================== Page 2 ============================//
    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[3]/div[1]/div/div[1]/div[1]/div[1]/label")
    private WebElement DeliveryMethodFranco;
    //
    //--
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[3]/div[1]/div/div[2]/label")
    private WebElement Scroll2;
    //--
    //Add products//
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[3]/div[1]/div/div[2]/div/div/div/div[2]/button")
    private WebElement AddBtnProduct;
    //
    @FindBy(xpath = "/html/body/div[3]/div/div[1]/div/div/div/div[2]/div/div/div/div[1]/div/div/div[1]/label/input")
    private WebElement RdBtnLocationSaveAddress;
    //
    @FindBy(css = ".flex-wrap > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1)")
    private WebElement TBoxInputCompany;
    //@FindBy(xpath = "//*[@id=\"react-select-9-option-0\"]")
    @FindBy(id = "react-select-9-option-0")
    private WebElement TboxDropdownCompanyDelivery;
    //
    @FindBy(xpath = "/html/body/div[3]/div/div[1]/div/div/div[1]/div/div[1]/div[2]/div/div/div[2]/div/div/div[1]")
    //@FindBy(xpath = "/html/body/div[3]/div/div[1]/div/div/div[1]/div/div[1]/div[2]/div/div/div[2]/div/div/div[2]/div")
    private WebElement CompanyLocationforProduct;
    @FindBy(id = "react-select-10-option-0")
    private WebElement DropdownListCompanyLocationforProduct;
    //
    @FindBy(xpath = "/html/body/div[3]/div/div[1]/div/div/div[1]/div/div[2]/div[1]/div/div/div[1]/input")
    private WebElement BtnAddProductUploadFile;
    //
    @FindBy(id = "btn-AddProdDelv")
    private WebElement BtnSaveAddProduct;
    //finish product//
    //
    //submission
    @FindBy(xpath = "//*[@id=\"rfqForm-dateDeadline\"]")
    private WebElement DateChooseBox;
    //
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[3]/div[2]/div[1]/div/div[2]/div/div/div[1]")
    private WebElement TimeChooseBox1;
    @FindBy(id = "react-select-7-option-3")
    private WebElement TimeChooseBox2;
    //
    //--
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[3]/div[2]/div[1]/label")
    private WebElement Scroll3;
    //--
    //
    @FindBy(xpath = "//input[@id='rfqForm-startDeadline']")
    private WebElement StartdeliveryStartDate;
    @FindBy(xpath = "//input[@id='rfqForm-endDeadline']")
    private WebElement StartdeliveryFinishDate;
    //
    @FindBy(id = "react-select-8-input")
    private WebElement TermsOfPaymentsChoose;
    @FindBy(id = "react-select-8-option-1")
    private WebElement ListTermsOfPaymentsChoose;
    //
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[3]/div[2]/div[4]/textarea")
    private WebElement AdditionalNoteBox;
    //
    //--
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[3]/div[3]/div/label")
    private WebElement Scroll4;
    //--
    //
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[3]/div[3]/div/div/div/div[2]/div[2]/input")
    private WebElement AttachmentAdditionalFile;
    //
    @FindBy(id = "btn-Vendor")
    private WebElement ButtonNextToPage3;
    //================== END OF PAGE 2 ========================//

    //===================== Page 3 ===========================//
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[3]/div[1]/div[1]/div/label")
    private WebElement ChooseVendorGokomodo;
    //
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[3]/div[2]/div[3]/div[1]/div[2]/div[1]/label")
    private WebElement RdbuttonChooseArea;
    //
    //--
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[3]/div[2]/div[3]/div[1]/div[1]")
    private WebElement Scroll5;
    //--
    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[3]/div[3]/div[2]/div[1]/label")
    private WebElement clickManualSearch;
    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[3]/div[3]/div[3]/div/div[1]/div/div[1]/div/div[2]/input")
    private WebElement inputVendor;
    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[3]/div[3]/div[3]/div/div[2]/div/div/div[1]/div/div/div[1]/h5")
    private WebElement clickSaka;
    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[3]/div[3]/div[3]/div/div[2]/div/div/div[2]/div/div/div[1]/h5")
    private WebElement clickSellerKomodo;
    //
    @FindBy(id = "btn-Summary")
    //@FindBy(xpath = "//button[@id='btn-Summary']")
    private WebElement ButtonSummarytoPage4;
    //======================= END OF PAGE 3 =======================//

    //====================== Page 4 ========================//

    //@FindBy(xpath = "//button[contains(text(),'Next: Submit RFQ')]")
    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[3]/div/div/div[5]/div/div/button[3]")
    private WebElement ButtonSubmitRFQBuyerEproc;
    @FindBy(xpath = "/html/body/div[3]/div/div[1]/div/div/div[2]/button[2]")
    private WebElement ButtonPopUpSubmitRFQBuyerEproc;
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[3]/a[1]/button")
    private WebElement btnBackToMenu;

    //==========================================================================//


    //==========================================================================//

    @Step("As a user already input email")
    public CreateRFQ_For_Tender InputEmailEproc() throws InterruptedException {
        Thread.sleep(1000);
        highlightElement(inputEmail);
        inputEmail.sendKeys(decryptData(appConfig.getUsrNauseee1()));
        return this;
    }

    @Step("As a user already input password")
    public CreateRFQ_For_Tender InputPasswordEproc(){
        highlightElement(inputPassword);
        inputPassword.sendKeys(decryptData(appConfig.getPasswordAccount()));
        return this;
    }

    @Step("As a user click button login")
    public CreateRFQ_For_Tender BtnEprocLoginEproc(){
        highlightElement(btnLoginEproc);
        btnLoginEproc.click();
        return this;
    }

    @Step("As user click create new button")
    public CreateRFQ_For_Tender BtnEprocCreateNew() {
        highlightElement(btnCreateNewRFQ);
        btnCreateNewRFQ.click();
        return this;
    }

    @Step("As user click create new RFQ button")
    public CreateRFQ_For_Tender BtnEprocCreateNewRFQ() {
        highlightElement(btnSubCreateNewRFQ);
        btnSubCreateNewRFQ.click();
        return this;
    }

    @Step("As user fill the subject name of RFQ")
    public CreateRFQ_For_Tender TboxSubjectRFQ() {
        highlightElement(SubjectRFQbox);
        SubjectRFQbox.sendKeys("Automate OOP Test");
        return this;
    }

    @Step("As user choose the category of RFQ")
    public CreateRFQ_For_Tender TboxofCategory() {
        highlightElement(SelectCategory);
        SelectCategory.click();
        return this;
    }

    @Step("As user choose the category list of RFQ")
    public CreateRFQ_For_Tender TboxofDropdownListCategory() {
        highlightElement(SelectMenuDropdownCategory);
        SelectMenuDropdownCategory.click();
        return this;
    }

    @Step("As user choose the sub-category of RFQ")
    public CreateRFQ_For_Tender TboxofSubCategory() {
        highlightElement(SelectSubCategory);
        SelectSubCategory.click();
        return this;
    }

    @Step("As user choose the sub-category list of RFQ")
    public CreateRFQ_For_Tender TboxofDropdownListSubCategory() {
        highlightElement(SelectMenuDropdownSubCategory);
        SelectMenuDropdownSubCategory.click();
        return this;
    }

    @Step("As user choose All product of category item")
    public CreateRFQ_For_Tender ChecklistbuttonAllitemChoose() {
        highlightElement(CheckbuttonPilihSemua);
        //utils.BuyerAllureAttachments.saveWebElement(getWebDriver(),CheckbuttonPilihSemua);
        CheckbuttonPilihSemua.click();
        return this;
    }

//    @Step("As user scroll to the bottom of the page")
//        public BuyerEprocCreateRFQ Scrolling1(){
//        JavascriptExecutor js1 = (JavascriptExecutor)Scroll1;
//        js1.executeScript("arguments[0].scrollIntoView()",Scroll1);
//        return this;
//    }

    @Step("As user choose department for create RFQ")
    public CreateRFQ_For_Tender TboxChooseDepartment() throws Exception {
        Thread.sleep(4000);
        scrollDown1000();
        highlightElement(SelectDepartment);
        SelectDepartment.click();
        return this;
    }

    @Step("As user choose dropdown list department for create RFQ")
    public CreateRFQ_For_Tender TboxChooseDropdownListDepartment() {
        highlightElement(SelectDepartmentDropdownList);
        SelectDepartmentDropdownList.click();
        return this;
    }

    @Step("As user choose department for create RFQ")
    public CreateRFQ_For_Tender RdbuttonPriorityUrgent() {
        highlightElement(RdPriority);
        RdPriority.click();
        return this;
    }

    @Step("As user Click next button go to the next page")
    public CreateRFQ_For_Tender BtnNextPagetoPage2() {
        highlightElement(btntoSecondPage);
        btntoSecondPage.click();
        return this;
    }

    @Step("As user Choose Delivery Method")
    public CreateRFQ_For_Tender DeliveryMethodChooseFranco() {
        highlightElement(DeliveryMethodFranco);
        DeliveryMethodFranco.click();
        return this;
    }

    //AddBtnProduct
    @Step("As user want to add product by click button product")
    public CreateRFQ_For_Tender ButtonAddProductforRFQ() throws InterruptedException {
        highlightElement(AddBtnProduct);
        AddBtnProduct.click();
        Thread.sleep(4000);
        return this;
    }

    @Step("As user click company for send product")
    public CreateRFQ_For_Tender TBoxInputCompanyNameforProduct(){
        highlightElement(TBoxInputCompany);
        //Gokomodo.Web.Buyer.utils.BuyerExplicitWaiting.explicitWaitElementToBeClickable(TBoxInputCompany, 7000);
        TBoxInputCompany.click();
        return this;
    }

    @Step("As user add company by choose dropdownlist for send product")
    public CreateRFQ_For_Tender TboxDropdownChooseCompanyDelivery() throws InterruptedException {
        Thread.sleep(4000);
        highlightElement(TboxDropdownCompanyDelivery);
        TboxDropdownCompanyDelivery.click();
        return this;
    }

    @Step("As user add company location for send product")
    public CreateRFQ_For_Tender CompanyLocationforProductRFQ(){
        highlightElement(CompanyLocationforProduct);
        CompanyLocationforProduct.click();
        return this;
    }

    @Step("As user add company by choose dropdownlist location for send product")
    public CreateRFQ_For_Tender DropdownListCompanyLocationforProductforRFQ() throws InterruptedException {
        highlightElement(DropdownListCompanyLocationforProduct);
        DropdownListCompanyLocationforProduct.click();
        Thread.sleep(3000);
        return this;
    }

    @Step("As user upload Xls for product")
    public CreateRFQ_For_Tender BtnAddProductUploadFileforRFQ() throws Exception {
        highlightElement(BtnAddProductUploadFile);
        BtnAddProductUploadFile.sendKeys("/Users/nazaralamgokomodo/GATE-Automation/QA-AutomationFramework/srcUploadedFile/komodo-rfq-excel-template.xlsx");
        Thread.sleep(4000);
        return this;
    }


    @Step("As user click the save product button on product page")
    public CreateRFQ_For_Tender BtnSaveAddProductforRFQ() {
        highlightElement(BtnSaveAddProduct);
        BtnSaveAddProduct.click();
        return this;
    }


    @Step("As user click Date textbox for choose dateline RFQ")
    public CreateRFQ_For_Tender DateChooseBoxCLick() throws InterruptedException {
        Thread.sleep(3000);
        scrollDown500();
        highlightElement(DateChooseBox);
        DateChooseBox.sendKeys("30 September 2022");
        return this;
    }

    @Step("As user click Date textbox for choose dateline RFQ")
    public CreateRFQ_For_Tender TimeChooseBoxClick1() {
        highlightElement(TimeChooseBox1);
        TimeChooseBox1.click();
        return this;
    }

    @Step("As user choose Date textbox for choose dateline RFQ")
    public CreateRFQ_For_Tender TimeChooseBoxClick2() {
        highlightElement(TimeChooseBox2);
        TimeChooseBox2.click();
        return this;
    }

    @Step("As user choose interval start delivery the product")
    public CreateRFQ_For_Tender StartdeliveryStartDateClick(){
        highlightElement(StartdeliveryStartDate);
        StartdeliveryStartDate.sendKeys("31 September '22");
        return this;
    }

    @Step("As user choose interval finish delivery the product")
    public CreateRFQ_For_Tender StartdeliveryFinishDateClick(){
        highlightElement(StartdeliveryFinishDate);
        StartdeliveryFinishDate.sendKeys("22 October '22");
        return this;
    }



    @Step("As user Click terms of payments box")
    public CreateRFQ_For_Tender TermsOfPaymentsChooseClick() throws InterruptedException {
        Thread.sleep(4000);
        scrollDown700();
        highlightElement(TermsOfPaymentsChoose);
        TermsOfPaymentsChoose.click();
        return this;
    }

    @Step("As user choose terms of payments box")
    public CreateRFQ_For_Tender ListTermsOfPaymentsTboxChoose() {
        highlightElement(ListTermsOfPaymentsChoose);
        ListTermsOfPaymentsChoose.click();
        return this;
    }

    @Step("As user choose terms of payments box")
    public CreateRFQ_For_Tender AdditionalNoteBoxFilled() {
        highlightElement(AdditionalNoteBox);
        AdditionalNoteBox.sendKeys("It Works! NICE..");
        return this;
    }

    @Step("As user choose terms of payments box")
    public CreateRFQ_For_Tender ButtonNextToPage3Click() {
        highlightElement(ButtonNextToPage3);
        ButtonNextToPage3.click();
        return this;
    }

    @Step("As user choose Vendor Radio button")
    public CreateRFQ_For_Tender ChooseVendorGokomodoRdButton() {
        highlightElement(ChooseVendorGokomodo);
        ChooseVendorGokomodo.click();
        return this;
    }

    @Step("As user choose Area Vendor")
    public CreateRFQ_For_Tender RdbuttonChooseAreaChecklistbutton() {
        highlightElement(RdbuttonChooseArea);
        RdbuttonChooseArea.click();
        return this;
    }

    @Step("As user choose all seller Vendor")
    public CreateRFQ_For_Tender ChooseAllVendorSellerRdbutton() throws InterruptedException {
        Thread.sleep(4000);
        scrollDown700();
        highlightElement(clickManualSearch);
        clickManualSearch.click();
        return this;
    }

    @Step("As user input Saka semua ada in textbox search vendor")
    public CreateRFQ_For_Tender inputVendorTboxEproc() {
        highlightElement(inputVendor);
        inputVendor.sendKeys("saka");
        return this;
    }

    @Step("As user choose and click Saka semua ada in textbox search vendorr")
    public CreateRFQ_For_Tender clickSakaVendorEproc() {
        highlightElement(clickSaka);
        clickSaka.click();
        return this;
    }

    @Step("As user input seller komodo in textbox search vendor")
    public CreateRFQ_For_Tender inputVendor2TboxEproc() {
        highlightElement(inputVendor);
        inputVendor.sendKeys("seller ko");
        return this;
    }

    @Step("As user choose and click Seller Komodo in textbox search vendorr")
    public CreateRFQ_For_Tender clickSellerKomodoVendorEproc() {
        highlightElement(clickSellerKomodo);
        clickSellerKomodo.click();
        return this;
    }

    @Step("As user click summary button move to the next page")
    public CreateRFQ_For_Tender ButtonSummarytoPage4Eproc() throws InterruptedException {
        highlightElement(ButtonSummarytoPage4);
        ButtonSummarytoPage4.click();
        Thread.sleep(4000);
        return this;
    }

    @Step("As user click the button Submit RFQ")
    public CreateRFQ_For_Tender ButtonSubmitRFQBuyerEprocClick() throws InterruptedException {
        highlightElement(ButtonSubmitRFQBuyerEproc);
        ButtonSubmitRFQBuyerEproc.click();
        Thread.sleep(5000);
        return this;
    }

    @Step("As user click the button Submit RFQ")
    public CreateRFQ_For_Tender ButtonPopUpSubmitRFQBuyerEprocClick() {
        highlightElement(ButtonPopUpSubmitRFQBuyerEproc);
        ButtonPopUpSubmitRFQBuyerEproc.click();
        return this;
    }

    @Step("As user click the button Submit RFQ")
    public CreateRFQ_For_Tender buttonBackToMenuBuyer() {
        highlightElement(btnBackToMenu);
        btnBackToMenu.click();
        return this;
    }





}
