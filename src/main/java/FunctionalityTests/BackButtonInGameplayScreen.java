package FunctionalityTests;

import SanityTest.Sanity;
import ScreenManager.DriverManager;
import ScreenManager.GamePlayAnswerScreen;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

/*
 * back button test in gameplay test
 */


public class BackButtonInGameplayScreen extends DriverManager {

    @Test
    public void generateFlow() {
        // partial sanity flow
        Sanity sanity  = new Sanity();
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
        // back button click
        GamePlayAnswerScreen game = new GamePlayAnswerScreen(driver);
        game.clickOnBackButton();
        game.clickOnBackButton();
        game.assertPage();

    }

    @AfterTest
    public void tearDown() {

        driver.close();
        driver.quit();

    }

}
