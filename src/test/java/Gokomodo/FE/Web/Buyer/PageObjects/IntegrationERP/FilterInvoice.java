package Gokomodo.FE.Web.Buyer.PageObjects.IntegrationERP;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.Base64;

import static Gokomodo.GlobalMethod.PropertiesReader.ApplicationConfigReader.appConfig;

public class FilterInvoice {
    //============Create Element Login  Web Bifrost===================//
    @FindBy(id = "email-login")
    private WebElement IntegrationEmailLogin;

    @FindBy(id = "password-login")
    private WebElement IntegrationPassword;

    @FindBy(id = "submit-login")
    public WebElement submitLoginMasuk;
    //-----------------------END---------------------//


    //============Create Element Invoice===================//
    @FindBy(id = "btn-procurement-list")
    public WebElement procurementList;

    @FindBy(id = "btn-invoice-list" )
    public WebElement btninvoicelist;

    @FindBy(xpath = "//input[@placeholder=\"ID Invoice\"]")
    public WebElement formControlKomodo;
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[2]/div[1]/button")
    public WebElement resetfilter;
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[2]/div[1]/div[1]/div[3]/button")
    public WebElement element;

    @FindBy(id = "input-search-invoice-id")
    public WebElement invoice2;

    @FindBy(xpath = "//button[contains(text(),'Cari ID Invoice')]")
    public WebElement btncariIDinvoice;
    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[2]/div[2]/div/div/button")
    public WebElement btnLihatDetail;

    @FindBy(xpath = "/html/body/div[3]/div/div[1]/div/div/div[3]/button")
    public WebElement btnSayamengerti;

    @FindBy(xpath = "//input[contains(@placeholder, \"Order\")]")
    public WebElement formControlKomodo2;

    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[2]/div[1]/div[2]/div[3]/button")
    public WebElement element2;

    @FindBy(id = "input-search-po-id")
    public WebElement searchPO;

    @FindBy(css = "button[class=\"btn btn-primary px-4\"]")
    public WebElement btnCariidPO;

    @FindBy(css = "input[placeholder=\"ID Goods Received\"]")
    public WebElement formControlKomodo3;

    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[2]/div[1]/div[3]/div[3]/button")
    public WebElement element3;

    @FindBy(id = "input-search-gr-id")
    public WebElement InputGRPopUp;

    @FindBy(css = "button[class=\"btn btn-primary px-4\"]")
    public WebElement cariGoodsReceived;


    @FindBy(id = "input-seller")
    public WebElement element5;

    @FindBy(id = "react-select-3-option-0")
    public WebElement reactSelectInput;
    @FindBy(id = "react-select-3-option-1")
    public WebElement reactSelectInput1;
    @FindBy(id = "react-select-3-option-2")
    public WebElement reactSelectInput2;

    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[2]/div[1]/div[5]/div/div[2]/div/div/div[1]")
    public WebElement getReactSelectStatus;

    @FindBy(id = "react-select-4-option-0")
    public WebElement reactSelectSemuaStatus;

    @FindBy(id = "react-select-4-option-1")
    public WebElement reactSelectDibuat;

    @FindBy(id = "react-select-4-option-2")
    public WebElement reactSelectDibayar;

    @FindBy(id = "react-select-4-option-3")
    public WebElement reactSelectDibatalkan;
    //-----------------------END---------------------//

    //======Enkrip=========//
    String decryptData(String decrptData) {
        byte[] decodeBytes = Base64.getDecoder().decode(decrptData.getBytes());
        return (new String(decodeBytes));
    }
    //=====END======//


    //============Step Login Web Bifrost===================//
    @Step("Given as a user input valid email")
    public FilterInvoice getEmailLoginBuyerbifrost() throws InterruptedException {
        IntegrationEmailLogin.sendKeys(decryptData(appConfig.getBuyerIntegrationBifrost()));
        Thread.sleep(1000);
        return this;
    }

    @Step("Given as a user input password")
    public FilterInvoice getPasswordLoginBuyer() throws InterruptedException {
        IntegrationPassword.sendKeys(decryptData(appConfig.getPasswordAccount()));
        Thread.sleep(1000);
        return this;
    }

    @Step("Then user click button login")
    public FilterInvoice getButtonLoginBuyer() throws InterruptedException {
        submitLoginMasuk.click();
        Thread.sleep(3000);
        return this;
    }

    //==================END=====================//

    //=========================Invoice===========================//
    @Step("Given when user click procurement list")
    public FilterInvoice getprocurementlist() throws InterruptedException {
        procurementList.click();
        Thread.sleep(1000);
        return this;
    }

    @Step("When user click the button")
    public FilterInvoice getbtninvoicelist() throws InterruptedException {
        btninvoicelist.click();
        Thread.sleep(4000);
        return this;
    }

    @Step("And user show menu invoice & input invoice ID")
    public FilterInvoice getformcontrolkomodo() throws InterruptedException {
        formControlKomodo.sendKeys("INV/01/02/NEW/00011");
        Thread.sleep(2000);
        return this;

    }
    @Step("And click button reset filter")
    public FilterInvoice getresetfilter() throws InterruptedException {
        resetfilter.click();
        Thread.sleep(2000);
        return this;
    }

