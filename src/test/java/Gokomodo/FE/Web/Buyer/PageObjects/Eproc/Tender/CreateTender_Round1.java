package Gokomodo.FE.Web.Buyer.PageObjects.Eproc.Tender;

import Gokomodo.FE.Web.LoginManager.Buyer.pageObjects.pages.BuyerLoginNauseee1PageObject;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Base64;

public class CreateTender_Round1 extends BuyerLoginNauseee1PageObject{

    //======= Xpath & ID ======//
    @FindBy(xpath = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")
    private WebElement inputEmail;
    @FindBy(xpath = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/input[1]")
    private  WebElement inputPassword;
    @FindBy(xpath = "//button[contains(text(),'Masuk')]")
    private WebElement btnLoginEproc;


    //==========================================================================//

    //==========================================================================//

    @FindBy(xpath = "//*[@id=\"btn-procurement-list\"]")
    private WebElement clickProcrumentList;
    @FindBy(xpath = "//*[@id=\"root\"]/div/header/div/nav/ul[1]/li[1]/div/div/div/div/div[1]/div[1]/a/div")
    private WebElement clickRFQList;

    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[1]/div/div[1]/div/div[2]/input")
    public WebElement formControlKomodo;

    @FindBy(xpath = "//td[.//div[@class=\"mb-1\"]]")
    public WebElement element;

    @FindBy(xpath = "//button[@style=\"width: 150px;\"]")
    public WebElement createTender;

    @FindBy(xpath = "//div[@aria-hidden=\"true\"][.//*[@id='tooltip-price-detail-13c0f0d4-5c0d-42e8-90b3-217a3f5f4176']]")
    public WebElement sakaSemuaAdaIdrIncl;

    @FindBy(xpath = "//div[@aria-hidden=\"true\"][.//*[@id='tooltip-price-detail-391c3945-ec74-4603-b1b9-bc937ff8ac9d']]")
    public WebElement sellerTestKomodoIdrIncl;

    @FindBy(xpath = "//button[@data-testid=\"modal-ok\"]")
    public WebElement modal;

    @FindBy(id = "date")
    public WebElement date;

    @FindBy(xpath = "/html/body/div[3]/div/div[1]/div/div/div[2]/div/div[1]/div[2]/div/div/div[2]/div")
    private WebElement clickEndTime;
    
    @FindBy(id = "react-select-6-option-0")
    public WebElement chooseEndTime;

    @FindBy(xpath = "//input[@name=\"bid_blind\"]")
    public WebElement bidBlindFormCheckInput;

    @FindBy(xpath = "//input[@name=\"bid_open\"]")
    public WebElement bidOpenFormCheckInput;

    @FindBy(xpath = "//button[@data-testid=\"modal-ok\"]")
    public WebElement modal2;

    //========================================================================//

    //================================ STEP ==================================//
    @Step("As a user already input email")
    public CreateTender_Round1 InputEmailEproc() throws InterruptedException {
        Thread.sleep(1000);
        highlightElement(inputEmail);
        inputEmail.sendKeys(decryptData(appConfig.getUsrNauseee1()));
        return this;
    }

    @Step("As a user already input password")
    public CreateTender_Round1 InputPasswordEproc(){
        highlightElement(inputPassword);
        inputPassword.sendKeys(decryptData(appConfig.getPasswordAccount()));
        return this;
    }

    @Step("As a user click button login")
    public CreateTender_Round1 BtnEprocLoginEproc(){
        highlightElement(btnLoginEproc);
        btnLoginEproc.click();
        return this;
    }

    @Step("As a user click procrument button")
    public CreateTender_Round1 clickProcrumentListTender(){
        highlightElement(clickProcrumentList);
        clickProcrumentList.click();
        return this;
    }

    @Step("As a user click RFQ button")
    public CreateTender_Round1 clickRFQListbuttonTender(){
        highlightElement(clickRFQList);
        clickRFQList.click();
        return this;
    }

    @Step("As a user input RFQ name")
    public CreateTender_Round1 formControlKomodoTender(){
        highlightElement(formControlKomodo);
        formControlKomodo.sendKeys("RFQ/2022/09/347");
        return this;
    }

    @Step("As a user click RFQ name")
    public CreateTender_Round1 elementClickRFQName(){
        highlightElement(element);
        element.click();
        return this;
    }

    @Step("As a user click create Tender")
    public CreateTender_Round1 buttonCreateTender(){
        highlightElement(createTender);
        createTender.click();
        return this;
    }

    @Step("As a user choose Saka Semua Ada")
    public CreateTender_Round1 sakaSemuaAdaIdrInclTender(){
        highlightElement(sakaSemuaAdaIdrIncl);
        sakaSemuaAdaIdrIncl.click();
        return this;
    }

    @Step("As a user choose Seller Kodomo")
    public CreateTender_Round1 sellerTestKomodoIdrInclTender(){
        highlightElement(sellerTestKomodoIdrIncl);
        sellerTestKomodoIdrIncl.click();
        return this;
    }


    @Step("As a user click continue")
    public CreateTender_Round1 modalNextBtnTender(){
        highlightElement(modal);
        modal.click();
        return this;
    }

    @Step("As a user choose date")
    public CreateTender_Round1 dateForTender(){
        highlightElement(date);
        date.sendKeys("30 September '22");
        return this;
    }

    @Step("As a user click time")
    public CreateTender_Round1 clickEndTimetender(){
        highlightElement(clickEndTime);
        clickEndTime.click();
        return this;
    }

    @Step("As a user choose time")
    public CreateTender_Round1 chooseEndTimeTender(){
        highlightElement(chooseEndTime);
        chooseEndTime.click();
        return this;
    }

    @Step("As a user choose radio buttom for bidding")
    public CreateTender_Round1 bidOpenFormCheckInputTender(){
        highlightElement(bidOpenFormCheckInput);
        bidOpenFormCheckInput.click();
        return this;
    }

    @Step("As a user choose radio buttom for bidding")
    public CreateTender_Round1 modal2CreateTender(){
        highlightElement(modal2);
        modal2.click();
        return this;
    }











    
    



}
