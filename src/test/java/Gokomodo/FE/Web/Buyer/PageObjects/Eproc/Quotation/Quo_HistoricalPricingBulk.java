package Gokomodo.FE.Web.Buyer.PageObjects.Eproc.Quotation;

import Gokomodo.FE.Web.LoginManager.Buyer.pageObjects.pages.BuyerLoginNauseee1PageObject;
import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Base64;

public class Quo_HistoricalPricingBulk extends BuyerLoginNauseee1PageObject {

    //============== Login ==================//
    @FindBy(xpath = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")
    private WebElement inputEmail;
    @FindBy(xpath = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/input[1]")
    private  WebElement inputPassword;
    @FindBy(xpath = "//button[contains(text(),'Masuk')]")
    private WebElement btnLoginEproc;
    @FindBy(id = "btn-procurement-list")
    private WebElement btnProcrumentList;
    @FindBy(xpath = "//*[@id=\"root\"]/div/header/div/nav/ul[1]/li[1]/div/div/div/div/div[1]/div[1]")
    private WebElement btnClickRFQ;
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[1]/div/div[1]/div/div[2]/input")
    private WebElement inputRFQBulk;
    @FindBy(xpath = "/html/body/div[1]/div/main/div/table/tbody/tr/td[1]")
    private WebElement clickTheTCList;
    @FindBy(xpath = "//span[contains(text(),'Quotations')]")
    private WebElement clickQuobtn;



    //=======================================//

    @FindBy(xpath = "//body/div[@id='root']/div[@class='root-wrapper']/main/div/div[@class='container-fluid']/div[@class='row']/div[@class='container-fluid']/div[@class='mt-4 pb-5 mb-5 row']/div[@class='col-lg-12']/div[2]/div[1]/div[2]/button[1]")
    private WebElement clickDetailQuo;
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[2]/div/div[12]/div/div[1]")
    private WebElement lblRFQAttch;
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
    @FindBy(xpath = "/html/body/div[3]/div/div[1]/div/div/div[2]/div/div/div[5]/div[2]/div[1]/span[1]/ul/a[2]")
    private WebElement ClickPageDown10;
    @FindBy(xpath = "/html/body/div[3]/div/div[1]/div/div/div[2]/div/div/div[5]/div[2]/div[1]/span[1]/ul/a[3]")
    private WebElement ClickPageDown25;
    //
	@FindBy(xpath="/html/body/div[3]/div/div[1]/div/div/div[2]/div/div/div[6]/div[2]/div[1]/span[1]/ul/a[2]")
	private WebElement ClickPageDown10i2;
	@FindBy(xpath="/html/body/div[3]/div/div[1]/div/div/div[2]/div/div/div[6]/div[2]/div[1]/span[1]/ul/a[3]")
	private WebElement ClickPageDown25i2;
	@FindBy(xpath="/html/body/div[3]/div/div[1]/div/div/div[2]/div/div/div[6]/div[2]/div[1]/span[1]/ul/a[4]")
	private WebElement ClickPageDown50i2;
    //
    @FindBy(xpath = "/html/body/div[3]/div/div[1]/div/div/div[2]/div/div/div[5]/div[2]/div[1]/span[1]/ul/a[4]")
    private WebElement ClickPageDown50;
    @FindBy(xpath = "//span[contains(text(),'×')]")
    private WebElement closeUnitCostChanges;
    //
    @FindBy(xpath = "/html/body/div[3]/div/div[1]/div/div/div[2]/div/div/div[4]")
    private WebElement lblPopUp;
    //
    @FindBy(xpath = "/html/body/div[3]/div/div[1]/div/div/div[1]")
    private WebElement lblPopUp2;
    //
	@FindBy(xpath="/html/body/div[3]/div/div[1]/div/div/div[2]/div/div/div[6]/div[1]/table/tbody/tr[1]/td[1]/div")
	private WebElement lblPopUp4;

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
	@FindBy(xpath="//small[contains(text(),'View Delivery Price Changes')]")
	private WebElement clickDeliveryPrize;
    //
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[4]/div/div[2]/div/div[5]/div[2]/div/div[1]/div[3]/div[2]/div[2]/small")
    private WebElement clickDiscountTotal;

    //========================================================================//

    //================================ STEP ==================================//
    @Step("As a user already input email")
    public Quo_HistoricalPricingBulk InputEmailEproc() throws InterruptedException {
        Thread.sleep(1000);
        highlightElement(inputEmail);
        inputEmail.sendKeys(decryptData(appConfig.getUsrNauseee1()));
        return this;
    }

    @Step("As a user already input password")
    public Quo_HistoricalPricingBulk InputPasswordEproc(){
        highlightElement(inputPassword);
        inputPassword.sendKeys(decryptData(appConfig.getPasswordAccount()));
        return this;
    }

    @Step("As a user click button login")
    public Quo_HistoricalPricingBulk BtnEprocLoginEproc(){
        highlightElement(btnLoginEproc);
        btnLoginEproc.click();
        return this;
    }

    @Step("As a user click Procrument on navbar")
    public Quo_HistoricalPricingBulk btnProcrumentListTCBulk(){
        highlightElement(btnProcrumentList);
        btnProcrumentList.click();
        return this;
    }

    @Step("As a user click TC Button")
    public Quo_HistoricalPricingBulk btnClickTCBulk() throws InterruptedException {
        highlightElement(btnClickRFQ);
        btnClickRFQ.click();
        Thread.sleep(3000);
        return this;
    }

    @Step("As a user Search TC for Franco (RFQ/2022/09/173)")
    public Quo_HistoricalPricingBulk inputEprocTCBulk() throws InterruptedException {
        highlightElement(inputRFQBulk);
        inputRFQBulk.sendKeys("RFQ/2022/09/173");
        Thread.sleep(3000);
        return this;
    }

    @Step("As a user click view button on that TC")
    public Quo_HistoricalPricingBulk clickTheTCListBulk() throws InterruptedException {
        highlightElement(clickTheTCList);
        clickTheTCList.click();
        Thread.sleep(3000);
        return this;
    }

    @Step("As a user click Quotation button on that TC")
    public Quo_HistoricalPricingBulk clickQuobtnBulk(){
        highlightElement(clickQuobtn);
        clickQuobtn.click();
        return this;
    }

    @Step("As a user click view details quotation")
    public Quo_HistoricalPricingBulk clickDetailQuoBulk() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblRFQAttch);
        Thread.sleep(3000);
        highlightElement(clickDetailQuo);
        clickDetailQuo.click();
        return this;
    }

