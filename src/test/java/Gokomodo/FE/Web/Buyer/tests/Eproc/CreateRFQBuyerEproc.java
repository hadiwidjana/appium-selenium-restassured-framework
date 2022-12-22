package Gokomodo.FE.Web.Buyer.tests.Eproc;

import Gokomodo.FE.Web.Buyer.PageObjects.Eproc.CreateRFQ.General.BuyerEprocCreateRFQ;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class CreateRFQBuyerEproc extends BuyerEprocCreateRFQ {

    @Description("Create RFQ buyer Eproc nauseee1")
    @Test(description = "Create RFQ Buyer Eproc")
    public void TestBuyerCreateRFQEproc()throws Exception {
        EprocCreateRFQBuyer().InputEmailEproc().InputPasswordEproc().BtnEprocLoginEproc().BtnEprocCreateNew().
                BtnEprocCreateNewRFQ().TboxSubjectRFQ().TboxofCategory().TboxofDropdownListCategory().TboxofSubCategory().
                TboxofDropdownListSubCategory().ChecklistbuttonAllitemChoose().TboxChooseDepartment().TboxChooseDropdownListDepartment().
                RdbuttonPriorityUrgent().BtnNextPagetoPage2().DeliveryMethodChooseFranco().ButtonAddProductforRFQ().TBoxInputCompanyNameforProduct().
                TboxDropdownChooseCompanyDelivery().CompanyLocationforProductRFQ().DropdownListCompanyLocationforProductforRFQ().BtnAddProductUploadFileforRFQ().
                BtnSaveAddProductforRFQ().DateChooseBoxCLick().TimeChooseBoxClick1().TimeChooseBoxClick2().StartdeliveryStartDateClick().StartdeliveryFinishDateClick().
                TermsOfPaymentsChooseClick().ListTermsOfPaymentsTboxChoose().AdditionalNoteBoxFilled().ButtonNextToPage3Click().ChooseVendorGokomodoRdButton().
                RdbuttonChooseAreaChecklistbutton().ChooseAllVendorSellerRdbutton().ButtonSummarytoPage4Click().ButtonSubmitRFQBuyerEprocClick().
                                            ButtonPopUpSubmitRFQBuyerEprocClick().buttonBackToMenuBuyer().lblSuccessCreateEproc();
    }

    //R7
    @Description("RFQ Flow available seller GKCRP-697")
    @Test(description = "Create RFQ Buyer Eproc")
    public void RFQFlowAvailableSeller()throws Exception {
        GKCRP_697().InputEmailEproc().InputPasswordEproc().BtnEprocLoginEproc().BtnEprocCreateNew().
                BtnEprocCreateNewRFQ().TboxSubjectRFQ().TboxofCategory().TboxofDropdownListCategory().TboxofSubCategory().
                TboxofDropdownListSubCategory().ChecklistbuttonAllitemChoose().btnAvailableSeller().inputVendorSeller().
                btnClearFilter().btnCloseAvailableClose().TboxChooseDepartment().TboxChooseDropdownListDepartment().
                RdbuttonPriorityUrgent().BtnNextPagetoPage2().DeliveryMethodChooseFranco().ButtonAddProductforRFQ().TBoxInputCompanyNameforProduct().
                TboxDropdownChooseCompanyDelivery().CompanyLocationforProductRFQ().DropdownListCompanyLocationforProductforRFQ().BtnAddProductUploadFileforRFQ().
                BtnSaveAddProductforRFQ().DateChooseBoxCLick().TimeChooseBoxClick1().TimeChooseBoxClick2().StartdeliveryStartDateClick().StartdeliveryFinishDateClick().
                TermsOfPaymentsChooseClick().ListTermsOfPaymentsTboxChoose().AdditionalNoteBoxFilled().ButtonNextToPage3Click().ChooseVendorGokomodoRdButton().
                RdbuttonChooseAreaChecklistbutton().ChooseAllVendorSellerRdbutton().ButtonSummarytoPage4Click().ButtonSubmitRFQBuyerEprocClick().
                ButtonPopUpSubmitRFQBuyerEprocClick().buttonBackToMenuBuyer().lblSuccessCreateEproc();
    }
    //

}
