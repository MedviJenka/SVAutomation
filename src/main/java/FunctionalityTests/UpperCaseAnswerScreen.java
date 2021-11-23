package FunctionalityTests;

import SanityTest.Sanity;
import ScreenManager.AnswerScreen;
import ScreenManager.DriverManager;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import java.util.Collections;


/*
 * In this case we will test upper case letters limit in the answer field
 * Result: PASSED
 */


public class UpperCaseAnswerScreen extends DriverManager {

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
        String thirtyLetters = String.join("", Collections.nCopies(10, "A"));
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
