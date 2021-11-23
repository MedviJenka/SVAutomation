package FunctionalityTests;

import SanityTest. * ;
import ScreenManager. * ;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import java.util.Collections;

/*
 * In this case we will test max letters limit in the answer field (50)
 * Result: PASSED
 */

public class MaxAnswerValue extends DriverManager {


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
        String thirtyLetters = String.join("", Collections.nCopies(30, "a"));
        //flow
        answerScreen[0].typeAnswer("1",thirtyLetters);
        answerScreen[0].typeAnswer("2","a");
        answerScreen[0].typeAnswer("3","a");
        answerScreen[0].typeAnswer("4","a");

        answerScreen[0].clickOnRadioButton("1");
        answerScreen[0].clickNextButton();

    }


    @AfterTest
    public void tearDown() {

        driver.close();
        driver.quit();

    }

}
