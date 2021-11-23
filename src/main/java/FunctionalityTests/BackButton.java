package FunctionalityTests;

import SanityTest.Sanity;
import ScreenManager.DriverManager;
import ScreenManager.GamePlayAnswerScreen;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*
* back button test
*/


public class BackButton extends DriverManager {

    @Test(priority=2)
    public void backButtonTest() {

        Sanity sanity = new Sanity();
        // partial sanity flow
        sanity.setUp();
        sanity.introScreen();
        sanity.firstQuestion();
        sanity.firstAnswer();
        sanity.secondQuestion();
        sanity.secondAnswer();
        sanity.thirdQuestion();
        sanity.thirdAnswer();
        sanity.finalScreen();
        sanity.gamePlayScreen1();
        sanity.gamePlayScreen2();

        gamePlayAnswerScreen[0] = new GamePlayAnswerScreen(driver);
        gamePlayAnswerScreen[1] = new GamePlayAnswerScreen(driver);
        gamePlayAnswerScreen[2] = new GamePlayAnswerScreen(driver);

        gamePlayAnswerScreen[2].assertPage();
        gamePlayAnswerScreen[2].clickOnBackButton();
        gamePlayAnswerScreen[1].assertPage();
        gamePlayAnswerScreen[1].clickOnBackButton();
        gamePlayAnswerScreen[0].assertPage();


    }

    @AfterTest
    public void tearDown()  {
        // dismiss alert
        driver.close();
        driver.quit();

    }
}