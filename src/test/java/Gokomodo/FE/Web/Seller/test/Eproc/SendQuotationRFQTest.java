package Gokomodo.FE.Web.Seller.test.Eproc;

import Gokomodo.FE.Web.LoginManager.Seller.pageObjects.initializePageObjects.SellerPageLoginInitializer;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class SendQuotationRFQTest extends SellerPageLoginInitializer {

    @Description("Send RFQ")
    @Test(description = "Send RFQ from Seller")
    public void TestSendRFQEprocFlow()throws Exception{
        SellerSendRFQ().InputEmailSeller().InputPasswordSeller().btnLoginSeller().inquirylistButtonSeller().
                inputInquiryNameSeller().clickTheInquirySeller().clickBtnSendQuoPopupSeller();

    }

    @Description("Send RFQ Production")
    @Test(description = "Send RFQ from Seller")
    public void TestSendRFQEprocFlowProd()throws Exception{
        SellerSendRFQProd().InputEmailSeller().InputPasswordSeller().btnLoginSeller().inquirylistButtonSeller().
                inputInquiryNameSeller().clickTheInquirySeller().clickBtnSendQuoSeller().clickBtnSendQuoPopupSeller();

    }

}
