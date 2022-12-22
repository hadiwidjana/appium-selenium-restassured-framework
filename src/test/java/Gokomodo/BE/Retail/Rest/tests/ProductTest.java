package Gokomodo.BE.Retail.Rest.tests;

import Gokomodo.BE.Retail.Rest.pageObjects.Auth.RetailLogin;
import Gokomodo.BE.Retail.Rest.pageObjects.Product.CreateProduct;
import Gokomodo.BE.Retail.Rest.pageObjects.Product.FindById;
import Gokomodo.GlobalMethod.Logger.Log;
import io.qameta.allure.Description;
import org.json.simple.parser.ParseException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.lang.reflect.Method;

public class ProductTest {

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

    @Description("Create product")
    @Test(description = "Rest API Test of Create Product", priority = 2)
    public void createProduct() throws IOException, ParseException {
        CreateProduct createProduct = new CreateProduct();
        createProduct.postNewProduct().assertStatusCode().assertBody().assertContentType();
    }

    @Description("Find product")
    @Test(description = "Rest API Test of Find Product by ID", priority = 3)
    public void findProductById() throws IOException, ParseException {
        FindById findById = new FindById();
        findById.findProductByID().assertStatusCode().assertBody().assertContentType();
    }
}
