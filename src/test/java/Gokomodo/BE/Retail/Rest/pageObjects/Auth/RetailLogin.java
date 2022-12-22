package Gokomodo.BE.Retail.Rest.pageObjects.Auth;

import Gokomodo.BE.Rest.controllers.RetailBaseMethod;
import io.qameta.allure.Step;
import org.json.simple.parser.ParseException;

import java.io.IOException;

import static Gokomodo.BE.Rest.controllers.RestInitMethod.*;

public class RetailLogin extends RetailBaseMethod {

    @Step("As a dev, I input login credential")
    public RetailLogin postAuthUserLogin() throws IOException, ParseException {
        setBaseURI(retailBaseURI);
        httpPost(retailAuthLoginTestDataLocation,jsonContentType,retailAuthLoginPath);
        writeResponseBody(retailTokenFileLocation);
        return this;
    }

    @Step("As a dev, I want to get the correct status code")
    public RetailLogin assertAuthStatusCode() {
        assertStatusCode(200);
        return this;
    }

    @Step("As a dev, I want to get the correct response body")
    public RetailLogin assertAuthBody() throws IOException, ParseException {
        assertBodyContain("AccessToken");
        assertBodyContain("RefreshToken");
        jsonSchemaCheck(retailTokenFileLocation,retailAuthLoginSchemaLocation);
        return this;
    }

    @Step("As a dev, I want to get the correct content type")
    public RetailLogin assertAuthContentType() {
        assertContentType(jsonContentType);
        return this;
    }
}
