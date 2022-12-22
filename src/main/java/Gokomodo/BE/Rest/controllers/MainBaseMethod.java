package Gokomodo.BE.Rest.controllers;

import Gokomodo.GlobalMethod.Logger.Log;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.Assert;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Random;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.MatcherAssert.assertThat;

public class MainBaseMethod {
    private static JSONParser parser;
    private static Reader reader;
    private JSONObject readJson;
    private JSONArray readJsonArray;
    private Response response;
    private String writeJson;


    /**
     * http request query JSON path
     *
     * @param path query JSON path
     * @return returns httpRequest
     */
    protected JsonPath httpGetPath(String path) {
        return RestAssured.given()
                .when()
                .get(path)
                .then()
                .assertThat()
                .statusCode(200)
                .assertThat()
                .extract().body().jsonPath();
    }

    /**
     * http request with parameter
     *
     * @param JSONPath body test data file location
     * @param contentType body content type
     * @return returns httpRequest
     */
    private RequestSpecification httpRequestPost(String JSONPath, String contentType) throws IOException, ParseException {
        readJson = readJSONObject(JSONPath);
        return RestAssured
                .given()
                .filter(new AllureRestAssured())
                .with()
                .contentType(contentType)
                .with()
                .body(readJson.toJSONString());
    }

    /**
     * http post request with parameter and bearer token
     *
     * @param JSONPath body test data file location
     * @param contentType body content type
     * @return returns httpRequest
     */
    private RequestSpecification httpRequestPost(String JSONPath, String contentType, String accessToken) throws IOException, ParseException {
        readJson = readJSONObject(JSONPath);
        return RestAssured
                .given()
                .header("Authorization", "Bearer " + accessToken)
                .filter(new AllureRestAssured())
                .with()
                .contentType(contentType)
                .with()
                .body(readJson.toJSONString());
    }

    /**
     * http post request with parameter and bearer token
     *
     * @param JSONPath body test data file location
     * @param contentType body content type
     * @return returns httpRequest
     */
    private RequestSpecification httpRequestPostArray(String JSONPath, String contentType, String accessToken) throws IOException, ParseException {
        readJsonArray = readJSONArray(JSONPath);
        return RestAssured
                .given()
                .header("Authorization", "Bearer " + accessToken)
                .filter(new AllureRestAssured())
                .with()
                .contentType(contentType)
                .with()
                .body(readJsonArray.toJSONString());
    }

    /**
     * http request with parameter
     *
     * @return returns httpRequest
     */
    private RequestSpecification httpRequest() {
        return RestAssured
                .given()
                .filter(new AllureRestAssured())
                .with()
                .contentType(ContentType.JSON);
    }

    /**
     * http request with parameter and bearer token
     *
     * @param accessToken access token
     * @return returns httpRequest
     */
    private RequestSpecification httpRequest(String accessToken) {
        return RestAssured
                .given()
                .header("Authorization", "Bearer " + accessToken)
                .filter(new AllureRestAssured())
                .with()
                .contentType(ContentType.JSON);
    }


    /**
     * Set base uri
     *
     * @param baseURI baseUri
     */
    protected void setBaseURI(String baseURI) {
        RestAssured.baseURI = baseURI;
    }

    /**
     * Set base path
     *
     * @param basePathTerm basepath
     */
    protected void setBasePath(String basePathTerm) {
        RestAssured.basePath = basePathTerm;
    }

    /**
     * reset base uri
     */
    protected void resetBaseURI() {
        RestAssured.baseURI = null;
    }

    /**
     * Reset base path
     */
    protected void resetBasePath() {
        RestAssured.basePath = null;
    }

