package FunctionalityTests;

import SanityTest. * ;
import ScreenManager.DriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class PressAltF4 extends DriverManager {

    @Test
    public void pressAltF4() {

        Sanity sanity = new Sanity();

        sanity.setUp();
        sanity.introScreen();

        Actions actions = new Actions(driver);
        actions.keyDown(Keys.ALT);
        actions.sendKeys(Keys.F4);
        actions.keyUp(Keys.ALT);
        actions.perform();

    }

    @AfterTest
    public void tearDown() {

        driver.close();
        driver.quit();
        System.out.println("Functionality alf f4 done");

    }

}
