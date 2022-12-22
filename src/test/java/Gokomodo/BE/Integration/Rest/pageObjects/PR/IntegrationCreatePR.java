package Gokomodo.BE.Integration.Rest.pageObjects.PR;

import Gokomodo.BE.Rest.controllers.IntegrationBaseMethod;
import io.qameta.allure.Step;
import org.json.simple.parser.ParseException;

import java.io.IOException;



public class IntegrationCreatePR extends IntegrationBaseMethod {

    @Step("As a user, I want to check the list of users on my company")
    public IntegrationCreatePR postCreatePR() throws IOException, ParseException {
        setBaseURI(env.IntegrationBaseURI());

        generatePRData(env.IntegrationCreatePRTestData(),
                env.IntegrationLocation(),
                env.IntegrationUserListResponse());

        httpPost(env.IntegrationCreatePRPath(),
                env.IntegrationCreatePRTestData(),
                env.JSONContentType(),
                getIntegrationAccessToken(env.IntegrationAuthLoginResponseFileLocation()));

        writeResponseBody(env.IntegrationCreatePRResponse());
        return this;
    }

    @Step("As a user, I want to get the correct status code")
    public IntegrationCreatePR assertStatusCode() {
        assertStatusCode(200);
        return this;
    }

    @Step("As a user, I want to get the correct response body")
    public IntegrationCreatePR assertBody() throws IOException, ParseException {
        jsonSchemaCheck(env.IntegrationCreatePRResponse(),env.IntegrationCreatePRSchema());
        return this;
    }

    @Step("As a user, I want to get the correct content type")
    public IntegrationCreatePR assertContentType() {
        assertContentType(env.JSONContentType());
        return this;
    }
}
