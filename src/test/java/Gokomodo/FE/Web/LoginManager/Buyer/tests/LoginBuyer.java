package Gokomodo.FE.Web.LoginManager.Buyer.tests;

import Gokomodo.FE.Web.LoginManager.Buyer.pageObjects.initializePageObjects.BuyerPageLoginInitializerBuyer;
import io.qameta.allure.Description;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginBuyer extends BuyerPageLoginInitializerBuyer {

    @BeforeClass
    public void beforeClass() {
        //Set website URL
        getURL = WebsiteURLBuyer;
    }

    @Description("Login Nausee1")
    @Test(description = "Login Nausee1")
    public void Testloginbuyer()throws Exception{
        LoginNausee1Page().InputEmail().InputPassword().btnLogin();
    }
    @Description("Login Nausee5")
    @Test(description = "Login Nausee5")
    public void Testloginbuyer1()throws Exception{
        LoginNausee5Page().InputEmail().InputPassword().btnLogin();

    }
    @Description("Login Commerce1")
    @Test(description = "Login Commerce1")
    public void Testloginbuyer2()throws Exception{
        LoginCommerce1Page().InputEmail().InputPassword().btnLogin();
    }







//    @Description("Login Production")
//    @Test(description = "Login Production")
//    public void TestloginbuyerProd()throws Exception{
//        LoginProduction().InputEmail().InputPassword().btnLogin();
//
//    }


}
