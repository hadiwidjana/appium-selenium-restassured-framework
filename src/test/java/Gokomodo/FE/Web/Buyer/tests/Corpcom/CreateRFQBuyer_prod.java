package Gokomodo.FE.Web.Buyer.tests.Corpcom;

import Gokomodo.FE.Web.Buyer.PageObjects.Corpcom.CorpcomCreateRFQ;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class CreateRFQBuyer_prod extends CorpcomCreateRFQ {

    @Description("Create RFQ Corpcomm Production")
    @Test(description = "Create RFQ Buyer Corpcom") //invocationCount = 15)
    public void TestBuyerCreateRFQCorpComm()throws Exception {
        CorpcomRFQProd().InputEmail().InputPassword().BtnLoginCorp().
                btnCreateRFQCorpComm().btnClickCategory().
                    txtChangeCategory().btnUploadFile().btnSendRFQCorpcom().
                        btnSendRFQPopUp().btnBacktoBeranda();
        //btnClosePenawaran().

    }


}
