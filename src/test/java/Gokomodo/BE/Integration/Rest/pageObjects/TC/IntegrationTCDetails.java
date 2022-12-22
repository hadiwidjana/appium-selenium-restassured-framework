package Gokomodo.BE.Integration.Rest.pageObjects.TC;

import Gokomodo.BE.Rest.controllers.IntegrationBaseMethod;
import io.qameta.allure.Step;
import org.json.simple.parser.ParseException;

import java.io.IOException;


public class IntegrationTCDetails extends IntegrationBaseMethod {
    @Step("As a user, I want to check the details of a TC")
    public IntegrationTCDetails getTCDetail() throws IOException, ParseException {
        setBaseURI(env.IntegrationBaseURI());

        httpGet(env.IntegrationTCListPath()+"/"+getTCID(env.IntegrationTCListResponse()),
                getIntegrationAccessToken(env.IntegrationAuthLoginResponseFileLocation()));

        writeResponseBody(env.IntegrationTCDetailsResponse());
        return this;
    }

    @Step("As a user, I want to get the correct status code")
    public IntegrationTCDetails assertStatusCode() {
        assertStatusCode(200);
        return this;
    }

    @Step("As a user, I want to get the correct response body")
    public IntegrationTCDetails assertBody() throws IOException, ParseException {
        jsonSchemaCheck(env.IntegrationTCDetailsResponse(),env.IntegrationTCDetailsSchema());
        return this;
    }

    @Step("As a user, I want to get the correct content type")
    public IntegrationTCDetails assertContentType() {
        assertContentType(env.JSONContentType());
        return this;
    }
}
