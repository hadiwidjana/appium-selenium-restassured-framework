package Gokomodo.FE.Mobile.LoginManager.Seller.pageObjects;

import Gokomodo.FE.Mobile.MobileBaseMethod;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.Base64;

public class MobileSellerLoginPage extends MobileBaseMethod {

    public MobileSellerLoginPage() {
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }



    @AndroidFindBy(xpath = "//*[@resource-id='login-input-email']")
    @iOSXCUITFindBy(xpath = "//*[@name='login-input-email']")
    private WebElement txtLogin;
    @AndroidFindBy(xpath = "//*[@resource-id='login-input-password']")
    @iOSXCUITFindBy(xpath = "//*[@name='login-input-password']")
    private WebElement pwdLogin;
    @AndroidFindBy(xpath = "//*[@resource-id='submit-login']")
    @iOSXCUITFindBy(xpath = "//*[@name='submit-login']")
    private WebElement btnLogin;

    @AndroidFindBy(xpath = "//*[@resource-id = 'bottombar-activity']")
    @iOSXCUITFindBy(xpath = "//*[@name='Activity, tab, 2 of 5']")
    private WebElement activityTab;

    @AndroidFindBy(xpath = "//*[@resource-id = 'submit-logistic-tracking']")
    @iOSXCUITFindBy(xpath = "//*[@name='submit-track']")
    private WebElement trackButton;

    String decryptData(String decrptData)
    {
        byte[] decodeBytes = Base64.getDecoder().decode(decrptData.getBytes());
        return(new String(decodeBytes));
    }

    @Step("As a user already input email")
    public MobileSellerLoginPage InputEmail(){
//        highlightElement(txtLogin);
        clear(txtLogin);
        sendKeys(txtLogin,decryptData(usrSeller));
        return this;
    }

    @Step("As a user already input password")
    public MobileSellerLoginPage InputPassword(){
//        highlightElement(pwdLogin);
        clear(pwdLogin);
        sendKeys(pwdLogin,decryptData(PasswordAccount));
        return this;
    }

    @Step("As a user click button submit")
    public MobileSellerLoginPage pressLoginButton(){
//        highlightElement(btnLogin);
        click(btnLogin);
        return this;
    }

    @Step("As a user I want to see Activity Page")
    public MobileSellerLoginPage goToActivityPage() {
        click(activityTab);
        return this;
    }

    @Step("As a user I want to Track my order")
    public MobileSellerLoginPage clickTrackButton() {
        scrollToElement(trackButton,"down");
        click(trackButton);
        return this;
    }


}
