package Gokomodo.FE.MobileWeb.LoginManager.Admin.pageObjects.initializePageObjects;

import Gokomodo.FE.MobileWeb.LoginManager.Admin.pageObjects.pages.MobileWebAdminLoginPage;
import Gokomodo.FE.Mobile.MobileDriverFactory;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

public class MobileWebAdminPageLoginInitializer extends MobileDriverFactory {

    @BeforeClass
    public void beforeClass() {
        //Set website URL
        getURL = WebsiteURLAdmin;
    }

    public MobileWebAdminLoginPage LoginPageTest(){

        return PageFactory.initElements(getDriver(), MobileWebAdminLoginPage.class);
    }

}
