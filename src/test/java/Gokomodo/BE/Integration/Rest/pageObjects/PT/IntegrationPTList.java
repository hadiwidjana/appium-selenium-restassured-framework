package Gokomodo.BE.Integration.Rest.pageObjects.PT;

import Gokomodo.BE.Integration.Rest.pageObjects.User.IntegrationUserList;
import Gokomodo.BE.Rest.controllers.IntegrationBaseMethod;
import io.qameta.allure.Step;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public class IntegrationPTList extends IntegrationBaseMethod {

    @Step("As a user, I want to check the list of users on my company")
    public IntegrationPTList getPTList() throws IOException, ParseException {
        setBaseURI(env.IntegrationBaseURI());

        httpGet(env.IntegrationPTListPath(),
                getIntegrationAccessToken(env.IntegrationAuthLoginResponseFileLocation()));

        writeResponseBody(env.IntegrationPTListResponse());
        return this;
    }

    @Step("As a user, I want to get the correct status code")
    public IntegrationPTList assertStatusCode() {
        assertStatusCode(200);
        return this;
    }

    @Step("As a user, I want to get the correct response body")
    public IntegrationPTList assertBody() throws IOException, ParseException {
        jsonSchemaCheck(env.IntegrationPTListResponse(),env.IntegrationPTListSchema());
        return this;
    }

    @Step("As a user, I want to get the correct content type")
    public IntegrationPTList assertContentType() {
        assertContentType(env.JSONContentType());
        return this;
    }
}
