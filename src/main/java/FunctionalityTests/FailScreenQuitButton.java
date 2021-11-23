package FunctionalityTests;

import ScreenManager.DriverManager;
import ScreenManager.QuizFailScreen;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


/*
* in this test case we will see if the quit button behaves correctly in Fail screen mode
* Result: PASSED
*/


public class FailScreenQuitButton extends DriverManager {

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
        quizFailScreen.clickOnQuitButton();

    }

    @AfterTest
    public void tearDown() {
        driver.switchTo().alert().accept();
        driver.close();
        driver.quit();

    }

}


