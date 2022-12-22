package Gokomodo.FE.Web.Buyer.PageObjects.Corpcom.R6;


import Gokomodo.FE.Web.LoginManager.Buyer.pageObjects.pages.BuyerLoginCommerce1PageObject;
import Gokomodo.GlobalMethod.AllureReport.AllureAttachments;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Base64;

public class T33066 extends BuyerLoginCommerce1PageObject {

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
    @FindBy(id = "react-select-5-option-4")
    private WebElement inquirychooseTC;
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[3]/table/tbody/tr/td[1]")
    private WebElement clickRFQList;
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[1]/div[2]/div/div/div[2]/div/span/button")
    private WebElement clickActionbtn;


    //=======================================//

    //============ test ====================//

    @Step("As a user already input email")
    public T33066 InputEmail() throws InterruptedException {
        Thread.sleep(1000);
        highlightElement(inputEmail);
        inputEmail.sendKeys(decryptData(appConfig.getUserCommerce1()));
        return this;
    }

    @Step("As a user already input password")
    public T33066 InputPassword() {
        highlightElement(inputPassword);
        inputPassword.sendKeys(decryptData(appConfig.getPasswordAccount()));
        return this;
    }

    @Step("As a user click button login")
    public T33066 BtnLoginCorp() throws InterruptedException {
        highlightElement(btnLoginCorpcom);
        btnLoginCorpcom.click();
        Thread.sleep(5000);
        return this;
    }

    @Step("As a user click RFQ Icon")
    public T33066 clickLogoRFQBtnCorpcomm() {
        highlightElement(clickLogoRFQ);
        clickLogoRFQ.click();
        return this;
    }

    @Step("As a user click Uploaded RFQ button")
    public T33066 clickUploadedbtnCorpcomm() throws InterruptedException {
        highlightElement(clickUploadedbtn);
        clickUploadedbtn.click();
        Thread.sleep(3000);
        return this;
    }

    @Step("As a user click inquiry status box")
    public T33066 inquiryListClickCorpcomm() {
        highlightElement(inquiryListClick);
        inquiryListClick.click();
        return this;
    }

    @Step("As a user choose Waiting for response")
    public T33066 inquirychooseTCCorpcomm() throws InterruptedException {
        highlightElement(inquirychooseTC);
        inquirychooseTC.click();
        Thread.sleep(4000);
        return this;
    }

    @Step("As a user choose click the RFQ detail")
    public T33066 clickRFQListCorpcomm() {
        highlightElement(clickRFQList);
        clickRFQList.click();
        return this;
    }

    @Step("As a user click the action button And teh cancel button will be disable")
    public T33066 clickActionbtnCorpcomm() throws Exception {
        highlightElement(clickActionbtn);
        clickActionbtn.click();
        Thread.sleep(3000);
        AllureAttachments.saveWebElement(getWebDriver(), clickActionbtn);
        Thread.sleep(3000);
        robotScreenCapture("ExpectedT33066");
        return this;
    }




}
