package Gokomodo.FE.Web.Buyer.tests.Corpcom.BrandTreatment;

import Gokomodo.FE.Web.Buyer.PageObjects.Corpcom.R6.T33158;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class BrandTreatment extends T33158 {

    //============== Buyer ==================//

    @Description("Already on homepage corporate commerce")
    @Test(description = "it should show brand detail and there should be shown: title of brand, brand description, attachment and user able to filter product based on the brand")
    public void Tc_T33158() throws Exception {
        Test_T33158().
                InputEmail().
                InputPassword().
                BtnLoginCorp().
                searchPrd().
                ChsPrd().
                evidanceT33158();
    }

    @Description("Already on homepage corporate commerce")
    @Test(description = "the Buyer should be able to filter products based on the brand")
    public void Tc_T33159()throws Exception{
        Test_T33159().
                InputEmail().
                InputPassword().
                BtnLoginCorp().
                searchPrd().
                ChsPrd().
                clickprd().
                evidenceT33159();

    }
    @Description("Already on homepage corporate commerce")
    @Test(description = "the Buyer should be able to see the detail of brand popup")
    public void Tc_T33160()throws Exception{
        Test_T33160().
                InputEmail().
                InputPassword().
                BtnLoginCorp().
                searchPrd().
                ChsPrd().
                evidenceT33160();


    }
    @Description("Already on homepage corporate commerce")
    @Test(description = "the Buyer should be able to see the detail of brand popup")
    public void Tc_T33161()throws Exception{
        Test_T33161().
                InputEmail().
                InputPassword().
                BtnLoginCorp().
                searchPrd().
                ChsPrd().
                clickprd().
                evidenceT33161();
    }
    @Description("Already on homepage corporate commerce")
    @Test(description = "the Buyer should be able to see preview attachment on brand detail")
     public void Tc_T33162()throws Exception{
        Test_T33162().
                InputEmail().
                InputPassword().
                BtnLoginCorp().
                searchPrd().
                ChsPrd().
                clickprd().
                evidenceT33162();
    }
    @Description("Already on homepage corporate commerce")
    @Test(description = "the Buyer should be able to close the brand detail popup")
    public void Tc_T33163()throws Exception{
        Test_T33163().
                InputEmail().
                InputPassword().
                BtnLoginCorp().
                searchPrd().
                ChsPrd().
                clickprd().
                evidenceT33163();

    }
    @Description("Already on homepage corporate commerce")
    @Test(description = "the Buyer should be able to close the brand detail popup")
    public void Tc_T33164()throws Exception{
        Test_T33164().
                InputEmail().
                InputPassword().
                BtnLoginCorp().
                searchPrd().
                ChsPrd().
                clickprd().
                evidenceT33164();
    }
    @Description("Already on homepage corporate commerce")
    @Test(description = "the Buyer should be able to close the brand detail popup")
    public void Tc_T33167()throws Exception{
        Test_T33167().
                InputEmail().
                InputPassword().
                BtnLoginCorp().
                searchPrd().
                evidenceT33167();
    }
    //============== Admin ==================//
}
