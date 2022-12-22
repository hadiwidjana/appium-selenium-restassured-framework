package frmwrk.be.restapi.pageObjects.UIAction;

import frmwrk.fe.web.BaseMethod;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static frmwrk.be.restapi.IntegrationBaseMethod.env;
import static frmwrk.be.restapi.IntegrationBaseMethod.getRFQNumber;

public class SellerAction extends BaseMethod {

    @FindBy(xpath = "//a[@href='/inquiry']")
    public WebElement inquiryHeader;

    @FindBy(xpath = "//input[@placeholder='RFQ ID']")
    public WebElement queryRFQ;

    @FindBy(xpath = "//div[@id='navBottomInquiry']/div/button[text()='Create Quotation']")
    public WebElement createQuotationButton;

    @FindBy(xpath = "//div[@class='modal-content']//button[text()='Create Quotation']")
    public WebElement getCreateQuotationButtonConfirm;

    @FindBy(xpath = "//button[@data-testid='point_of_origin-open']")
    public WebElement shipmentOrigin;

    @FindBy(xpath = "//div[@data-testid='point_of_origin-card'][@class='card-body']")
    public WebElement shipmentOriginSelect;

    @FindBy(xpath = "//button[@data-testid='modal-ok']")
    public WebElement shipmentOriginConfirm;

    @FindBy(xpath = "//thead//span[@class='checkmark']")
    public WebElement selectAllProduct;

    @FindBy(xpath = "//tbody/tr/td[2]//span")
    public List<WebElement> productColumn;

    @FindBy(xpath = "//input[@placeholder='IDR 0']")
    public WebElement unitCost;

    @FindBy(xpath = "//i/following-sibling::input[@placeholder='0']")
    public WebElement unitQty;

    @FindBy(xpath = "//button[text()='Close']")
    public WebElement closeProd;

    @FindBy(id = "btn-SendQuotation")
    public WebElement sendQuotationButton;

    @FindBy(xpath = "//button[@class='btn btn-outline-primary mr-3']/following-sibling::button")
    public WebElement sendQuotationButtonConfirm;

    @FindBy(xpath = "//tr[@data-testid='table-row'][1]/td[1]")
    public WebElement clickRFQ;

    @FindBy(xpath = "//input[@data-testid='email']")
    private WebElement txtLogin;
    @FindBy(xpath = "//input[@data-testid='password']")
    private  WebElement pwdLogin;
    @FindBy(xpath = "//button[@data-testid='submit-login']")
    private WebElement btnLogin;


    public SellerAction navigateToHomepage(){
        getWebDriver().get(env.IntegrationURLSeller());
        return this;
    }

    public SellerAction InputEmail() throws InterruptedException {
        Thread.sleep(1000);
        sendKeys(txtLogin,decryptData(env.IntegrationSellerEmail()));
        return this;
    }

    public SellerAction InputPassword(){
        sendKeys(pwdLogin,decryptData(env.IntegrationSellerPassword()));
        return this;
    }

    public SellerAction btnLogin() throws InterruptedException {
        click(btnLogin);
        return this;
    }


    public SellerAction navigateToCreateInquiry() throws Exception{
        click(inquiryHeader);
        sendKeys(queryRFQ,getRFQNumber(env.IntegrationCreateRFQResponse()));
        Thread.sleep(2000);
        scrollToElement(clickRFQ);
        click(clickRFQ);
        return this;
    }

    public SellerAction addProduct() throws Exception {
        click(createQuotationButton);
        click(getCreateQuotationButtonConfirm);
        Thread.sleep(2000);
        scrollToCenter(shipmentOrigin);
        click(shipmentOrigin);
        click(shipmentOriginSelect);
        click(shipmentOriginConfirm);
        Thread.sleep(2000);
//        scrollToElement(selectAllProduct);
        click(selectAllProduct);

        for(int i = 0;i<productColumn.size();i++){
            WebElement product = productColumn.get(i);
            scrollToCenter(product);
            click(product);
            scrollToElement(unitCost);
//            unitCost.sendKeys(String.valueOf(MainBaseMethod.random(1000000)));
            sendKeys(unitCost,Integer.toString(env.IntegrationUnitCost()));
            scrollToElement(unitQty);
            sendKeys(unitQty,Integer.toString(env.IntegrationQuantity()));
            scrollToCenter(closeProd);
            click(closeProd);
        }
        click(sendQuotationButton);
        click(sendQuotationButtonConfirm);
        return this;
    }



}
