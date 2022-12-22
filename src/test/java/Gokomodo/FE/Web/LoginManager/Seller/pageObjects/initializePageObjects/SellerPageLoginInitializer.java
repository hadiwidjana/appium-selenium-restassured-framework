package Gokomodo.FE.Web.LoginManager.Seller.pageObjects.initializePageObjects;

import Gokomodo.BE.Integration.Rest.pageObjects.UIAction.SellerAction;
import Gokomodo.FE.Web.LoginManager.Seller.pageObjects.pages.SellerLoginIntegrationBifrostPageObject;
import Gokomodo.FE.Web.LoginManager.Seller.pageObjects.pages.SellerLoginPageObject;
import Gokomodo.FE.Web.LoginManager.Seller.pageObjects.pages.SellerLoginPageObject2;
import Gokomodo.FE.Web.BaseMethod;
import Gokomodo.FE.Web.Seller.pageObjects.Corpcom.SendQuoCorpComm;
import Gokomodo.FE.Web.Seller.pageObjects.Corpcom.Status_PODetail_TCtoPO;
import Gokomodo.FE.Web.Seller.pageObjects.Corpcom.Status_PODetail_inTCindex;
import Gokomodo.FE.Web.Seller.pageObjects.Eproc.CreateQuotationRFQ;
import Gokomodo.FE.Web.Seller.pageObjects.Eproc.CreateQuotationRFQ_Prod;
import Gokomodo.FE.Web.Seller.pageObjects.Eproc.SendQuotationRFQ;
import org.openqa.selenium.support.PageFactory;
import Gokomodo.FE.Web.Seller.pageObjects.Corpcom.StatusPODetail;
import Gokomodo.FE.Web.LoginManager.Seller.pageObjects.pages.SellerLoginProduction1PageObject;
import Gokomodo.FE.Web.Seller.pageObjects.Eproc.SendQuotationRFQ_Prod;
import org.testng.annotations.BeforeClass;

public class SellerPageLoginInitializer extends BaseMethod {

    @BeforeClass
    public void beforeClass() {
        //Set website URL
        getURL = WebsiteURLSeller;
    }
    public SellerLoginPageObject SellerLoginPage(){
        return PageFactory.initElements(getWebDriver(), SellerLoginPageObject.class);
    }

    //Production
    public SellerLoginProduction1PageObject SellerLoginProd(){
        return PageFactory.initElements(getWebDriver(), SellerLoginProduction1PageObject.class);
    }
    //

    public SellerLoginPageObject2 SellerLoginPage2(){
        return PageFactory.initElements(getWebDriver(), SellerLoginPageObject2.class);
    }

    public SendQuotationRFQ SellerSendRFQ(){
        return PageFactory.initElements(getWebDriver(), SendQuotationRFQ.class);
    }

    public CreateQuotationRFQ SellerCreateRFQ(){
        return PageFactory.initElements(getWebDriver(), CreateQuotationRFQ.class);
    }

    //Production
    public CreateQuotationRFQ_Prod SellerCreateProd(){
        return PageFactory.initElements(getWebDriver(), CreateQuotationRFQ_Prod.class);
    }

    public SendQuotationRFQ_Prod SellerSendRFQProd(){
        return PageFactory.initElements(getWebDriver(), SendQuotationRFQ_Prod.class);
    }
    //

    public SendQuoCorpComm SendQuotationCorpcomm(){
        return PageFactory.initElements(getWebDriver(), SendQuoCorpComm.class);
    }

    public StatusPODetail TestPODetail(){
        return PageFactory.initElements(getWebDriver(), StatusPODetail.class);
    }

    public Status_PODetail_inTCindex checkStatusPOtoTC(){
        return PageFactory.initElements(getWebDriver(), Status_PODetail_inTCindex.class);
    }

    public Status_PODetail_TCtoPO checkStatusPOforTC(){
        return PageFactory.initElements(getWebDriver(), Status_PODetail_TCtoPO.class);
    }

    public SellerLoginIntegrationBifrostPageObject loginSellerIntegration(){
        return PageFactory.initElements(getWebDriver(), SellerLoginIntegrationBifrostPageObject.class);
    }

    public SellerAction sellerAction(){
        getURL = WebsiteURLSeller;
        return PageFactory.initElements(getWebDriver(), SellerAction.class);
    }
}
