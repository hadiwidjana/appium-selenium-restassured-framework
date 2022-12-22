package Gokomodo.FE.Web.Admin.tests.BrandTreatment;

import Gokomodo.FE.Web.Admin.pageObjects.R6.T33168;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class BrandTreatment extends T33168 {
    @Description("Already on edit root category page")
    @Test(description = "The Admin should be able to see Add New Brand section")
    public void T33168()throws Exception {
        Test_T33168().
                InputEmail().
                InputPassword().
                btnLogin().
                hdrmn().
                subhdrmn().
                btnEdit().
                expectedT33168();

    }
    @Description("Already on edit root category page")
    @Test(description = "The Admin should be able to see the Add New Brand popup and there should be shown: Brand Name, Brand Description, Brand Logo, Attachment, Cancel button and Add Brand button")
    public void T33169()throws Exception {
        Test_T33169().
                InputEmail().
                InputPassword().
                btnLogin().
                hdrmn().
                subhdrmn().
                btnEdit().
                addnewbrand().
                expectedT33169();

    }
    @Description("Already on edit root category page")
    @Test(description ="The Admin should be able to input only mandatory field And save the New Brand")
    public void T33170()throws Exception {
        Test_T33170().
                InputEmail().
                InputPassword().
                btnLogin().
                hdrmn().
                subhdrmn().
                btnEdit().
                addnewbrand().
                txtbrndNm().
                txtareabrndNm().
                upldfile().
                //upldfile2().
                btnaddbrand().
                ExpectedT33170();
    }
    @Description("Already on edit root category page")
    @Test(description ="The Admin should be able to upload 1 attachment And save the New Brand")
    public void T33171()throws Exception {
        Test_T33171().
                InputEmail().
                InputPassword().
                btnLogin().
                hdrmn().
                subhdrmn().
                btnEdit().
                addnewbrand().
                txtbrndNm().
                txtareabrndNm().
                upldfile().
                upldfile2().
                ExpectedT33171();
    }
    @Description("Already on edit root category page")
    @Test(description ="The Admin should be able to input only mandatory field And save the New Brand")
    public void T33172()throws Exception {
        Test_T33172().
                InputEmail().
                InputPassword().
                btnLogin().
                hdrmn().
                subhdrmn().
                btnEdit().
                addnewbrand().
                txtbrndNm().
                txtareabrndNm().
                upldfile().
                upldfile2().
                ExpectedT33172();
    }
    @Description("Already on edit root category page")
    @Test(description = "The Admin should not be able to save the New Brand")
    public void T33173()throws Exception {
        Test_T33173().
                InputEmail().
                InputPassword().
                btnLogin().
                hdrmn().
                subhdrmn().
                btnEdit().
                addnewbrand().
                ExpectedT33173();
    }
    @Description("Already add at least 1 brand")
    @Test(description ="The Admin should be able to see the preview new brand")
    public void T33174()throws Exception {
        Test_T33174().
                InputEmail().
                InputPassword().
                btnLogin().
                hdrmn().
                subhdrmn().
                btnEdit().
                addnewbrand().
                txtbrndNm().
                txtareabrndNm().
                upldfile().
                upldfile2().
                btnaddbrand().
                btnSave().
                ExpectedT33174();
    }
    @Description("Already add at least 1 brand")
    @Test(description ="The Admin is should be able to see the preview new brand And Multiple attachment")
    public void T33175()throws Exception {
        Test_T33175().
                InputEmail().
                InputPassword().
                btnLogin().
                hdrmn().
                subhdrmn().
                btnEdit().
                addnewbrand().
                txtbrndNm().
                txtareabrndNm().
                upldfile().
                upldfile2().
                btnaddbrand().
                btnSave().
                ExpectedT33175();
    }
    @Description("Already add at least 1 brand")
    @Test(description ="The Admin is should be able to see the preview new brand And Multiple attachment")
    public void T33176()throws Exception {
        Test_T33176().
                InputEmail().
                InputPassword().
                btnLogin().
                hdrmn().
                subhdrmn().
                btnEdit().
                addnewbrand().
                txtbrndNm().
                txtareabrndNm().
                upldfile().
                upldfile2().
                btnaddbrand().
                btnSave().
                ExpectedT33176();
    }

    @Description("Already add at least 1 brand")
    @Test(description ="The Admin is should be able to see the preview new brand And Multiple attachment")
    public void T33177()throws Exception {
        Test_T33177().
                InputEmail().
                InputPassword().
                btnLogin().
                hdrmn().
                subhdrmn().
                btnEdit().
                addnewbrand().
                txtbrndNm().
                txtareabrndNm().
                upldfile().
                upldfile2().
                btnaddbrand().
                btnSave().
                ExpectedT33177();
    }
    @Description("Already add at least 1 brand")
    @Test(description ="The Admin should be able to see New Brand Popup for edit the Brand")
    public void T33178()throws Exception {
        Test_T33178().
                InputEmail().
                InputPassword().
                btnLogin().
                hdrmn().
                subhdrmn().
                btnEdit().
                Btnedit().
                expectedT33178();
    }
    @Description("Already add at least 1 brand + Attachment")
    @Test(description =" The Admin should not be able to save the brand edited")
    public void T33179()throws Exception {
        Test_T33179().
                InputEmail().
                InputPassword().
                btnLogin().
                hdrmn().
                subhdrmn().
                btnEdit().
                Btnedit().
                txtbrndNm().
                txtareabrndNm().
                upldfile().
        expectedT33179();
    }
    @Description("Already add at least 1 brand + Attachment")
    @Test(description =" The Admin should not be able to save the brand edited")
    public void T33180()throws Exception {
        Test_T33180().
                InputEmail().
                InputPassword().
                btnLogin().
                hdrmn().
                subhdrmn().
                btnEdit().
                Btnedit().
                btncancel().
                ExpetedT33180();
    }
    @Description("Already add at least 1 brand + Attachment")
    @Test(description =" The Admin should not be able to save the brand edited")
    public void T33181()throws Exception {
        Test_T33181().
                InputEmail().
                InputPassword().
                btnLogin().
                hdrmn().
                subhdrmn().
                btnEdit().
                Btnedit().
                btnclose().
                ExpetedT33181();
    }

}