    @Step("And user click icon arrow invoice")
    public FilterInvoice getelementclickicon() throws InterruptedException {
        element.click();
        Thread.sleep(4000);
        return this;
    }

    @Step("And user Input data invoice")
    public FilterInvoice getelementinputinvoice() throws InterruptedException {
        invoice2.sendKeys("INV/01/02/NEW/00011,");
        Thread.sleep(2000);
        return this;
    }
    @Step("And user Input Invalid data invoice")
    public FilterInvoice getelementinpuinvalidtinvoice() throws InterruptedException {
        invoice2.sendKeys("Hesoyam,");
        Thread.sleep(1000);
        return this;
    }
    @Step("Then user click button invoice to show search invoice")
    public FilterInvoice getelembuttoninvoice() throws InterruptedException {
        btncariIDinvoice.click();
        Thread.sleep(3000);
        return this;
    }

    @Step("Give as a user click lihat detail")
    public FilterInvoice getlihatdetail() throws InterruptedException {
        btnLihatDetail.click();
        Thread.sleep(3000);
        return this;
    }

    @Step("When user show data invoice & click button mengerti " +
            "Then user back to menu invoice ")
    public FilterInvoice getSayaMengerti() throws InterruptedException {
        btnSayamengerti.click();
        Thread.sleep(1000);
        return this;
    }

    //=========================Cari ID Purchase Order===========================//

    @Step("")
    public FilterInvoice GetcariIDPO() throws InterruptedException {
        formControlKomodo2.sendKeys("PO/SGRO/2022/09/19/O02");
        Thread.sleep(2000);
        return this;
    }
    @Step("")
    public FilterInvoice iconcariIDPO() throws InterruptedException {
        element2.click();
        Thread.sleep(4000);
        return this;
    }
    @Step("")
    public FilterInvoice getSearchPO() throws InterruptedException {
        searchPO.sendKeys("PO/SGRO/2022/09/19/O02,");
        Thread.sleep(2000);
        return this;
    }
    @Step("")
    public FilterInvoice getSearchPO1() throws InterruptedException {
        searchPO.sendKeys("Polisi baik,");
        Thread.sleep(1000);
        return this;
    }

    @Step("")
    public FilterInvoice getBtnCariIDPO() throws InterruptedException {
        btnCariidPO.click();
        Thread.sleep(3000);
        return this;
    }

    //=========================Cari ID GR===========================//
    @Step("")
    public FilterInvoice getCariIDGR() throws InterruptedException {
        formControlKomodo3.sendKeys("GR/19/09/2022/001");
        Thread.sleep(2000);
        return this;
    }

    @Step("")
    public FilterInvoice geticonGR() throws InterruptedException {
        element3.click();
        Thread.sleep(5000);
        return this;
    }
    @Step("")
    public FilterInvoice getInputGR() throws InterruptedException {
        InputGRPopUp.sendKeys("GR/19/09/2022/001,");
        Thread.sleep(2000);
        return this;
    }
    @Step("")
    public FilterInvoice getInputGR1() throws InterruptedException {
        InputGRPopUp.sendKeys("Yantooo,");
        Thread.sleep(2000);
        return this;
    }
    public FilterInvoice getBtnGR() throws InterruptedException {
        cariGoodsReceived.click();
        Thread.sleep(3000);
        return this;
    }

    //=========================Cari ID GR===========================//
    @Step("")
    public FilterInvoice getFilterSeller1() throws InterruptedException {
        element5.sendKeys("Saka");
        Thread.sleep(2000);
        return this;
    }
    public FilterInvoice getselectseller() throws InterruptedException {
        reactSelectInput.click();
        Thread.sleep(3000);
        return this;
    }
    public FilterInvoice getselectseller1() throws InterruptedException {
        reactSelectInput1.click();
        Thread.sleep(3000);
        return this;
    }
    public FilterInvoice getselectseller2() throws InterruptedException {
        reactSelectInput2.click();
        Thread.sleep(3000);
        return this;
    }

    //=========================Select Status===========================//
    public FilterInvoice getselectstatus() throws InterruptedException {
        getReactSelectStatus.click();
        Thread.sleep(3000);
        return this;
    }

    public FilterInvoice getselectSemuastatus() throws InterruptedException {
        reactSelectSemuaStatus.click();
        Thread.sleep(2000);
        return this;
    }
    public FilterInvoice getselectstatusDibayar() throws InterruptedException {
        reactSelectDibayar.click();
        Thread.sleep(2000);
        return this;
    }

    public FilterInvoice getselectstatusDibuat() throws InterruptedException {
        reactSelectDibuat.click();
        Thread.sleep(2000);
        return this;
    }
    public FilterInvoice getselectstatusDibatalkan() throws InterruptedException {
        reactSelectDibatalkan.click();
        Thread.sleep(2000);
        return this;
    }
    }
