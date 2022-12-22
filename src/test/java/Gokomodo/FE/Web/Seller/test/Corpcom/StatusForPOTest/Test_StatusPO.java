package Gokomodo.FE.Web.Seller.test.Corpcom.StatusForPOTest;

import Gokomodo.FE.Web.Seller.pageObjects.Corpcom.StatusPODetail;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class Test_StatusPO extends StatusPODetail {

    @Description("Status PO detail Corpcomm")
    @Test(description = "Status PO Corpcomm")
    public void TestStatusPODetail()throws Exception {
        TestPODetail().InputEmailSeller().InputPasswordSeller().btnLoginSeller().
                clickQTNbtnCorpcomm().clickDropdownlistCorpcomm().checkForPOCorpcomm().
                clickQuoLblCorpcomm().clickListofQuoCorpcomm().POSuccessCorpcomm();
    }
}
