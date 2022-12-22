package Gokomodo.BE.Integration.Rest.tests;

import Gokomodo.BE.Integration.Rest.pageObjects.Auth.IntegrationLogin;
import Gokomodo.BE.Integration.Rest.pageObjects.Company.IntegrationCompanyList;
import Gokomodo.BE.Integration.Rest.pageObjects.Department.IntegrationDepartmentList;
import Gokomodo.BE.Integration.Rest.pageObjects.GR.IntegrationCreateGR;
import Gokomodo.BE.Integration.Rest.pageObjects.Invoice.IntegrationCreateInvoice;
import Gokomodo.BE.Integration.Rest.pageObjects.PO.IntegrationApprovePO;
import Gokomodo.BE.Integration.Rest.pageObjects.PO.IntegrationCreatePO;
import Gokomodo.BE.Integration.Rest.pageObjects.PR.IntegrationCreatePR;
import Gokomodo.BE.Integration.Rest.pageObjects.PT.IntegrationPTList;
import Gokomodo.BE.Integration.Rest.pageObjects.RFQ.IntegrationCreateRFQ;
import Gokomodo.BE.Integration.Rest.pageObjects.TC.IntegrationExportTC;
import Gokomodo.BE.Integration.Rest.pageObjects.TC.IntegrationTCDetails;
import Gokomodo.BE.Integration.Rest.pageObjects.TC.IntegrationTCList;
import Gokomodo.BE.Integration.Rest.pageObjects.User.IntegrationUserList;
import Gokomodo.BE.Rest.controllers.IntegrationBaseMethod;
import Gokomodo.FE.Web.BrowserFactory;
import Gokomodo.FE.Web.LoginManager.Buyer.pageObjects.initializePageObjects.BuyerPageLoginInitializerBuyer;
import Gokomodo.FE.Web.LoginManager.Seller.pageObjects.initializePageObjects.SellerPageLoginInitializer;
import Gokomodo.FE.Web.WebDriverFactory;
import org.json.simple.parser.ParseException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.FileWriter;
import java.io.IOException;

import static Gokomodo.FE.Web.BrowserFactory.driver;
import static Gokomodo.FE.Web.WebDriverFactory.wd;

public class IntegrationE2ETest extends IntegrationBaseMethod {

    @Test(description = "Rest API Test of Login Authentication", priority = 1)
    public void loginCompany() throws IOException, ParseException {
        IntegrationLogin integrationLogin = new IntegrationLogin();
        integrationLogin.postAuthUserLogin().assertAuthStatusCode().assertAuthBody().assertAuthContentType();
    }

    @Test(description = "Rest API Test of Get User List", priority = 2)
    public void getUserList() throws IOException, ParseException {
        IntegrationUserList integrationUserList = new IntegrationUserList();
        integrationUserList.getUserList().assertStatusCode().assertBody().assertContentType();
    }

    @Test(description = "Rest API Test of Get Payment Terms List", priority = 2)
    public void getPTList() throws IOException, ParseException {
        IntegrationPTList integrationPTList = new IntegrationPTList();
        integrationPTList.getPTList().assertStatusCode().assertBody().assertContentType();
    }

    @Test(description = "Rest API Test of Get Vendor List", priority = 2)
    public void getCompanyList() throws IOException, ParseException {
IntegrationCompanyList integrationCompanyList = new IntegrationCompanyList();
integrationCompanyList.getCompanyListById().assertStatusCode().assertBody().assertContentType();
    }

    @Test(description = "Rest API Test of Create PR", priority = 3)
    public void createPR() throws IOException, ParseException {
        IntegrationCreatePR integrationCreatePR = new IntegrationCreatePR();
        integrationCreatePR.postCreatePR().assertStatusCode().assertBody().assertContentType();
    }

    @Test(description = "Rest API Test of Get Department List", priority = 4)
    public void getDepartmentList() throws IOException, ParseException {
        IntegrationDepartmentList integrationDepartmentList = new IntegrationDepartmentList();
        integrationDepartmentList.getDepartmentList().assertStatusCode().assertBody().assertContentType();
    }

    @Test(description = "Rest API Test of Create RFQ", priority = 5)
    public void createRFQ() throws IOException, ParseException {
        IntegrationCreateRFQ integrationCreateRFQ = new IntegrationCreateRFQ();
        integrationCreateRFQ.postCreateRFQ().assertStatusCode().assertBody().assertContentType();
    }

