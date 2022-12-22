package Gokomodo.FE.Web.Buyer.tests.Eproc.R7;

import Gokomodo.FE.Web.Buyer.PageObjects.Eproc.CreateRFQ.R7.NewDPH_Format_GKCRP_672;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class Test_DPH_Format_672 extends NewDPH_Format_GKCRP_672 {

    @Description("Create RO buyer Eproc nauseee1")
    @Test(description = "Create RO Buyer Eproc")
    public void DPHNewFormat() throws Exception {
        GKCRP_672().InputEmailEproc().InputPasswordEproc().BtnEprocLoginEproc();

    }
}
