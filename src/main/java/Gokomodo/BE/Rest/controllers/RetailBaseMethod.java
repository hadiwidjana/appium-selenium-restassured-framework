package Gokomodo.BE.Rest.controllers;

import Gokomodo.GlobalMethod.Logger.Log;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public class RetailBaseMethod extends MainBaseMethod{

    private JSONObject loginResponse;
    private JSONObject tokenData;
    private String accessToken;
    private String productID;

    /**
     * Get access token from file
     *
     * @return access token string
     */

    protected String getRetailAccessToken(String tokenLocation) throws IOException, ParseException {
        loginResponse = readJSONObject(tokenLocation);
        tokenData = (JSONObject) loginResponse.get("Data");
        return accessToken = tokenData.get("AccessToken").toString();
    }


    /**
     * Get product ID from file
     *
     * @param IDLocation file location of the ID
     * @return product ID string
     */

    protected String getRetailID(String IDLocation) throws IOException, ParseException {
        loginResponse = readJSONObject(IDLocation);
        productID = loginResponse.get("Data").toString();
        Log.info("Product ID: " + productID);
        return productID;
    }
}
