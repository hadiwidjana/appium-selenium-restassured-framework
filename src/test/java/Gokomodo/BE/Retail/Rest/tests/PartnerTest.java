package Gokomodo.BE.Retail.Rest.tests;

import Gokomodo.BE.Retail.Rest.pageObjects.Auth.RetailLogin;
import Gokomodo.BE.Retail.Rest.pageObjects.Partner.CreatePartner;
import Gokomodo.BE.Retail.Rest.pageObjects.Partner.FindById;
import Gokomodo.GlobalMethod.Logger.Log;
import io.qameta.allure.Description;
import org.json.simple.parser.ParseException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.lang.reflect.Method;

public class PartnerTest {
    Test test;

    @BeforeMethod
    public void beforeMethod(Method method) {
        test = method.getAnnotation(Test.class);
        Log.info("===============================================");
        Log.info(test.description());
        Log.info("===============================================");
    }

    @Description("Login Authentication")
    @Test(description = "Rest API Test of Login Authentication", priority = 1)
    public void loginUser() throws IOException, ParseException {
        RetailLogin retailLogin = new RetailLogin();
        retailLogin.postAuthUserLogin().assertAuthStatusCode().assertAuthBody().assertAuthContentType();
    }

    @Description("Create Partner")
    @Test(description = "Rest API Test of Create Partner", priority = 2)
    public void createPartner() throws IOException, ParseException {
        CreatePartner createPartner = new CreatePartner();
        createPartner.postNewPartner().assertStatusCode().assertBody().assertContentType();
    }

    @Description("Find Partner by ID")
    @Test(description = "Rest API Test of Find Partner by ID", priority = 3)
    public void findPartnerById() throws IOException, ParseException {
        FindById findById = new FindById();
        findById.findPartnerByID().assertStatusCode().assertBody().assertContentType();
    }
}
