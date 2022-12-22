package frmwrk.be.restapi.pageObjects.TC;

import frmwrk.be.restapi.IntegrationBaseMethod;
import io.qameta.allure.Step;
import org.json.simple.parser.ParseException;

import java.io.IOException;


public class IntegrationExportTC extends IntegrationBaseMethod {

    @Step("As a admin, I want to export a TC")
    public IntegrationExportTC putExportTC() throws IOException, ParseException {
        setBaseURI(env.IntegrationBaseURI());

        generateExportTCData(env.IntegrationExportTCTestData(),
                env.IntegrationTCListResponse());

        httpPutArray(env.IntegrationExportTCPath(),
                env.IntegrationExportTCTestData(),
                env.JSONContentType(),
                getIntegrationAccessToken(env.IntegrationAuthLoginResponseFileLocation()));

        writeResponseBody(env.IntegrationExportTCResponse());
        return this;
    }

    @Step("As a user, I want to get the correct status code")
    public IntegrationExportTC assertStatusCode() {
        assertStatusCode(200);
        return this;
    }

    @Step("As a user, I want to get the correct response body")
    public IntegrationExportTC assertBody() throws IOException, ParseException {
        jsonSchemaCheck(env.IntegrationExportTCResponse(),env.IntegrationExportTCSchema());
        return this;
    }

    @Step("As a user, I want to get the correct content type")
    public IntegrationExportTC assertContentType() {
        assertContentType(env.JSONContentType());
        return this;
    }

}
