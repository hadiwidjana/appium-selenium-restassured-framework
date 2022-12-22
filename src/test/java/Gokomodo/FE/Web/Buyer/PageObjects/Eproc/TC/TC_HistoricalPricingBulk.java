package Gokomodo.FE.Web.Buyer.PageObjects.Eproc.TC;

import Gokomodo.FE.Web.LoginManager.Buyer.pageObjects.pages.BuyerLoginNauseee1PageObject;
import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Base64;

public class TC_HistoricalPricingBulk extends BuyerLoginNauseee1PageObject {

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
    private WebElement inputTCBulk;
    @FindBy(xpath = "//html/body/div[1]/div/main/div/table/tbody/tr/td[1]")
    private WebElement clickTheTCList;



    //=======================================//

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[4]/div/div[2]/div/div[2]/div[2]/div/div[1]/div[2]/a")
    private WebElement clickDetailTC;

    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[4]/div/div[2]/div/div[3]/div/div[1]/h5")
    private WebElement lblLaNausee;

    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[4]/div/div[2]/div/div[3]/div/div[1]/div/div/div[2]/table/tbody/tr[1]/td[1]")
    private WebElement dropDownListProd;

    @FindBy(xpath = "//html/body/div[1]/div/main/div/div[4]/div/div[2]/div/div[3]/div/div[1]/div/div/div[2]/table/tbody/tr[2]/td/div/div/div/div/div[4]/div[2]/div[2]/small")
    private WebElement clickUnitCost;

    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[4]/div/div[2]/div/div[3]/div/div[1]/div/div/div[2]/table/thead/tr/th[3]")
    private WebElement lblkUnitCost;

    @FindBy(xpath = "/html/body/div[3]/div/div[1]/div/div/div[2]/div/div/div[5]/div[2]/div[2]/ul/li[2]/a")
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
    @FindBy(xpath = "/html/body/div[3]/div/div[1]/div/div/div[2]/div/div/div[3]/div/table/tbody/tr/td[1]/div")
    private WebElement lblPopUp;
    //
    @FindBy(xpath = "/html/body/div[3]/div/div[1]/div/div/div[1]")
    private WebElement lblPopUp2;
    //
    //========================================================================//

    //================================ STEP ==================================//
    @Step("As a user already input email")
    public TC_HistoricalPricingBulk InputEmailEproc() throws InterruptedException {
        Thread.sleep(1000);
        highlightElement(inputEmail);
        inputEmail.sendKeys(decryptData(appConfig.getUsrNauseee1()));
        return this;
    }

    @Step("As a user already input password")
    public TC_HistoricalPricingBulk InputPasswordEproc(){
        highlightElement(inputPassword);
        inputPassword.sendKeys(decryptData(appConfig.getPasswordAccount()));
        return this;
    }

    @Step("As a user click button login")
    public TC_HistoricalPricingBulk BtnEprocLoginEproc(){
        highlightElement(btnLoginEproc);
        btnLoginEproc.click();
        return this;
    }

    @Step("As a user click Procrument on navbar")
    public TC_HistoricalPricingBulk btnProcrumentListTCBulkEproc(){
        highlightElement(btnProcrumentList);
        btnProcrumentList.click();
        return this;
    }

    @Step("As a user click TC Button")
    public TC_HistoricalPricingBulk btnClickRFQBulkRFQ(){
        highlightElement(btnClickRFQ);
        btnClickRFQ.click();
        return this;
    }

    @Step("As a user Search RFQ RFQ/2022/09/169")
    public TC_HistoricalPricingBulk inputEprocTCBulkEproc() throws InterruptedException{
        highlightElement(inputTCBulk);
        inputTCBulk.sendKeys("RFQ/2022/09/169");
        Thread.sleep(4000);
        return this;
    }

    @Step("As a user click view button on that TC")
    public TC_HistoricalPricingBulk clickTheTCListBulkEproc(){
        highlightElement(clickTheTCList);
        clickTheTCList.click();
        return this;
    }

    @Step("As a user click view TC detail")
    public TC_HistoricalPricingBulk clickDetailTCBulk(){
        highlightElement(clickDetailTC);
        clickDetailTC.click();
        return this;
    }

    @Step("As a user click view details quotation")
    public TC_HistoricalPricingBulk dropDownListProdBulk() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblLaNausee);
        Thread.sleep(3000);
        highlightElement(dropDownListProd);
        dropDownListProd.click();
        return this;
    }

    //======================================================//
    @Step("As a user click View Unit cost historical pricing")
    public TC_HistoricalPricingBulk clickUnitCostBulk() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblkUnitCost);
        Thread.sleep(5000);
        highlightElement(clickUnitCost);
        clickUnitCost.click();
        return this;
    }


    @Step("As a user click View Unit cost historical pricing page 2")
    public TC_HistoricalPricingBulk clickPage2UnitCostBulk() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblPopUp);
        Thread.sleep(3000);
        highlightElement(clickPage2);
        clickPage2.click();
        return this;
    }

    @Step("As a user click View Unit cost historical pricing first page")
    public TC_HistoricalPricingBulk backToFirstUnitCostBulk() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblPopUp);
        Thread.sleep(3000);
        highlightElement(backToFirst);
        backToFirst.click();
        return this;
    }

    @Step("As a user click View Unit cost historical pricing last page")
    public TC_HistoricalPricingBulk goToLastUnitCostBulk() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblPopUp);
        Thread.sleep(3000);
        highlightElement(goToLast);
        goToLast.click();
        return this;
    }

    @Step("As a user click index View Unit cost pricing list")
    public TC_HistoricalPricingBulk clickPageDownUnitCostBulk(){
        highlightElement(clickPageDown);
        clickPageDown.click();
        return this;
    }

    @Step("As a user click index View Unit cost pricing for 10 list")
    public TC_HistoricalPricingBulk ClickPageDown10UnitCostBulk(){
        highlightElement(ClickPageDown10);
        ClickPageDown10.click();
        return this;
    }

    @Step("As a user click index View Unit cost pricing list")
    public TC_HistoricalPricingBulk clickPageDownUnitCost2Bulk(){
        highlightElement(clickPageDown);
        clickPageDown.click();
        return this;
    }

    @Step("As a user click index View Unit cost pricing for 25 list")
    public TC_HistoricalPricingBulk ClickPageDown25UnitCostBulk() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblPopUp);
        Thread.sleep(3000);
        highlightElement(ClickPageDown25);
        ClickPageDown25.click();
        return this;
    }

    @Step("As a user click index View Unit cost pricing list")
    public TC_HistoricalPricingBulk clickPageDownUnitCost3Bulk(){
        highlightElement(clickPageDown);
        clickPageDown.click();
        return this;
    }

    @Step("As a user click index View Unit cost pricing for 50 list")
    public TC_HistoricalPricingBulk ClickPageDown50UnitCostBulk() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblPopUp);
        Thread.sleep(3000);
        highlightElement(ClickPageDown50);
        ClickPageDown50.click();
        return this;
    }

    @Step("As a user click close index View Unit cost pricing")
    public TC_HistoricalPricingBulk closeUnitCostBulk() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblPopUp2);
        Thread.sleep(3000);
        highlightElement(closeUnitCostChanges);
        closeUnitCostChanges.click();
        return this;
    }


}
