package Gokomodo.FE.Web.Seller.pageObjects.Corpcom;

import Gokomodo.FE.Web.LoginManager.Seller.pageObjects.initializePageObjects.SellerPageLoginInitializer;
import Gokomodo.GlobalMethod.AllureReport.AllureAttachments;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Base64;

public class StatusPODetail extends SellerPageLoginInitializer {

    //============================ Login ================================//
    @FindBy(xpath = "/html/body/div/div/main/div/div/div[1]/div[2]/form/div[1]/input")
    private WebElement txtLogin;
    @FindBy(xpath = "/html/body/div/div/main/div/div/div[1]/div[2]/form/div[2]/div/input")
    private  WebElement pwdLogin;
    @FindBy(xpath = "/html/body/div/div/main/div/div/div[1]/div[2]/form/div[3]/button")
    private WebElement btnLogin;


    //=====================================================================//

    @FindBy(xpath = "//div[contains(text(),'Quotation')]")
    private WebElement clickQTNbtn;
    @FindBy(xpath = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]")
    private WebElement clickDropdownlist;
    @FindBy(id = "react-select-6-option-4")
    private WebElement checkForPO;
    @FindBy(xpath = "/html/body/div/div/main/div/div[1]/div[1]/div/div[2]/input")
    private WebElement clickQuoLbl;
    @FindBy(xpath = "/html/body/div/div/main/div/table/tbody/tr[1]")
    private WebElement lblforScreenShoot;
    @FindBy(xpath = "/html/body/div/div/main/div/table/tbody/tr[3]/td[2]")
    private WebElement clickListofQuo;
    @FindBy(xpath = "/html/body/div/div/main/div/div[1]/div[1]/div[2]/div[2]/div/h4")
    private WebElement lblCheckStatus;
    @FindBy(xpath = "/html/body/div/div/main/div/div[1]/div[2]/div[3]/div[2]/div[2]/div")
    private WebElement lblPOSuccess;



    //=====================================================================//

    //=====================================================================//

    @Step("As a user already input email")
    public StatusPODetail InputEmailSeller() throws InterruptedException {
        Thread.sleep(2000);
        highlightElement(txtLogin);
        txtLogin.sendKeys(decryptData(appConfig.getUsrSeller()));
        return this;
    }

    @Step("As a user already input password")
    public StatusPODetail InputPasswordSeller(){

        highlightElement(pwdLogin);
        pwdLogin.sendKeys(decryptData(appConfig.getPasswordAccount()));
        return this;
    }

    @Step("As a user click button submit login")
    public StatusPODetail btnLoginSeller(){
        highlightElement(btnLogin);
        btnLogin.click();
        return this;
    }

    @Step("As a user click Quotation button")
    public StatusPODetail clickQTNbtnCorpcomm(){
        highlightElement(clickQTNbtn);
        clickQTNbtn.click();
        return this;
    }

    @Step("As a user click dropdownlist filter box")
    public StatusPODetail clickDropdownlistCorpcomm(){
        highlightElement(clickDropdownlist);
        clickDropdownlist.click();
        return this;
    }

    @Step("As a user checklist the PO checkbox")
    public StatusPODetail checkForPOCorpcomm(){
        highlightElement(checkForPO);
        checkForPO.click();
        return this;
    }

    @Step("As a user view the PO index List")
    public StatusPODetail clickQuoLblCorpcomm() throws Exception {
        highlightElement(clickQuoLbl);
        clickQuoLbl.click();
        robotScreenCapture("Expected_POIndex");
        Thread.sleep(3000);
        AllureAttachments.saveWebElement(getWebDriver(), lblforScreenShoot);
        Thread.sleep(3000);
        return this;
    }

    @Step("As a user click the RFQ Id")
    public StatusPODetail clickListofQuoCorpcomm() throws InterruptedException {
        highlightElement(clickListofQuo);
        clickListofQuo.click();
        Thread.sleep(4000);
        return this;
    }


    @Step("As a user View the PO details")
    public StatusPODetail POSuccessCorpcomm() throws Exception {
//        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
//        js.executeScript("arguments[0].scrollIntoView();", lblCheckStatus);
        highlightElement(lblPOSuccess);
        robotScreenCapture("Expected_PODetails");
        Thread.sleep(3000);
        AllureAttachments.saveWebElement(getWebDriver(), lblPOSuccess);
        Thread.sleep(3000);
        return this;
    }




}
