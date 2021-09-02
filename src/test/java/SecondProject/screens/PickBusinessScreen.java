package SecondProject.screens;

import Utilities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class PickBusinessScreen extends BasePage {

    private static String value;

    /**
     * assert website URL
     */
    public void checkURL() {
        String URL = driver.getCurrentUrl();
        Assert.assertNotNull(URL);
        Assert.assertEquals(URL, "https://buyme.co.il/search?budget=3&category=16&region=11");
    }

    /**
     * choose a business
     */
    public void pickBusiness() throws Exception {
    this.clickElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/ul/li[1]/a/div/div[3]"));
}

    /**
     * set a price for the gift card
     * @return
     */
    public String enterPrice() throws Exception {
    WebElement webElement = this.sendKeysToElement(By.cssSelector("input[type=tel]"), "200");
    return webElement.getText();
        }

    /**
     * choosing the selected gift card
     */
    public void pressChoose() throws Exception {
        this.clickElement(By.className("mx-12"));
        }

    }
