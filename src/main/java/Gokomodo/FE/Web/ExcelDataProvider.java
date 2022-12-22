package Gokomodo.FE.Web;

import Gokomodo.GlobalMethod.PropertiesReader.ApplicationConfigReader;
import Gokomodo.GlobalMethod.Utils.ExcelUtils;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.lang.reflect.Method;



public class ExcelDataProvider extends ApplicationConfigReader {
    @DataProvider(name = "multiSheetExcelRead", parallel = true)
    public static Object[][] multiSheetExcelRead(Method method) throws Exception {
        File file = new File("./src/test/resources/Excel Files/TestData.xlsx");
        String SheetName = method.getName();
        System.out.println(SheetName);
        return ExcelUtils.getTableArray(file.getAbsolutePath(), SheetName);
    }

    @DataProvider(name = "excelSheetNameAsMethodName", parallel = true)
    public static Object[][] excelSheetNameAsMethodName(Method method) throws Exception {
        File file = new File("./src/test/resources/Excel Files/" + method.getName() + ".xlsx");
        return ExcelUtils.getTableArray(file.getAbsolutePath());
    }
}
