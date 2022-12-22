package frmwrk.be.restapi.pageObjects.Company;

import frmwrk.be.restapi.IntegrationBaseMethod;
import io.qameta.allure.Step;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public class IntegrationCompanyList extends IntegrationBaseMethod {
    @Step("As a user, I want to get company list")
    public IntegrationCompanyList getCompanyListById() throws IOException, ParseException {
        setBaseURI(env.IntegrationBaseURI());
        httpGet(env.IntegrationCompanyListPath()+"?id=1893",getIntegrationAccessToken(env.IntegrationAuthLoginResponseFileLocation()));
        writeResponseBody(env.IntegrationCompanyListResponse());
        return this;
    }

    @Step("As a user, I want to get the correct status code")
    public IntegrationCompanyList assertStatusCode() {
        assertStatusCode(200);
        return this;
    }

    @Step("As a user, I want to get the correct response body")
    public IntegrationCompanyList assertBody() throws IOException, ParseException {
        jsonSchemaCheck(env.IntegrationCompanyListResponse(),env.IntegrationCompanyListSchema());
        return this;
    }

    @Step("As a user, I want to get the correct content type")
    public IntegrationCompanyList assertContentType() {
        assertContentType(env.JSONContentType());
        return this;
    }
}
