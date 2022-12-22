package Gokomodo.BE.Rest.controllers;

import ru.qatools.properties.Property;
import ru.qatools.properties.PropertyLoader;
import ru.qatools.properties.Resource;

@Resource.Classpath("BE/Integration/RestConfig.properties")
public class RestConfigReader {

    public RestConfigReader()
    {
        PropertyLoader.newInstance().populate(this);
    }


    // ===== Retail ===== //
    @Property(value = "RetailBaseURI")
    private String RetailBaseURI;
    protected String getRetailBaseURI() {return RetailBaseURI;}

    @Property(value = "RetailAccessControlPath")
    private String RetailAccessControlPath;
    protected String getRetailAccessControlPath() {return RetailAccessControlPath;}

    @Property(value = "RetailAuthLoginPath")
    private String RetailAuthLoginPath;
    protected String getRetailAuthLoginPath() {return RetailAuthLoginPath;}

    @Property(value = "JSONContentType")
    private String JSONContentType;
    protected String getJSONContentType() {return JSONContentType;}

    @Property(value = "RetailAuthLoginTestDataLocation")
    private String RetailAuthLoginTestDataLocation;
    protected String getRetailAuthLoginTestDataLocation() {return RetailAuthLoginTestDataLocation;}

    @Property(value = "RetailTokenFileLocation")
    private String RetailTokenFileLocation;
    protected String getRetailTokenFileLocation() {return RetailTokenFileLocation;}

    @Property(value = "RetailCreateProductLocation")
    private String RetailCreateProductLocation;
    protected String getRetailCreateProductLocation() {return RetailCreateProductLocation;}

    @Property(value = "RetailProductPath")
    private String RetailProductPath;
    protected String getRetailProductPath() {return RetailProductPath;}

    @Property(value = "RetailCreateProductResponseLocation")
    private String RetailCreateProductResponseLocation;
    protected String getRetailCreateProductResponseLocation() {return RetailCreateProductResponseLocation;}

    @Property(value = "RetailPartnerPath")
    private String RetailPartnerPath;
    protected String getRetailPartnerPath() {return RetailPartnerPath;}

    @Property(value = "RetailCreatePartnerLocation")
    private String RetailCreatePartnerLocation;
    protected String getRetailCreatePartnerLocation() {return RetailCreatePartnerLocation;}

    @Property(value = "RetailCreatePartnerResponseLocation")
    private String RetailCreatePartnerResponseLocation;
    protected String getRetailCreatePartnerResponseLocation() {return RetailCreatePartnerResponseLocation;}

    @Property(value = "IntegrationBaseURI")
    private String IntegrationBaseURI;
    protected String getIntegrationBaseURI() {return IntegrationBaseURI;}

    @Property(value = "IntegrationAuthLoginPath")
    private String IntegrationAuthLoginPath;
    protected String getIntegrationAuthLoginPath() {return IntegrationAuthLoginPath;}

    @Property(value = "IntegrationAuthLoginTestDataLocation")
    private String IntegrationAuthLoginTestDataLocation;
    protected String getIntegrationAuthLoginTestDataLocation() {return IntegrationAuthLoginTestDataLocation;}

    @Property(value = "IntegrationAuthLoginResponseFileLocation")
    private String IntegrationAuthLoginResponseFileLocation;
    protected String getIntegrationAuthLoginResponseFileLocation() {return IntegrationAuthLoginResponseFileLocation;}

    @Property(value = "IntegrationAuthLoginSchemaLocation")
    private String IntegrationAuthLoginSchemaLocation;
    protected String getIntegrationAuthLoginSchemaLocation() {return IntegrationAuthLoginSchemaLocation;}

    @Property(value = "RetailAuthLoginSchemaLocation")
    private String RetailAuthLoginSchemaLocation;
    protected String getRetailAuthLoginSchemaLocation() {return RetailAuthLoginSchemaLocation;}

    @Property(value = "IntegrationCompanyListPath")
    private String IntegrationCompanyListPath;
    protected String getIntegrationCompanyListPath() {return IntegrationCompanyListPath;}

    @Property(value = "IntegrationCompanyListResponse")
    private String IntegrationCompanyListResponse;
    protected String getIntegrationCompanyListResponse() {return IntegrationCompanyListResponse;}

    @Property(value = "IntegrationCreateCompanyPath")
    private String IntegrationCreateCompanyPath;
    protected String getIntegrationCreateCompanyPath() {return IntegrationCreateCompanyPath;}

    @Property(value = "IntegrationCreateCompanyTestData")
    private String IntegrationCreateCompanyTestData;
    protected String getIntegrationCreateCompanyTestData() {return IntegrationCreateCompanyTestData;}

    @Property(value = "IntegrationCreateCompanyResponse")
    private String IntegrationCreateCompanyResponse;
    protected String getIntegrationCreateCompanyResponse() {return IntegrationCreateCompanyResponse;}

    @Property(value = "IntegrationCreateCompanySchema")
    private String IntegrationCreateCompanySchema;
    protected String getIntegrationCreateCompanySchema() {return IntegrationCreateCompanySchema;}

    @Property(value = "IntegrationUserListPath")
    private String IntegrationUserListPath;
    protected String getIntegrationUserListPath() {return IntegrationUserListPath;}

    @Property(value = "IntegrationUserListResponse")
    private String IntegrationUserListResponse;
    protected String getIntegrationUserListResponse() {return IntegrationUserListResponse;}

