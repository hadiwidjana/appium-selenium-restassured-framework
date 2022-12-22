package frmwrk.be.restapi.pageObjects.UIAction;

import frmwrk.fe.web.BaseMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static frmwrk.be.restapi.IntegrationBaseMethod.*;

public class BuyerAction extends BaseMethod {

    @FindBy(id = "btn-procurement-list")
    public WebElement procurementList;

    @FindBy(xpath = "//div[@role='menu']/div/div/div[1]/div[2]")
    public WebElement RFQMenu;

    @FindBy(xpath = "//button[@data-testid='continue']")
    public WebElement nextRFQ;

    @FindBy(xpath = "//div[@class='card-body']/div/div[1]/div[1]/div[2]/div")
    public WebElement productDropDown;

    @FindBy(xpath = "//div[@role='menu']/button[@data-cy='editProduct']")
    public WebElement editProduct;

    protected String PRNumberPath;
    protected String PRNumberInput;
    List<WebElement> ProductPR;
    List<WebElement> ProductPRInput;

    @FindBy(xpath = "//input[@data-cy='rfqForm-priority-input'][@value='1']")
    public WebElement urgentRFQ;

    @FindBy(xpath = "//div[@data-cy='rfqForm-searchVendorMethod']/div/label[@for='vendorAuto']")
    public WebElement vendorAuto;

    @FindBy(xpath = "//div[@data-cy='rfqForm-searchVendorMethod']/div/label[@for='vendorManual']")
    public WebElement vendorManual;

    @FindBy(xpath = "//button[@data-testid='rfqForm-confirmCreate']")
    public WebElement sendRFQ;

    @FindBy(xpath = "//button[@id='btn-AddProdDelv']")
    public WebElement nextProd;

    @FindBy(xpath = "//button[@id='btn-Vendor']")
    public WebElement nextVendor;

    @FindBy(xpath = "//button[@data-cy='rfqForm-submit']")
    public WebElement nextSubmit;

    @FindBy(xpath = "//tbody//td[1]")
    public WebElement RFQEdit;

    @FindBy(xpath = "//button[@class='btn btn-primary ml-3']")
    public WebElement createTCBtn;

    @FindBy(xpath = "//label[@for='without_approval']")
    public WebElement withoutApproval;

    @FindBy(xpath = "//div[@class='d-flex justify-content-end']/div/button[3]")
    public WebElement sendTC;

    @FindBy(xpath = "//button[@data-testid='modal-ok']")
    public WebElement sendTCConfirm;

    @FindBy(xpath = "//div[@class='d-flex align-items-center flex-wrap pb-4']/div[1]//input")
    public WebElement searchRFQ;

    @FindBy(xpath = "//input[@data-cy='rfqForm-searchVendorByName']")
    public WebElement searchVendor;

    @FindBy(xpath = "//div[@class='card-body']")
    public WebElement vendorCard;

    @FindBy(id = "email-login")
    private WebElement txtLogin;
    @FindBy(id = "password-login")
    private  WebElement pwdLogin;
    @FindBy(id = "submit-login")
    private WebElement btnLogin;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-warning']")
    private WebElement btnAddLocation;

    @FindBy(xpath = "//label[text()='Company']/following-sibling::div")
    private WebElement company;

//    @FindBy(xpath = "//div[text()='PD Day6']")
    @FindBy(xpath = "//div[@class='komodo__option komodo__option--is-focused css-1n7v3ny-option']")
    private WebElement companySelect;

    @FindBy(xpath = "//label[text()='Company Location']/following-sibling::div")
    private WebElement companyLoc;

    @FindBy(xpath = "//div[@class='komodo__option komodo__option--is-focused css-1n7v3ny-option']")
    private WebElement getCompanyLocSelect;


    public BuyerAction InputEmail() throws InterruptedException {
        Thread.sleep(1000);
        txtLogin.sendKeys(decryptData(env.IntegrationBuyerEmail()));
        return this;
    }

    public BuyerAction InputPassword(){
        pwdLogin.sendKeys(decryptData(env.IntegrationBuyerPassword()));
        return this;
    }

    public BuyerAction btnLogin(){
        btnLogin.click();
        return this;
    }

    public BuyerAction navigateToHomepage() {
        getWebDriver().get(env.IntegrationURLBuyer());
        return this;
    }


    public BuyerAction navigateToRFQPage() throws Exception {
        click(procurementList);
        click(RFQMenu);
        sendKeys(searchRFQ,getRFQNumber(env.IntegrationCreateRFQResponse()));
        Thread.sleep(2000);
        scrollToElement(RFQEdit);
        click(RFQEdit);
        return this;
    }

    public BuyerAction editRFQDraft() throws Exception {
        Thread.sleep(3000);
        scrollToElement(urgentRFQ);
        click(urgentRFQ);
        click(nextRFQ);
        waitPageToLoad();

//        scrollToCenter(productDropDown);
//        click(productDropDown);
//        click(editProduct);


        scrollToCenter(btnAddLocation);
        click(btnAddLocation);
        waitPageToLoad();
        return this;
    }

    public BuyerAction editProduct() throws Exception {


        click(company);
        click(companySelect);
        Thread.sleep(500);

        click(companyLoc);
        click(getCompanyLocSelect);
        Thread.sleep(500);


        PRNumberPath = "//div[@title='" + getPRNumber(env.IntegrationCreatePRResponse()) + "']";
        PRNumberInput = "//div[@title='" + getPRNumber(env.IntegrationCreatePRResponse()) + "']//input";
        ProductPR = (List<WebElement>) getWebDriver().findElements(By.xpath(PRNumberPath));
        ProductPRInput = (List<WebElement>) getWebDriver().findElements(By.xpath(PRNumberInput));
        for(int i = 0;i<ProductPR.size();i++){
            WebElement PR = ProductPR.get(i);
            WebElement PRInput = ProductPRInput.get(i);
            scrollToElement(PR);
            click(PR);
            PRInput.sendKeys(getPRNumber(env.IntegrationCreatePRResponse()));
            Thread.sleep(500);
            PRInput.sendKeys(Keys.ENTER);
            Thread.sleep(500);
        }
        click(nextProd);
        return this;
    }

    public BuyerAction submitRFQ() throws Exception {
        Thread.sleep(2000);
        click(nextVendor);
        Thread.sleep(2000);

        switch (envName){
            case "bifrost":
            case "erp":
                scrollToCenter(vendorAuto);
                click(vendorAuto);
                break;
            case "prod":
                scrollToCenter(vendorManual);
                click(vendorManual);
                scrollToElement(searchVendor);
                sendKeys(searchVendor, "DEMO");
                Thread.sleep(2000);
                click(vendorCard);
                break;
            case "digital":
                scrollToCenter(vendorManual);
                click(vendorManual);
                scrollToElement(searchVendor);
                sendKeys(searchVendor, "ALPHA01");
                Thread.sleep(2000);
                click(vendorCard);
                break;
            default:
                throw new NotFoundException("Environment not found, please enter bifrost, erp, or prod as environment");
        }
        click(nextRFQ);
        waitPageToLoad();
        click(nextSubmit);
        waitPageToLoad();
        click(sendRFQ);
        return this;
    }

    public BuyerAction createTC() throws Exception {
        click(createTCBtn);
        scrollToElement(withoutApproval);
        click(withoutApproval);
        click(sendTC);
        click(sendTCConfirm);
        return this;
    }









}