    /**
     * http post
     *
     * @param JSONPath body test data file location
     * @param contentType body content type
     * @param path   endpoint
     * @return response
     */
    protected void httpPost(String path, String JSONPath, String contentType ) throws IOException, ParseException {
        response = httpRequestPost(JSONPath,contentType).request(Method.POST, path);
        Log.info("REQUEST INFO");
        Log.info("Request type: POST");
        Log.info("URI: " + RestAssured.baseURI + path);
        Log.info("Request body: " + readJSONObject(JSONPath).toJSONString());
        Log.info("-----------------------------------------------");
        Log.info("RESPONSE INFO");
    }

    /**
     * http post with access token
     *
     * @param JSONPath body test data file location
     * @param contentType body content type
     * @param path   endpoint
     * @return response
     */
    protected void httpPost(String path, String JSONPath, String contentType, String accessToken) throws IOException, ParseException {
        response = httpRequestPost(JSONPath,contentType,accessToken).request(Method.POST, path);
        Log.info("REQUEST INFO");
        Log.info("Request type: POST");
        Log.info("URI: " + RestAssured.baseURI + path);
        Log.info("Request body: " + readJSONObject(JSONPath).toJSONString());
        Log.info("-----------------------------------------------");
        Log.info("RESPONSE INFO");
    }

    /**
     * http get
     *
     * @param path endpoint
     * @return response
     */
    protected void httpGet(String path) {
        response = httpRequest().request(Method.GET, path);
        Log.info("REQUEST INFO");
        Log.info("Request type: GET");
        Log.info("URI: " + RestAssured.baseURI + path);
        Log.info("-----------------------------------------------");
        Log.info("RESPONSE INFO");
    }

    /**
     * http get with access token
     *
     * @param path endpoint
     * @return response
     */
    protected void httpGet(String path, String accessToken) {
        response = httpRequest(accessToken).request(Method.GET, path);
        Log.info("REQUEST INFO");
        Log.info("Request type: GET");
        Log.info("URI: " + RestAssured.baseURI + path);
        Log.info("-----------------------------------------------");
        Log.info("RESPONSE INFO");
    }

    /**
     * http get with access token
     *
     * @param path endpoint
     * @param accessToken access token
     * @param param query parameter
     * @return response
     */
    protected void httpGet(String path, String accessToken, String param) {
        response = httpRequest(accessToken).request(Method.GET, path);
        Log.info("REQUEST INFO");
        Log.info("Request type: GET");
        Log.info("URI: " + RestAssured.baseURI + path + param);
        Log.info("-----------------------------------------------");
        Log.info("RESPONSE INFO");
    }

    /**
     * http get with headers
     *
     * @param path    endpoint
     * @param headers headers
     * @return response
     */
    protected Response httpGet(String path, Header headers) {
        return httpRequest()
                .with()
                .header(headers)
                .request(Method.GET, path);
    }



    /**
     * http delete
     *
     * @param path endpoint
     * @return response
     */
    protected Response httpDelete(String path) {
        return httpRequest().request(Method.DELETE, path);
    }

    /**
     * http put
     *
     * @param JSONPath body test data file location
     * @param contentType body content type
     * @param path endpoint
     */
    protected void httpPut(String path, String JSONPath, String contentType, String accessToken) throws IOException, ParseException {
        response = httpRequestPost(JSONPath,contentType,accessToken).request(Method.PUT, path);
        Log.info("REQUEST INFO");
        Log.info("Request type: PUT");
        Log.info("URI: " + RestAssured.baseURI + path);
        Log.info("Request body: " + readJSONObject(JSONPath).toJSONString());
        Log.info("-----------------------------------------------");
        Log.info("RESPONSE INFO");
    }

    /**
     * http put with array test body
     *
     * @param JSONPath body test data file location
     * @param contentType body content type
     * @param path endpoint
     */
    protected void httpPutArray(String path, String JSONPath, String contentType, String accessToken) throws IOException, ParseException {
        response = httpRequestPostArray(JSONPath,contentType,accessToken).request(Method.PUT, path);
        Log.info("REQUEST INFO");
        Log.info("Request type: PUT");
        Log.info("URI: " + RestAssured.baseURI + path);
        Log.info("Request body: " + readJSONArray(JSONPath).toJSONString());
        Log.info("-----------------------------------------------");
        Log.info("RESPONSE INFO");
    }

