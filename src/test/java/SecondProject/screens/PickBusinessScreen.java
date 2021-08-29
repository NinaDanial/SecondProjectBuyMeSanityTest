package SecondProject.screens;

import SecondProject.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class PickBusinessScreen extends BasePage {
    public static WebDriver driver;
    private static String value;

    public void checkURL() {
        String URL = driver.getCurrentUrl();
        Assert.assertNotNull(URL);
        Assert.assertEquals(URL, "https://buyme.co.il/search?budget=3&category=16&region=11");
    }
public void pickBusiness() {
    this.clickElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/ul/li[1]/a/div/div[3]"));
}
public String enterPrice() {
    WebElement webElement = this.sendKeysToElement(By.cssSelector("input[type=tel]"), "200");
    return webElement.getText();
        }
        public void pressChoose(){
        this.clickElement(By.className("mx-12"));
        }

    }
