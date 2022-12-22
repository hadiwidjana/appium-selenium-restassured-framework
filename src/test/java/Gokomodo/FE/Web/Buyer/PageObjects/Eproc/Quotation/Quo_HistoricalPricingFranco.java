package Gokomodo.FE.Web.Buyer.PageObjects.Eproc.Quotation;


import Gokomodo.FE.Web.LoginManager.Buyer.pageObjects.pages.BuyerLoginNauseee1PageObject;
import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Base64;

public class Quo_HistoricalPricingFranco extends BuyerLoginNauseee1PageObject {

    //============== Login ==================//
    @FindBy(xpath = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")
    private WebElement inputEmail;
    @FindBy(xpath = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/input[1]")
    private  WebElement inputPassword;
    @FindBy(xpath = "//button[contains(text(),'Masuk')]")
    private WebElement btnLoginEproc;



    //=======================================//

    //======================================//

    @FindBy(id = "btn-procurement-list")
    private WebElement btnProcrumentList;
    @FindBy(xpath = "//*[@id=\"root\"]/div/header/div/nav/ul[1]/li[1]/div/div/div/div/div[1]/div[1]")
    private WebElement btnClickRFQ;
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[1]/div/div[1]/div/div[2]/input")
    private WebElement inputRFQFranco;
    @FindBy(xpath = "/html/body/div[1]/div/main/div/table/tbody/tr/td[1]")
    private WebElement clickTheTCList;
    @FindBy(xpath = "//span[contains(text(),'Quotations')]")
    private WebElement clickQuobtn;

    @FindBy(xpath = "//body/div[@id='root']/div[@class='root-wrapper']/main/div/div[@class='container-fluid']/div[@class='row']/div[@class='container-fluid']/div[@class='mt-4 pb-5 mb-5 row']/div[@class='col-lg-12']/div[2]/div[1]/div[2]/button[1]")
    private WebElement clickDetailQuo;
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[2]/div/div[12]/div/div[1]")
    private WebElement lblRFQAttch;
    //
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[4]/div/div[2]/div/div[5]/div[1]/div/div[3]/table/tbody/tr[1]/td[1]/span")
    private WebElement dropDownListProd;
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[4]/div/div[2]/div/div[5]/div[1]/div/div[2]/div[1]/div[2]/h5")
    private WebElement lblLaNausee;
    //
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[4]/div/div[2]/div/div[5]/div[1]/div/div[3]/table/tbody/tr[2]/td/div/div/div/div/div[4]/div[2]/div[2]/small")
    private WebElement clickUnitCost;
    @FindBy(xpath = "/html/body/div[3]/div/div[1]/div/div/div[2]/div/div/div[5]/div[2]/div[2]/ul/li[2]")
    private WebElement clickPage2;
    @FindBy(xpath = "/html/body/div[3]/div/div[1]/div/div/div[2]/div/div/div[5]/div[2]/div[2]/ul/li[1]")
    private WebElement backToFirst;
    @FindBy(xpath = "/html/body/div[3]/div/div[1]/div/div/div[2]/div/div/div[5]/div[2]/div[2]/ul/li[3]")
    private WebElement goToLast;
    @FindBy(id = "pageDropDown")
    private WebElement clickPageDown;
    @FindBy(xpath = "/html/body/div[3]/div/div[1]/div/div/div[2]/div/div/div[5]/div[2]/div[1]/span[1]/ul/a[1]")
    private WebElement ClickPageDown5;
    @FindBy(xpath = "/html/body/div[3]/div/div[1]/div/div/div[2]/div/div/div[5]/div[2]/div[1]/span[1]/ul/a[2]")
    private WebElement ClickPageDown10;
    @FindBy(xpath = "/html/body/div[3]/div/div[1]/div/div/div[2]/div/div/div[5]/div[2]/div[1]/span[1]/ul/a[3]")
    private WebElement ClickPageDown25;
    @FindBy(xpath = "/html/body/div[3]/div/div[1]/div/div/div[2]/div/div/div[5]/div[2]/div[1]/span[1]/ul/a[4]")
    private WebElement ClickPageDown50;
    @FindBy(xpath = "//span[contains(text(),'×')]")
    private WebElement closeUnitCostChanges;
    //
    @FindBy(xpath = "/html/body/div[3]/div/div[1]/div/div/div[2]/div/div/div[4]")
    private WebElement lblPopUp;
    @FindBy(xpath = "/html/body/div[3]/div/div[1]/div/div/div[1]")
    private WebElement lblPopUp2;
    //
    @FindBy(xpath = "//th[contains(text(),'Product Name')]")
    private WebElement lblUnitBrand;
    @FindBy(xpath = "//small[contains(text(),'View Quantity Changes')]")
    private WebElement clickQuantityCost;
    //
    @FindBy(xpath = "//div[@class='col-9 p-3 bg-white']//div[@class='btn-link p-0 text-right']//small[contains(text(),'View Discount Changes')]")
    private WebElement clickViewDiscount;
    //
    @FindBy(xpath = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/div[4]/div[1]")
    private WebElement lblTotal;
    @FindBy(xpath = "//body[1]/div[1]/div[1]/main[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[5]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/small[1]")
    private WebElement clickDiscountTotal;



    //================================ STEP ==================================//
    @Step("As a user already input email")
    public Quo_HistoricalPricingFranco InputEmailEproc() throws InterruptedException {
        Thread.sleep(1000);
        highlightElement(inputEmail);
        inputEmail.sendKeys(decryptData(appConfig.getUsrNauseee1()));
        return this;
    }

    @Step("As a user already input password")
    public Quo_HistoricalPricingFranco InputPasswordEproc(){
        highlightElement(inputPassword);
        inputPassword.sendKeys(decryptData(appConfig.getPasswordAccount()));
        return this;
    }

    @Step("As a user click button login")
    public Quo_HistoricalPricingFranco BtnEprocLoginEproc(){
        highlightElement(btnLoginEproc);
        btnLoginEproc.click();
        return this;
    }

    @Step("As a user click Procrument on navbar")
    public Quo_HistoricalPricingFranco btnProcrumentListTCFranco(){
        highlightElement(btnProcrumentList);
        btnProcrumentList.click();
        return this;
    }

    @Step("As a user click RFQ Button")
    public Quo_HistoricalPricingFranco btnClickTCFranco() throws InterruptedException {
        highlightElement(btnClickRFQ);
        btnClickRFQ.click();
        Thread.sleep(3000);
        return this;
    }

    @Step("As a user Search RFQ for Franco (RFQ/2022/09/169)")
    public Quo_HistoricalPricingFranco inputEprocTCFranco() throws InterruptedException {
        highlightElement(inputRFQFranco);
        inputRFQFranco.sendKeys("RFQ/2022/09/169");
        Thread.sleep(3000);
        return this;
    }

    @Step("As a user click view button on that RFQ")
    public Quo_HistoricalPricingFranco clickTheTCListFranco() throws InterruptedException {
        highlightElement(clickTheTCList);
        clickTheTCList.click();
        Thread.sleep(3000);
        return this;
    }

    @Step("As a user click quotation")
    public Quo_HistoricalPricingFranco clickQuobtnFranco(){
        highlightElement(clickQuobtn);
        clickQuobtn.click();
        return this;
    }

//    JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
//        js.executeScript("arguments[0].scrollIntoView();", lblUpdateQuotation);
//        Thread.sleep(3000);

    @Step("As a user click view details quotation")
    public Quo_HistoricalPricingFranco clickDetailQuoFranco() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblRFQAttch);
        Thread.sleep(3000);
        highlightElement(clickDetailQuo);
        clickDetailQuo.click();
        return this;
    }

    @Step("As a user click dropdown icon product")
    public Quo_HistoricalPricingFranco dropDownListProdFranco() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblLaNausee);
        Thread.sleep(3000);
        highlightElement(dropDownListProd);
        dropDownListProd.click();
        return this;
    }


    //====================================================================================//
    @Step("As a user click View Unit cost historical pricing")
    public Quo_HistoricalPricingFranco clickUnitCostFranco() throws InterruptedException {
        highlightElement(clickUnitCost);
        clickUnitCost.click();
        Thread.sleep(3000);
        return this;
    }

    @Step("As a user click View Unit cost historical pricing page 2")
    public Quo_HistoricalPricingFranco clickPage2UnitCostFranco(){
        highlightElement(clickPage2);
        clickPage2.click();
        return this;
    }

    @Step("As a user click View Unit cost historical pricing first page")
    public Quo_HistoricalPricingFranco backToFirstUnitCostFranco(){
        highlightElement(backToFirst);
        backToFirst.click();
        return this;
    }

    @Step("As a user click View Unit cost historical pricing last page")
    public Quo_HistoricalPricingFranco goToLastUnitCostFranco(){
        highlightElement(goToLast);
        goToLast.click();
        return this;
    }

    @Step("As a user click index View historical pricing list")
    public Quo_HistoricalPricingFranco clickPageDownUnitCostFranco(){
        highlightElement(clickPageDown);
        clickPageDown.click();
        return this;
    }

    @Step("As a user click index View historical pricing for 10 list")
    public Quo_HistoricalPricingFranco ClickPageDown10UnitCostFranco(){
        highlightElement(ClickPageDown10);
        ClickPageDown10.click();
        return this;
    }

    @Step("As a user click index View historical pricing list")
    public Quo_HistoricalPricingFranco clickPageDown2UnitCostFranco(){
        highlightElement(clickPageDown);
        clickPageDown.click();
        return this;
    }

    @Step("As a user click index View historical pricing for 25 list")
    public Quo_HistoricalPricingFranco ClickPageDown25UnitCostFranco() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblPopUp);
        Thread.sleep(3000);
        highlightElement(ClickPageDown25);
        ClickPageDown25.click();
        return this;
    }

    @Step("As a user click index View historical pricing list")
    public Quo_HistoricalPricingFranco clickPageDown3UnitCostFranco(){
        highlightElement(clickPageDown);
        clickPageDown.click();
        return this;
    }

    @Step("As a user click index View historical pricing for 50 list")
    public Quo_HistoricalPricingFranco ClickPageDown50UnitCostFranco() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblPopUp);
        Thread.sleep(3000);
        highlightElement(ClickPageDown50);
        ClickPageDown50.click();
        return this;
    }

    @Step("As a user click close index View historical pricing")
    public Quo_HistoricalPricingFranco closeUnitCostChangesFranco() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblPopUp2);
        Thread.sleep(3000);
        highlightElement(closeUnitCostChanges);
        closeUnitCostChanges.click();
        return this;
    }
    //====================================================================================//


    //====================================================================================//
    @Step("As a user click Quantitiy Cost changes")
    public Quo_HistoricalPricingFranco clickQuantityCostFranco() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblUnitBrand);
        Thread.sleep(3000);
        highlightElement(clickQuantityCost);
        clickQuantityCost.click();
        Thread.sleep(3000);
        return this;
    }

    @Step("As a user click index View Unit Cost list")
    public Quo_HistoricalPricingFranco clickPageDownQuantityCost(){
        highlightElement(clickPageDown);
        clickPageDown.click();
        return this;
    }

    @Step("As a user click index View historical pricing for 10 list")
    public Quo_HistoricalPricingFranco ClickPageDown10QuantityCost(){
        highlightElement(ClickPageDown10);
        ClickPageDown10.click();
        return this;
    }

    @Step("As a user click index View historical pricing list")
    public Quo_HistoricalPricingFranco clickPageDown2QuantityCostFranco(){
        highlightElement(clickPageDown);
        clickPageDown.click();
        return this;
    }

    @Step("As a user click index View historical pricing for 25 list")
    public Quo_HistoricalPricingFranco ClickPageDown25QuantityCostFranco() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblPopUp);
        Thread.sleep(3000);
        highlightElement(ClickPageDown25);
        ClickPageDown25.click();
        return this;
    }

    @Step("As a user click index View historical pricing list")
    public Quo_HistoricalPricingFranco clickPageDown3QuantityCostFranco(){
        highlightElement(clickPageDown);
        clickPageDown.click();
        return this;
    }

    @Step("As a user click index View historical pricing for 50 list")
    public Quo_HistoricalPricingFranco ClickPageDown50QuantityCostFranco() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblPopUp);
        Thread.sleep(3000);
        highlightElement(ClickPageDown50);
        ClickPageDown50.click();
        return this;
    }

    @Step("As a user click close index View Quantity pricing")
    public Quo_HistoricalPricingFranco closeUnitCostChangesQuantityCostFranco() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblPopUp2);
        Thread.sleep(3000);
        highlightElement(closeUnitCostChanges);
        closeUnitCostChanges.click();
        return this;
    }
    //====================================================================================//


    //====================================================================================//
    @Step("As a user click index View Discount pricing list")
    public Quo_HistoricalPricingFranco clickViewDiscountFranco() throws InterruptedException {
        Thread.sleep(3000);
        highlightElement(clickViewDiscount);
        clickViewDiscount.click();
        return this;
    }

    @Step("As a user click index View Unit Cost list")
    public Quo_HistoricalPricingFranco clickPageDown2ViewDiscountFranco() throws InterruptedException {
        Thread.sleep(3000);
        highlightElement(clickPageDown);
        clickPageDown.click();
        return this;
    }

    @Step("As a user click index View historical pricing for 10 list")
    public Quo_HistoricalPricingFranco ClickPageDown10ViewDiscountFranco(){
        highlightElement(ClickPageDown10);
        ClickPageDown10.click();
        return this;
    }

    @Step("As a user click index View historical pricing list")
    public Quo_HistoricalPricingFranco clickPageDown3ViewDiscountFranco(){
        highlightElement(clickPageDown);
        clickPageDown.click();
        return this;
    }

    @Step("As a user click index View historical pricing for 25 list")
    public Quo_HistoricalPricingFranco ClickPageDown25ViewDiscountFranco() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblPopUp);
        Thread.sleep(3000);
        highlightElement(ClickPageDown25);
        ClickPageDown25.click();
        return this;
    }

    @Step("As a user click index View historical pricing list")
    public Quo_HistoricalPricingFranco clickPageDown4ViewDiscountFranco(){
        highlightElement(clickPageDown);
        clickPageDown.click();
        return this;
    }

    @Step("As a user click index View historical pricing for 50 list")
    public Quo_HistoricalPricingFranco ClickPageDown50ViewDiscountFranco() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblPopUp);
        Thread.sleep(3000);
        highlightElement(ClickPageDown50);
        ClickPageDown50.click();
        return this;
    }

    @Step("As a user click close index View Discount pricing")
    public Quo_HistoricalPricingFranco closeViewDiscountFranco() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblPopUp2);
        Thread.sleep(3000);
        highlightElement(closeUnitCostChanges);
        closeUnitCostChanges.click();
        return this;
    }
    //====================================================================================//


    //====================================================================================//
    @Step("As a user click index View Discount total list")
    public Quo_HistoricalPricingFranco clickDiscountTotalFranco() throws InterruptedException {
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblTotal);
        Thread.sleep(3000);
        highlightElement(clickDiscountTotal);
        clickDiscountTotal.click();
        return this;
    }

    @Step("As a user click View Unit Discount total pricing page 2")
    public Quo_HistoricalPricingFranco clickPage2DiscountTotalFranco(){
        highlightElement(clickPage2);
        clickPage2.click();
        return this;
    }

    @Step("As a user click View Unit Discount total pricing first page")
    public Quo_HistoricalPricingFranco backToFirstDiscountTotalFranco(){
        highlightElement(backToFirst);
        backToFirst.click();
        return this;
    }

    @Step("As a user click View Unit Discount total pricing last page")
    public Quo_HistoricalPricingFranco goToLastDiscountTotalFranco(){
        highlightElement(goToLast);
        goToLast.click();
        return this;
    }

    @Step("As a user click index View Discount total pricing list")
    public Quo_HistoricalPricingFranco clickPageDownDiscountTotalFranco(){
        highlightElement(clickPageDown);
        clickPageDown.click();
        return this;
    }

    @Step("As a user click index View Discount total pricing for 10 list")
    public Quo_HistoricalPricingFranco ClickPageDown10DiscountTotalFranco(){
        highlightElement(ClickPageDown10);
        ClickPageDown10.click();
        return this;
    }

    @Step("As a user click index View Discount total pricing list")
    public Quo_HistoricalPricingFranco clickPageDown2DiscountTotalFranco(){
        highlightElement(clickPageDown);
        clickPageDown.click();
        return this;
    }

    @Step("As a user click index View Discount total pricing for 25 list")
    public Quo_HistoricalPricingFranco ClickPageDown25DiscountTotalFranco() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblPopUp);
        Thread.sleep(3000);
        highlightElement(ClickPageDown25);
        ClickPageDown25.click();
        return this;
    }

    @Step("As a user click index View Discount total pricing list")
    public Quo_HistoricalPricingFranco clickPageDown3DiscountTotalFranco(){
        highlightElement(clickPageDown);
        clickPageDown.click();
        return this;
    }

    @Step("As a user click index View Discount total pricing for 50 list")
    public Quo_HistoricalPricingFranco ClickPageDown50DiscountTotalFranco() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblPopUp);
        Thread.sleep(3000);
        highlightElement(ClickPageDown50);
        ClickPageDown50.click();
        return this;
    }

    @Step("As a user click close index View Discount total pricing")
    public Quo_HistoricalPricingFranco closeViewDiscountTotalFranco() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblPopUp2);
        Thread.sleep(3000);
        highlightElement(closeUnitCostChanges);
        closeUnitCostChanges.click();
        return this;
    }
    //====================================================================================//


}
