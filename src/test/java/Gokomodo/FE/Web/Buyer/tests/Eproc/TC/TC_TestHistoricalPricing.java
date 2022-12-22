package Gokomodo.FE.Web.Buyer.tests.Eproc.TC;


import Gokomodo.FE.Web.Buyer.PageObjects.Eproc.TC.TC_HistoricalPricingBulk;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class TC_TestHistoricalPricing extends TC_HistoricalPricingBulk {

    @Description("View Historical Pricing TC Bulk Eproc nauseee1")
    @Test(description = "Historical Pricing TC Bulk")
    public void TestBuyerCreateRFQBulk()throws Exception {
        EprocHistoricalPricingBulkTC().InputEmailEproc().InputPasswordEproc().BtnEprocLoginEproc().
                btnProcrumentListTCBulkEproc().btnClickRFQBulkRFQ().inputEprocTCBulkEproc().clickTheTCListBulkEproc().
                clickDetailTCBulk().dropDownListProdBulk().clickUnitCostBulk().
                clickUnitCostBulk().clickPage2UnitCostBulk().backToFirstUnitCostBulk().
                goToLastUnitCostBulk().clickPageDownUnitCostBulk().ClickPageDown10UnitCostBulk().
                clickPageDownUnitCost2Bulk().ClickPageDown25UnitCostBulk().clickPageDownUnitCost3Bulk().
                ClickPageDown50UnitCostBulk().closeUnitCostBulk();
    }

    @Description("View Historical Pricing TC Franco Eproc nauseee1")
    @Test(description = "Historical Pricing TC Franco")
    public void TestBuyerCreateRFQFranco()throws Exception {
        EprocHistoricalPricingFrancoTC().InputEmailEproc().InputPasswordEproc().BtnEprocLoginEproc().
                btnProcrumentListTCFrancoEproc().btnClickTCFrancoEproc().inputEprocTCFrancoEproc().
                clickTheTCListFrancoEproc();
    }
    @Description("View Historical Pricing per-Product Bulk Eproc nauseee1")
    @Test(description = "Historical Pricing per-Product Bulk")
    public void TestBuyerCreateRFQPerproduct()throws Exception {
        EprocHistoricalPricingPerProductTC().InputEmailEproc().InputPasswordEproc().BtnEprocLoginEproc().
                btnProcrumentListTCPerProductEproc().btnClickTCPerProductEproc().inputEprocTCPerProductEproc().clickTheTCListPerProductEproc();
    }

}
