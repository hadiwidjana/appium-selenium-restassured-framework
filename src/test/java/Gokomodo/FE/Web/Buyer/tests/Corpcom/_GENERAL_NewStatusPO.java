package Gokomodo.FE.Web.Buyer.tests.Corpcom;

import Gokomodo.FE.Web.Buyer.PageObjects.Corpcom._GENERAL_NewStatusPOAvailable;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class _GENERAL_NewStatusPO extends _GENERAL_NewStatusPOAvailable {
    @Description("Happy Flow General New Status PO")
    @Test(description = "Happy Flow General New Status PO")
    public void TestBuyerCreateRFQCorpComm()throws Exception {
        Test_GeneralStatusPO().
                InputEmail().
                InputPassword().
                BtnLoginCorp().
                RFQindex().
                searchID().
                lstmn().
                btntc().
                uploadTC().
                sendTC().
                Stts();
    }
    @Description("Happy Flow General New Status PO Later")
    @Test(description = "Happy Flow General New Status PO Later")
    public void NewStatusPOLaterTest()throws Exception {
        NewStatusPOLater().
                InputEmail().
                InputPassword().
                BtnLoginCorp().
                RFQindex().
                searchID().
                lstmn().
                btntc().
                rdiobtnattachment().
                sendTC().
                uploadPO().
                attachmentPO().
                saveattachment().
                refreshthispage().
                SttsPOLater();


    }
}