    /**
     * http patch
     *
     * @param JSONPath body test data file location
     * @param contentType body content type
     * @param path   endpoint
     * @return response
     */
    protected Response httpPatch(String JSONPath, String contentType, String path) throws IOException, ParseException {
        return httpRequestPost(JSONPath,contentType).request(Method.PATCH, path);
    }

    /**
     * Get Status code
     *
     * @param expectedStatusCode expected status code response
     * @return status code
     */

    protected void assertStatusCode(int expectedStatusCode) {
        Assert.assertEquals(response.getStatusCode(),expectedStatusCode);
        Log.info("Status code is: "+ response.getStatusCode());
    }

    /**
     * check response body
     *
     * @param stringContain expected string contained in body
     * @return status code
     */


    protected void assertBodyContain(String stringContain) {
        Log.info("Response body contains " + stringContain);
        Assert.assertTrue(response.getBody().asString().contains(stringContain),"fail");
    }
    /**
     * Get Content Type
     *
     * @param contentType response content type
     * @return contentType
     */
    protected void assertContentType(String contentType) {
        Assert.assertEquals(response.getContentType(), contentType);
        Log.info("Content type is: "+ response.getContentType());
    }

    /**
     * Get headers
     *
     * @param response response
     * @param header   header
     * @return header value
     */
    private String getHeaders(Response response, String header) {
        return response.getHeaders().getValue(header);
    }

    /**
     * Response Body
     *
     * @param response response
     * @return responseBody
     */
    private ResponseBody responseBody(Response response) {
        return response.getBody();
    }

    /**
     * Get Body
     *
     * @param response response
     * @return preety Print
     */
    protected String getBody(Response response) {
        return responseBody(response).prettyPrint();
    }

    /**
     * JsonPath evaluator
     *
     * @param response response
     * @return jsonPath
     */
    protected Object jsonPathEvaluator(Response response, String exp) {
        return response.jsonPath().get(exp);
    }

    /**
     * Read JSON file
     *
     * @param fileLocation JSON file location
     * @return jsonObject
     */
    protected static JSONObject readJSONObject(String fileLocation) throws IOException, ParseException {
        parser = new JSONParser();
        reader = new FileReader(fileLocation);
        JSONObject jsonObject = (JSONObject) parser.parse(reader);
        return jsonObject;
    }

    protected static JSONArray readJSONArray(String fileLocation) throws IOException, ParseException {
        parser = new JSONParser();
        reader = new FileReader(fileLocation);
        JSONArray jsonArray = (JSONArray) parser.parse(reader);
        return jsonArray;
    }

    /**
     * Write JSON file
     *
     * @param fileLocation JSON file location
     * @return jsonObject
     */

    protected void writeResponseBody(String fileLocation){
        writeJson = response.getBody().prettyPrint();
        try(FileWriter file = new FileWriter(fileLocation)){
            file.write(writeJson);
        } catch(IOException e){
            e.printStackTrace();
        }
    }

    /**
     * Validate JSON schema
     *
     * @param responseBodyLocation location of response body file
     * @param responseSchemaLocation location of JSON schema file
     */
    protected void jsonSchemaCheck(String responseBodyLocation, String responseSchemaLocation) throws IOException, ParseException {
        assertThat(readJSONObject(responseBodyLocation).toJSONString(), matchesJsonSchemaInClasspath(responseSchemaLocation));
        Log.info("Response body schema is correct");
    }


    protected String prettyPrint(String uglyString){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonElement je = JsonParser.parseString(uglyString);
        return gson.toJson(je);
    }

    static Random rand;
    public MainBaseMethod(){
        rand = new Random();
    }
    public static int random(int i){
        return rand.nextInt(i);
    }






}
