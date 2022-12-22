package Gokomodo.BE.Rest.controllers;

public class RestInitMethod {

    public static RestConfigReader appConfig = new RestConfigReader();
    public static String jsonContentType = appConfig.getJSONContentType();

    //Retail
    public static String retailBaseURI = appConfig.getRetailBaseURI();
    public static String retailAccessControlPath = appConfig.getRetailAccessControlPath();
    public static String retailAuthLoginPath = appConfig.getRetailAuthLoginPath();
    public static String retailAuthLoginTestDataLocation = appConfig.getRetailAuthLoginTestDataLocation();
    public static String retailTokenFileLocation = appConfig.getRetailTokenFileLocation();
    public static String retailCreateProductLocation = appConfig.getRetailCreateProductLocation();
    public static String retailCreateProductResponseLocation = appConfig.getRetailCreateProductResponseLocation();
    public static String retailProductPath = appConfig.getRetailProductPath();
    public static String retailPartnerPath = appConfig.getRetailPartnerPath();
    public static String retailCreatePartnerLocation = appConfig.getRetailCreatePartnerLocation();
    public static String retailCreatePartnerResponseLocation = appConfig.getRetailCreatePartnerResponseLocation();
    public static String retailAuthLoginSchemaLocation = appConfig.getRetailAuthLoginSchemaLocation();


    //integration
    public static String integrationBaseURI = appConfig.getIntegrationBaseURI();
    public static String integrationAuthLoginPath = appConfig.getIntegrationAuthLoginPath();
    public static String integrationAuthLoginTestDataLocation = appConfig.getIntegrationAuthLoginTestDataLocation();
    public static String integrationAuthLoginResponseFileLocation = appConfig.getIntegrationAuthLoginResponseFileLocation();
    public static String integrationAuthLoginSchemaLocation = appConfig.getIntegrationAuthLoginSchemaLocation();
    public static String integrationCompanyListPath = appConfig.getIntegrationCompanyListPath();
    public static String integrationCompanyListResponse = appConfig.getIntegrationCompanyListResponse();
    public static String integrationCreateCompanyPath = appConfig.getIntegrationCreateCompanyPath();
    public static String integrationCreateCompanyTestData = appConfig.getIntegrationCreateCompanyTestData();
    public static String integrationCreateCompanyResponse = appConfig.getIntegrationCreateCompanyResponse();
    public static String integrationCreateCompanySchema = appConfig.getIntegrationCreateCompanySchema();
    public static String integrationUserListPath = appConfig.getIntegrationUserListPath();
    public static String integrationUserListResponse = appConfig.getIntegrationUserListResponse();
    public static String integrationUserListSchema = appConfig.getIntegrationUserListSchema();
    public static String integrationCreatePRPath = appConfig.getIntegrationCreatePRPath();
    public static String integrationCreatePRTestData = appConfig.getIntegrationCreatePRTestData();
    public static String integrationCreatePRResponse = appConfig.getIntegrationCreatePRResponse();
    public static String integrationCreatePRSchema = appConfig.getIntegrationCreatePRSchema();
    public static String integrationCreateRFQTestData = appConfig.getIntegrationCreateRFQTestData();
    public static String integrationCreateRFQPath = appConfig.getIntegrationCreateRFQPath();
    public static String integrationCreateRFQResponse = appConfig.getIntegrationCreateRFQResponse();
    public static String integrationCreateRFQSchema = appConfig.getIntegrationCreateRFQSchema();
    public static String integrationTCListPath = appConfig.getIntegrationTCListPath();
    public static String integrationTCListResponse = appConfig.getIntegrationTCListResponse();
    public static String integrationTCListSchema = appConfig.getIntegrationTCListSchema();
    public static String integrationTCDetailsResponse = appConfig.getIntegrationTCDetailsResponse();
    public static String integrationTCDetailsSchema = appConfig.getIntegrationTCDetailsSchema();
    public static String integrationExportTCPath = appConfig.getIntegrationExportTCPath();
    public static String integrationExportTCTestData = appConfig.getIntegrationExportTCTestData();
    public static String integrationExportTCResponse = appConfig.getIntegrationExportTCResponse();
    public static String integrationExportTCSchema = appConfig.getIntegrationExportTCSchema();
    public static String integrationCreatePOPath = appConfig.getIntegrationCreatePOPath();
    public static String integrationCreatePOTestData = appConfig.getIntegrationCreatePOTestData();
    public static String integrationCreatePOResponse = appConfig.getIntegrationCreatePOResponse();
    public static String integrationCreatePOSchema = appConfig.getIntegrationCreatePOSchema();
    public static String integrationApprovePOPath = appConfig.getIntegrationApprovePOPath();
    public static String integrationApprovePOTestData = appConfig.getIntegrationApprovePOTestData();
    public static String integrationApprovePOResponse = appConfig.getIntegrationApprovePOResponse();
    public static String integrationApprovePOSchema = appConfig.getIntegrationApprovePOSchema();
    public static String resultData = appConfig.getResultData();
    public static String integrationLocation = appConfig.getIntegrationLocation();
    public static int integrationPaymentTerm = appConfig.getIntegrationPaymentTerm();





}