    @Property(value = "IntegrationUserListSchema")
    private String IntegrationUserListSchema;
    protected String getIntegrationUserListSchema() {return IntegrationUserListSchema;}

    @Property(value = "IntegrationCreatePRPath")
    private String IntegrationCreatePRPath;
    protected String getIntegrationCreatePRPath() {return IntegrationCreatePRPath;}

    @Property(value = "IntegrationCreatePRTestData")
    private String IntegrationCreatePRTestData;
    protected String getIntegrationCreatePRTestData() {return IntegrationCreatePRTestData;}

    @Property(value = "IntegrationCreatePRResponse")
    private String IntegrationCreatePRResponse;
    protected String getIntegrationCreatePRResponse() {return IntegrationCreatePRResponse;}

    @Property(value = "IntegrationCreatePRSchema")
    private String IntegrationCreatePRSchema;
    protected String getIntegrationCreatePRSchema() {return IntegrationCreatePRSchema;}

    @Property(value = "IntegrationCreateRFQTestData")
    private String IntegrationCreateRFQTestData;
    protected String getIntegrationCreateRFQTestData() {return IntegrationCreateRFQTestData;}

    @Property(value = "IntegrationCreateRFQPath")
    private String IntegrationCreateRFQPath;
    protected String getIntegrationCreateRFQPath() {return IntegrationCreateRFQPath;}

    @Property(value = "IntegrationCreateRFQResponse")
    private String IntegrationCreateRFQResponse;
    protected String getIntegrationCreateRFQResponse() {return IntegrationCreateRFQResponse;}

    @Property(value = "IntegrationCreateRFQSchema")
    private String IntegrationCreateRFQSchema;
    protected String getIntegrationCreateRFQSchema() {return IntegrationCreateRFQSchema;}

    @Property(value = "IntegrationTCListPath")
    private String IntegrationTCListPath;
    protected String getIntegrationTCListPath() {return IntegrationTCListPath;}

    @Property(value = "IntegrationTCListResponse")
    private String IntegrationTCListResponse;
    protected String getIntegrationTCListResponse() {return IntegrationTCListResponse;}

    @Property(value = "IntegrationTCListSchema")
    private String IntegrationTCListSchema;
    protected String getIntegrationTCListSchema() {return IntegrationTCListSchema;}

    @Property(value = "IntegrationTCDetailsResponse")
    private String IntegrationTCDetailsResponse;
    protected String getIntegrationTCDetailsResponse() {return IntegrationTCDetailsResponse;}

    @Property(value = "IntegrationTCDetailsSchema")
    private String IntegrationTCDetailsSchema;
    protected String getIntegrationTCDetailsSchema() {return IntegrationTCDetailsSchema;}

    @Property(value = "IntegrationExportTCPath")
    private String IntegrationExportTCPath;
    protected String getIntegrationExportTCPath() {return IntegrationExportTCPath;}

    @Property(value = "IntegrationExportTCTestData")
    private String IntegrationExportTCTestData;
    protected String getIntegrationExportTCTestData() {return IntegrationExportTCTestData;}

    @Property(value = "IntegrationExportTCResponse")
    private String IntegrationExportTCResponse;
    protected String getIntegrationExportTCResponse() {return IntegrationExportTCResponse;}

    @Property(value = "IntegrationExportTCSchema")
    private String IntegrationExportTCSchema;
    protected String getIntegrationExportTCSchema() {return IntegrationExportTCSchema;}

    @Property(value = "IntegrationCreatePOPath")
    private String  IntegrationCreatePOPath;
    protected String getIntegrationCreatePOPath() {return IntegrationCreatePOPath;}

    @Property(value = "IntegrationCreatePOTestData")
    private String IntegrationCreatePOTestData;
    protected String getIntegrationCreatePOTestData() {return IntegrationCreatePOTestData;}

    @Property(value = "IntegrationCreatePOResponse")
    private String IntegrationCreatePOResponse;
    protected String getIntegrationCreatePOResponse() {return IntegrationCreatePOResponse;}

    @Property(value = "IntegrationCreatePOSchema")
    private String IntegrationCreatePOSchema;
    protected String getIntegrationCreatePOSchema() {return IntegrationCreatePOSchema;}

    @Property(value = "IntegrationApprovePOPath")
    private String IntegrationApprovePOPath;
    protected String getIntegrationApprovePOPath() {return IntegrationApprovePOPath;}

    @Property(value = "IntegrationApprovePOTestData")
    private String IntegrationApprovePOTestData;
    protected String getIntegrationApprovePOTestData() {return IntegrationApprovePOTestData;}

    @Property(value = "IntegrationApprovePOResponse")
    private String IntegrationApprovePOResponse;
    protected String getIntegrationApprovePOResponse() {return IntegrationApprovePOResponse;}

    @Property(value = "IntegrationApprovePOSchema")
    private String IntegrationApprovePOSchema;
    protected String getIntegrationApprovePOSchema() {return IntegrationApprovePOSchema;}

    @Property(value = "ResultData")
    private String ResultData;
    protected String getResultData() {return ResultData;}

    @Property(value = "IntegrationLocation")
    private String IntegrationLocation;
    protected String getIntegrationLocation(){return IntegrationLocation;}

    @Property(value = "IntegrationPaymentTerm")
    private int IntegrationPaymentTerm;
    protected int getIntegrationPaymentTerm(){return IntegrationPaymentTerm;}


}