    @Step("As a user click dropdown icon product")
    public Quo_HistoricalPricingBulk dropDownListProdBulk() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblLaNausee);
        Thread.sleep(3000);
        highlightElement(dropDownListProd);
        dropDownListProd.click();
        return this;
    }

    //===================================================================================//
    @Step("As a user click View Unit cost historical pricing")
    public Quo_HistoricalPricingBulk clickUnitCostBulk() throws InterruptedException {
        highlightElement(clickUnitCost);
        clickUnitCost.click();
        Thread.sleep(3000);
        return this;
    }

    @Step("As a user click View Unit cost historical pricing page 2")
    public Quo_HistoricalPricingBulk clickPage2UnitCostBulk(){
        highlightElement(clickPage2);
        clickPage2.click();
        return this;
    }

    @Step("As a user click View Unit cost historical pricing first page")
    public Quo_HistoricalPricingBulk backToFirstUnitCostBulk(){
        highlightElement(backToFirst);
        backToFirst.click();
        return this;
    }

    @Step("As a user click View Unit cost historical pricing last page")
    public Quo_HistoricalPricingBulk goToLastUnitCostBulk(){
        highlightElement(goToLast);
        goToLast.click();
        return this;
    }

    @Step("As a user click index View Unit cost pricing list")
    public Quo_HistoricalPricingBulk clickPageDownUnitCostBulk(){
        highlightElement(clickPageDown);
        clickPageDown.click();
        return this;
    }

    @Step("As a user click index View Unit cost pricing for 10 list")
    public Quo_HistoricalPricingBulk ClickPageDown10UnitCostBulk(){
        highlightElement(ClickPageDown10);
        ClickPageDown10.click();
        return this;
    }

    @Step("As a user click index View Unit cost pricing list")
    public Quo_HistoricalPricingBulk clickPageDownUnitCost2Bulk(){
        highlightElement(clickPageDown);
        clickPageDown.click();
        return this;
    }

    @Step("As a user click index View Unit cost pricing for 25 list")
    public Quo_HistoricalPricingBulk ClickPageDown25UnitCostBulk() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblPopUp);
        Thread.sleep(3000);
        highlightElement(ClickPageDown25);
        ClickPageDown25.click();
        return this;
    }

    @Step("As a user click index View Unit cost pricing list")
    public Quo_HistoricalPricingBulk clickPageDownUnitCost3Bulk(){
        highlightElement(clickPageDown);
        clickPageDown.click();
        return this;
    }

    @Step("As a user click index View Unit cost pricing for 50 list")
    public Quo_HistoricalPricingBulk ClickPageDown50UnitCostBulk() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblPopUp);
        Thread.sleep(3000);
        highlightElement(ClickPageDown50);
        ClickPageDown50.click();
        return this;
    }

    @Step("As a user click close index View Unit cost pricing")
    public Quo_HistoricalPricingBulk closeUnitCostBulk() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblPopUp2);
        Thread.sleep(3000);
        highlightElement(closeUnitCostChanges);
        closeUnitCostChanges.click();
        return this;
    }
    //=======================================================================================//


    //=======================================================================================//
    @Step("As a user click Quantitiy changes")
    public Quo_HistoricalPricingBulk clickQuantityCostBulk() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblUnitBrand);
        Thread.sleep(3000);
        highlightElement(clickQuantityCost);
        clickQuantityCost.click();
        Thread.sleep(3000);
        return this;
    }

    @Step("As a user click index View Unit Cost list")
    public Quo_HistoricalPricingBulk clickPageDownQuantityCostBulk(){
        highlightElement(clickPageDown);
        clickPageDown.click();
        return this;
    }

    @Step("As a user click index View historical pricing for 10 list")
    public Quo_HistoricalPricingBulk ClickPageDown10QuantityCostBulk(){
        highlightElement(ClickPageDown10);
        ClickPageDown10.click();
        return this;
    }

    @Step("As a user click index View historical pricing list")
    public Quo_HistoricalPricingBulk clickPageDownQuantityCost2Bulk(){
        highlightElement(clickPageDown);
        clickPageDown.click();
        return this;
    }

    @Step("As a user click index View historical pricing for 25 list")
    public Quo_HistoricalPricingBulk ClickPageDown25QuantityCostBulk() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblPopUp);
        Thread.sleep(3000);
        highlightElement(ClickPageDown25);
        ClickPageDown25.click();
        return this;
    }

    @Step("As a user click index View historical pricing list")
    public Quo_HistoricalPricingBulk clickPageDownQuantityCost3Bulk(){
        highlightElement(clickPageDown);
        clickPageDown.click();
        return this;
    }

    @Step("As a user click index View historical pricing for 50 list")
    public Quo_HistoricalPricingBulk ClickPageDown50QuantityCostBulk() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblPopUp);
        Thread.sleep(3000);
        highlightElement(ClickPageDown50);
        ClickPageDown50.click();
        return this;
    }

    @Step("As a user click close index View Quantity pricing")
    public Quo_HistoricalPricingBulk closeQuantityCostChangesBulk() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblPopUp2);
        Thread.sleep(3000);
        highlightElement(closeUnitCostChanges);
        closeUnitCostChanges.click();
        return this;
    }
    //=======================================================================================//


    //=======================================================================================//
    @Step("As a user click index View Discount pricing list")
    public Quo_HistoricalPricingBulk clickViewDiscountBulk() throws InterruptedException {
        Thread.sleep(3000);
        highlightElement(clickViewDiscount);
        clickViewDiscount.click();
        return this;
    }

    @Step("As a user click index View Unit Cost list")
    public Quo_HistoricalPricingBulk clickPageDownViewDiscountBulk() throws InterruptedException {
        Thread.sleep(3000);
        highlightElement(clickPageDown);
        clickPageDown.click();
        return this;
    }

    @Step("As a user click index View historical pricing for 10 list")
    public Quo_HistoricalPricingBulk ClickPageDown10ViewDiscountBulk() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblPopUp);
        Thread.sleep(3000);
        highlightElement(ClickPageDown10);
        ClickPageDown10.click();
        return this;
    }

    @Step("As a user click index View historical pricing list")
    public Quo_HistoricalPricingBulk clickPageDownViewDiscount2Bulk(){
        highlightElement(clickPageDown);
        clickPageDown.click();
        return this;
    }

    @Step("As a user click index View historical pricing for 25 list")
    public Quo_HistoricalPricingBulk ClickPageDown25ViewDiscountBulk() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblPopUp);
        Thread.sleep(3000);
        highlightElement(ClickPageDown25);
        ClickPageDown25.click();
        return this;
    }

    @Step("As a user click index View historical pricing list")
    public Quo_HistoricalPricingBulk clickPageDownViewDiscount3Bulk(){
        highlightElement(clickPageDown);
        clickPageDown.click();
        return this;
    }

    @Step("As a user click index View historical pricing for 50 list")
    public Quo_HistoricalPricingBulk ClickPageDown50ViewDiscountBulk() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblPopUp);
        Thread.sleep(3000);
        highlightElement(ClickPageDown50);
        ClickPageDown50.click();
        return this;
    }

    @Step("As a user click close index View Quantity pricing")
    public Quo_HistoricalPricingBulk closeViewDiscountChangesBulk() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblPopUp2);
        Thread.sleep(3000);
        highlightElement(closeUnitCostChanges);
        closeUnitCostChanges.click();
        return this;
    }
    //=======================================================================================//


    //=======================================================================================//
    @Step("As a user click View Delivery Price Changes index View pricing")
    public Quo_HistoricalPricingBulk clickDeliveryPrizeBulk() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblTotal);
        Thread.sleep(3000);
        highlightElement(clickDeliveryPrize);
        clickDeliveryPrize.click();
        return this;
    }

    @Step("As a user click index Delivery Price Changes list")
    public Quo_HistoricalPricingBulk clickPageDownDeliveryPrizeBulk() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblPopUp);
        Thread.sleep(3000);
        highlightElement(clickPageDown);
        clickPageDown.click();
        return this;
    }

    @Step("As a user click index View Delivery Price Changes for 10 list")
    public Quo_HistoricalPricingBulk ClickPageDown10DeliveryPrizeBulk() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblPopUp4);
        Thread.sleep(3000);
        highlightElement(ClickPageDown10i2);
        ClickPageDown10i2.click();
        return this;
    }

    @Step("As a user click index View Delivery Price Changes list")
    public Quo_HistoricalPricingBulk clickPageDownDeliveryPrize2Bulk() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblPopUp);
        Thread.sleep(3000);
        highlightElement(clickPageDown);
        clickPageDown.click();
        return this;
    }

    @Step("As a user click index View Delivery Price Changes for 25 list")
    public Quo_HistoricalPricingBulk ClickPageDown25DeliveryPrizeBulk() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblPopUp4);
        Thread.sleep(3000);
        highlightElement(ClickPageDown25i2);
        ClickPageDown25i2.click();
        return this;
    }

    @Step("As a user click index View Delivery Price Changes list")
    public Quo_HistoricalPricingBulk clickPageDownDeliveryPrize3Bulk() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblPopUp);
        Thread.sleep(3000);
        highlightElement(clickPageDown);
        clickPageDown.click();
        return this;
    }

    @Step("As a user click index View Delivery Price Changes for 50 list")
    public Quo_HistoricalPricingBulk ClickPageDown50DeliveryPrizeBulk() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblPopUp4);
        Thread.sleep(3000);
        highlightElement(ClickPageDown50i2);
        ClickPageDown50i2.click();
        return this;
    }

    @Step("As a user click close index Delivery Price Changes pricing")
    public Quo_HistoricalPricingBulk closeDeliveryPrizeBulk() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblPopUp2);
        Thread.sleep(3000);
        highlightElement(closeUnitCostChanges);
        closeUnitCostChanges.click();
        return this;
    }
    //=======================================================================================//


    //=======================================================================================//
    @Step("As a user click index View Discount Changes pricing list")
    public Quo_HistoricalPricingBulk clickDiscountTotalBulk() throws InterruptedException {
        Thread.sleep(3000);
        highlightElement(clickDiscountTotal);
        clickDiscountTotal.click();
        return this;
    }

    @Step("As a user click index View Discount Changes pricin list")
    public Quo_HistoricalPricingBulk clickPageDownDiscountTotalBulk() throws InterruptedException {
        Thread.sleep(3000);
        highlightElement(clickPageDown);
        clickPageDown.click();
        return this;
    }

    @Step("As a user click index View Discount Changes pricin for 10 list")
    public Quo_HistoricalPricingBulk ClickPageDown10DiscountTotalBulk(){
        highlightElement(ClickPageDown10);
        ClickPageDown10.click();
        return this;
    }

    @Step("As a user click index View Discount Changes pricin list")
    public Quo_HistoricalPricingBulk clickPageDownDiscountTotal2Bulk(){
        highlightElement(clickPageDown);
        clickPageDown.click();
        return this;
    }

    @Step("As a user click index View Discount Changes pricin for 25 list")
    public Quo_HistoricalPricingBulk ClickPageDown25DiscountTotalBulk() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblPopUp);
        Thread.sleep(3000);
        highlightElement(ClickPageDown25);
        ClickPageDown25.click();
        return this;
    }

    @Step("As a user click index View Discount Changes pricin list")
    public Quo_HistoricalPricingBulk clickPageDownDiscountTotal3Bulk(){
        highlightElement(clickPageDown);
        clickPageDown.click();
        return this;
    }

    @Step("As a user click index View historical pricing for 50 list")
    public Quo_HistoricalPricingBulk ClickPageDown50DiscountTotalBulk() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblPopUp);
        Thread.sleep(3000);
        highlightElement(ClickPageDown50);
        ClickPageDown50.click();
        return this;
    }

    @Step("As a user click close index View Discount total Changes pricing")
    public Quo_HistoricalPricingBulk closeDiscountTotalBulk() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblPopUp2);
        Thread.sleep(3000);
        highlightElement(closeUnitCostChanges);
        closeUnitCostChanges.click();
        return this;
    }
    //=======================================================================================//



}
