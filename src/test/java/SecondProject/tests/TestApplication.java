package SecondProject.tests;

import Utilities.BasePage;
import Utilities.DriverSingleton;
import SecondProject.screens.HomeScreen;
import SecondProject.screens.IntroRegistrationScreen;
import SecondProject.screens.PickBusinessScreen;
import SecondProject.screens.SenderAndReceiverInfoScreen;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestApplication {
    public static WebElement getWebElement(By locator) throws Exception {
        return DriverSingleton.getDriverInstance().findElement(locator);
    }

    public static WebDriver driver;
    private static ExtentReports extent= new ExtentReports();
    private static ExtentTest test = extent.createTest("BuyMeTest", "Sanity Test");
    private final IntroRegistrationScreen introRegistration = new IntroRegistrationScreen();
    private final SenderAndReceiverInfoScreen senderAndReceiverInfoScreen = new SenderAndReceiverInfoScreen();
    private final PickBusinessScreen pickBusinessScreen = new PickBusinessScreen();
    private final HomeScreen homeScreen= new HomeScreen();

    /**
     * running the driver
     */
    @BeforeClass
    public static void runOnceBeforeClass() throws Exception {
        DriverSingleton.getDriverInstance();
        ExtentSparkReporter htmlReporter = new ExtentSparkReporter("C://Users//extent.html");
        extent.attachReporter(htmlReporter);
        test.log(Status.INFO,"initializing the driver");

    }

        /**
        * the test process of the registration screen
        */
         @Test
         public void testFirstScreen() throws Exception {
        testRegistrationScreen();
        test.log(Status.INFO, "registration and login test");
    }

        /**
        * searching for a gift by choosing from dropdown lists
        * @throws InterruptedException
        */

        @Test
        public void testSearchingAGift() throws Exception {
            testHomeScreen();
            test.log(Status.INFO, "searching for a gift test");
        }

        /**
         * choosing a gift card
        * @throws InterruptedException
        */
         @Test
        public void testChoosingAGift() throws Exception {
             testPickBusinessScreen();
             test.log(Status.INFO, "choosing a gift test");
            }
            /**
             * sending the gift
             */

            @Test
       public void testSendingAGift() throws Exception {
        testSenderAndReceiverScreen();
                test.log(Status.INFO, "sending a gift test");
    }


    @AfterClass
    public static void tearDown() {
        driver.quit();
        extent.flush();
    }



    /**
     * tests of the registration screen
     */
    private void testRegistrationScreen() throws Exception {
        introRegistration.openPopUp();
        introRegistration.pressRegistrationLink();
        introRegistration.fillFirstName();
        introRegistration.enterEmailAddressByKey();
        introRegistration.enterPassByKey();
        introRegistration.reEnterPassByKey();
        introRegistration.registrationToBuyMe();
        introRegistration.assertFirstName();
        introRegistration.assertEmail();
        introRegistration.assertPassword();
        introRegistration.assertReenterPassword();
    }

    /**
     * tests of the homeScreen
     */
    private void testHomeScreen() throws Exception {
        homeScreen.pickPricePoint();
        homeScreen.pickRegion();
        homeScreen.pickCategory();
        homeScreen.findAGift();
    }

    /**
     * tests of the pickBusinessScreen
     */
    private void testPickBusinessScreen() throws Exception {
        pickBusinessScreen.checkURL();
        pickBusinessScreen.pickBusiness();
        pickBusinessScreen.enterPrice();
        pickBusinessScreen.pressChoose();
    }

    /**
     * tests of the senderAndReceiverScreen
     */
    private void testSenderAndReceiverScreen() throws Exception {
        senderAndReceiverInfoScreen.toSomeoneElseButton();
        senderAndReceiverInfoScreen.receiverName();
        senderAndReceiverInfoScreen.receiverName();
        senderAndReceiverInfoScreen.setUploadImg();
        senderAndReceiverInfoScreen.chooseRightNowOption();
        senderAndReceiverInfoScreen.chooseSMSOption();
        senderAndReceiverInfoScreen.enterPhoneNumber();
        senderAndReceiverInfoScreen.pressContinueToPayment();
        senderAndReceiverInfoScreen.assertionReceiver();
        senderAndReceiverInfoScreen.assertionSender();
    }


}

