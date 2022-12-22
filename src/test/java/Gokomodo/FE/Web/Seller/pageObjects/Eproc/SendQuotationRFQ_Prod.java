package Gokomodo.FE.Web.Seller.pageObjects.Eproc;

import Gokomodo.FE.Web.LoginManager.Seller.pageObjects.initializePageObjects.SellerPageLoginInitializer;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Base64;

public class SendQuotationRFQ_Prod extends SellerPageLoginInitializer {


    //============================ Login ================================//
    @FindBy(xpath = "/html/body/div/div/main/div/div/div[1]/div[2]/form/div[1]/input")
    private WebElement txtLogin;
    @FindBy(xpath = "/html/body/div/div/main/div/div/div[1]/div[2]/form/div[2]/div/input")
    private  WebElement pwdLogin;
    @FindBy(xpath = "/html/body/div/div/main/div/div/div[1]/div[2]/form/div[3]/button")
    private WebElement btnLogin;


    //=====================================================================//

    //========================= Send RFQ from Seller ===========================//
    //
    @FindBy(xpath = "//div[contains(text(),'Inquiry')]")
    private WebElement inquirylistBtn;
    //
    @FindBy(xpath = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[2]/input[1]")
    private WebElement inputInquiryName;
    //
    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/table/tbody/tr/td[1]")
    private WebElement clickTheInquiry;
    //
    @FindBy(xpath = "//button[contains(text(),'Create Quotation')]")
    private WebElement clickBtnSendQuo;
    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[2]")
    private WebElement clickBtnSendQuoPopup;


    @Step("As a user already input email")
    public SendQuotationRFQ_Prod InputEmailSeller() throws InterruptedException {
        Thread.sleep(1000);
        highlightElement(txtLogin);
        txtLogin.sendKeys(decryptData(appConfig.getSellerprod1()));
        return this;
    }

    @Step("As a user already input password")
    public SendQuotationRFQ_Prod InputPasswordSeller(){

        highlightElement(pwdLogin);
        pwdLogin.sendKeys(decryptData(appConfig.getPasswordprodseller1()));
        return this;
    }

    @Step("As a user click button submit login")
    public SendQuotationRFQ_Prod btnLoginSeller(){
        highlightElement(btnLogin);
        btnLogin.click();
        return this;
    }

    @Step("As a user click inquiry button")
    public SendQuotationRFQ_Prod inquirylistButtonSeller(){
        highlightElement(inquirylistBtn);
        inquirylistBtn.click();
        return this;
    }

    @Step("As a user type RFQ name in inquiry list")
    public SendQuotationRFQ_Prod inputInquiryNameSeller() throws InterruptedException {
        highlightElement(inputInquiryName);
        inputInquiryName.sendKeys("RFQ/2022/09/1576");
        Thread.sleep(3000);
        return this;
    }

    @Step("As a user click RFQ RFQ/2022/09/32")
    public SendQuotationRFQ_Prod clickTheInquirySeller(){
        highlightElement(clickTheInquiry);
        clickTheInquiry.click();
        return this;
    }


    @Step("As a user click Send quotation button")
    public SendQuotationRFQ_Prod clickBtnSendQuoSeller(){
        highlightElement(clickBtnSendQuo);
        clickBtnSendQuo.click();
        return this;
    }

    @Step("As a user click Send quotation button Pop Up")
    public SendQuotationRFQ_Prod clickBtnSendQuoPopupSeller(){
        highlightElement(clickBtnSendQuoPopup);
        clickBtnSendQuoPopup.click();
        return this;
    }

}
