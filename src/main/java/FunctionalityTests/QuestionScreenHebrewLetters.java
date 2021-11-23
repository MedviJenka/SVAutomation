package FunctionalityTests;

import SanityTest. * ;
import ScreenManager. * ;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


/*
 * In this case we will test hebrew letters in the question field (1)
 * Result: Caught
 */

public class QuestionScreenHebrewLetters extends DriverManager {

    @Test
    public void oneLetterTest()  {

        // partial sanity flow
        Sanity sanity = new Sanity();
        sanity.setUp();
        sanity.introScreen();

        questionScreen[0] = new QuestionScreen(driver);
        // assert you're on the correct page
        questionScreen[0].assertPage("question number: 1");
        // type a question
        questionScreen[0].typeQuestion("דגכגכגכגכגכ");

        try{
            questionScreen[0].clickNextButton();
        }
        catch(Exception e) {
            e.getCause();
            answerScreen[0] = new AnswerScreen(driver);
            // assert you're on the right screen
            answerScreen[0].assertPage("question number: 1");
        }

    }


    @AfterTest
    public void tearDown() {

        driver.close();
        driver.quit();

    }

}
