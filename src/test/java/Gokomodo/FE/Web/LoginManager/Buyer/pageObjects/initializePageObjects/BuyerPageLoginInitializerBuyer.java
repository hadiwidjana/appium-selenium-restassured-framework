package Gokomodo.FE.Web.LoginManager.Buyer.pageObjects.initializePageObjects;

import Gokomodo.BE.Integration.Rest.pageObjects.UIAction.BuyerAction;
import Gokomodo.FE.Web.BaseMethod;
import Gokomodo.FE.Web.Buyer.PageObjects.Corpcom.CorpcomCreateRFQ;
import Gokomodo.FE.Web.Buyer.PageObjects.Corpcom.NewStatusPOLater;
import Gokomodo.FE.Web.Buyer.PageObjects.Corpcom.R6.*;
import Gokomodo.FE.Web.Buyer.PageObjects.Corpcom._GENERAL_NewStatusPOAvailable;
import Gokomodo.FE.Web.Buyer.PageObjects.Eproc.CreateRFQ.General.BuyerEprocCreateRFQ;
import Gokomodo.FE.Web.Buyer.PageObjects.Eproc.CreateRFQ.R7.RFQCreationVendor_GKCRP_697;
import Gokomodo.FE.Web.Buyer.PageObjects.Eproc.CreateRO;
import Gokomodo.FE.Web.Buyer.PageObjects.Eproc.CreateTC;
import Gokomodo.FE.Web.Buyer.PageObjects.Eproc.Quotation.Quo_HistoricalPricingBulk;
import Gokomodo.FE.Web.Buyer.PageObjects.Eproc.Quotation.Quo_HistoricalPricingFranco;
import Gokomodo.FE.Web.Buyer.PageObjects.Eproc.Quotation.Quo_HistoricalPricingPerProduct;
import Gokomodo.FE.Web.Buyer.PageObjects.Eproc.TC.TC_HistoricalPricingBulk;
import Gokomodo.FE.Web.Buyer.PageObjects.Eproc.TC.TC_HistoricalPricingFranco;
import Gokomodo.FE.Web.Buyer.PageObjects.Eproc.TC.TC_HistoricalPricingPerProduct;
import Gokomodo.FE.Web.Buyer.PageObjects.Eproc.Tender.CreateRFQ_For_Tender;
import Gokomodo.FE.Web.Buyer.PageObjects.Eproc.Tender.CreateTender_Round1;
import Gokomodo.FE.Web.Buyer.PageObjects.ForgotPassEproc;
import Gokomodo.FE.Web.Buyer.tests.Eproc.R7.Test_DPH_Format_672;
import Gokomodo.FE.Web.LoginManager.Buyer.pageObjects.pages.*;
import Gokomodo.FE.Web.Buyer.PageObjects.Corpcom.CorpcomCreateRFQ_Prod;
import Gokomodo.FE.Web.Buyer.PageObjects.IntegrationERP.FilterInvoice;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

public class BuyerPageLoginInitializerBuyer extends BaseMethod {

    @BeforeClass
    public void beforeClass() {
        //Set website URL
        getURL = WebsiteURLBuyer;
    }
    public BuyerLoginNauseee1PageObject LoginNausee1Page() {
        return PageFactory.initElements(getWebDriver(), BuyerLoginNauseee1PageObject.class);
    }

    public BuyerLoginNausee5PageObject LoginNausee5Page() {
        return PageFactory.initElements(getWebDriver(), BuyerLoginNausee5PageObject.class);

    }

    public BuyerLoginCommerce1PageObject LoginCommerce1Page() {
        return PageFactory.initElements(getWebDriver(), BuyerLoginCommerce1PageObject.class);

    }

    //Production
    public BuyerLoginProduction1Object LoginProduction() {
        return PageFactory.initElements(getWebDriver(), BuyerLoginProduction1Object.class);

    }

    public BuyerLoginIntegrationBifrostPageObject loginIntegration() {
        return PageFactory.initElements(getWebDriver(), BuyerLoginIntegrationBifrostPageObject.class);
    }

    //
    //Production Corpcom RFQ
    public CorpcomCreateRFQ_Prod CorpcomRFQProd() {
        return PageFactory.initElements(getWebDriver(), CorpcomCreateRFQ_Prod.class);

    }
    //


    public ForgotPassEproc ForgetPassBuyerNause1() {
        return PageFactory.initElements(getWebDriver(), ForgotPassEproc.class);
    }

    public CorpcomCreateRFQ CorpcomCreateRFQBuyer() {
        return PageFactory.initElements(getWebDriver(), CorpcomCreateRFQ.class);
    }

    public BuyerEprocCreateRFQ EprocCreateRFQBuyer() {
        return PageFactory.initElements(getWebDriver(), BuyerEprocCreateRFQ.class);
    }

    //======================== R7
    // GKCRP-697
    public RFQCreationVendor_GKCRP_697 GKCRP_697() {
        return PageFactory.initElements(getWebDriver(), RFQCreationVendor_GKCRP_697.class);
    }

    //GKCRP-672
    public Test_DPH_Format_672 GKCRP_672() {
        return PageFactory.initElements(getWebDriver(), Test_DPH_Format_672.class);
    }

    //===========================


    public CreateRFQ_For_Tender CreateRFQForTender() {
        return PageFactory.initElements(getWebDriver(), CreateRFQ_For_Tender.class);
    }

    public CreateTender_Round1 CreateTenderR1() {
        return PageFactory.initElements(getWebDriver(), CreateTender_Round1.class);
    }

    public CreateTC BuyerCreateTCEproc() {

        return PageFactory.initElements(getWebDriver(), CreateTC.class);
    }

