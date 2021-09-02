package SecondProject.screens;

import Utilities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeScreen extends BasePage {
    public static WebDriver driver;
    private static String value;

    /**
     * choose a price range
     */
    public void pickPricePoint() throws InterruptedException {
        try {
            this.pickValueFromList(By.xpath("//*[@id=\"ember4842_chosen\"]/div"),4);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    /**
     * choose a region
     */
    public void pickRegion() throws InterruptedException {
        try {
            this.pickValueFromList(By.xpath("//*[@id=\"ember1027_chosen\"]"), 2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    /**
     * choose a category
     */
    public void pickCategory() throws Exception {
        this.pickValueFromList(By.xpath("//*[@id=\"ember4844_chosen\"]"), 3);
    }

    /**
     * search for the gift
     */
    public void findAGift() throws Exception {
        this.clickElement(By.xpath("//*[@id=\"ember4847\"]"));
    }



//
//    public void pickRegion() {
//    }
//
//    public void pickPricePoint() {
//    }
}
