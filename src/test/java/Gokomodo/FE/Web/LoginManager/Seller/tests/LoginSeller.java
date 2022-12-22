package Gokomodo.FE.Web.LoginManager.Seller.tests;

import Gokomodo.FE.Web.LoginManager.Seller.pageObjects.initializePageObjects.SellerPageLoginInitializer;
import io.qameta.allure.Description;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginSeller extends SellerPageLoginInitializer {


    @Description("Login Seller")
    @Test(description = "Seller Test Komodo")
    public void TestloginSeller()throws Exception{
        SellerLoginPage().InputEmail().InputPassword().btnLogin();

    }

    @Description("Login Seller")
    @Test(description = "Saka Semua Ada")
    public void TestloginSeller2()throws Exception{
        SellerLoginPage2().InputEmail().InputPassword().btnLogin();

    }

//    @Description("Login Seller Production")
//    @Test(description = "Saka Semua Ada")
//    public void TestloginSeller3()throws Exception{
//        SellerLoginProd().InputEmail().InputPassword().btnLogin();
//
//    }


}
