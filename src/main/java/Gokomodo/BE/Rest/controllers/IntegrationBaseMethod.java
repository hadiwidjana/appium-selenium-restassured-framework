package Gokomodo.BE.Rest.controllers;

import Gokomodo.GlobalMethod.Logger.Log;
import org.aeonbits.owner.ConfigFactory;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.NotFoundException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public class IntegrationBaseMethod extends MainBaseMethod {

    public static String envName;
    public static IntegrationEnvironment env;

    /**
     * Get access token from file
     *
     * @return access token string
     */
    protected String getIntegrationAccessToken(String tokenLocation) throws IOException, ParseException {
        JSONObject loginResponse = readJSONObject(tokenLocation);
        JSONObject tokenData = (JSONObject) loginResponse.get("data");
        String accessToken = tokenData.get("token").toString();
        return accessToken;
    }

    protected JSONObject getUserData(String userListResponse) throws IOException, ParseException {
        JSONObject getUserResponseJSON = readJSONObject(userListResponse);
        JSONArray userData = (JSONArray) getUserResponseJSON.get("data");
        JSONObject userData1;
        switch (envName) {
            case "bifrost":
                userData1 = (JSONObject) userData.get(userData.size() - 3);
                break;
            case "erp":
                userData1 = (JSONObject) userData.get(userData.size() - 1);
                break;
            case "digital":
                userData1 = (JSONObject) userData.get(userData.size() - 11);
                break;
            case "prod":
                userData1 = (JSONObject) userData.get(userData.size() - 3);
                break;
            default:
                throw new NotFoundException("Environment not found, please enter bifrost, erp, or prod as environment");
        }
        long userID = (long) userData1.get("id");
        String userEmail = (String) userData1.get("email");
        JSONObject PRCreator = new JSONObject();
        PRCreator.put("id", userID);
        PRCreator.put("email", userEmail);
        return PRCreator;
    }


    public static String getPRDate() {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
        return dateFormat.format(date);
    }

    public static String getPODate() {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd/yy");
        return dateFormat.format(date);
    }

    public static String getGRDate() {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(date);
    }

    public static String getRFQDate(int numOfDays) {
        Calendar current = Calendar.getInstance();
        current.add(Calendar.DATE, numOfDays);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date resultdate = new Date(current.getTimeInMillis());
        return df.format(resultdate);
    }

    protected void generatePRData(String createPRTestData, String integrationLocation, String userListResponse) throws IOException, ParseException {
        int upperbound = 9999;
        int int_random = random(upperbound);
        String PRNumber = "PRM2022/DEMO-INTG/" + getPRDate() + "/" + int_random;
        JSONObject PRTestData = readJSONObject(createPRTestData);
        JSONObject itemMod;
        JSONArray PRItems = (JSONArray) PRTestData.get("items");
        JSONArray newPRItems = new JSONArray();
        for (int i = 0; i < PRItems.size(); i++) {
            itemMod = new JSONObject();
            itemMod.clear();
            itemMod = (JSONObject) PRItems.get(i);
            itemMod.put("purchaser", getUserData(userListResponse));
            itemMod.put("location_id", integrationLocation);
            newPRItems.add(itemMod);
        }
        PRTestData.put("items", newPRItems);
        PRTestData.put("pr_no", PRNumber);
        PRTestData.put("creator", getUserData(userListResponse));
        PRTestData.put("location_id", integrationLocation);
        Log.info("Creating PR no: " + PRNumber);

        try (FileWriter file = new FileWriter(createPRTestData)) {
            file.write(prettyPrint(PRTestData.toJSONString()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getRFQNumber(String createRFQResponse) throws IOException, ParseException {
        JSONObject RFQResponseData = (JSONObject) readJSONObject(createRFQResponse).get("data");
        return RFQResponseData.get("rfq_no").toString();
    }

    public static String getRFQID(String createRFQResponse) throws IOException, ParseException {
        JSONObject RFQResponseData = (JSONObject) readJSONObject(createRFQResponse).get("data");
        return RFQResponseData.get("rfq_id").toString();
    }

    public static String getPRNumber(String createPRResponse) throws IOException, ParseException {
        JSONObject RFQResponseData = (JSONObject) readJSONObject(createPRResponse).get("data");
        return RFQResponseData.get("pr_no").toString();
    }

    public static String getPONumber(String createPOTestData) throws IOException, ParseException {
        String PONumber = (String) readJSONObject(createPOTestData).get("po_no");
        return PONumber;
    }

    protected void generateRFQData(String createPRResponse, String createRFQTestData, String userListResponse, String integrationLocation) throws IOException, ParseException {
        JSONObject PRTestData = new JSONObject(readJSONObject(createPRResponse));
        JSONObject PRDataArray = (JSONObject) PRTestData.get("data");
        JSONArray PRItemsArray = (JSONArray) PRDataArray.get("items");
        HashMap<Integer, JSONObject> PRItemsObject = new HashMap<>();
        JSONObject RFQTestData = new JSONObject(readJSONObject(createRFQTestData));
        JSONArray RFQDeliveries = (JSONArray) RFQTestData.get("deliveries");
        JSONObject RFQDeliveriesObject = (JSONObject) RFQDeliveries.get(0);
        JSONArray RFQItemsArray = (JSONArray) RFQDeliveriesObject.get("items");
        RFQItemsArray.clear();
        JSONObject RFQItemsObject;
        for (int i = 0; i < PRItemsArray.size(); i++) {
            RFQItemsObject = new JSONObject();
            RFQItemsObject.clear();
            PRItemsObject.put(i, (JSONObject) PRItemsArray.get(i));
            RFQItemsObject.put("brand", PRItemsObject.get(i).get("brand"));
            RFQItemsObject.put("budget", 2000000);
            RFQItemsObject.put("last_price", 1000000);
            RFQItemsObject.put("location_id", integrationLocation);
            RFQItemsObject.put("material_number", PRItemsObject.get(i).get("material_number"));
            RFQItemsObject.put("name", PRItemsObject.get(i).get("name"));
            RFQItemsObject.put("note", PRItemsObject.get(i).get("note"));
            RFQItemsObject.put("pr_id", PRDataArray.get("pr_no"));
            RFQItemsObject.put("pr_item_id", PRItemsObject.get(i).get("pr_item_id"));
            RFQItemsObject.put("quantity", PRItemsObject.get(i).get("quantity"));
            RFQItemsObject.put("uom", PRItemsObject.get(i).get("uom"));
            RFQItemsArray.add(RFQItemsObject);
        }
        Log.info("Creating RFQ from PR no: " + PRDataArray.get("pr_no"));
        RFQDeliveriesObject.put("location_id", integrationLocation);
        RFQDeliveriesObject.put("items", RFQItemsArray);
        RFQDeliveries.clear();
        RFQDeliveries.add(0, RFQDeliveriesObject);
        RFQTestData.put("deliveries", RFQDeliveries);
        RFQTestData.put("creator", getUserData(userListResponse));
        RFQTestData.put("payment_term_id", getPaymentTermID());
        RFQTestData.put("due_date", getRFQDate(7) + " 12:00");
        RFQTestData.put("expected_delivery_start", getRFQDate(14));
        RFQTestData.put("expected_delivery_end", getRFQDate(30));
        try (FileWriter file = new FileWriter(createRFQTestData)) {
            file.write(prettyPrint(RFQTestData.toJSONString()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected String getIntegrationTCQueryParameter(String createRFQResponse) throws IOException, ParseException {
        String queryPath = "?page=1&per_page=5&rfq_id=" + getRFQID(createRFQResponse);
        return queryPath;
    }

    public static String getTCNumber(String TCListResponse) throws IOException, ParseException {
        JSONObject TCResponseData = (JSONObject) readJSONObject(TCListResponse).get("data");
        JSONArray TCDetails = (JSONArray) TCResponseData.get("trade_confirmations");
        JSONObject firstTC = (JSONObject) TCDetails.get(0);
        String TCNumber = firstTC.get("tc_no").toString();
        return TCNumber;
    }

    public static String getTCID(String TCListResponse) throws IOException, ParseException {
        JSONObject TCResponseData = (JSONObject) readJSONObject(TCListResponse).get("data");
        JSONArray TCDetails = (JSONArray) TCResponseData.get("trade_confirmations");
        JSONObject firstTC = (JSONObject) TCDetails.get(0);
        String TCID = firstTC.get("tc_id").toString();
        return TCID;
    }

    protected void generateExportTCData(String exportTCTestData, String TCListResponse) throws IOException, ParseException {
        JSONObject ExportTCObject = (JSONObject) readJSONArray(exportTCTestData).get(0);
        ExportTCObject.put("tc_id", getTCID(TCListResponse));
        ExportTCObject.put("status", 1);
        JSONArray ExportTCArray = new JSONArray();
        ExportTCArray.add(ExportTCObject);
        try (FileWriter file = new FileWriter(exportTCTestData)) {
            file.write(prettyPrint(ExportTCArray.toString()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void generateCreatePOData(String createPOTestData, String userListResponse) throws IOException, ParseException {
        int upperbound = 9999;
        int int_random = random(upperbound);
        String PONumber = "PO/RFQ/" + getPODate() + "/" + int_random;
        JSONObject CreatePO = readJSONObject(createPOTestData);
        CreatePO.put("po_no", PONumber);
        CreatePO.put("creator", getUserData(userListResponse));
        try (FileWriter file = new FileWriter(createPOTestData)) {
            file.write(prettyPrint(CreatePO.toString()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void generateApprovePOData(String approvePOTestData, String createPOTestData, String userListResponse) throws IOException, ParseException {
        JSONObject ApprovePO = readJSONObject(approvePOTestData);
        String PONumber = (String) readJSONObject(createPOTestData).get("po_no");
        ApprovePO.put("po_no", PONumber);
        ApprovePO.put("user", getUserData(userListResponse));
        try (FileWriter file = new FileWriter(approvePOTestData)) {
            file.write(prettyPrint(ApprovePO.toString()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void generateCreateGRData(String CreateGRTestData, String UserListResponse, String POTestData, String PRResponse, String integrationLocation) throws Exception {
        int upperbound = 9999;
        int int_random = random(upperbound);
        JSONObject createGRData = readJSONObject(CreateGRTestData);
        createGRData.put("no", "GR/" + getGRDate() + "/" + int_random);
        createGRData.put("po_no", getPONumber(POTestData));
        createGRData.put("received_at", getRFQDate(0) + " 00:00");
        createGRData.put("receiver", getUserData(UserListResponse));
        createGRData.put("location_id", integrationLocation);
        createGRData.put("items", getGRItems(PRResponse, integrationLocation));
        try (FileWriter file = new FileWriter(CreateGRTestData)) {
            file.write(prettyPrint(createGRData.toJSONString()));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    protected JSONArray getGRItems(String PRResponseData, String integrationLocation) throws IOException, ParseException {
        JSONObject PRResponse = (JSONObject) readJSONObject(PRResponseData).get("data");
        JSONArray PRItemsArray = (JSONArray) PRResponse.get("items");
        JSONObject GRItemsObject;
        HashMap<Integer, JSONObject> PRItemsObject = new HashMap<>();
        JSONArray GRItemsArray = new JSONArray();
        for (int i = 0; i < PRItemsArray.size(); i++) {
            GRItemsObject = new JSONObject();
            GRItemsObject.clear();
            PRItemsObject.put(i, (JSONObject) PRItemsArray.get(i));
            GRItemsObject.put("name", PRItemsObject.get(i).get("name"));
            GRItemsObject.put("material_number", PRItemsObject.get(i).get("material_number"));
            GRItemsObject.put("uom", PRItemsObject.get(i).get("uom"));
            GRItemsObject.put("pr_id", PRResponse.get("pr_no"));
            GRItemsObject.put("pr_item_id", PRItemsObject.get(i).get("pr_item_id"));
            GRItemsObject.put("quantity", PRItemsObject.get(i).get("quantity"));
            GRItemsObject.put("receive_status", 1);
            GRItemsObject.put("receive_note", "item received");
            GRItemsObject.put("location_id", integrationLocation);
            GRItemsObject.put("received_at", getRFQDate(0) + " 12:00");
            GRItemsArray.add(i, GRItemsObject);
        }
        return GRItemsArray;
    }

    protected void generateCreateInvoiceData(String createInvoiceTestData, String companyListResponse, String userListResponse, String createGRTestData) throws IOException, ParseException {
        int upperbound = 9999;
        int int_random = random(upperbound);
        String invoiceNumber = "INV/" + getPRDate() + "/VENDOR/" + int_random;
        String sellerInvoiceNumber = "INV/" + getPRDate() + "/FROMSELLER/" + int_random;
        JSONObject createInvoice = readJSONObject(createInvoiceTestData);
        JSONArray GRItems = (JSONArray) readJSONObject(createGRTestData).get("items");
        JSONObject GRItemsObject = (JSONObject) GRItems.get(0);
        JSONObject invoiceItemsObject;
        JSONArray invoiceItemsArray = new JSONArray();

        invoiceItemsObject = new JSONObject();
        invoiceItemsObject.clear();
        invoiceItemsObject.put("item_internal_id", GRItemsObject.get("pr_item_id"));
        invoiceItemsObject.put("name", GRItemsObject.get("name"));
        invoiceItemsObject.put("material_number", GRItemsObject.get("material_number"));
        invoiceItemsObject.put("uom", GRItemsObject.get("uom"));
        invoiceItemsObject.put("unit_cost", env.IntegrationUnitCost());
        invoiceItemsObject.put("quantity", env.IntegrationQuantity());
        invoiceItemsObject.put("sub_total", env.IntegrationUnitCost() * env.IntegrationQuantity());
        invoiceItemsObject.put("down_payment", getPaymentTermID());
        invoiceItemsObject.put("freight", env.IntegrationFreight());
        invoiceItemsObject.put("misc", env.IntegrationMisc());
        invoiceItemsObject.put("tax", env.IntegrationTax());
        invoiceItemsObject.put("discount", env.IntegrationDiscount());
        int total = (env.IntegrationUnitCost() * env.IntegrationQuantity()) +
                env.IntegrationFreight() +
                env.IntegrationMisc() +
                env.IntegrationTax() -
                env.IntegrationDiscount();
        invoiceItemsObject.put("total", total);

        JSONArray PRArray = new JSONArray();
        PRArray.add(readJSONObject(createGRTestData).get("po_no"));
        invoiceItemsObject.put("purchase_orders", PRArray);

        JSONArray GRArray = new JSONArray();
        GRArray.add(readJSONObject(createGRTestData).get("no").toString());
        invoiceItemsObject.put("goods_receiveds", GRArray);

        invoiceItemsObject.put("notes", "create invoice test");
        invoiceItemsObject.put("description", "automation");
        invoiceItemsArray.add(invoiceItemsObject);


        createInvoice.put("items", invoiceItemsArray);
        createInvoice.put("invoice_no", invoiceNumber);
        createInvoice.put("seller_invoice_no", sellerInvoiceNumber);
        createInvoice.put("vendor", getVendorData(companyListResponse));
        createInvoice.put("seller_invoice_date", getRFQDate(0) + " 12:00");
        createInvoice.put("deadline_date", getRFQDate(14) + " 12:00");
        createInvoice.put("created_by", getUserData(userListResponse));
        createInvoice.put("total", total);
        createInvoice.put("note", "create invoice test");
        createInvoice.put("payment_terms", getPaymentTerm());
        try (FileWriter file = new FileWriter(createInvoiceTestData)) {
            file.write(prettyPrint(createInvoice.toJSONString()));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    protected JSONObject getVendorData(String companyListResponse) throws IOException, ParseException {

        JSONObject vendorResponse = (JSONObject) readJSONObject(companyListResponse).get("data");
        JSONArray vendorArray = (JSONArray) vendorResponse.get("vendors");
        JSONObject vendorObject = (JSONObject) vendorArray.get(0);
        JSONObject vendorData = new JSONObject();
        vendorData.put("id", vendorObject.get("id"));
        vendorData.put("NPWP", vendorObject.get("npwp"));
        return vendorData;
    }

    protected long getPaymentTermID() throws IOException, ParseException {
        JSONArray PTDatas = (JSONArray) readJSONObject(env.IntegrationPTListResponse()).get("data");
        JSONObject PTData = (JSONObject) PTDatas.get(0);
        return (long) PTData.get("id");
    }

    protected JSONArray getPaymentTerm() throws IOException, ParseException {
        JSONArray PTDatas = (JSONArray) readJSONObject(env.IntegrationPTListResponse()).get("data");
        JSONObject PTData = (JSONObject) PTDatas.get(0);
        JSONObject returnPTData = new JSONObject();
        returnPTData.put("id", PTData.get("id"));
        returnPTData.put("term", PTData.get("terms"));
        JSONArray returnPTArray = new JSONArray();
        returnPTArray.add(returnPTData);
        return returnPTArray;
    }


    @BeforeTest
    @Parameters({"environment"})
    public static void beforeTest(@Optional("bifrost") String environment) {
        IntegrationBaseMethod.envName = environment;
        ConfigFactory.setProperty("env", environment);
        env = ConfigFactory.create(IntegrationEnvironment.class);
        Log.info("Testing environment: " + env.IntegrationBaseURI());
    }

}
