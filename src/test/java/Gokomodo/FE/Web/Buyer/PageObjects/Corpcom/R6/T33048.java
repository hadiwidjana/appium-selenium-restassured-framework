package Gokomodo.FE.Web.Buyer.PageObjects.Corpcom.R6;


import Gokomodo.FE.Web.LoginManager.Buyer.pageObjects.pages.BuyerLoginCommerce1PageObject;
import Gokomodo.GlobalMethod.AllureReport.AllureAttachments;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Base64;

public class T33048 extends BuyerLoginCommerce1PageObject {

    //============== Login ==================//
    @FindBy(xpath = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")
    private WebElement inputEmail;
    @FindBy(xpath = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/input[1]")
    private WebElement inputPassword;
    @FindBy(xpath = "//button[contains(text(),'Masuk')]")
    private WebElement btnLoginCorpcom;




    //========================================//

    //=======================================//
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div/div/div[1]/div[3]/div[2]/img")
    private WebElement clickLogoRFQ;
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[2]/a[2]")
    private WebElement clickUploadedbtn;

    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[3]/div[1]/div/div[5]/div/div[2]/div/div/div[2]/div")
    private WebElement inquiryListClick;
    @FindBy(id = "react-select-5-option-2")
    private WebElement inquirychooseIP;
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[3]/table/tbody/tr/td[1]")
    private WebElement clickRFQList;
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[1]/div[2]/div/div/div[2]/div/span/button")
    private WebElement clickActionbtn;
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[1]/div[2]/div/div/div[2]/div/div/button")
    private WebElement clickCancelBtn;
    @FindBy(xpath = "/html/body/div[3]/div/div[1]/div/div/div[2]/textarea")
    private WebElement inputReasonCancel;
    @FindBy(xpath = "/html/body/div[3]/div/div[1]/div/div/div[3]/button[2]")
    private WebElement clickCancelPopUp;


    //=======================================//

    //============ test ====================//

    @Step("As a user already input email")
    public T33048 InputEmail() throws InterruptedException {
        Thread.sleep(1000);
        highlightElement(inputEmail);
        inputEmail.sendKeys(decryptData(appConfig.getUserCommerce1()));
        return this;
    }

    @Step("As a user already input password")
    public T33048 InputPassword() {
        highlightElement(inputPassword);
        inputPassword.sendKeys(appConfig.getPasswordAccount());
        return this;
    }

    @Step("As a user click button login")
    public T33048 BtnLoginCorp() throws InterruptedException {
        highlightElement(btnLoginCorpcom);
        btnLoginCorpcom.click();
        Thread.sleep(5000);
        return this;
    }

    @Step("As a user click RFQ Icon")
    public T33048 clickLogoRFQBtnCorpcomm() {
        highlightElement(clickLogoRFQ);
        clickLogoRFQ.click();
        return this;
    }

    @Step("As a user click Uploaded RFQ button")
    public T33048 clickUploadedbtnCorpcomm() throws InterruptedException {
        highlightElement(clickUploadedbtn);
        clickUploadedbtn.click();
        Thread.sleep(3000);
        return this;
    }

    @Step("As a user click inquiry status box")
    public T33048 inquiryListClickCorpcomm() {
        highlightElement(inquiryListClick);
        inquiryListClick.click();
        return this;
    }

    @Step("As a user choose Waiting for response")
    public T33048 inquirychooseIPCorpcomm() throws InterruptedException {
        highlightElement(inquirychooseIP);
        inquirychooseIP.click();
        Thread.sleep(4000);
        return this;
    }

    @Step("As a user choose click the RFQ detail")
    public T33048 clickRFQListCorpcomm() {
        highlightElement(clickRFQList);
        clickRFQList.click();
        return this;
    }

    @Step("As a user click the action button")
    public T33048 clickActionbtnCorpcomm() {
        highlightElement(clickActionbtn);
        clickActionbtn.click();
        return this;
    }

    @Step("As a user click the cancel button")
    public T33048 clickCancelBtnCorpcomm() {
        highlightElement(clickCancelBtn);
        clickCancelBtn.click();
        return this;
    }

    @Step("As a user input the reason for cancelled the RFQ")
    public T33048 inputReasonCancelCorpcomm() {
        highlightElement(inputReasonCancel);
        inputReasonCancel.sendKeys("testing testcase T33048");
        return this;
    }

    @Step("As a user click the cancel button")
    public T33048 clickCancelPopUpCorpcomm() throws Exception {
        highlightElement(clickCancelPopUp);
        clickCancelPopUp.click();
        Thread.sleep(3000);
        AllureAttachments.saveWebElement(getWebDriver(), clickCancelPopUp);
        Thread.sleep(3000);
        robotScreenCapture("ExpectedT33048");
        return this;
    }



}