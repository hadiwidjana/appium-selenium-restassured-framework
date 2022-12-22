package Gokomodo.FE.MobileWeb.LoginManager.Seller.pageObjects.initializePageObjects;

import Gokomodo.FE.MobileWeb.LoginManager.Seller.pageObjects.pages.MobileWebSellerLoginPage;
import Gokomodo.FE.Mobile.MobileDriverFactory;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

public class MobileWebSellerPageLoginInitializer extends MobileDriverFactory {

    @BeforeClass
    public void beforeClass() {
        //Set website URL
        getURL = WebsiteURLSeller;
    }

    public MobileWebSellerLoginPage LoginPageTest(){
        return PageFactory.initElements(getDriver(), MobileWebSellerLoginPage.class);
    }

}
