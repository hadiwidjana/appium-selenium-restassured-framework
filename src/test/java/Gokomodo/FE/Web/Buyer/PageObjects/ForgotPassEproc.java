package Gokomodo.FE.Web.Buyer.PageObjects;


import Gokomodo.FE.Web.LoginManager.Buyer.pageObjects.pages.BuyerLoginNauseee1PageObject;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Base64;

public class ForgotPassEproc extends BuyerLoginNauseee1PageObject {

        @FindBy(xpath = "//a[contains(text(),'Lupa Password?')]")
        private WebElement txtForgetPass;
        @FindBy(id = "email-forgot-password")
        private  WebElement txtEmail;
        @FindBy(id = "submit-forgot-password")
        private WebElement btnAturUlangPass;
        @FindBy(xpath = "html/body/div/div/main/div/div/div/div[1]/a")
        private WebElement btCekEmail;
        @Step("As a user already click Lupa Password")
            public ForgotPassEproc BtnForgetPass() throws InterruptedException {
            Thread.sleep(1000);
            highlightElement(txtForgetPass);
            txtForgetPass.click();
            return this;
        }

        @Step("As a user already input email that forget the password")
        public ForgotPassEproc InputEmailForget(){

            highlightElement(txtEmail);
            txtEmail.sendKeys(decryptData(appConfig.getUsrNauseee1()));
            return this;
        }

        @Step("As a user click button Atur Ulang Kata Sandi")
        public ForgotPassEproc BtnAturUlangPass(){
            highlightElement(btnAturUlangPass);
            btnAturUlangPass.click();
            return this;
        }

        ///html/body/div/div/main/div/div/div/div[1]/a
        @Step("As a user click cek email anda")
        public ForgotPassEproc BtnCekEmail(){
            highlightElement(btCekEmail);
            btCekEmail.click();
            return this;
        }
}
