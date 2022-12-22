package Gokomodo.BE.Retail.Rest.pageObjects.Product;

import Gokomodo.BE.Rest.controllers.MainBaseMethod;
import Gokomodo.BE.Rest.controllers.RetailBaseMethod;
import io.qameta.allure.Step;
import org.json.simple.parser.ParseException;

import java.io.IOException;

import static Gokomodo.BE.Rest.controllers.RestInitMethod.*;

public class FindById extends RetailBaseMethod {

    @Step("As a dev, I input login credential")
    public FindById findProductByID() throws IOException, ParseException {
        setBaseURI(retailBaseURI);
        httpGet(retailProductPath + "/" + getRetailID(retailCreateProductResponseLocation) , getRetailAccessToken(retailTokenFileLocation));
        return this;
    }

    @Step("As a dev, I want to get the correct status code")
    public FindById assertStatusCode() {
        assertStatusCode(200);
        return this;
    }

    @Step("As a dev, I want to get the correct response body")
    public FindById assertBody() {
        assertBodyContain("ID");
        assertBodyContain("Code");
        assertBodyContain("Name");
        assertBodyContain("Category");
        assertBodyContain("BasePrice");
        assertBodyContain("LastUpdatedBy");
        assertBodyContain("Variants");
        assertBodyContain("UpdatedAt");
        return this;
    }

    @Step("As a dev, I want to get the correct content type")
    public FindById assertContentType() {
        assertContentType(jsonContentType);
        return this;
    }
}
