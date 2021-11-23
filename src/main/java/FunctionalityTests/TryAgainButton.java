package FunctionalityTests;

import SanityTest. * ;
import ScreenManager.DriverManager;
import ScreenManager.GameEndingScreen;
import ScreenManager.GamePlayAnswerScreen;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TryAgainButton extends DriverManager {

    @Test
    public void generateTest() {
        // full sanity flow
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
        sanity.gamePlayScreen3();
        //try again button
        gameEndingScreen = new GameEndingScreen(driver);
        GamePlayAnswerScreen gamePlayAnswerScreen = new GamePlayAnswerScreen(driver);
        gameEndingScreen.clickOnTryAgainButton();
        // should come back to initial gameplay
        gamePlayAnswerScreen.assertPage();

    }


    @AfterTest
    public void tearDown() {
        driver.close();
        driver.quit();
    }

}
