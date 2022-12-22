package Gokomodo.FE.Web.Seller.test.Corpcom;

import Gokomodo.FE.Web.LoginManager.Seller.pageObjects.initializePageObjects.SellerPageLoginInitializer;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class TestSendQuoCorpComm extends SellerPageLoginInitializer {

    @Description("Send Quotation Corpcomm")
    @Test(description = "Send Quotation Corpcomm")
    public void TestSendRFQCorpcomm()throws Exception {
        SendQuotationCorpcomm().InputEmailSeller().InputPasswordSeller().btnLoginSeller().
                inquirylistButtonCorpcomm().inputlistButtonCorpcomm().clickTheInquiryRFQCorpcomm().
                    clickSendQuotationCorpcomm().clickChoosePICboxCorpcomm().clickPICboxCorpcomm().
                        inputSubjectNameCorpcomm().clickCategoryBoxCorpcomm().clickCategoryCorpcomm().
                            inputStartDateCorpcomm().inputFinishDateCorpcomm().clickMethodPaymentCorpcomm().
                                chooseMeethodPaymentCorpcomm().addAttchbtnCorpcomm().addProdbtnCorpcomm().
                                     clickOfficeCorpcomm().chooseOfficeCorpcomm().clickLocOfficeCorpcomm().
                                        chooseLocOfficeCorpcomm().addProdXlsCorpcomm().btnSaveProdCorpcomm().
                                            inputDatelineCorpcomm().clickTimeCorpComm().chooseTimeCorpcomm().
                                                btnCreateRFQCorpcomm(); //.btnCreateRFQPopUpCorpcomm();

    }

}
