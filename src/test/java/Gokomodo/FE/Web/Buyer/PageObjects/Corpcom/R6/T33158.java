package Gokomodo.FE.Web.Buyer.PageObjects.Corpcom.R6;

import Gokomodo.FE.Web.LoginManager.Buyer.pageObjects.pages.BuyerLoginCommerce1PageObject;
import Gokomodo.GlobalMethod.AllureReport.AllureAttachments;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Base64;

public class T33158 extends BuyerLoginCommerce1PageObject {
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
    @FindBy(xpath = "/html/body/div[1]/div/main/div[1]/div/div/div[1]")
    private WebElement EvidanceT33158;


        @Step("As a user already input email")
        public T33158 InputEmail() throws InterruptedException {
            Thread.sleep(1000);
            highlightElement(inputEmail);
            inputEmail.sendKeys(decryptData(appConfig.getUserCommerce1()));
            return this;
        }

        @Step("As a user already input password")
        public T33158 InputPassword() {
            highlightElement(inputPassword);
            inputPassword.sendKeys(decryptData(appConfig.getPasswordAccount()));
            return this;
        }

        @Step("As a user click button login")
        public T33158 BtnLoginCorp() throws InterruptedException {
            highlightElement(btnLoginCorpcom);
            btnLoginCorpcom.click();
            Thread.sleep(5000);
            return this;
        }
         @Step("As a user search product")
         public T33158 searchPrd() throws InterruptedException {
            highlightElement(SearchProduct);
             AllureAttachments.saveWebElement(getWebDriver(), SearchProduct);
             SearchProduct.sendKeys("Pelumas", Keys.ENTER);
            Thread.sleep(5000);
            return this;
        }
        @Step("As a user click product")
        public T33158 ChsPrd() throws InterruptedException {
            highlightElement(chooseprd);
            AllureAttachments.saveWebElement(getWebDriver(), chooseprd);
            chooseprd.click();
            Thread.sleep(5000);
            return this;
        }
        @Step("T33158 - it should show brand detail and there should be shown: title of brand, brand description, attachment and user able to filter product based on the brand")
        public T33158 evidanceT33158() {
            highlightElement(EvidanceT33158);
            AllureAttachments.saveWebElement(getWebDriver(), EvidanceT33158);
            return this;
    }
}
