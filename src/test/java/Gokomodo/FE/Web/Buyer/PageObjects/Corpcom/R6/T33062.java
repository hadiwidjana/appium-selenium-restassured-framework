package Gokomodo.FE.Web.Buyer.PageObjects.Corpcom.R6;



import Gokomodo.FE.Web.LoginManager.Buyer.pageObjects.pages.BuyerLoginCommerce1PageObject;
import Gokomodo.GlobalMethod.AllureReport.AllureAttachments;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Base64;

public class T33062 extends BuyerLoginCommerce1PageObject {

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

    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[3]/div[1]/div/div[1]/div/div[2]/input")
    private WebElement inputRFQName;
    //
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[3]/table/tbody/tr/td[1]")
    private WebElement clickTheRFQName;
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[1]/div[2]/div/div/div[2]/div/span/button")
    private WebElement clickActionbtn;
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[1]/div[2]/div/div/div[2]/div/div/button")
    private WebElement clickCancelbtn;
    @FindBy(xpath = "/html/body/div[3]/div/div[1]/div/div/div[2]/textarea")
    private WebElement inputTextReason;
    @FindBy(xpath = "/html/body/div[3]/div/div[1]/div/div/div[3]/button[2]")
    private WebElement clickCancelRFQbtn;
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[2]/div/div[6]/div/div[2]/button/span")
    private WebElement clickViewCancelled;
    @FindBy(xpath = "/html/body/div[3]/div/div[1]/div")
    private WebElement clickXViewCancel;
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[4]/div/div[2]/div/div/div/div[1]")
    private WebDriver clickAlam;



    //=======================================//

    //============ test ====================//

    @Step("As a user already input email")
    public T33062 InputEmail() throws InterruptedException {
        Thread.sleep(1000);
        highlightElement(inputEmail);
        inputEmail.sendKeys(decryptData(appConfig.getUserCommerce1()));
        return this;
    }

    @Step("As a user already input password")
    public T33062 InputPassword() {
        highlightElement(inputPassword);
        inputPassword.sendKeys(decryptData(appConfig.getPasswordAccount()));
        return this;
    }

    @Step("As a user click button login")
    public T33062 BtnLoginCorp() throws InterruptedException {
        highlightElement(btnLoginCorpcom);
        btnLoginCorpcom.click();
        Thread.sleep(5000);
        return this;
    }

    @Step("As a user click RFQ Icon")
    public T33062 clickLogoRFQBtnCorpcomm() {
        highlightElement(clickLogoRFQ);
        clickLogoRFQ.click();
        return this;
    }

    @Step("As a user Input RFQ name RFQ/2022/09/135")
    public T33062 inputRFQNameCorpcomm() throws InterruptedException {
        highlightElement(inputRFQName);
        inputRFQName.sendKeys("RFQ/2022/09/120");
        Thread.sleep(4000);
        return this;
    }

    @Step("As a user click The RFQ Choosen")
    public T33062 clickTheRFQNameCorpcomm() {
        highlightElement(clickTheRFQName);
        clickTheRFQName.click();
        return this;
    }

//    @Step("As a user click Action button")
//    public T33059 clickActionbtnCorpcomm() {
//        highlightElement(clickActionbtn);
//        clickActionbtn.click();
//        return this;
//    }
//
//    @Step("As a user click cancel icon button")
//    public T33059 clickCancelbtnCorpcomm() {
//        highlightElement(clickCancelbtn);
//        clickCancelbtn.click();
//        return this;
//    }
//
//    @Step("As a user Input RFQ name RFQ/2022/09/135")
//    public T33059 inputTextReasonCorpcomm() {
//        highlightElement(inputTextReason);
//        inputTextReason.sendKeys("Testing Automated by GATE for automating stuff.");
//        return this;
//    }
//
//    @Step("As a user click cancel icon button")
//    public T33059 clickCancelRFQbtnCorpcomm() {
//        highlightElement(clickCancelRFQbtn);
//        clickCancelRFQbtn.click();
//        return this;
//    }

    @Step("As a user click View cancel icon button")
    public T33062 clickViewCancelledCorpcomm() {
        highlightElement(clickViewCancelled);
        clickViewCancelled.click();
        return this;
    }

    //Masih Error atau dibikin manual aja
    @Step("As a user click close in view X icon button")
    public T33062 clickXViewEverywhereCorpcomm() throws Exception {
        highlightElement(clickXViewCancel);
        //new Actions(getWebDriver()).moveByOffset(1700, 900).click();
        clickXViewCancel.click();
        Thread.sleep(3000);
        AllureAttachments.saveWebElement(getWebDriver(), clickXViewCancel);
        Thread.sleep(3000);
        robotScreenCapture("ExpectedT33062");
        return this;
    }


}
