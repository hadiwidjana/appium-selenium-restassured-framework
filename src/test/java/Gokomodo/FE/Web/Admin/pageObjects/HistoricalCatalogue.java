package Gokomodo.FE.Web.Admin.pageObjects;

import Gokomodo.FE.Web.LoginManager.Admin.pageObjects.pages.AdminLoginCommerce1PageObject;
import Gokomodo.GlobalMethod.AllureReport.AllureAttachments;
import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Base64;

public class HistoricalCatalogue extends AdminLoginCommerce1PageObject {
    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]")
    private WebElement txtLogin;
    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/form[1]/div[2]/input[1]")
    private WebElement pwdLogin;
    @FindBy(xpath = "//button[contains(text(),'Login')]")
    private WebElement btnLogin;


    //=================================//

    //================================//
    @FindBy(xpath = "//a[contains(text(),'Companies')]")
    private WebElement btnCompany;
    @FindBy(xpath = "//body/div[@id='root']/nav[1]/div[1]/ul[1]/li[3]/div[1]/div[1]/div[1]/a[1]/button[1]")
    private WebElement btnBuyerCompany;
    @FindBy(xpath = "//body/div[@id='root']/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")
    private WebElement inputNameBuyer;
    @FindBy(xpath = "//a[contains(text(),'View Details')]")
    private WebElement clickViewDetails;
    @FindBy(xpath = "//a[contains(text(),'Catalogue')]")
    private WebElement btnCatalogue;
    @FindBy(xpath = "//a[contains(text(),'Vitamin D')]")
    private WebElement btnNameProd;
    @FindBy(xpath = "//th[contains(text(),'Action')]")
    private WebElement lblAction;
    @FindBy(xpath = "//tbody/tr[1]/td[10]/button[1]")
    private WebElement btnRemove;
    @FindBy(xpath = "//button[contains(text(),'Cancel')]")
    private WebElement btnCancelRemove;
    @FindBy(xpath = "//body/div[@id='root']/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/a[5]")
    private WebElement btnBackCatalogue;
    @FindBy(xpath = "//*[@id=\"root\"]/main/div/div/div/div[1]/div[1]/a/span")
    private WebElement lblscroll;
    @FindBy(xpath = "//tbody/tr[3]/td[6]/button[1]")
    private WebElement btnAddGlobal;

    //===============================//


    @Step("As a user already input email")
    public HistoricalCatalogue InputEmail() throws InterruptedException {
        Thread.sleep(1000);
        AllureAttachments.saveWebElement(getWebDriver(),txtLogin);
        highlightElement(txtLogin);
        txtLogin.sendKeys(decryptData(appConfig.getUserAdmin2()));
        return this;
    }

    @Step("As a user already input password")
    public HistoricalCatalogue InputPassword(){

        highlightElement(pwdLogin);
        pwdLogin.sendKeys(decryptData(appConfig.getPassAdmin2()));
        return this;
    }

    @Step("As a user click button submit")
    public HistoricalCatalogue btnLogin(){
        highlightElement(btnLogin);
        btnLogin.click();
        return this;
    }

    @Step("As a user click button Companies")
    public HistoricalCatalogue btnCompanyClickCatalogue(){
        highlightElement(btnCompany);
        btnCompany.click();
        return this;
    }

    @Step("As a user click button Companies Buyer")
    public HistoricalCatalogue btnBuyerCompanyCatalogue(){
        highlightElement(btnBuyerCompany);
        btnBuyerCompany.click();
        return this;
    }

    @Step("As a user click input la nausee in search box")
    public HistoricalCatalogue inputNameBuyerCatalogue() throws InterruptedException {
        highlightElement(inputNameBuyer);
        inputNameBuyer.sendKeys("la nause");
        Thread.sleep(4000);
        return this;
    }

    @Step("As a user click view detail")
    public HistoricalCatalogue clickViewDetailsCatalogue(){
        highlightElement(clickViewDetails);
        clickViewDetails.click();
        return this;
    }

    @Step("As a user click view detail")
    public HistoricalCatalogue btnCatalogueCatalogue(){
        highlightElement(btnCatalogue);
        btnCatalogue.click();
        return this;
    }

    @Step("As a user click one of product")
    public HistoricalCatalogue btnNameProdCatalogue(){
        highlightElement(btnNameProd);
        btnNameProd.click();
        return this;
    }

//    Thread.sleep(3000);
//    JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
//        js.executeScript("arguments[0].scrollIntoView();", lblAction);

    @Step("As a user click one of product")
    public HistoricalCatalogue btnRemoveCatalogue() throws InterruptedException {
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblAction);
        highlightElement(btnRemove);
        btnRemove.click();
        return this;
    }

    @Step("As a user click cancel remove")
    public HistoricalCatalogue btnCancelRemoveCatalogue(){
        highlightElement(btnCancelRemove);
        btnCancelRemove.click();
        return this;
    }

    @Step("As a user click cancel remove")
    public HistoricalCatalogue btnBackCatalogueAdmin() throws InterruptedException {
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", lblscroll);
        Thread.sleep(3000);
        highlightElement(btnBackCatalogue);
        btnBackCatalogue.click();
        return this;
    }


    @Step("As a user click cancel remove")
    public HistoricalCatalogue btnAddGlobalCatalogue(){
        highlightElement(btnAddGlobal);
        btnAddGlobal.click();
        return this;
    }



}
