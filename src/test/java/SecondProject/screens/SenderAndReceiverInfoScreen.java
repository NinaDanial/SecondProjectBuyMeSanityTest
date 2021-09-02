package SecondProject.screens;

import Utilities.BasePage;
import SecondProject.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SenderAndReceiverInfoScreen extends BasePage {
    public static WebDriver driver;
    private static String value;
    static String sender="Nina";
    static String receiver="John";

    /**
     * choose the option to send the gift to someone else
     */
    public void toSomeoneElseButton() throws Exception {
        this.clickElement(By.xpath("/html/body/div[1]/div/div/div[3]/div/div/div[1]/form/div[1]/div/div/div/div/div[1]"));
    }

    /**
     * writing the gift receiver's name
     * @return
     */
    public String receiverName() throws Exception {
        WebElement webElement = this.sendKeysToElement(By.id("ember4244"), "John");
        Assert.assertNotNull(webElement);
        return webElement.getText();
    }

    /**
     * writing the gift sender's name
     * @return
     */
    public String senderName() throws Exception {
        WebElement webElement = this.sendKeysToElement(By.xpath("/html/body/div[1]/div/div/div[3]/div/div/div[1]/form/div[3]/div[2]/label/input"), "Nina");
        Assert.assertNotNull(webElement);
        return webElement.getText();
    }

//    /**
//     * choose an event for sending the gift
//     */
//    public void pickAnEvent() {
//        this.selectValue(By.cssSelector("div[data-ember-action=4430"));
//    }

    /**
     * writing a blessing to the gift receiver
     * @return
     */
    public String writeABlessing() throws Exception {
        WebElement webElement = this.sendKeysToElement(By.xpath("/html/body/div[1]/div/div/div[3]/div/div/div[1]/form/div[2]/div[4]/label/textarea"), "Happy Birthday my dearest son");
        return webElement.getText();
    }

    /**
     * uploading an image
     */
    public void setUploadImg() {
        WebElement UploadImg = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div/div/div[1]/form/div[2]/div[5]/div[2]/div[1]/label"));
        UploadImg.sendKeys("eef036f583e91a438896a377716ea85e.jpg");
    }

    /**
     * choosing the right now option in when to send the gift field
     */
    public void chooseRightNowOption() throws Exception {
        this.clickElement(By.cssSelector("svg[xmlns=http://www.w3.org/2000/svg]"));
    }

    /**
     * choosing the sms option in how to send the gift option
     */
    public void chooseSMSOption() throws Exception {
        this.clickElement(By.cssSelector("svg[gtm=method-sms"));
    }

    /**
     * entering the phone number
     * @return
     */
    public String enterPhoneNumber() throws Exception {
       WebElement webElement= this.sendKeysToElement(By.cssSelector("input[id=sms]"),"0532353885");
       return webElement.getText();
    }

    /**
     * continue to payment
     */
    public void pressContinueToPayment() throws Exception {
        this.clickElement(By.id("ember4485"));

}

    /**
     * asserting the receiver's name
     */
    public void assertionReceiver(){
        assertionField("John", receiver);
    }

    /**
     * asserting the sender's name
     */
    public void assertionSender() {
        assertionField(Constants.firstName, sender);
    }
}
