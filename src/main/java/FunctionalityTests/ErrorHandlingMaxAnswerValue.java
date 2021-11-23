package FunctionalityTests;

import SanityTest.Sanity;
import ScreenManager. * ;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import java.util.Collections;


/*
 * In this case we will test max letters in the answer field (31)
 * Result: PASSED
 */

public class ErrorHandlingMaxAnswerValue extends DriverManager {


    Sanity sanity = new Sanity();

    @Test(priority=1)
    public void generateBasicSanityTest() {

        sanity.setUp();
        sanity.introScreen();
        sanity.firstQuestion();

    }


    @Test(priority=2)
    public void generateMaxValue() {

        String thirtyOneLetters = String.join("", Collections.nCopies(31, "A"));
        answerScreen[0] = new AnswerScreen(driver);
        // assert you're on the right screen
        answerScreen[0].assertPage("question number: 1");
        // parameter 1: field number
        // parameter 2: free text
        answerScreen[0].typeAnswer("1",thirtyOneLetters);
        answerScreen[0].typeAnswer("2","a");
        answerScreen[0].typeAnswer("3","a");
        answerScreen[0].typeAnswer("4","a");
        answerScreen[0].clickOnRadioButton("1");
        answerScreen[0].clickNextButton();

    }

    @AfterTest
    public void tearDown() throws InterruptedException {

        driver.switchTo().alert().accept();
        driver.close();
        driver.quit();

    }

}
