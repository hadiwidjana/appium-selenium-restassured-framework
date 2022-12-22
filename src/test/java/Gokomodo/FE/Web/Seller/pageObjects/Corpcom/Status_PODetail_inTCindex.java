package Gokomodo.FE.Web.Seller.pageObjects.Corpcom;

import Gokomodo.FE.Web.LoginManager.Seller.pageObjects.initializePageObjects.SellerPageLoginInitializer;
import Gokomodo.GlobalMethod.AllureReport.AllureAttachments;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Base64;

public class Status_PODetail_inTCindex extends SellerPageLoginInitializer {


    //============================ Login ================================//
    @FindBy(xpath = "/html/body/div/div/main/div/div/div[1]/div[2]/form/div[1]/input")
    private WebElement txtLogin;
    @FindBy(xpath = "/html/body/div/div/main/div/div/div[1]/div[2]/form/div[2]/div/input")
    private  WebElement pwdLogin;
    @FindBy(xpath = "/html/body/div/div/main/div/div/div[1]/div[2]/form/div[3]/button")
    private WebElement btnLogin;

    //=====================================================================//

    //=====================================================================//

    @FindBy(xpath = "/html/body/div/div/header/div/nav/ul/li[4]/a/div")
    private WebElement clickTCbtn;
    @FindBy(xpath = "/html/body/div/div/main/div/table/tbody/tr[2]")
    private WebElement lblListTCnumber2;

    //=====================================================================//

    @Step("As a user already input email")
    public Status_PODetail_inTCindex InputEmailSeller() throws InterruptedException {
        Thread.sleep(2000);
        highlightElement(txtLogin);
        txtLogin.sendKeys(decryptData(appConfig.getUsrSeller()));
        return this;
    }

    @Step("As a user already input password")
    public Status_PODetail_inTCindex InputPasswordSeller(){

        highlightElement(pwdLogin);
        pwdLogin.sendKeys(decryptData(appConfig.getPasswordAccount()));
        return this;
    }

    @Step("As a user click button submit login")
    public Status_PODetail_inTCindex btnLoginSeller(){
        highlightElement(btnLogin);
        btnLogin.click();
        return this;
    }

    @Step("As a user click TC button")
    public Status_PODetail_inTCindex clickTCbtnCorpcomm() throws Exception {
        highlightElement(clickTCbtn);
        clickTCbtn.click();
        robotScreenCapture("Expected_POin_TCIndex");
        Thread.sleep(3000);
        AllureAttachments.saveWebElement(getWebDriver(), lblListTCnumber2);
        Thread.sleep(3000);
        return this;
    }


}
