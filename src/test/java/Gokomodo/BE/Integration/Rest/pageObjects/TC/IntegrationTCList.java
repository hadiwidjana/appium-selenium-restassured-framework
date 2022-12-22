package Gokomodo.BE.Integration.Rest.pageObjects.TC;

import Gokomodo.BE.Rest.controllers.IntegrationBaseMethod;
import io.qameta.allure.Step;
import org.json.simple.parser.ParseException;

import java.io.IOException;



public class IntegrationTCList extends IntegrationBaseMethod {

    @Step("As a user, I want to see the list of TC created")
    public IntegrationTCList getTCList() throws IOException, ParseException {
        setBaseURI(env.IntegrationBaseURI());

        httpGet(env.IntegrationTCListPath(),
                getIntegrationAccessToken(env.IntegrationAuthLoginResponseFileLocation()),
                getIntegrationTCQueryParameter(env.IntegrationCreateRFQResponse()));

        writeResponseBody(env.IntegrationTCListResponse());
        return this;
    }

    @Step("As a user, I want to get the correct status code")
    public IntegrationTCList assertStatusCode() {
        assertStatusCode(200);
        return this;
    }

    @Step("As a user, I want to get the correct response body")
    public IntegrationTCList assertBody() throws IOException, ParseException {
        jsonSchemaCheck(env.IntegrationTCListResponse(),env.IntegrationTCListSchema());
        return this;
    }

    @Step("As a user, I want to get the correct content type")
    public IntegrationTCList assertContentType() {
        assertContentType(env.JSONContentType());
        return this;
    }
}
