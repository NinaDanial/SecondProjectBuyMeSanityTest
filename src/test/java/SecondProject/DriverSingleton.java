package SecondProject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSingleton {
    private static WebDriver driver;

    public static WebDriver getDriverInstance(){
        if(driver == null){
            System.setProperty("webdriver.chrome.driver" , "C:\\QA automation\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
        }

        return driver;
    }
    //    @AfterClass
//    public static void tearDown() {
//        driver.quit();
//    }
}
