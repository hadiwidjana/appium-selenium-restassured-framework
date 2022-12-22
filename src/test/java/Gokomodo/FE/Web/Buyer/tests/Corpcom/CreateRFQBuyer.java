package Gokomodo.FE.Web.Buyer.tests.Corpcom;

import Gokomodo.FE.Web.Buyer.PageObjects.Corpcom.CorpcomCreateRFQ;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class CreateRFQBuyer extends CorpcomCreateRFQ {

    @Description("Create RFQ Corpcomm Commerce+1")
    @Test(description = "Create RFQ Buyer Corpcom") //invocationCount = 15)
    public void TestBuyerCreateRFQCorpComm()throws Exception {
        CorpcomCreateRFQBuyer().InputEmail().InputPassword().BtnLoginCorp().
                btnCreateRFQCorpComm().btnClickCategory().
                    txtChangeCategory().btnUploadFile().btnSendRFQCorpcom().
                        btnSendRFQPopUp().btnBacktoBeranda();
        //btnClosePenawaran().

    }


}
