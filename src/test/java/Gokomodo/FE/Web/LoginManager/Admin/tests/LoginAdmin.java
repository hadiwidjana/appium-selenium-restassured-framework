package Gokomodo.FE.Web.LoginManager.Admin.tests;

import Gokomodo.FE.Web.LoginManager.Admin.pageObjects.initializePageObjects.AdminPageLoginInitializerBuyer;
import io.qameta.allure.Description;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginAdmin extends AdminPageLoginInitializerBuyer {


    @BeforeClass
    public void beforeClass() {
        //Set website URL
        getURL = WebsiteURLAdmin;
    }

    @Description("Login Admin")
    @Test(description = "Login Arum")
    public void TestloginAdmin()throws Exception {
        LoginAdminPage().InputEmail().InputPassword().btnLogin();
    }

    @Description("Login Admin")
    @Test(description = "Login Denny1")
    public void TestloginAdmin2()throws Exception {
        LoginAdminDeny().InputEmail().InputPassword().btnLogin();
    }


}
