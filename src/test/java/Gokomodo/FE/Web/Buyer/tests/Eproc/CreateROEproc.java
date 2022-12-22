package Gokomodo.FE.Web.Buyer.tests.Eproc;

import Gokomodo.FE.Web.Buyer.PageObjects.Eproc.CreateRO;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class CreateROEproc extends CreateRO {
    @Description("Create RO buyer Eproc nauseee1")
    @Test(description = "Create RO Buyer Eproc")
    public void TestCreateRO()throws Exception {
        BuyerCreateROEproc().InputEmail().InputPassword().btnLogin().createNewROBuyer().createNewRObtnBuyer().
                rdBtnProductNameBuyerRO().inputProdNameTboxBuyerRO().chooseProdNameTboxBuyerRO().btnSearchProdBuyerRO().
                    DeliveryMethodBulkBuyerRO().chooseDeliveryMethoBulkBuyerRO().checklistbtnLemBuyerRO().btnPopUpProdBuyerRO().
                        btnNextProdDelvBuyerRO().checklistVendorNauseeBuyerRO().editBtnProdBuyerRO(). inputPRIDBuyerRO1().inputPRItemIDBuyerRO1().
                           btnSaveProdBuyerRO().btnNextPage3BuyerRO().inputSubjectBuyerRO().clickDepartmentBuyerRO().chooseDepartmentNameBuyerRO().
                                inputDateStartBuyerRO().inputDateFinishBuyerRO().clickTermsOfPaymentBuyerRO().chooseTermsOfPaymentBuyerRO().
                                    inputNotesBuyerRO().withoutApprovalBuyerRO().buttonCreateBuyerRO().buttoncreatePopUpBuyerRO().lblSuccessCreateRO();
                //buttoncreatePopUpBuyerRO();
    }


}
