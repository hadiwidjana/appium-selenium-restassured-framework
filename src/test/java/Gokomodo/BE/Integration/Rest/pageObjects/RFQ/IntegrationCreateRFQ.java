package Gokomodo.BE.Integration.Rest.pageObjects.RFQ;

import Gokomodo.BE.Rest.controllers.IntegrationBaseMethod;
import io.qameta.allure.Step;
import org.json.simple.parser.ParseException;

import java.io.IOException;



public class IntegrationCreateRFQ extends IntegrationBaseMethod {

    @Step("As a user, I want to check the list of users on my company")
    public IntegrationCreateRFQ postCreateRFQ() throws IOException, ParseException {
        setBaseURI(env.IntegrationBaseURI());

        generateRFQData(env.IntegrationCreatePRResponse(),
                env.IntegrationCreateRFQTestData(),
                env.IntegrationUserListResponse(),
                env.IntegrationLocation());

        httpPost(env.IntegrationCreateRFQPath(),
                env.IntegrationCreateRFQTestData(),
                env.JSONContentType(),
                getIntegrationAccessToken(env.IntegrationAuthLoginResponseFileLocation()));

        writeResponseBody(env.IntegrationCreateRFQResponse());
        return this;
    }

    @Step("As a user, I want to get the correct status code")
    public IntegrationCreateRFQ assertStatusCode() {
        assertStatusCode(200);
        return this;
    }

    @Step("As a user, I want to get the correct response body")
    public IntegrationCreateRFQ assertBody() throws IOException, ParseException {
        jsonSchemaCheck(env.IntegrationCreateRFQResponse(),env.IntegrationCreateRFQSchema());
        return this;
    }

    @Step("As a user, I want to get the correct content type")
    public IntegrationCreateRFQ assertContentType() {
        assertContentType(env.JSONContentType());
        return this;
    }
}
