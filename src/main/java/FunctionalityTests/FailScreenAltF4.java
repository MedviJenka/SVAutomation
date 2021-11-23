package FunctionalityTests;


import ScreenManager.DriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


/*
 * in this test case we will see if alt+f4 behaves correctly in Fail screen mode
 * Result: PASSED
 */


public class FailScreenAltF4 extends DriverManager {

    WrongAnswers functionality = new WrongAnswers();

    @Test
    public void generateFlow() {

        // flow
        functionality.setUp();
        functionality.introScreen();
        functionality.firstQuestion();
        functionality.firstAnswer();
        functionality.secondQuestion();
        functionality.secondAnswer();
        functionality.thirdQuestion();
        functionality.thirdAnswer();
        functionality.finalScreen();
        functionality.gamePlayScreen1();
        functionality.gamePlayScreen2();
        functionality.gamePlayScreen3();
        functionality.gameEndingScreen();

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


