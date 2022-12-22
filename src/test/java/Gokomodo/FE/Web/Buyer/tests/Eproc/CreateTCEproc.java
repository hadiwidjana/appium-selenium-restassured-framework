package Gokomodo.FE.Web.Buyer.tests.Eproc;

import Gokomodo.FE.Web.Buyer.PageObjects.Eproc.CreateTC;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class CreateTCEproc extends CreateTC {
    @Description("Create TC buyer Eproc nauseee1")
    @Test(description = "Create TC Buyer Eproc")
    public void TestCreateTC()throws Exception {
        BuyerCreateTCEproc().InputEmail().InputPassword().btnLogin().createNewTcBuyer().
                createNewTcChooseBuyer().rdBtnGkVendorBuyer().clickVendorBuyer().chooseVendorBuyer().SubjectTCBuyer().
                    clickCategoryBuyer().chooseCategoryBuyer().clickDepartmentBuyerTC().chooseDepartmentBuyerTC().
                        inputStartDateTCBuyer().inputFinishDateTCBuyer().clickTermsPaymentTCBuyer().chooseTermsPaymentTCBuyer().
                            inputNotestcBuyerTC().AddAttachtcBuyerTC().rdBtnDeliveredBuyerTC().btnAddProductBuyerTC().clickCompanyboxBuyerTC().
                                chooseCompanyBuyerTC().clickCompLocBuyerTC().chooseCompLocBuyerTC().addNewProdManualbtnBuyerTC().
                                    inputProductName1BuyerTC().inputProductName2BuyerTC().inputProductBrandBuyerTC().inputProductQuantityBuyerTC().
                                        inputUnitCostBuyerTC().clickDiscountBuyerTC().chooseDiscountBuyerTC().inputDiscountBuyerTC().inputPRIDBuyerTC().
                                            inputPRItemIDBuyerTC().clickSubsidiaryBuyerTC().chooseSubsidiaryBuyerTC().clickLocSubsidiaryBuyerTC().chooseLocSubsidiaryBuyerTC().
                                                inputInitialUnitCostBuyerTC().inputDelivCOstBuyerTC().btnSaveProductsBuyerTC().rdBtnWithoutApprovalBuyerTC().createTCbtnBuyerTC().
                                                    createTCPopUpBtnBuyerTC().backHomebtnBuyerTC().lblSuccessCreateTC();
    }
}
