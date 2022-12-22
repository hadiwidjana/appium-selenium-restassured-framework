package Gokomodo.FE.Web.Buyer.PageObjects.Corpcom.R6;


import Gokomodo.FE.Web.LoginManager.Buyer.pageObjects.pages.BuyerLoginCommerce1PageObject;
import Gokomodo.GlobalMethod.AllureReport.AllureAttachments;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Base64;

public class T33164 extends BuyerLoginCommerce1PageObject {
    //============== Login ==================//
    @FindBy(xpath = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")
    private WebElement inputEmail;
    @FindBy(xpath = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/input[1]")
    private WebElement inputPassword;
    @FindBy(xpath = "//button[contains(text(),'Masuk')]")
    private WebElement btnLoginCorpcom;
    //============== Step ==================//
    @FindBy(id = "react-select-2-input")
    private WebElement SearchProduct;

    @FindBy(xpath = "//img[@class='img-fluid css-l4fru9']") //Firefox
    //@FindBy(xpath = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[4]/button[1]") //Chrome
    private WebElement chooseprd;

    @FindBy(xpath = "/html/body/div[1]/div/main/div[1]/div/div/div[1]/div[1]/div[1]")
    private WebElement detailsproduct;

    @FindBy(xpath = "/html/body/div[1]/div/main/div[1]/div/div/div[1]/div[1]/div[1]/div/img")
    private WebElement clkprd;
    @FindBy(xpath = "/html/body/div[3]/div/div[1]/div/div/div[3]/button")
    private WebElement btnclose;



        @Step("As a user already input email")
        public T33164 InputEmail() throws InterruptedException {
            Thread.sleep(1000);
            highlightElement(inputEmail);
            inputEmail.sendKeys(decryptData(appConfig.getUserCommerce1()));
            return this;
        }

        @Step("As a user already input password")
        public T33164 InputPassword() {
            highlightElement(inputPassword);
            inputPassword.sendKeys(decryptData(appConfig.getPasswordAccount()));
            return this;
        }

        @Step("As a user click button login")
        public T33164 BtnLoginCorp() throws InterruptedException {
            highlightElement(btnLoginCorpcom);
            btnLoginCorpcom.click();
            Thread.sleep(5000);
            return this;
        }
         @Step("As a user search product")
         public T33164 searchPrd() throws InterruptedException {
            highlightElement(SearchProduct);
             AllureAttachments.saveWebElement(getWebDriver(), SearchProduct);
             SearchProduct.sendKeys("Pelumas", Keys.ENTER);
            Thread.sleep(5000);
            return this;
        }
        @Step("As a user click product")
        public T33164 ChsPrd() throws InterruptedException {
            highlightElement(chooseprd);
            AllureAttachments.saveWebElement(getWebDriver(), chooseprd);
            chooseprd.click();
            Thread.sleep(5000);
            return this;
        }
        @Step("As a user want to click brand product")
        public T33164 clickprd() {
            highlightElement(clkprd);
            AllureAttachments.saveWebElement(getWebDriver(), clkprd);
            clkprd.click();
            return this;
        }
        @Step ("T33164 - the Buyer should be able to close the brand detail popup")
        public T33164 evidenceT33164(){
            highlightElement(btnclose);
            AllureAttachments.saveWebElement(getWebDriver(), btnclose);
            btnclose.click();
            return this;


    }
}
