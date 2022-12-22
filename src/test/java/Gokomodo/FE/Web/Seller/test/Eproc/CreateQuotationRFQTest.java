package Gokomodo.FE.Web.Seller.test.Eproc;

import Gokomodo.FE.Web.LoginManager.Seller.pageObjects.initializePageObjects.SellerPageLoginInitializer;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class CreateQuotationRFQTest extends SellerPageLoginInitializer {


    @Description("Create RFQ")
    @Test(description = "Create RFQ from Seller")
    public void TestSendRFQEprocFlow()throws Exception{
        SellerCreateRFQ().InputEmailSeller().InputPasswordSeller().btnLoginSeller().QuotationListbtnSeller().
                QuotationInputSeller().clickTheQuotationSeller().radioBtnUsingXlsSeller().btnPopUpSureSeller().
                    uploadXlsSeller().btnOriginShipmentSeller().btnChooseOriginShipmentSeller().btnSaveAddressSeller().
                        inputNotesSeller().btnSaveAddSeller().btnSendQuoSeller().btnSendQuoPopUpSeller();

    }

    @Description("Create RFQ Production")
    @Test(description = "Create RFQ from Seller Prod")
    public void TestSendRFQEprocProd()throws Exception{
        SellerCreateProd().InputEmailSeller().InputPasswordSeller().btnLoginSeller().QuotationListbtnSeller().
                QuotationInputSeller().clickTheQuotationSeller().radioBtnUsingXlsSeller().btnPopUpSureSeller().
                uploadXlsSeller().btnOriginShipmentSeller().btnChooseOriginShipmentSeller().btnSaveAddressSeller().
                inputNotesSeller().btnSaveAddSeller().btnSendQuoSeller().btnSendQuoPopUpSeller();

    }
}
