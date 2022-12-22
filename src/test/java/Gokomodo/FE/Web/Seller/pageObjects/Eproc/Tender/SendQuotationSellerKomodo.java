package Gokomodo.FE.Web.Seller.pageObjects.Eproc.Tender;

import Gokomodo.FE.Web.LoginManager.Seller.pageObjects.initializePageObjects.SellerPageLoginInitializer;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Base64;

public class SendQuotationSellerKomodo extends SellerPageLoginInitializer {


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
    public SendQuotationSellerKomodo InputEmailSeller() throws InterruptedException {
        Thread.sleep(1000);
        highlightElement(txtLogin);
        txtLogin.sendKeys(decryptData(appConfig.getUsrSeller()));
        return this;
    }

    @Step("As a user already input password")
    public SendQuotationSellerKomodo InputPasswordSeller(){

        highlightElement(pwdLogin);
        pwdLogin.sendKeys(decryptData(appConfig.getPasswordAccount()));
        return this;
    }

    @Step("As a user click button submit login")
    public SendQuotationSellerKomodo btnLoginSeller(){
        highlightElement(btnLogin);
        btnLogin.click();
        return this;
    }

    @Step("As a user click inquiry button")
    public SendQuotationSellerKomodo inquirylistButtonSeller(){
        highlightElement(inquirylistBtn);
        inquirylistBtn.click();
        return this;
    }

    @Step("As a user type RFQ name in inquiry list")
    public SendQuotationSellerKomodo inputInquiryNameSeller() throws InterruptedException {
        highlightElement(inputInquiryName);
        inputInquiryName.sendKeys("RFQ/2022/09/347");
        Thread.sleep(3000);
        return this;
    }

    @Step("As a user click RFQ RFQ/2022/09/32")
    public SendQuotationSellerKomodo clickTheInquirySeller(){
        highlightElement(clickTheInquiry);
        clickTheInquiry.click();
        return this;
    }


    @Step("As a user click Send quotation button")
    public SendQuotationSellerKomodo clickBtnSendQuoSeller(){
        highlightElement(clickBtnSendQuo);
        clickBtnSendQuo.click();
        return this;
    }

    @Step("As a user click Send quotation button Pop Up")
    public SendQuotationSellerKomodo clickBtnSendQuoPopupSeller(){
        highlightElement(clickBtnSendQuoPopup);
        clickBtnSendQuoPopup.click();
        return this;
    }

}
