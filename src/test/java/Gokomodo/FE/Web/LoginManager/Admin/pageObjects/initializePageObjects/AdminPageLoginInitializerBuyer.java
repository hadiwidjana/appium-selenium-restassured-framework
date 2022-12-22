package Gokomodo.FE.Web.LoginManager.Admin.pageObjects.initializePageObjects;

import Gokomodo.FE.Web.Admin.pageObjects.HistoricalCatalogue;
import Gokomodo.FE.Web.Admin.pageObjects.R6.*;
import Gokomodo.FE.Web.BaseMethod;
import Gokomodo.FE.Web.LoginManager.Admin.pageObjects.pages.AdminLoginCommerce1PageObject;
import org.openqa.selenium.support.PageFactory;
import Gokomodo.FE.Web.LoginManager.Admin.pageObjects.pages.AdminLoginDenny;
import org.testng.annotations.BeforeClass;

public class AdminPageLoginInitializerBuyer extends BaseMethod {
    @BeforeClass
    public void beforeClass() {
        //Set website URL
        getURL = WebsiteURLAdmin;
    }
    public AdminLoginCommerce1PageObject LoginAdminPage(){
        return PageFactory.initElements(getWebDriver(), AdminLoginCommerce1PageObject.class);
    }

    public AdminLoginDenny LoginAdminDeny(){
        return PageFactory.initElements(getWebDriver(),AdminLoginDenny.class);
    }

    public HistoricalCatalogue AdminCatalogueHistory(){
        return PageFactory.initElements(getWebDriver(), HistoricalCatalogue.class);
    }
    public T33168 Test_T33168(){
        return PageFactory.initElements(getWebDriver(), T33168.class);
    }
    public T33169 Test_T33169(){
        return PageFactory.initElements(getWebDriver(), T33169.class);
    }
    public T33170 Test_T33170(){
        return PageFactory.initElements(getWebDriver(),T33170.class);
    }
    public T33171 Test_T33171(){
        return PageFactory.initElements(getWebDriver(),T33171.class);
    }
    public T33172 Test_T33172(){
        return PageFactory.initElements(getWebDriver(), T33172.class);
    }
    public T33173 Test_T33173(){
        return PageFactory.initElements(getWebDriver(), T33173.class);
    }
    public T33174 Test_T33174(){
        return PageFactory.initElements(getWebDriver(), T33174.class);
    }
    public T33175 Test_T33175(){
        return PageFactory.initElements(getWebDriver(), T33175.class);
    }
    public T33176 Test_T33176(){
        return PageFactory.initElements(getWebDriver(), T33176.class);
    }
    public T33177 Test_T33177(){
        return PageFactory.initElements(getWebDriver(), T33177.class);
    }
    public T33178 Test_T33178(){
        return PageFactory.initElements(getWebDriver(), T33178.class);
    }
    public T33179 Test_T33179(){
        return PageFactory.initElements(getWebDriver(), T33179.class);
    }
    public T33180 Test_T33180(){
        return PageFactory.initElements(getWebDriver(), T33180.class);
    }
    public T33181 Test_T33181(){
        return PageFactory.initElements(getWebDriver(), T33181.class);
    }
}
