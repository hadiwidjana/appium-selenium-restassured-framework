package frmwrk.be.restapi.pageObjects.PO;

import frmwrk.be.restapi.IntegrationBaseMethod;
import io.qameta.allure.Step;
import org.json.simple.parser.ParseException;

import java.io.IOException;


public class IntegrationApprovePO extends IntegrationBaseMethod {
    @Step("As a user, I want to check the list of users on my company")
    public IntegrationApprovePO putApprovePO() throws IOException, ParseException {
        setBaseURI(env.IntegrationBaseURI());

        generateApprovePOData(env.IntegrationApprovePOTestData(),
                env.IntegrationCreatePOTestData(),
                env.IntegrationUserListResponse());

        httpPut(env.IntegrationApprovePOPath() ,
                env.IntegrationApprovePOTestData(),
                env.JSONContentType(),
                getIntegrationAccessToken(env.IntegrationAuthLoginResponseFileLocation()));

        writeResponseBody(env.IntegrationApprovePOResponse());
        return this;
    }

    @Step("As a user, I want to get the correct status code")
    public IntegrationApprovePO assertStatusCode() {
        assertStatusCode(200);
        return this;
    }

    @Step("As a user, I want to get the correct response body")
    public IntegrationApprovePO assertBody() throws IOException, ParseException {
        jsonSchemaCheck(env.IntegrationApprovePOResponse(),
                env.IntegrationApprovePOSchema());
        return this;
    }

    @Step("As a user, I want to get the correct content type")
    public IntegrationApprovePO assertContentType() {
        assertContentType(env.JSONContentType());
        return this;
    }
}
