package FunctionalityTests;

import SanityTest. * ;
import ScreenManager. * ;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.Collections;

/*
* In this case we will test max letters in the question field (50)
* Result: PASSED
*/

public class MaxQuestionValue extends DriverManager {

    Sanity sanity = new Sanity();
    @Test
    public void generateTest() {
        // partial sanity flow
        sanity.setUp();
        sanity.introScreen();
        // generate 50 letters
        String fiftyLetters = String.join("", Collections.nCopies(49, "a"));
        questionScreen[0] = new QuestionScreen(driver);
        // assert you're on the correct page
        questionScreen[0].assertPage("question number: 1");
        // type a question
        questionScreen[0].typeQuestion(fiftyLetters);
        questionScreen[0].clickNextButton();
        // move to the next screen
        answerScreen[0] = new AnswerScreen(driver);
        // assert you're on the right screen
        answerScreen[0].assertPage("question number: 1");

    }


    @AfterTest
    public void tearDown() {

        driver.close();
        driver.quit();

    }

}
