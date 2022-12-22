package Gokomodo.FE.Web.Buyer.tests.Corpcom.CancelRFQ;

import Gokomodo.FE.Web.Buyer.PageObjects.Corpcom.R6.T33051;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class Test_CancelRFQ extends T33051 {

    @Description("The Buyer already opened an RFQ")
    @Test(description = "The Buyer should be able to see the Action button")
    public void TC_T33051()throws Exception {
        Test_T33051().
                InputEmail().
                InputPassword().
                BtnLoginCorp().
                clickLogoRFQBtnCorpcomm().
                inputRFQNameCorpcomm().
                clickTheRFQNameCorpcomm();
    }

    @Description("The Buyer already opened an RFQ")
    @Test(description = "The Buyer should be able to click the Action button")
    public void TC_T33052()throws Exception {
        Test_T33052().
                InputEmail().
                InputPassword().
                BtnLoginCorp().
                clickLogoRFQBtnCorpcomm().
                inputRFQNameCorpcomm().
                clickTheRFQNameCorpcomm().
                clickActionbtnCorpcomm();
    }

    @Description("The Buyer already opened an RFQ")
    @Test(description = "The Buyer should be able to click the Cancel button")
    public void TC_T33053()throws Exception {
        Test_T33053().
                InputEmail().
                InputPassword().
                BtnLoginCorp().
                clickLogoRFQBtnCorpcomm().
                inputRFQNameCorpcomm().
                clickTheRFQNameCorpcomm().
                clickActionbtnCorpcomm().
                clickCancelbtnCorpcomm();
    }

    @Description("The Buyer already opened an RFQ")
    @Test(description = "The Buyer should be able to fill in the Reason of Cancelling text box")
    public void TC_T33054()throws Exception {
        Test_T33054().
                InputEmail().
                InputPassword().
                BtnLoginCorp().
                clickLogoRFQBtnCorpcomm().
                inputRFQNameCorpcomm().
                clickTheRFQNameCorpcomm().
                clickActionbtnCorpcomm().
                clickCancelbtnCorpcomm().
                inputTextReasonCorpcomm();
    }

    @Description("The Buyer already opened an RFQ")
    @Test(description = "The Buyer should be able to fill in the Reason with under 150 character")
    public void TC_T33055()throws Exception {
        Test_T33055().
                InputEmail().
                InputPassword().
                BtnLoginCorp().
                clickLogoRFQBtnCorpcomm().
                inputRFQNameCorpcomm().
                clickTheRFQNameCorpcomm().
                clickActionbtnCorpcomm().
                clickCancelbtnCorpcomm().
                inputTextReasonCorpcomm().
                inputTextReasonCorpcomm2();
    }

    @Description("The Buyer already opened an RFQ")
    @Test(description = "The Buyer should be able to fill in the Reason with equal to 150 character")
    public void TC_T33056()throws Exception {
        Test_T33056().
                InputEmail().
                InputPassword().
                BtnLoginCorp().
                clickLogoRFQBtnCorpcomm().
                inputRFQNameCorpcomm().
                clickTheRFQNameCorpcomm().
                clickActionbtnCorpcomm().
                clickCancelbtnCorpcomm().
                inputTextReasonCorpcomm();
    }

    @Description("The Buyer already opened an RFQ")
    @Test(description = "The Buyer should be able to fill in the Reason with above 150 character")
    public void TC_T33057()throws Exception {
        Test_T33057().
                InputEmail().
                InputPassword().
                BtnLoginCorp().
                clickLogoRFQBtnCorpcomm().
                inputRFQNameCorpcomm().
                clickTheRFQNameCorpcomm().
                clickActionbtnCorpcomm().
                clickCancelbtnCorpcomm().
                inputTextReasonCorpcomm();
    }

    @Description("The Buyer already opened an RFQ")
    @Test(description = "The Buyer should be able to to submit the Reason after fill in the text box")
    public void TC_T33058()throws Exception {
        Test_T33058().
                InputEmail().
                InputPassword().
                BtnLoginCorp().
                clickLogoRFQBtnCorpcomm().
                inputRFQNameCorpcomm().
                clickTheRFQNameCorpcomm().
                clickActionbtnCorpcomm().
                clickCancelbtnCorpcomm().
                inputTextReasonCorpcomm().
                clickCancelRFQbtnCorpcomm();
    }

    @Description("The Buyer already opened a Cancelled RFQ")
    @Test(description = "The Buyer should be able to see the Reason of Cancelled RFQ")
    public void TC_T33059()throws Exception {
        Test_T33059().
                InputEmail().
                InputPassword().
                BtnLoginCorp().
                clickLogoRFQBtnCorpcomm().
                inputRFQNameCorpcomm().
                clickTheRFQNameCorpcomm().
                clickViewCancelledCorpcomm();
    }

    @Description("The Buyer already opened a Cancelled RFQ")
    @Test(description = "The Buyer should be able to see the Reason of Cancelled RFQ")
    public void TC_T33060()throws Exception {
        Test_T33060().
                InputEmail().
                InputPassword().
                BtnLoginCorp().
                clickLogoRFQBtnCorpcomm().
                inputRFQNameCorpcomm().
                clickTheRFQNameCorpcomm().
                clickViewCancelledCorpcomm().
                clickCloseViewCancelCorpcomm();
    }

    @Description("The Buyer already opened a Cancelled RFQ")
    @Test(description = "The Buyer should be able to close the Reason Pop-Up page with X icon button")
    public void TC_T33061()throws Exception {
        Test_T33061().
                InputEmail().
                InputPassword().
                BtnLoginCorp().
                clickLogoRFQBtnCorpcomm().
                inputRFQNameCorpcomm().
                clickTheRFQNameCorpcomm().
                clickViewCancelledCorpcomm().
                clickXViewCancelCorpcomm();
    }

    @Description("The Buyer already opened a Cancelled RFQ")
    @Test(description = "The Buyer should be able to close the Reason Pop-Up page with click other areas")
    public void TC_T33062()throws Exception {
        Test_T33062().
                InputEmail().
                InputPassword().
                BtnLoginCorp().
                clickLogoRFQBtnCorpcomm().
                inputRFQNameCorpcomm().
                clickTheRFQNameCorpcomm().
                clickViewCancelledCorpcomm().
                clickXViewEverywhereCorpcomm();
    }

    @Description("The Buyer is already on the General RFQ tab")
    @Test(description = "The Buyer should be able to cancel General RFQ with the status Waiting for Response")
    public void TC_T33044()throws Exception {
        Test_T33044().
                InputEmail().
                InputPassword().
                BtnLoginCorp().
                clickLogoRFQBtnCorpcomm().
                inquiryListClickCorpcomm().
                inquirychooseWFRCorpcomm().
                clickRFQListCorpcomm().
                clickActionbtnCorpcomm().
                clickCancelBtnCorpcomm().
                inputReasonCancelCorpcomm();
                //.clickCancelPopUpCorpcomm();
    }

    @Description("The Buyer is already on the General RFQ tab")
    @Test(description = "The Buyer should be able to cancel General RFQ with the status In Progress")
    public void TC_T33045()throws Exception {
        Test_T33045().
                InputEmail().
                InputPassword().
                BtnLoginCorp().
                clickLogoRFQBtnCorpcomm().
                inquiryListClickCorpcomm().
                inquirychooseIPCorpcomm().
                clickRFQListCorpcomm().
                clickActionbtnCorpcomm().
                clickCancelBtnCorpcomm().
                inputReasonCancelCorpcomm();
                //.clickCancelPopUpCorpcomm();
    }

    @Description("The Buyer is already on the General RFQ tab")
    @Test(description = "The Buyer should be able to cancel General RFQ with the status Receive Quotation")
    public void TC_T33046()throws Exception {
        Test_T33046().
                InputEmail().
                InputPassword().
                BtnLoginCorp().
                clickLogoRFQBtnCorpcomm().
                inquiryListClickCorpcomm().
                inquirychooseRQCorpcomm().
                clickRFQListCorpcomm().
                clickActionbtnCorpcomm().
                clickCancelBtnCorpcomm().
                inputReasonCancelCorpcomm();
        //.clickCancelPopUpCorpcomm();
    }

    @Description("The Buyer is already on the General RFQ tab")
    @Test(description = "The Buyer shouldn't be able to cancel General RFQ with the status Trade Confirmation")
    public void TC_T33063()throws Exception {
        Test_T33063().
                InputEmail().
                InputPassword().
                BtnLoginCorp().
                clickLogoRFQBtnCorpcomm().
                inquiryListClickCorpcomm().
                inquirychooseTCCorpcomm().
                clickRFQListCorpcomm().
                clickActionbtnCorpcomm();
    }

    @Description("The Buyer is already on the General RFQ tab")
    @Test(description = "The Buyer shouldn't be able to cancel General RFQ with the status Purchase Order")
    public void TC_T33064()throws Exception {
        Test_T33064().
                InputEmail().
                InputPassword().
                BtnLoginCorp().
                clickLogoRFQBtnCorpcomm().
                inquiryListClickCorpcomm().
                inquirychoosePOCorpcomm().
                clickRFQListCorpcomm().
                clickActionbtnCorpcomm();
    }

    @Description("The Buyer is already on the General RFQ tab")
    @Test(description = "The Buyer shouldn't be able to cancel General RFQ with the status Cancelled")
    public void TC_T33065()throws Exception {
        Test_T33065().
                InputEmail().
                InputPassword().
                BtnLoginCorp().
                clickLogoRFQBtnCorpcomm().
                inquiryListClickCorpcomm().
                inquirychooseCancelledCorpcomm().
                clickRFQListCorpcomm().
                clickActionbtnCorpcomm();
    }

    @Description("The Buyer is already on the General RFQ tab")
    @Test(description = "The Buyer should be able to cancel Upload RFQ with the status Waiting for Response")
    public void TC_T33047()throws Exception {
        Test_T33047().
                InputEmail().
                InputPassword().
                BtnLoginCorp().
                clickLogoRFQBtnCorpcomm().
                clickUploadedbtnCorpcomm().
                inquiryListClickCorpcomm().
                inquirychooseWFRCorpcomm().
                clickRFQListCorpcomm().
                clickActionbtnCorpcomm().
                clickCancelBtnCorpcomm().
                inputReasonCancelCorpcomm();
        //.clickCancelPopUpCorpcomm();
    }

    @Description("The Buyer is already on the General RFQ tab")
    @Test(description = "The Buyer should be able to cancel Upload RFQ with the status In Progress")
    public void TC_T33048()throws Exception {
        Test_T33048().
                InputEmail().
                InputPassword().
                BtnLoginCorp().
                clickLogoRFQBtnCorpcomm().
                clickUploadedbtnCorpcomm().
                inquiryListClickCorpcomm().
                inquirychooseIPCorpcomm().
                clickRFQListCorpcomm().
                clickActionbtnCorpcomm().
                clickCancelBtnCorpcomm().
                inputReasonCancelCorpcomm();
        //.clickCancelPopUpCorpcomm();
    }

    @Description("The Buyer is already on the General RFQ tab")
    @Test(description = "The Buyer should be able to cancel Upload RFQ with the status Receive Quotation")
    public void TC_T33049()throws Exception {
        Test_T33049().
                InputEmail().
                InputPassword().
                BtnLoginCorp().
                clickLogoRFQBtnCorpcomm().
                clickUploadedbtnCorpcomm().
                inquiryListClickCorpcomm().
                inquirychooseRQCorpcomm().
                clickRFQListCorpcomm().
                clickActionbtnCorpcomm().
                clickCancelBtnCorpcomm().
                inputReasonCancelCorpcomm();
        //.clickCancelPopUpCorpcomm();
    }

    @Description("The Buyer is already on the General RFQ tab")
    @Test(description = "The Buyer shouldn't be able to cancel Upload RFQ with the status Trade Confirmation")
    public void TC_T33066()throws Exception {
        Test_T33066().
                InputEmail().
                InputPassword().
                BtnLoginCorp().
                clickLogoRFQBtnCorpcomm().
                clickUploadedbtnCorpcomm().
                inquiryListClickCorpcomm().
                inquirychooseTCCorpcomm().
                clickRFQListCorpcomm().
                clickActionbtnCorpcomm();
    }

    @Description("The Buyer is already on the General RFQ tab")
    @Test(description = "The Buyer shouldn't be able to cancel Upload RFQ with the status Purchase Order")
    public void TC_T33067()throws Exception {
        Test_T33067().
                InputEmail().
                InputPassword().
                BtnLoginCorp().
                clickLogoRFQBtnCorpcomm().
                clickUploadedbtnCorpcomm().
                inquiryListClickCorpcomm().
                inquirychoosePOCorpcomm().
                clickRFQListCorpcomm().
                clickActionbtnCorpcomm();
    }

    //include testcase: T33068 & T33184
    @Description("The Buyer is already on the General RFQ tab")
    @Test(description = "The Buyer shouldn't be able to cancel Upload RFQ with the status Cancelled")
    public void TC_T33068()throws Exception {
        Test_T33068().
                InputEmail().
                InputPassword().
                BtnLoginCorp().
                clickLogoRFQBtnCorpcomm().
                clickUploadedbtnCorpcomm().
                inquiryListClickCorpcomm().
                inquirychooseCancelledCorpcomm().
                clickRFQListCorpcomm().
                clickActionbtnCorpcomm().
                containerDisableTCCorpcomm();
    }
}
