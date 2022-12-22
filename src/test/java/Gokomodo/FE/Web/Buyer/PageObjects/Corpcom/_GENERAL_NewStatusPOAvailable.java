package Gokomodo.FE.Web.Buyer.PageObjects.Corpcom;

import Gokomodo.FE.Web.LoginManager.Buyer.pageObjects.pages.BuyerLoginCommerce1PageObject;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.Base64;

public class _GENERAL_NewStatusPOAvailable extends BuyerLoginCommerce1PageObject {
    //============== Login ==================//
    @FindBy(xpath = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")
    private WebElement inputEmail;
    @FindBy(xpath = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/input[1]")
    private WebElement inputPassword;
    @FindBy(xpath = "//button[contains(text(),'Masuk')]")
    private WebElement btnLoginCorpcom;

    //============== Step ==================//

    @FindBy(xpath = "/html/body/div[1]/div/main/div/div/div/div[1]/div[3]/div[2]/img")
    private WebElement RFQIndex;
    @FindBy(id = "react-select-5-input")
    private WebElement inqStatus;
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[3]/table/tbody/tr/td[6]")
    private WebElement lstmnrcvQuotation;
    @FindBy(xpath="//button[contains(text(),'Create Trade Confirmation')]")
    private WebElement btncrttc;
    @FindBy(xpath = "/html/body/div[3]/div/div[1]/div/div/div[2]/div[2]/div[2]/div[2]/input")
    private WebElement attchmntTC;
    @FindBy(xpath = "//div[@class='modal-footer']//button[@type='button'][contains(text(),'Create Trade Confirmation')]")
    private WebElement getBtncrttcattachment;
    @FindBy(xpath="//div[contains(text(),'Purchase Order')]")
    private WebElement lblstatus;
    @FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[1]/button/span")
    private WebElement btnclspopup;
    //============== Login ==================//
    @Step("As a user already input email")
    public _GENERAL_NewStatusPOAvailable InputEmail() throws InterruptedException {
        Thread.sleep(1000);
        highlightElement(inputEmail);
        inputEmail.sendKeys(decryptData(appConfig.getUserCommerce1()));
        return this;
    }

    @Step("As a user already input password")
    public _GENERAL_NewStatusPOAvailable InputPassword() {
        highlightElement(inputPassword);
        inputPassword.sendKeys(decryptData(appConfig.getPasswordAccount()));
        return this;
    }

    @Step("As a user click button login")
    public _GENERAL_NewStatusPOAvailable BtnLoginCorp() throws InterruptedException {
        highlightElement(btnLoginCorpcom);
        btnLoginCorpcom.click();
        Thread.sleep(5000);
        return this;
    }
    //============== Step ==================//
    @Step("As a user want to click RFQindex button")
    public _GENERAL_NewStatusPOAvailable RFQindex() throws InterruptedException {
           highlightElement(RFQIndex);
           RFQIndex.click();
           Thread.sleep(5000);

        return this;
    }
    @Step("As a user want to input ID Permintaan")
    public _GENERAL_NewStatusPOAvailable searchID() throws InterruptedException {
        highlightElement(inqStatus);
        inqStatus.sendKeys("Received Quotation", Keys.ENTER);
        Thread.sleep(5000);
        return this;
    }
    @Step("As a user want to click list menu ")
    public _GENERAL_NewStatusPOAvailable lstmn() throws InterruptedException {
        highlightElement(lstmnrcvQuotation);
        lstmnrcvQuotation.click();
        Thread.sleep(5000);
        return this;
    }
    @Step("As a user want to click btn TC ")
    public _GENERAL_NewStatusPOAvailable btntc() throws InterruptedException {
        highlightElement(btncrttc);
        btncrttc.click();
        Thread.sleep(5000);
        return this;
    }
    @Step("As a user want to upload document TC ")
    public _GENERAL_NewStatusPOAvailable uploadTC() throws InterruptedException {
        highlightElement(attchmntTC);
        attchmntTC.sendKeys("/Users/nazaralamgokomodo/GATE-Automation/QA-AutomationFramework/src/test/resources/Excel Files/gokomodo-virtual-quotation-excel-template.xlsx");
        Thread.sleep(5000);
        return this;
    }
    @Step("As a user want to click btn send TC ")
    public _GENERAL_NewStatusPOAvailable sendTC() throws InterruptedException {
        highlightElement(getBtncrttcattachment);
        getBtncrttcattachment.click();
        Thread.sleep(5000);
        return this;
    }
    @Step("As a user want to compare the status ")
    public _GENERAL_NewStatusPOAvailable Stts() throws Exception {
        highlightElement(lblstatus);
        String Actualstatus = lblstatus.getText();
        String Expectstatus = "Purchase Order";
        Assert.assertEquals(Actualstatus,Expectstatus);
        System.out.println(Actualstatus);
        Thread.sleep(3000);
        robotScreenCapture("Expected status PO");
        Thread.sleep(3000);
        return this;
    }




}
