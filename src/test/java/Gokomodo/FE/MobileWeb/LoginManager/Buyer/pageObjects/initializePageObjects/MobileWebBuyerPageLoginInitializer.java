package Gokomodo.FE.MobileWeb.LoginManager.Buyer.pageObjects.initializePageObjects;

import Gokomodo.FE.MobileWeb.LoginManager.Buyer.pageObjects.pages.MobileWebBuyerLoginPage;
import Gokomodo.FE.Mobile.MobileDriverFactory;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

public class MobileWebBuyerPageLoginInitializer extends MobileDriverFactory {
    @BeforeClass
    public void beforeClass() {
        //Set website URL
        getURL = WebsiteURLBuyer;
    }

    public MobileWebBuyerLoginPage LoginPageTest(){

        return PageFactory.initElements(getDriver(), MobileWebBuyerLoginPage.class);
    }

}
