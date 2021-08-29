package SecondProject.tests;

import SecondProject.BasePage;
import SecondProject.DriverSingleton;
import SecondProject.screens.HomeScreen;
import SecondProject.screens.IntroRegistrationScreen;
import SecondProject.screens.PickBusinessScreen;
import SecondProject.screens.SenderAndReceiverInfoScreen;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestApplication {
    public static WebElement getWebElement(By locator) {
        return DriverSingleton.getDriverInstance().findElement(locator);
    }

    public static WebDriver driver;

    private final IntroRegistrationScreen introRegistration = new IntroRegistrationScreen();
    private final SenderAndReceiverInfoScreen senderAndReceiverInfoScreen = new SenderAndReceiverInfoScreen();
    private final PickBusinessScreen pickBusinessScreen = new PickBusinessScreen();
    private final HomeScreen homeScreen= new HomeScreen();


    @BeforeClass
    public static void runOnceBeforeClass() {
        BasePage.setTimeoutAndDriver();
    }

    @Test
    public void testApplication() {
        testRegistrationScreen();
        testHomeScreen();
        testPickBusinessScreen();
        testSenderAndReceiverScreen();
    }
    private void testPickBusinessScreen(){
        pickBusinessScreen.checkURL();
        pickBusinessScreen.pickBusiness();
        pickBusinessScreen.enterPrice();
        pickBusinessScreen.pressChoose();


    }
    private void testHomeScreen() {
        homeScreen.pickPricePoint();
        homeScreen.pickRegion();
        homeScreen.pickCategory();
        homeScreen.findAGift();
    }

    private void testSenderAndReceiverScreen() {
        senderAndReceiverInfoScreen.toSomeoneElseButton();
        senderAndReceiverInfoScreen.receiverName();
        senderAndReceiverInfoScreen.receiverName();

    }

    private void testRegistrationScreen() {
        String actual;
        introRegistration.openPopUp();
        introRegistration.pressRegistrationLink();

        actual = introRegistration.fillRegistrationFields();
        introRegistration.assertionField(actual, "Nina");

        actual = introRegistration.enterEmailAddressByKey();
        introRegistration.assertionField(actual, "nardeensu@gmail.com");

        actual = introRegistration.reEnterPassByKey();
        introRegistration.assertionField(actual, "Ninosh55");

        introRegistration.registrationToBuyMe();
    }


}

