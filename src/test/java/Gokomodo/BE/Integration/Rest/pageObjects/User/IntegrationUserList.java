package Gokomodo.BE.Integration.Rest.pageObjects.User;

import Gokomodo.BE.Rest.controllers.IntegrationBaseMethod;
import io.qameta.allure.Step;
import org.json.simple.parser.ParseException;

import java.io.IOException;



public class IntegrationUserList extends IntegrationBaseMethod {

    @Step("As a user, I want to check the list of users on my company")
    public IntegrationUserList getUserList() throws IOException, ParseException {
        setBaseURI(env.IntegrationBaseURI());

        httpGet(env.IntegrationUserListPath(),
                getIntegrationAccessToken(env.IntegrationAuthLoginResponseFileLocation()));

        writeResponseBody(env.IntegrationUserListResponse());
        return this;
    }

    @Step("As a user, I want to get the correct status code")
    public IntegrationUserList assertStatusCode() {
        assertStatusCode(200);
        return this;
    }

    @Step("As a user, I want to get the correct response body")
    public IntegrationUserList assertBody() throws IOException, ParseException {
        jsonSchemaCheck(env.IntegrationUserListResponse(),env.IntegrationUserListSchema());
        return this;
    }

    @Step("As a user, I want to get the correct content type")
    public IntegrationUserList assertContentType() {
        assertContentType(env.JSONContentType());
        return this;
    }


}
