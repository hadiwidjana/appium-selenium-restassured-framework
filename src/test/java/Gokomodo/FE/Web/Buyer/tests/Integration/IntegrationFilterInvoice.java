package Gokomodo.FE.Web.Buyer.tests.Integration;
import Gokomodo.FE.Web.LoginManager.Buyer.pageObjects.initializePageObjects.BuyerPageLoginInitializerBuyer;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class IntegrationFilterInvoice extends BuyerPageLoginInitializerBuyer{
    @Description("Filter Invoice all button")
    @Test (description = "List Filter Invoice")
    public void FilterInvoiceAll () throws Exception{
       filterInvoice().getEmailLoginBuyerbifrost().getPasswordLoginBuyer().getButtonLoginBuyer().getprocurementlist().getbtninvoicelist()
                //==========Cari ID Invoice===========//
              .getformcontrolkomodo().getresetfilter().getelementclickicon()
               .getelementinputinvoice().getelementinpuinvalidtinvoice().getelembuttoninvoice().getlihatdetail()
               .getSayaMengerti().getresetfilter()

                //==========Cari ID Purchase Order===========//
               .GetcariIDPO().getresetfilter().iconcariIDPO().getSearchPO().getSearchPO1().getBtnCariIDPO()
               .getlihatdetail().getSayaMengerti().getresetfilter()

                //==========Cari ID Good Receive===========//
               .getCariIDGR().getresetfilter().geticonGR().getInputGR().getInputGR1().getBtnGR()
               .getlihatdetail().getSayaMengerti().getresetfilter()

                //==========Filter Seller===========//
               .getFilterSeller1().getselectseller().getselectseller1().getselectseller2().getresetfilter()

                //==========Select Status==========//
               .getselectstatus().getselectstatusDibuat().getresetfilter()
               .getselectstatus().getselectstatusDibayar().getresetfilter()
               .getselectstatus().getselectstatusDibatalkan().getresetfilter()
               .getselectstatus().getselectSemuastatus()
       ;

    }
}
