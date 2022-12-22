package Gokomodo.FE.Web.Buyer.tests.Eproc.Quotation;

import Gokomodo.FE.Web.Buyer.PageObjects.Eproc.Quotation.Quo_HistoricalPricingBulk;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class Quo_TestHistoricalPricing extends Quo_HistoricalPricingBulk {

    @Description("View Historical Pricing Quotation Bulk Eproc nauseee1")
    @Test(description = "Historical Pricing Quotation Bulk")
    public void TestBuyerCreateRFQEBulk()throws Exception {
        EprocHistoricalPricingBulk().InputEmailEproc().InputPasswordEproc().BtnEprocLoginEproc().
        btnProcrumentListTCBulk().btnClickTCBulk().inputEprocTCBulk().clickTheTCListBulk().
                clickQuobtnBulk().clickDetailQuoBulk().dropDownListProdBulk().
                clickUnitCostBulk().clickPage2UnitCostBulk().backToFirstUnitCostBulk().
                goToLastUnitCostBulk().clickPageDownUnitCostBulk().ClickPageDown10UnitCostBulk().
                clickPageDownUnitCost2Bulk().ClickPageDown25UnitCostBulk().clickPageDownUnitCost3Bulk().
                ClickPageDown50UnitCostBulk().closeUnitCostBulk().clickQuantityCostBulk().
                clickPageDownQuantityCostBulk().ClickPageDown10QuantityCostBulk().clickPageDownQuantityCost2Bulk().
                ClickPageDown25QuantityCostBulk().clickPageDownQuantityCost3Bulk().ClickPageDown50QuantityCostBulk().
                closeQuantityCostChangesBulk().clickViewDiscountBulk().clickPageDownViewDiscountBulk().
                ClickPageDown10ViewDiscountBulk().clickPageDownViewDiscount2Bulk().ClickPageDown25ViewDiscountBulk().
                clickPageDownViewDiscount3Bulk().ClickPageDown50ViewDiscountBulk().closeViewDiscountChangesBulk().
                clickDeliveryPrizeBulk().clickPageDownDeliveryPrizeBulk().ClickPageDown10DeliveryPrizeBulk().
                clickPageDownDeliveryPrize2Bulk().ClickPageDown25DeliveryPrizeBulk().clickPageDownDeliveryPrize3Bulk().
                ClickPageDown50DeliveryPrizeBulk().closeDeliveryPrizeBulk().clickDiscountTotalBulk().
                clickPageDownDiscountTotalBulk().ClickPageDown10DiscountTotalBulk().clickPageDownDiscountTotal2Bulk().
                ClickPageDown25DiscountTotalBulk().clickPageDownDiscountTotal3Bulk().ClickPageDown50DiscountTotalBulk().
                closeDiscountTotalBulk();
    }

    @Description("View Historical Pricing Quotation Franco Eproc nauseee1")
    @Test(description = "Historical Pricing Quotation Franco")
    public void TestBuyerCreateRFQFranco()throws Exception {
        EprocHistoricalPricingFranco().InputEmailEproc().InputPasswordEproc().BtnEprocLoginEproc().
        btnProcrumentListTCFranco().btnClickTCFranco().inputEprocTCFranco().clickTheTCListFranco().
                clickQuobtnFranco().clickDetailQuoFranco().dropDownListProdFranco().
                clickUnitCostFranco().clickPage2UnitCostFranco().backToFirstUnitCostFranco().
                clickPage2UnitCostFranco().backToFirstUnitCostFranco().goToLastUnitCostFranco().
                clickPageDownUnitCostFranco().ClickPageDown10UnitCostFranco().clickPageDown2UnitCostFranco().
                ClickPageDown25UnitCostFranco().clickPageDown3UnitCostFranco().ClickPageDown50UnitCostFranco().
                closeUnitCostChangesFranco().clickQuantityCostFranco().clickPageDownQuantityCost().
                ClickPageDown10QuantityCost().clickPageDown2QuantityCostFranco().ClickPageDown25QuantityCostFranco().
                clickPageDown3QuantityCostFranco().ClickPageDown50QuantityCostFranco().closeUnitCostChangesQuantityCostFranco().
                clickViewDiscountFranco().clickPageDown2ViewDiscountFranco().ClickPageDown10ViewDiscountFranco().
                clickPageDown3ViewDiscountFranco().ClickPageDown25ViewDiscountFranco().clickPageDown4ViewDiscountFranco().
                ClickPageDown50ViewDiscountFranco().closeViewDiscountFranco().clickDiscountTotalFranco().
                clickPage2DiscountTotalFranco().backToFirstDiscountTotalFranco().goToLastDiscountTotalFranco().
                clickPageDownDiscountTotalFranco().ClickPageDown10DiscountTotalFranco().clickPageDown2DiscountTotalFranco().
                ClickPageDown25DiscountTotalFranco().clickPageDown3DiscountTotalFranco().ClickPageDown50DiscountTotalFranco().
                closeViewDiscountTotalFranco();
    }

    @Description("View Historical Pricing Quotation PerProduct Eproc nauseee1")
    @Test(description = "Historical Pricing Quotation PerProduct")
    public void TestBuyerCreateRFQPerproduct()throws Exception {
        EprocHistoricalPricingPerProduct().InputEmailEproc().InputPasswordEproc().BtnEprocLoginEproc().
        btnProcrumentListTCPerProduct().btnClickTCPerProduct().inputEprocTCPerProduct().clickTheTCListPerProduct().
                clickQuobtnPerProduct().viewQuotationPerProduct().clickProdIconPerProduct().
                viewUnitCostChangesPerProduct().clickUnitCostPerProduct().clickPage2PerProduct().
                backToFirstPerProduct().goToLastPerProduct().clickPageDownPerProduct().
                ClickPageDown10PerProduct().clickPageDownPerProduct2().ClickPageDown25PerProduct().
                clickPageDown3PerProduct().ClickPageDown50PerProduct().closeUnitCostChangesPerProduct().
                clickQuantityCostPerProduct().clickPageDownQuantityCostPerProduct().ClickPageDown10QuantityCostPerProduct().
                clickPageDown2QuantityCostPerProduct().ClickPageDown25QuantityCostPerProduct().clickPageDown3QuantityCostPerProduct().
                ClickPageDown50QuantityCostPerProduct().closeQuantityCostPerProduct().clickViewDiscountPerProduct().
                clickPageDown2ViewDiscountPerProduct().ClickPageDown10ViewDiscountPerProduct().ClickPageDown25ViewDiscountPerProduct().
                clickPageDown4ViewDiscountPerProduct().ClickPageDown50ViewDiscountPerProduct().closeViewDiscountPerProduct().
                clickDiscountTotalPerProduct().clickPage2DiscountTotalPerProduct().backToFirstDiscountTotalPerProduct().
                goToLastDiscountTotalPerProduct().clickPageDownDiscountTotalPerProduct().ClickPageDown10DiscountTotalPerProduct().
                clickPageDown2DiscountTotalPerProduct().ClickPageDown25DiscountTotalPerProduct().clickPageDown3DiscountTotalPerProduct().
                ClickPageDown50DiscountTotalPerProduct().closeViewDiscountTotalPerProduct();
    }

}
