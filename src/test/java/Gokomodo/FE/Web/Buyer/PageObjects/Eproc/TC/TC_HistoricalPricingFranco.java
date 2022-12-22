package Gokomodo.FE.Web.Buyer.PageObjects.Eproc.TC;


import Gokomodo.FE.Web.LoginManager.Buyer.pageObjects.pages.BuyerLoginNauseee1PageObject;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Base64;

public class TC_HistoricalPricingFranco extends BuyerLoginNauseee1PageObject {

    //============== Login ==================//
    @FindBy(xpath = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")
    private WebElement inputEmail;
    @FindBy(xpath = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/input[1]")
    private  WebElement inputPassword;
    @FindBy(xpath = "//button[contains(text(),'Masuk')]")
    private WebElement btnLoginEproc;
    @FindBy(id = "btn-procurement-list")
    private WebElement btnProcrumentList;
    @FindBy(id = "btn-tc-list")
    private WebElement btnClickTC;
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[3]/div/div[1]/div/div[2]/input")
    private WebElement inputTCFranco;
    @FindBy(xpath = "//a[@class='btn btn-sm btn-outline-primary mr-2']")
    private WebElement clickTheTCList;



    //=======================================//

    //================================ STEP ==================================//
    @Step("As a user already input email")
    public TC_HistoricalPricingFranco InputEmailEproc() throws InterruptedException {
        Thread.sleep(1000);
        highlightElement(inputEmail);
        inputEmail.sendKeys(decryptData(appConfig.getUsrNauseee1()));
        return this;
    }

    @Step("As a user already input password")
    public TC_HistoricalPricingFranco InputPasswordEproc(){
        highlightElement(inputPassword);
        inputPassword.sendKeys(decryptData(appConfig.getPasswordAccount()));
        return this;
    }

    @Step("As a user click button login")
    public TC_HistoricalPricingFranco BtnEprocLoginEproc(){
        highlightElement(btnLoginEproc);
        btnLoginEproc.click();
        return this;
    }

    @Step("As a user click Procrument on navbar")
    public TC_HistoricalPricingFranco btnProcrumentListTCFrancoEproc(){
        highlightElement(btnProcrumentList);
        btnProcrumentList.click();
        return this;
    }

    @Step("As a user click TC Button")
    public TC_HistoricalPricingFranco btnClickTCFrancoEproc() throws InterruptedException {
        highlightElement(btnClickTC);
        btnClickTC.click();
        Thread.sleep(3000);
        return this;
    }

    @Step("As a user Search TC for Franco (TCO/2022/09/62)")
    public TC_HistoricalPricingFranco inputEprocTCFrancoEproc(){
        highlightElement(inputTCFranco);
        inputTCFranco.sendKeys("TCO/2022/09/62");
        return this;
    }

    @Step("As a user click view button on that TC")
    public TC_HistoricalPricingFranco clickTheTCListFrancoEproc(){
        highlightElement(clickTheTCList);
        clickTheTCList.click();
        return this;
    }

}
