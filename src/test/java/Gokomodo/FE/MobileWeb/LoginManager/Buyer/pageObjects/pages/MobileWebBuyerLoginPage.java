package Gokomodo.FE.MobileWeb.LoginManager.Buyer.pageObjects.pages;

import Gokomodo.FE.Mobile.MobileBaseMethod;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.Base64;


public class MobileWebBuyerLoginPage extends MobileBaseMethod {

    @FindBy(xpath = "//input[@id='email-login']")
    private WebElement txtLogin;
    @FindBy(xpath = "//input[@id='password-login']")
    private WebElement pwdLogin;
    @FindBy(xpath = "//button[@id='submit-login']")
    private WebElement btnLogin;

    String decryptData(String decrptData)
    {
        byte[] decodeBytes = Base64.getDecoder().decode(decrptData.getBytes());
        return(new String(decodeBytes));
    }

    @Step("As a user already input email")
    public MobileWebBuyerLoginPage InputEmail(){
        highlightElement(txtLogin);
        clear(txtLogin);
        sendKeys(txtLogin,decryptData(usrNausee));
        return this;
    }

    @Step("As a user already input password")
    public MobileWebBuyerLoginPage InputPassword(){
        highlightElement(pwdLogin);
        clear(pwdLogin);
        sendKeys(pwdLogin,decryptData(PasswordAccount));

        return this;
    }

    @Step("As a user click button submit")

    public MobileWebBuyerLoginPage pressLoginButton(){
        highlightElement(btnLogin);
        click(btnLogin);
        return this;
    }

}
