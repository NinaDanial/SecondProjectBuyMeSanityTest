package SecondProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class BasePage {
    private static WebDriver driver;

    public static void setTimeoutAndDriver() {
        driver = DriverSingleton.getDriverInstance();
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://buyme.co.il");
    }


    /**
     * Clicking on fields/buttons
     * @param locator
     */

    public void clickElement(By locator) {
        WebElement webElement = getWebElement(locator);
        Assert.assertNotNull(webElement);
        webElement.click();
    }

    /**
     * Writing in a field
     * @param locator
     * @param text
     */
    public WebElement sendKeysToElement(By locator, String text) {
        WebElement webElement = getWebElement(locator);
        Assert.assertNotNull(webElement);
        webElement.sendKeys(text);
        return webElement;
    }

    /**
     * pick a value from a list
     * @return
     */
    public void pickValueFromList() {
        List<WebElement> elementsList= driver.findElements(By.name(""));
    }
    /**
     * select a value from a dropdown list
     */
    public void selectValue(By value){
        Select mySelection= new Select(driver.findElement(By.xpath("")));
    }

    /**
     * find an element
     * @param locator
     * @return
     */
    private WebElement getWebElement(By locator) {
        return DriverSingleton.getDriverInstance().findElement(locator);
    }

    /**
     *
     * @param actual
     * @param expected
     */
    public void assertionField(String actual, String expected) {
        Assert.assertEquals(actual,expected);
    }
}