    public CreateRO BuyerCreateROEproc() {
        return PageFactory.initElements(getWebDriver(), CreateRO.class);
    }

    public Quo_HistoricalPricingFranco EprocHistoricalPricingFranco() {
        return PageFactory.initElements(getWebDriver(), Quo_HistoricalPricingFranco.class);
    }

    public Quo_HistoricalPricingBulk EprocHistoricalPricingBulk() {
        return PageFactory.initElements(getWebDriver(), Quo_HistoricalPricingBulk.class);
    }

    public Quo_HistoricalPricingPerProduct EprocHistoricalPricingPerProduct() {
        return PageFactory.initElements(getWebDriver(), Quo_HistoricalPricingPerProduct.class);
    }

    //=========================================================================================//

    public TC_HistoricalPricingFranco EprocHistoricalPricingFrancoTC() {
        return PageFactory.initElements(getWebDriver(), TC_HistoricalPricingFranco.class);
    }

    public TC_HistoricalPricingBulk EprocHistoricalPricingBulkTC() {
        return PageFactory.initElements(getWebDriver(), TC_HistoricalPricingBulk.class);
    }

    public TC_HistoricalPricingPerProduct EprocHistoricalPricingPerProductTC() {
        return PageFactory.initElements(getWebDriver(), TC_HistoricalPricingPerProduct.class);
    }

    //================================++=============================================//

    public T33051 Test_T33051() {
        return PageFactory.initElements(getWebDriver(), T33051.class);
    }

    public T33052 Test_T33052() {
        return PageFactory.initElements(getWebDriver(), T33052.class);
    }

    public T33053 Test_T33053() {
        return PageFactory.initElements(getWebDriver(), T33053.class);
    }

    public T33054 Test_T33054() {
        return PageFactory.initElements(getWebDriver(), T33054.class);
    }

    public T33055 Test_T33055() {
        return PageFactory.initElements(getWebDriver(), T33055.class);
    }

    public T33056 Test_T33056() {
        return PageFactory.initElements(getWebDriver(), T33056.class);
    }

    public T33057 Test_T33057() {
        return PageFactory.initElements(getWebDriver(), T33057.class);
    }

    public T33058 Test_T33058() {
        return PageFactory.initElements(getWebDriver(), T33058.class);
    }

    public T33059 Test_T33059() {
        return PageFactory.initElements(getWebDriver(), T33059.class);
    }

    public T33060 Test_T33060() {
        return PageFactory.initElements(getWebDriver(), T33060.class);
    }

    public T33061 Test_T33061() {
        return PageFactory.initElements(getWebDriver(), T33061.class);
    }

    public T33062 Test_T33062() {
        return PageFactory.initElements(getWebDriver(), T33062.class);
    }

    public T33044 Test_T33044() {
        return PageFactory.initElements(getWebDriver(), T33044.class);
    }

    public T33045 Test_T33045() {
        return PageFactory.initElements(getWebDriver(), T33045.class);
    }

    public T33046 Test_T33046() {
        return PageFactory.initElements(getWebDriver(), T33046.class);
    }

    public T33047 Test_T33047() {
        return PageFactory.initElements(getWebDriver(), T33047.class);
    }

    public T33048 Test_T33048() {
        return PageFactory.initElements(getWebDriver(), T33048.class);
    }

    public T33049 Test_T33049() {
        return PageFactory.initElements(getWebDriver(), T33049.class);
    }

    public T33063 Test_T33063() {
        return PageFactory.initElements(getWebDriver(), T33063.class);
    }

    public T33064 Test_T33064() {
        return PageFactory.initElements(getWebDriver(), T33064.class);
    }

    public T33065 Test_T33065() {
        return PageFactory.initElements(getWebDriver(), T33065.class);
    }

    public T33066 Test_T33066() {
        return PageFactory.initElements(getWebDriver(), T33066.class);
    }

    public T33067 Test_T33067() {
        return PageFactory.initElements(getWebDriver(), T33067.class);
    }

    public T33068 Test_T33068() {
        return PageFactory.initElements(getWebDriver(), T33068.class);
    }


    //=============================================================================================//
    public T33158 Test_T33158() {
        return PageFactory.initElements(getWebDriver(), T33158.class);
    }

    public T33159 Test_T33159() {
        return PageFactory.initElements(getWebDriver(), T33159.class);
    }

    public T33160 Test_T33160() {
        return PageFactory.initElements(getWebDriver(), T33160.class);
    }

    public T33161 Test_T33161() {
        return PageFactory.initElements(getWebDriver(), T33161.class);
    }

    public T33162 Test_T33162() {
        return PageFactory.initElements(getWebDriver(), T33162.class);
    }

    public T33163 Test_T33163() {
        return PageFactory.initElements(getWebDriver(), T33163.class);
    }

    public T33164 Test_T33164() {
        return PageFactory.initElements(getWebDriver(), T33164.class);
    }

    public T33167 Test_T33167() {
        return PageFactory.initElements(getWebDriver(), T33167.class);
    }

    public _GENERAL_NewStatusPOAvailable Test_GeneralStatusPO() {
        return PageFactory.initElements(getWebDriver(), _GENERAL_NewStatusPOAvailable.class);
    }

    public NewStatusPOLater NewStatusPOLater() {
        return PageFactory.initElements(getWebDriver(), NewStatusPOLater.class);
    }


    public FilterInvoice filterInvoice() {
        return PageFactory.initElements(getWebDriver(), FilterInvoice.class);
    }


    public static BuyerAction buyerAction(){
        return PageFactory.initElements(getWebDriver(), BuyerAction.class);
    }
    //================END===============//
}

