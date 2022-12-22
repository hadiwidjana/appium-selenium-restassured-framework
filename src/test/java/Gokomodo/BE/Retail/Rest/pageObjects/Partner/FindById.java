package Gokomodo.BE.Retail.Rest.pageObjects.Partner;

import Gokomodo.BE.Rest.controllers.MainBaseMethod;
import Gokomodo.BE.Rest.controllers.RetailBaseMethod;
import io.qameta.allure.Step;
import org.json.simple.parser.ParseException;

import java.io.IOException;

import static Gokomodo.BE.Rest.controllers.RestInitMethod.*;

public class FindById extends RetailBaseMethod {

    @Step("As a dev, I want to get partner by its ID")
    public FindById findPartnerByID() throws IOException, ParseException {
        setBaseURI(retailBaseURI);
        httpGet(retailPartnerPath + "/" + getRetailID(retailCreatePartnerResponseLocation) , getRetailAccessToken(retailTokenFileLocation));
        return this;
    }

    @Step("As a dev, I want to get the correct status code")
    public FindById assertStatusCode() {
        assertStatusCode(200);
        return this;
    }

    @Step("As a dev, I want to get the correct response body")
    public FindById assertBody() {
        assertBodyContain("OwnerName");
        assertBodyContain("WarehousesOwned");
        assertBodyContain("FeaturedProducts");
        return this;
    }

    @Step("As a dev, I want to get the correct content type")
    public FindById assertContentType() {
        assertContentType(jsonContentType);
        return this;
    }
}
