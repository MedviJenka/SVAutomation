package FunctionalityTests;

import SanityTest.Sanity;
import ScreenManager.AnswerScreen;
import ScreenManager.DriverManager;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.Collections;

/*
 * In this case we will test space bar behaviour in the answer field
 * Result: PASSED (should not pass)
 */


public class SpaceBarForTypingAnswer extends DriverManager {

    Sanity sanity = new Sanity();

    @Test
    public void thirtyLettersTest() {

        // partial sanity flow
        sanity.setUp();
        sanity.introScreen();
        sanity.firstQuestion();

        answerScreen[0] = new AnswerScreen(driver);
        // assert you're on the right screen
        answerScreen[0].assertPage("question number: 1");
        // generate 30 letters
        String space = String.join("", Collections.nCopies(10, "  "));
        //flow
        answerScreen[0].typeAnswer("1", space);
        answerScreen[0].typeAnswer("2", space);
        answerScreen[0].typeAnswer("3", space);
        answerScreen[0].typeAnswer("4", space);

        answerScreen[0].clickOnRadioButton("1");

        try {
            answerScreen[0].clickNextButton();
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
