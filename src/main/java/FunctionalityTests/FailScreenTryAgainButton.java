package FunctionalityTests;

import SanityTest.Sanity;
import ScreenManager.DriverManager;
import ScreenManager.QuizFailScreen;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


/*
 * in this test case we will see if the try again button behaves correctly in Fail screen mode
 * Result: PASSED
 */


public class FailScreenTryAgainButton extends DriverManager {

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

        // press on quit button
        QuizFailScreen quizFailScreen = new QuizFailScreen(driver);
        quizFailScreen.clickOnTryAgainButton();
        //assert back to screen 1
        Sanity sanity = new Sanity();
        sanity.gamePlayScreen1();


    }

    @AfterTest
    public void tearDown() {

        driver.close();
        driver.quit();

    }

}


