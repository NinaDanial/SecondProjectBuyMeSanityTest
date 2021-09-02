package SecondProject.screens;

import Utilities.BasePage;
import SecondProject.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class IntroRegistrationScreen extends BasePage {
    public static WebDriver driver;
    private static String value;
    static String FirstName = "Nina";
    static String emailAddress="nina.danial01@gmail.com";
    static String passWord="Ninosh55";

    /**
     * open registration window
     */
    public void openPopUp() throws Exception {
        this.clickElement(By.cssSelector("span[class=seperator-link]"));
    }

    /**
     * click on registration option
     */
    public void pressRegistrationLink() throws Exception {
        this.clickElement(By.cssSelector("span.text-link"));
    }

    /**
     * enter first name
     * @return
     */
    public String fillFirstName() throws Exception {
        WebElement webElement = this.sendKeysToElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div[3]/div[2]/div[3]/form/div[1]/label"), Constants.firstName);
        Assert.assertNotNull(webElement);
        return webElement.getText();
    }

    /**
     * enter email address
     * @return
     */
    public String enterEmailAddressByKey() throws Exception {
        WebElement webElement = this.sendKeysToElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div[3]/div[2]/div[3]/form/div[2]/label/input"), Constants.emailAddress);
        Assert.assertNotNull(webElement);
        return webElement.getText();
    }

    /**
     * enter password
     * @return
     */
    public String enterPassByKey() throws Exception {
        WebElement webElement= this.sendKeysToElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div[3]/div[2]/div[3]/form/div[3]/label"),Constants.password);
        Assert.assertNotNull(webElement);
        return webElement.getText();
    }

    /**
     * verify the password
     * @return
     */
    public String reEnterPassByKey() throws Exception {
        WebElement webElement = this.sendKeysToElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div[3]/div[2]/div[3]/form/div[4]/label"), Constants.password);
        Assert.assertNotNull(webElement);
        return webElement.getText();
    }

    /**
     * click on registration
     */
    public void registrationToBuyMe() throws Exception {
        this.clickElement(By.cssSelector("button[type=submit]"));
    }

    public void assertFirstName(){
        assertionField(FirstName, Constants.firstName);
}
    public void assertEmail() {
        assertionField(emailAddress,Constants.emailAddress);
    }
    public void assertPassword(){
        assertionField(passWord,Constants.password);
    }
    public void assertReenterPassword() {
        assertionField(passWord,Constants.password);
    }
    }




