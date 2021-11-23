package FunctionalityTests;

import SanityTest.Sanity;
import ScreenManager.AnswerScreen;
import ScreenManager.DriverManager;
import ScreenManager.QuestionScreen;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import java.util.Collections;


/*
 * In this case we will test space bar behaviour in the question field
 * Result: PASSED (should not pass)
*/


public class SpaceBarForTypingQuestion extends DriverManager {

    @Test
    public void oneLetterTest()  {

        // partial sanity flow
        Sanity sanity = new Sanity();
        sanity.setUp();
        sanity.introScreen();

        // assert you're on the correct page
        questionScreen[0] = new QuestionScreen(driver);
        questionScreen[0].assertPage("question number: 1");
        // type a question

        String upper = String.join("", Collections.nCopies(10, " "));
        questionScreen[0].typeQuestion(upper);
        try {
            questionScreen[0].clickNextButton();
            answerScreen[0] = new AnswerScreen(driver);
            // assert you're on the right screen
            answerScreen[0].assertPage("question number: 1");
        }
        catch(Exception e) {
            e.getCause();

        }

    }


    @AfterTest
    public void tearDown() {

        driver.close();
        driver.quit();

    }

}
