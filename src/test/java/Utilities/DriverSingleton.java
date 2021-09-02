package Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverSingleton extends XMLUtil {
    private static WebDriver driver;

    public static WebDriver getDriverInstance() throws Exception {
        String type = getData("browser type");
        if (type.equals("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\QA automation\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (type.equals("FF")) {
            System.setProperty("webdriver.firefox.driver", "C:\\geckodriver\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        String url = getData("URL");
        driver.get(url);

    return getDriverInstance();
    }
}
