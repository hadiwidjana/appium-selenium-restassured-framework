package frmwrk.be.restapi.pageObjects.Invoice;

import frmwrk.be.restapi.IntegrationBaseMethod;
import io.qameta.allure.Step;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public class IntegrationCreateInvoice extends IntegrationBaseMethod {
    @Step("As a user, I want to create goods received")
    public IntegrationCreateInvoice postCreateInvoice() throws Exception {
        setBaseURI(env.IntegrationBaseURI());

        generateCreateInvoiceData(env.IntegrationCreateInvoiceTestData(),
                env.IntegrationCompanyListResponse(),
                env.IntegrationUserListResponse(),
                env.IntegrationCreateGRTestData());

        httpPost(env.IntegrationCreateInvoicePath(),
                env.IntegrationCreateInvoiceTestData(),
                env.JSONContentType(),
                getIntegrationAccessToken(env.IntegrationAuthLoginResponseFileLocation()));

        writeResponseBody(env.IntegrationCreateInvoiceResponse());
        return this;
    }

    @Step("As a user, I want to get the correct status code")
    public IntegrationCreateInvoice assertStatusCode() {
        assertStatusCode(200);
        return this;
    }

    @Step("As a user, I want to get the correct response body")
    public IntegrationCreateInvoice assertBody() throws IOException, ParseException {
        jsonSchemaCheck(env.IntegrationCreateInvoiceResponse(), env.IntegrationCreateInvoiceSchema());
        return this;
    }

    @Step("As a user, I want to get the correct content type")
    public IntegrationCreateInvoice assertContentType() {
        assertContentType(env.JSONContentType());
        return this;
    }
}
