package FunctionalityTests;

import SanityTest. * ;
import ScreenManager. * ;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Collections;


/*
 * In this case we will test max letters in the question field (51)
 * Result: PASSED (the test itself has failed, but the program works normally)
 */

public class ErrorHandlingMaxValue extends DriverManager {

    Sanity sanity = new Sanity();

    @Test(priority=1)
    public void partialSanityFlow() {

        sanity.setUp();
        sanity.introScreen();

    }

    @Test(priority=2)
    public void fiftyLettersTest() {

        String fiftyLetters = String.join("", Collections.nCopies(51, "a"));

        // assert you're on the correct page
        questionScreen[0] = new QuestionScreen(driver);
        questionScreen[0].assertPage("question number: 1");

        // type a question
        questionScreen[0].typeQuestion(fiftyLetters);
        questionScreen[0].clickNextButton();

    }


    @AfterTest
    public void tearDown() {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.close();
        driver.quit();

    }

}
