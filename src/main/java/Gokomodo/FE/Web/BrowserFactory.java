package Gokomodo.FE.Web;

import Gokomodo.GlobalMethod.PropertiesReader.ApplicationConfigReader;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;


public class BrowserFactory extends ApplicationConfigReader {
    public static WebDriver driver;

    public static WebDriver createDriver() {

        switch (browser.toLowerCase()) {
            case "chrome":
                driver = new ChromeDriver();
                break;

            case "chrome_headless":
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--headless");
                chromeOptions.addArguments("--disable-gpu");
                driver = new ChromeDriver(chromeOptions);
                break;

            case "firefox":
                driver = new FirefoxDriver();
                break;

            case "firefox_headless":
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.addArguments("--headless");
                driver = new FirefoxDriver(firefoxOptions);
                break;

            case "ie":
            case "internet explorer":
                driver = new InternetExplorerDriver();
                break;

            case "edge":
                driver = new EdgeDriver();
                break;

//            case "opera":
//                OperaOptions operaOptions = new OperaOptions();
//                operaOptions.setBinary("C:\\Program Files\\Opera\\77.0.4054.277\\opera.exe");
//                driver = new OperaDriver(operaOptions);
//                break;

            case "safari":
                driver = new SafariDriver();
                break;

            default:
                throw new NotFoundException("Browser Not Found. Please Provide a Valid Browser");
        }
        if (implicitlyWait > 0) {
            implicitlyWaitMethod(implicitlyWait);
        }

        if (maxPageLoadTime > 0) {
            setMaxPageLoadTimeMethod(maxPageLoadTime);
        }

        if (getURL==null){
            driver.get("https://ibb.co/FbyrWLK");
        } else{
            driver.get(getURL);
        }


        if (!browser.toLowerCase().contains("ghost") || !browser.toLowerCase().contains("phantom")) {
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void implicitlyWaitMethod(int timeInSeconds) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeInSeconds));
    }

    public static void setMaxPageLoadTimeMethod(int timeInSeconds) {
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(timeInSeconds));
    }
}
