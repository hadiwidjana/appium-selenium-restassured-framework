package Gokomodo.FE.Web.Seller.test.Corpcom.StatusForPOTest;

import Gokomodo.FE.Web.Seller.pageObjects.Corpcom.Status_PODetail_inTCindex;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class Test_POtoTC extends Status_PODetail_inTCindex {

    @Description("Happy Flow PO detail list Index Corpcomm")
    @Test(description = "Status PO index Corpcomm")
    public void TestStatusPOinTCindex()throws Exception {
        checkStatusPOtoTC().InputEmailSeller().InputPasswordSeller().btnLoginSeller().clickTCbtnCorpcomm();
    }

    @Description("Happy Flow Status PO detail in TC Corpcomm")
    @Test(description = "Status PO in TC Corpcomm")
    public void TestStatusPOinTCdetail()throws Exception {
        checkStatusPOforTC().InputEmailSeller().InputPasswordSeller().btnLoginSeller().clickTCbtnCorpcomm().
                inputTCNameCorpcomm().clicktheTCListCorpcomm().clickUploadDocbtnCorpcomm().inputAttachmentCorpcomm().
                    saveBtnUploadDocCorpcomm().moveToQuoCorpcomm().SttsPOLater();
    }
}
