package Gokomodo.BE.Retail.Rest.pageObjects.Partner;

import Gokomodo.BE.Rest.controllers.MainBaseMethod;
import Gokomodo.BE.Rest.controllers.RetailBaseMethod;
import io.qameta.allure.Step;
import org.json.simple.parser.ParseException;

import java.io.IOException;

import static Gokomodo.BE.Rest.controllers.RestInitMethod.*;

public class CreatePartner extends RetailBaseMethod {

    @Step("As a dev, I want to create a partner")
    public CreatePartner postNewPartner() throws IOException, ParseException {
        setBaseURI(retailBaseURI);
        httpPost(retailCreatePartnerLocation,jsonContentType,retailPartnerPath,getRetailAccessToken(retailTokenFileLocation));
        writeResponseBody(retailCreatePartnerResponseLocation);
        return this;
    }

    @Step("As a dev, I want to get the correct status code")
    public CreatePartner assertStatusCode() {
        assertStatusCode(201);
        return this;
    }

    @Step("As a dev, I want to get the correct response body")
    public CreatePartner assertBody() {
        assertBodyContain("Data");
        assertBodyContain("Message");
        return this;
    }

    @Step("As a dev, I want to get the correct content type")
    public CreatePartner assertContentType() {
        assertContentType(jsonContentType);
        return this;
    }
}
