package Gokomodo.FE.MobileWeb.LoginManager.Seller.pageObjects.pages;

import Gokomodo.FE.Mobile.MobileBaseMethod;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Base64;


public class MobileWebSellerLoginPage extends MobileBaseMethod {

    @FindBy(xpath = "//input[@data-testid='email']")
    private WebElement txtLogin;
    @FindBy(xpath = "//input[@data-testid='password']")
    private WebElement pwdLogin;
    @FindBy(xpath = "//button[@data-testid='submit-login']")
    private WebElement btnLogin;

    String decryptData(String decrptData)
    {
        byte[] decodeBytes = Base64.getDecoder().decode(decrptData.getBytes());
        return(new String(decodeBytes));
    }

    @Step("As a user already input email")
    public MobileWebSellerLoginPage InputEmail(){
        highlightElement(txtLogin);
        clear(txtLogin);
        sendKeys(txtLogin,decryptData(usrSeller));
        return this;
    }

    @Step("As a user already input password")
    public MobileWebSellerLoginPage InputPassword(){
        highlightElement(pwdLogin);
        clear(pwdLogin);
        sendKeys(pwdLogin,decryptData(PasswordAccount));

        return this;
    }

    @Step("As a user click button submit")
    public MobileWebSellerLoginPage pressLoginButton(){
        highlightElement(btnLogin);
        click(btnLogin);
        return this;
    }

    public MobileWebSellerLoginPage login(String username, String password) {
        InputEmail();
        InputPassword();
        return pressLoginButton();
    }


}
