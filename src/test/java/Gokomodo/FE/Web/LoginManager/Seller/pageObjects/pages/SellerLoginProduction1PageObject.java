package Gokomodo.FE.Web.LoginManager.Seller.pageObjects.pages;

import Gokomodo.FE.Web.LoginManager.Seller.pageObjects.initializePageObjects.SellerPageLoginInitializer;
import Gokomodo.GlobalMethod.AllureReport.AllureAttachments;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Base64;

public class SellerLoginProduction1PageObject extends SellerPageLoginInitializer {

    @FindBy(xpath = "/html/body/div/div/main/div/div/div[1]/div[2]/form/div[1]/input")
    private  WebElement txtLogin;
    @FindBy(xpath = "/html/body/div/div/main/div/div/div[1]/div[2]/form/div[2]/div/input")
    private  WebElement pwdLogin;
    @FindBy(xpath = "/html/body/div/div/main/div/div/div[1]/div[2]/form/div[3]/button")
    private WebElement btnLogin;

    @Step("As a user already input email")
    public SellerLoginProduction1PageObject InputEmail() throws InterruptedException {
        Thread.sleep(1000);
        AllureAttachments.saveWebElement(getWebDriver(),txtLogin);
        highlightElement(txtLogin);
        txtLogin.sendKeys(decryptData(appConfig.getSellerprod1()));
        return this;
    }

    @Step("As a user already input password")
    public SellerLoginProduction1PageObject InputPassword(){

        highlightElement(pwdLogin);
        pwdLogin.sendKeys(decryptData(appConfig.getPasswordprodseller1()));
        return this;
    }

    @Step("As a user click button submit")
    public SellerLoginProduction1PageObject btnLogin(){
        highlightElement(btnLogin);
        btnLogin.click();
        return this;
    }

}
