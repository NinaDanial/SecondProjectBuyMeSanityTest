package SecondProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtil {
//    private static WebDriver driver;

//    public static WebDriver getDriverInstance() {
//        if (driver == null) {
//            System.setProperty("webdriver.chrome.driver", "C:\\QA automation\\chromedriver_win32\\chromedriver.exe");
//            driver = new ChromeDriver();
//        }
//        return driver;
//        driver = DriverSingleton.getDriverInstance();
//        driver.get("https://buyme.co.il");
//
//        public static void beforeClass()throws Exception {
//        String type = getData("browserType");
//        if(type.equals("Chrome")){
//            System.setProperty("webdriver.chrome.driver" , "C:\\QA automation\\chromedriver_win32\\chromedriver.exe");
//            driver = new ChromeDriver();
//        }else if(type.equals("FF")){
//            System.setProperty("webdriver.firefox.driver", "C:\\geckodriver\\geckodriver.exe");
//            driver = new FirefoxDriver();
//        }
//        }
//    private static String getData (String keyName) throws Exception{
//        File fXmlFile = new File("C:\\QA automation\\SeleniumExtra\\SeleniumExtra\\src\\main\\resources\\data.xml");
//        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
//        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
//        Document doc = dBuilder.parse(fXmlFile);
//        doc.getDocumentElement().normalize();
//        return doc.getElementsByTagName(keyName).item(0).getTextContent();
//    }
//}
}
