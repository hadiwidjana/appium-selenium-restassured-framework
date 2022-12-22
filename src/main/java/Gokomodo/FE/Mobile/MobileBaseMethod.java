package Gokomodo.FE.Mobile;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;
import java.time.Duration;


public class MobileBaseMethod extends MobileDriverFactory {


    protected static ThreadLocal<String> platform = new ThreadLocal<String>();

    public String getPlatform() {
        return platform.get();
    }

    public static final long WAIT = 10;

    private Point start;
    private Point end;
    private boolean isDisplayed;


    //wait for visibility
    public void waitForVisibility(WebElement e) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(WAIT));
        wait.until(ExpectedConditions.visibilityOf(e));
    }

    //get website name
    public String getUrlTitle() throws Exception
    {
        URL aURL = new URL(getURL);
        String WebName = aURL.getHost();
        return WebName.toUpperCase();
    }

    //clear element
    public void clear(WebElement e) {
        waitForVisibility(e);
        e.clear();
    }

    //highlight element
    public void highlightElement(WebElement e){
        waitForVisibility(e);
        JavascriptExecutor js = (JavascriptExecutor)getDriver() ;
        js.executeScript("arguments[0].setAttribute('style',' border: 2px solid red;');", e);
    }

    //click
    public void click(WebElement e) {
        waitForVisibility(e);
        e.click();
    }


    //send key or text
    public void sendKeys(WebElement e, String txt){
        waitForVisibility(e);
        e.sendKeys(txt);
    }

    //get attribute
    public String getAttribute(WebElement e, String attribute){
        waitForVisibility(e);
        return e.getAttribute(attribute);
    }

    //get text
    public String getText(WebElement e, String msg) {
        String txt = null;
        switch (getPlatform()) {
            case "Android":
                txt = getAttribute(e, "text");
                break;
            case "iOS":
                txt = getAttribute(e, "label");
                break;
        }
        return txt;
    }

    public void scrollDown() {

        Dimension dimension = getDriver().manage().window().getSize();
        start = new Point((int)(dimension.width*0.5), (int)(dimension.height*0.8));
        end = new Point((int)(dimension.width*0.2), (int)(dimension.height*0.1));
        MobileW3cActions.doSwipe(getDriver(), start, end, 1000);  //with duration 1s

    }

    public void scrollUp() {

        Dimension dimension = getDriver().manage().window().getSize();
        start = new Point((int)(dimension.width*0.5), (int)(dimension.height*0.8));
        end = new Point((int)(dimension.width*0.2), (int)(dimension.height*0.1));
        MobileW3cActions.doSwipe(getDriver(), end, start, 1000);  //with duration 1s

    }

    public void scrollToElement(WebElement e, String direction) {
        for(int i = 0; i<10; i++){
            if(isElementDisplayed(e)){
                break;
            } else {
                if(direction.equalsIgnoreCase("up")){
                    scrollUp();
                } else{
                    scrollDown();
                }
            }
        }
    }

    public boolean isElementDisplayed(WebElement e){
        new WebDriverWait(getDriver(), Duration.ofMillis(500));
        try {
            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofMillis(500));
            return wait.until(new ExpectedCondition<Boolean>() {
                public Boolean apply(WebDriver driver) {
                    if(e.isDisplayed()){
                        return true;
                    }
                    return false;
                }
            });
        } catch (Exception ex){
            return false;
        }
    }




}
