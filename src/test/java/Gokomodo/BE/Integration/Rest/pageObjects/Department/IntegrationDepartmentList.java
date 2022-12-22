package Gokomodo.BE.Integration.Rest.pageObjects.Department;

import Gokomodo.BE.Integration.Rest.pageObjects.User.IntegrationUserList;
import Gokomodo.BE.Rest.controllers.IntegrationBaseMethod;
import io.qameta.allure.Step;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public class IntegrationDepartmentList extends IntegrationBaseMethod {

    @Step("As a user, I want to check the list of departments on my company")
    public IntegrationDepartmentList getDepartmentList() throws IOException, ParseException {
        setBaseURI(env.IntegrationBaseURI());

        httpGet(env.IntegrationDepartmentListPath(),
                getIntegrationAccessToken(env.IntegrationAuthLoginResponseFileLocation()));

        writeResponseBody(env.IntegrationDepartmentListResponse());
        return this;
    }

    @Step("As a user, I want to get the correct status code")
    public IntegrationDepartmentList assertStatusCode() {
        assertStatusCode(200);
        return this;
    }

    @Step("As a user, I want to get the correct response body")
    public IntegrationDepartmentList assertBody() throws IOException, ParseException {
        jsonSchemaCheck(env.IntegrationDepartmentListResponse(),env.IntegrationDepartmentListSchema());
        return this;
    }

    @Step("As a user, I want to get the correct content type")
    public IntegrationDepartmentList assertContentType() {
        assertContentType(env.JSONContentType());
        return this;
    }
}
