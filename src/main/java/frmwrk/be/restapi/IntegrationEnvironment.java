package frmwrk.be.restapi;

import org.aeonbits.owner.Config;
import org.testng.annotations.Parameters;

@Config.Sources({"file:src/main/resources/BE/Integration/${env}.properties"})
@Parameters({"environment"})
public interface IntegrationEnvironment extends Config {

    //#General
    String IntegrationBaseURI();

    String IntegrationURLBuyer();

    String IntegrationURLSeller();

    String IntegrationBuyerEmail();

    String IntegrationBuyerPassword();

    String IntegrationSellerEmail();

    String IntegrationSellerPassword();

    String JSONContentType();

    String ResultData();


    //#Test Data Variables

    String IntegrationLocation();

    int IntegrationUnitCost();

    int IntegrationQuantity();

    int IntegrationDownPayment();

    int IntegrationDiscount();

    int IntegrationFreight();

    int IntegrationMisc();

    int IntegrationTax();

    //#Auth
    //##Login
    String IntegrationAuthLoginPath();

    String IntegrationAuthLoginTestDataLocation();

    String IntegrationAuthLoginResponseFileLocation();

    String IntegrationAuthLoginSchemaLocation();

    //#Company
    //##List
    String IntegrationCompanyListPath();

    String IntegrationCompanyListResponse();

    String IntegrationCompanyListSchema();

    //##Create
    String IntegrationCreateCompanyPath();

    String IntegrationCreateCompanyTestData();

    String IntegrationCreateCompanyResponse();

    String IntegrationCreateCompanySchema();


    //#User
    //##User List
    String IntegrationUserListPath();

    String IntegrationUserListResponse();

    String IntegrationUserListSchema();


    //#PR
    //##Create PR
    String IntegrationCreatePRPath();

    String IntegrationCreatePRTestData();

    String IntegrationCreatePRResponse();

    String IntegrationCreatePRSchema();

    //#RFQ
    //##Create RFQ
    String IntegrationCreateRFQPath();

    String IntegrationCreateRFQTestData();

    String IntegrationCreateRFQResponse();

    String IntegrationCreateRFQSchema();

    //#TC
    //##TC List
    String IntegrationTCListPath();

    String IntegrationTCListResponse();

    String IntegrationTCListSchema();

    //##TC Detail
    String IntegrationTCDetailsResponse();

    String IntegrationTCDetailsSchema();

    //##Export TC
    String IntegrationExportTCPath();

    String IntegrationExportTCTestData();

    String IntegrationExportTCResponse();

    String IntegrationExportTCSchema();

    //#PO
    //##Create PO
    String IntegrationCreatePOPath();

    String IntegrationCreatePOTestData();

    String IntegrationCreatePOResponse();

    String IntegrationCreatePOSchema();

    //##Approve PO
    String IntegrationApprovePOPath();

    String IntegrationApprovePOTestData();

    String IntegrationApprovePOResponse();

    String IntegrationApprovePOSchema();

    //#GR
    //##Create GR
    String IntegrationCreateGRPath();

    String IntegrationCreateGRTestData();

    String IntegrationCreateGRResponse();

    String IntegrationCreateGRSchema();

    //#Department
    //##List
    String IntegrationDepartmentListPath();

    String IntegrationDepartmentListResponse();

    String IntegrationDepartmentListSchema();

    //#Invoice
    //##Create Invoice
    String IntegrationCreateInvoicePath();

    String IntegrationCreateInvoiceTestData();

    String IntegrationCreateInvoiceResponse();

    String IntegrationCreateInvoiceSchema();

    //#PT
    //##Payment Term
    String IntegrationPTListPath();
    String IntegrationPTListResponse();
    String IntegrationPTListSchema();
}
