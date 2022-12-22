package Gokomodo.FE.Web.Buyer.tests.Eproc.Tender;

import Gokomodo.FE.Web.Buyer.PageObjects.Eproc.Tender.CreateRFQ_For_Tender;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class TestForTender extends CreateRFQ_For_Tender {

    @Description("Create RFQ buyer for tender Eproc nauseee1")
    @Test(description = "Create RFQ for tender")
    public void TestCreateTender() throws Exception {
        CreateRFQForTender().InputEmailEproc().InputPasswordEproc().BtnEprocLoginEproc().BtnEprocCreateNew().
                BtnEprocCreateNewRFQ().TboxSubjectRFQ().TboxofCategory().TboxofDropdownListCategory().TboxofSubCategory().
                TboxofDropdownListSubCategory().ChecklistbuttonAllitemChoose().TboxChooseDepartment().TboxChooseDropdownListDepartment().
                RdbuttonPriorityUrgent().BtnNextPagetoPage2().DeliveryMethodChooseFranco().ButtonAddProductforRFQ().TBoxInputCompanyNameforProduct().
                TboxDropdownChooseCompanyDelivery().CompanyLocationforProductRFQ().DropdownListCompanyLocationforProductforRFQ().BtnAddProductUploadFileforRFQ().
                BtnSaveAddProductforRFQ().DateChooseBoxCLick().TimeChooseBoxClick1().TimeChooseBoxClick2().StartdeliveryStartDateClick().StartdeliveryFinishDateClick().
                TermsOfPaymentsChooseClick().ListTermsOfPaymentsTboxChoose().AdditionalNoteBoxFilled().ButtonNextToPage3Click().ChooseVendorGokomodoRdButton().
                RdbuttonChooseAreaChecklistbutton().ChooseAllVendorSellerRdbutton().inputVendorTboxEproc().clickSakaVendorEproc().
                inputVendor2TboxEproc().clickSellerKomodoVendorEproc().ButtonSummarytoPage4Eproc().ButtonSubmitRFQBuyerEprocClick().
                ButtonPopUpSubmitRFQBuyerEprocClick().buttonBackToMenuBuyer();
    }

    @Description("Creat tender Eproc nauseee1")
    @Test(description = "Create tender from buyer")
    public void TestCreateTenderRound1() throws Exception {
        CreateTenderR1().InputEmailEproc().InputPasswordEproc().BtnEprocLoginEproc().
                clickProcrumentListTender().clickRFQListbuttonTender().
                formControlKomodoTender().elementClickRFQName().
                buttonCreateTender().sakaSemuaAdaIdrInclTender().
                sellerTestKomodoIdrInclTender().modalNextBtnTender().
                dateForTender().dateForTender().clickEndTimetender().
                chooseEndTimeTender().bidOpenFormCheckInputTender();

        //.modal2CreateTender(); btn create Tender

    }
}
