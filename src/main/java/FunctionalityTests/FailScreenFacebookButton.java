package FunctionalityTests;


import ScreenManager.DriverManager;
import ScreenManager.QuizFailScreen;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


/*
 * in this test case we will see if alt+f4 behaves correctly in Fail screen mode
 * Result: PASSED
 */


public class FailScreenFacebookButton extends DriverManager {

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

        // click on facebook button
        QuizFailScreen quizFailScreen = new QuizFailScreen(driver);
        quizFailScreen.shareOnFacebook();



    }

    @AfterTest
    public void tearDown() {

        driver.switchTo().alert().accept();
        driver.close();
        driver.quit();
        System.out.println("Functionality alf f4 done");

    }

}


