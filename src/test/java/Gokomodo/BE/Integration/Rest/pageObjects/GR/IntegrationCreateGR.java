package Gokomodo.BE.Integration.Rest.pageObjects.GR;

import Gokomodo.BE.Rest.controllers.IntegrationBaseMethod;
import io.qameta.allure.Step;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public class IntegrationCreateGR extends IntegrationBaseMethod {
    @Step("As a user, I want to create goods received")
    public IntegrationCreateGR postCreateGR() throws Exception {
        setBaseURI(env.IntegrationBaseURI());

        generateCreateGRData(env.IntegrationCreateGRTestData(),
                env.IntegrationUserListResponse(),
                env.IntegrationCreatePOTestData(),
                env.IntegrationCreatePRResponse(),
                env.IntegrationLocation());

        httpPost(env.IntegrationCreateGRPath(),
                env.IntegrationCreateGRTestData(),
                env.JSONContentType(),
                getIntegrationAccessToken(env.IntegrationAuthLoginResponseFileLocation()));

        writeResponseBody(env.IntegrationCreateGRResponse());
        return this;
    }

    @Step("As a user, I want to get the correct status code")
    public IntegrationCreateGR assertStatusCode() {
        assertStatusCode(200);
        return this;
    }

    @Step("As a user, I want to get the correct response body")
    public IntegrationCreateGR assertBody() throws IOException, ParseException {
        jsonSchemaCheck(env.IntegrationCreateGRResponse(), env.IntegrationCreateGRSchema());
        return this;
    }

    @Step("As a user, I want to get the correct content type")
    public IntegrationCreateGR assertContentType() {
        assertContentType(env.JSONContentType());
        return this;
    }
}
