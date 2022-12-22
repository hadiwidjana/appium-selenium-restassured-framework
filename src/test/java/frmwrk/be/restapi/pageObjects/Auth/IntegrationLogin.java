package frmwrk.be.restapi.pageObjects.Auth;

import frmwrk.be.restapi.IntegrationBaseMethod;

import io.qameta.allure.Step;
import org.json.simple.parser.ParseException;
import java.io.IOException;



public class IntegrationLogin extends IntegrationBaseMethod {

    @Step("As a buyer, I input login credential")
    public IntegrationLogin postAuthUserLogin() throws IOException, ParseException {
        setBaseURI(env.IntegrationBaseURI());

        httpPost(env.IntegrationAuthLoginPath(),
                env.IntegrationAuthLoginTestDataLocation(),
                env.JSONContentType());

        writeResponseBody(env.IntegrationAuthLoginResponseFileLocation());

        return this;
    }

    @Step("As a buyer, I want to get the correct status code")
    public IntegrationLogin assertAuthStatusCode() {
        assertStatusCode(200);
        return this;
    }

    @Step("As a buyer, I want to get the correct response body")
    public IntegrationLogin assertAuthBody() throws IOException, ParseException {

        jsonSchemaCheck(env.IntegrationAuthLoginResponseFileLocation(),
                env.IntegrationAuthLoginSchemaLocation());

        assertBodyContain("token");
        assertBodyContain("expire_in");
        return this;
    }

    @Step("As a buyer, I want to get the correct content type")
    public IntegrationLogin assertAuthContentType() {
        assertContentType(env.JSONContentType());
        return this;
    }
}
