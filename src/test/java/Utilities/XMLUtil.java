package Utilities;

import org.openqa.selenium.WebDriver;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtil {
    private static WebDriver driver;

    static String getData(String keyName) throws Exception {
        DriverSingleton.getDriverInstance();
        File fXmlFile = new File("C:\\QA automation\\SeleniumExtra\\SeleniumExtra\\src\\main\\resources\\data.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(fXmlFile);
        doc.getDocumentElement().normalize();
        return doc.getElementsByTagName(keyName).item(0).getTextContent();
    }
}