    @Test(description = "Submit RFQ, Create Offer, and Create TC from UI actions", priority = 6)
    public void UIActions() throws Exception {
        new WebDriverFactory();
        WebDriverFactory.suiteSetup();
        BrowserFactory.createDriver();
        wd.set(driver);
        BuyerPageLoginInitializerBuyer buyerPageLoginInitializerBuyer = new BuyerPageLoginInitializerBuyer();
        buyerPageLoginInitializerBuyer.buyerAction().navigateToHomepage().InputEmail().InputPassword().btnLogin().navigateToRFQPage().editRFQDraft().editProduct().submitRFQ();
        SellerPageLoginInitializer sellerPageLoginInitializer = new SellerPageLoginInitializer();
        sellerPageLoginInitializer.sellerAction().navigateToHomepage().InputEmail().InputPassword().btnLogin().navigateToCreateInquiry().addProduct();
//        buyerPageLoginInitializerBuyer.buyerAction().navigateToHomepage().navigateToRFQPage().createTC();
        driver.close();
    }

//    @Test(description = "Rest API Test of Get TC List", priority = 8)
//    public void getTCList() throws IOException, ParseException {
//        IntegrationTCList integrationTCList = new IntegrationTCList();
//        integrationTCList.getTCList().assertStatusCode().assertBody().assertContentType();
//    }
//
//    @Test(description = "Rest API Test of Get TC Details", priority = 9)
//    public void getTCDetails() throws IOException, ParseException {
//        IntegrationTCDetails integrationTCDetails = new IntegrationTCDetails();
//        integrationTCDetails.getTCDetail().assertStatusCode().assertBody().assertContentType();
//    }
//
//    @Test(description = "Rest API Test of Put Export TC", priority = 10)
//    public void putExportTC() throws IOException, ParseException {
//        IntegrationExportTC integrationExportTC = new IntegrationExportTC();
//        integrationExportTC.putExportTC().assertStatusCode().assertBody().assertContentType();
//    }
//
//    @Test(description = "Rest API Test of Create PO", priority = 11)
//    public void postCreatePO() throws IOException, ParseException {
//        IntegrationCreatePO integrationCreatePO = new IntegrationCreatePO();
//        integrationCreatePO.postCreatePO().assertStatusCode().assertBody().assertContentType();
//    }
//
//    @Test(description = "Rest API Test of Approve PO", priority = 12)
//    public void putApprovePO() throws IOException, ParseException {
//        IntegrationApprovePO integrationApprovePO = new IntegrationApprovePO();
//        integrationApprovePO.putApprovePO().assertStatusCode().assertBody().assertContentType();
//    }
//
//    @Test(description = "Rest API Test of Create GR", priority = 13)
//    public void postCreateGR() throws Exception {
//        IntegrationCreateGR integrationCreateGR = new IntegrationCreateGR();
//        integrationCreateGR.postCreateGR().assertStatusCode().assertBody().assertContentType();
//    }
//
//    @Test(description = "Rest API Test of Create Invoice", priority = 14)
//    public void postCreateInvoice() throws Exception {
//        IntegrationCreateInvoice integrationCreateInvoice = new IntegrationCreateInvoice();
//        integrationCreateInvoice.postCreateInvoice().assertStatusCode().assertBody().assertContentType();
//    }
//
//
//    @AfterSuite
//    public void afterSuite() throws IOException, ParseException {
//        //temporary way to store the IDs generated each run
//        String PRNumber = IntegrationBaseMethod.getPRNumber(env.IntegrationCreatePRResponse());
//        String RFQNumber = IntegrationBaseMethod.getRFQNumber(env.IntegrationCreateRFQResponse());
//        String RFQID = IntegrationBaseMethod.getRFQID(env.IntegrationCreateRFQResponse());
//        String TCNumber = IntegrationBaseMethod.getTCNumber(env.IntegrationTCListResponse());
//        String TCID = IntegrationBaseMethod.getTCID(env.IntegrationTCListResponse());
//        String PONumber = IntegrationBaseMethod.getPONumber(env.IntegrationCreatePOTestData());
//        String allData = PRNumber + "\r\n" +
//                RFQNumber + "\r\n" +
//                RFQID + "\r\n" +
//                TCNumber + "\r\n" +
//                TCID + "\r\n" +
//                PONumber + "\r\n";
//        try (FileWriter file = new FileWriter(env.ResultData())) {
//            file.write(allData);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

}
