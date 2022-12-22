package frmwrk.be.restapi.pageObjects.PO;

import frmwrk.be.restapi.IntegrationBaseMethod;
import io.qameta.allure.Step;
import org.json.simple.parser.ParseException;

import java.io.IOException;


public class IntegrationCreatePO extends IntegrationBaseMethod {
    @Step("As a user, I want to check the list of users on my company")
    public IntegrationCreatePO postCreatePO() throws IOException, ParseException {
        setBaseURI(env.IntegrationBaseURI());

        generateCreatePOData(env.IntegrationCreatePOTestData(),
                env.IntegrationUserListResponse());

        httpPost(env.IntegrationTCListPath() + "/" +
                        getTCID(env.IntegrationTCListResponse()) +
                        env.IntegrationCreatePOPath(),
                env.IntegrationCreatePOTestData(),
                env.JSONContentType(),
                getIntegrationAccessToken(env.IntegrationAuthLoginResponseFileLocation()));

        writeResponseBody(env.IntegrationCreatePOResponse());
        return this;
    }

    @Step("As a user, I want to get the correct status code")
    public IntegrationCreatePO assertStatusCode() {
        assertStatusCode(200);
        return this;
    }

    @Step("As a user, I want to get the correct response body")
    public IntegrationCreatePO assertBody() throws IOException, ParseException {
        jsonSchemaCheck(env.IntegrationCreatePOResponse(), env.IntegrationCreatePOSchema());
        return this;
    }

    @Step("As a user, I want to get the correct content type")
    public IntegrationCreatePO assertContentType() {
        assertContentType(env.JSONContentType());
        return this;
    }
}
