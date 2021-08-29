package SecondProject.screens;

import SecondProject.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SenderAndReceiverInfoScreen extends BasePage {
    public static WebDriver driver;
    private static String value;


    public void toSomeoneElseButton() {
        this.clickElement(By.xpath("/html/body/div[1]/div/div/div[3]/div/div/div[1]/form/div[1]/div/div/div/div/div[1]"));
    }
    public String receiverName() {
        WebElement webElement = this.sendKeysToElement(By.id("ember4244"), "John");
        return webElement.getText();
    }
    public String senderName() {
        WebElement webElement = this.sendKeysToElement(By.xpath("/html/body/div[1]/div/div/div[3]/div/div/div[1]/form/div[3]/div[2]/label/input"), "Nina");
        return webElement.getText();

    }
    public void pickAnEvent() {
        this.selectValue(By.cssSelector("div[data-ember-action=4430"));
    }
    public String writeABlessing() {
        WebElement webElement = this.sendKeysToElement(By.xpath("/html/body/div[1]/div/div/div[3]/div/div/div[1]/form/div[2]/div[4]/label/textarea"), "Happy Birthday my dearest son");
        return webElement.getText();
    }
    public void setUploadImg() {
        WebElement UploadImg = driver.findElement(By.xpath("//*[@id='file_upload_button']"));
        UploadImg.sendKeys("

    }


}
