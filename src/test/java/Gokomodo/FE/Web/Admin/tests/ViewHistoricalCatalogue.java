package Gokomodo.FE.Web.Admin.tests;

import Gokomodo.FE.Web.Admin.pageObjects.HistoricalCatalogue;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class ViewHistoricalCatalogue extends HistoricalCatalogue {

    @Description("Create RFQ buyer Eproc nauseee1")
    @Test(description = "Create RFQ Buyer Eproc")
    public void TestAdminCatalogueHistory()throws Exception {
        AdminCatalogueHistory().InputEmail().InputPassword().btnLogin().btnCompanyClickCatalogue().
                btnBuyerCompanyCatalogue().inputNameBuyerCatalogue().clickViewDetailsCatalogue().btnCatalogueCatalogue().
                    btnNameProdCatalogue().btnRemoveCatalogue().btnCancelRemoveCatalogue().btnBackCatalogueAdmin().btnAddGlobalCatalogue();

    }
}

