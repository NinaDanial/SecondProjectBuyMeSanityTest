package Utilities;

import Utilities.DriverSingleton;
import Utilities.ReportManager;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class BasePage extends ReportManager {
    protected static WebDriver driver;
    private static ExtentReports extent= new ExtentReports();
    private static ExtentTest test = extent.createTest("BuyMeTest", "Sanity Test");


    /**
     * initializing the driver
     */

    public static void setTimeoutAndDriver() throws Exception {
        driver = DriverSingleton.getDriverInstance();
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://buyme.co.il");
    }

public static void URL(){
        driver.get("https://buyme.co.il/search?budget=3&category=16&region=11");
}
    /**
     * Clicking on fields/buttons
     * @param locator
     */

    public void clickElement(By locator) throws Exception {
        WebElement webElement = getWebElement(locator);
        Assert.assertNotNull(webElement);
        webElement.click();
        String timeNow = String.valueOf(System.currentTimeMillis());
        test.pass("element is found and clicked", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(timeNow)).build());
        try {
            getWebElement(locator).click();
        } catch (NoSuchElementException e){
            test.info("element can not be found", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot("pic")).build());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Writing in a field
     * @param locator
     * @param text
     */
    public WebElement sendKeysToElement(By locator, String text) throws Exception {
        WebElement webElement = getWebElement(locator);
        Assert.assertNotNull(webElement);
        webElement.sendKeys(text);
        String timeNow = String.valueOf(System.currentTimeMillis());
        test.pass("element is found and clicked", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(timeNow)).build());
        try {
            getWebElement(locator).click();
        } catch (NoSuchElementException e) {
            test.info("element can not be found", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot("pic")).build());

        }
        return webElement;
    }


    /**
     * pick a value from a list
     * @return
     */

        public void pickValueFromList(By xpath,int elementIndex) throws Exception {
            WebElement buttonElement = driver.findElement(xpath);
            Actions myAction = new Actions(driver);
            Thread.sleep(2000);
            Actions elementFromList = myAction.clickAndHold(buttonElement);
            myAction.build().perform();
            List<WebElement> options = buttonElement.findElements(xpath);
            elementFromList.moveToElement(options.get(elementIndex));
            elementFromList.build().perform();
            String timeNow = String.valueOf(System.currentTimeMillis());
            test.pass("element is found and clicked", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(timeNow)).build());
            try {
                getWebElement(xpath).click();
            } catch (NoSuchElementException e){
                test.info("element can not be found", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot("pic")).build());

            }

    }


    /**
     * find an element
     * @param locator
     * @return
     */
    private WebElement getWebElement(By locator) throws Exception {
        String timeNow = String.valueOf(System.currentTimeMillis());
        test.pass("element is found and clicked", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(timeNow)).build());
        try {
            getWebElement(locator).click();
        } catch (NoSuchElementException e){
            test.info("element can not be found", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot("pic")).build());

        }
        return DriverSingleton.getDriverInstance().findElement(locator);
    }

    /**
     * comparing between two string values
     * @param actual
     * @param expected
     */
    public void assertionField(String actual, String expected) {
        Assert.assertEquals(actual,expected);
    }


}