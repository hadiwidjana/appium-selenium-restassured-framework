package Gokomodo.FE.Web.Buyer.tests;


import Gokomodo.FE.Web.Buyer.PageObjects.ForgotPassEproc;
import io.qameta.allure.Description;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ForgotPassword extends ForgotPassEproc {

    @BeforeClass
    public void beforeClass() {
        //Set website URL
        getURL = WebsiteURLBuyer;
    }

    @Description("Forget Password Nausee1")
    @Test(description = "Forget Password Nausee1")
    public void TestForgetPassbuyer()throws Exception{
        ForgetPassBuyerNause1().BtnForgetPass().InputEmailForget().BtnAturUlangPass().BtnCekEmail();

    }
}
