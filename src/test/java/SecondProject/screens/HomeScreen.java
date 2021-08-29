package SecondProject.screens;

import SecondProject.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeScreen extends BasePage {
    public static WebDriver driver;
    private static String value;

    public void pickPricePoint() {
        this.selectValue(By.xpath("/html/body/div[1]/div/header/div[2]/div/div/form/div[1]"));
    }
    public void pickRegion() {
        this.selectValue(By.xpath("/html/body/div[1]/div/header/div[2]/div/div/form/div[2]"));
    }
    public void pickCategory() {
        this.selectValue(By.className("chosen-single"));
    }
    public void findAGift() {
        this.clickElement(By.xpath("/html/body/div[1]/div/header/div[2]/div/div/form/a"));
    }
}
