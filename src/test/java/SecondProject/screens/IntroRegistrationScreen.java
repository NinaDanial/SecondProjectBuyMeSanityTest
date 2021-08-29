package SecondProject.screens;

import SecondProject.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class IntroRegistrationScreen extends BasePage {
    public static WebDriver driver;
    private static String value;
    static String FirstName = "Nina";

    public void openPopUp() {
        this.clickElement(By.xpath("/html/body/div[1]/div/header/div[1]/div/ul[1]/li[3]/a/span[2]"));
    }

    public void pressRegistrationLink() {
        this.clickElement(By.cssSelector("span.text-link"));
    }

    public String fillRegistrationFields() {
        WebElement webElement = this.sendKeysToElement(By.cssSelector("input[id=ember1763]"), "Nina");
        Assert.assertNotNull(webElement);
        return webElement.getText();
    }


    public String enterEmailAddressByKey() {
        WebElement webElement = this.sendKeysToElement(By.xpath("//input[@required type='email' and @id='ember1766']"), "nardeensu@gmail.com");
        Assert.assertNotNull(webElement);
        return webElement.getText();
    }

    public String reEnterPassByKey() {
        WebElement webElement = this.sendKeysToElement(By.id("ember1716"), "Ninosh55");
        Assert.assertNotNull(webElement);
        return webElement.getText();
    }

    public void registrationToBuyMe() {
        this.clickElement(By.id("ember1719"));
    }


    }




