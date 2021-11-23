package FunctionalityTests;

import SanityTest.Sanity;
import ScreenManager.AnswerScreen;
import ScreenManager.DriverManager;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;



/*
 * In this case we will test hebrew letters in the answer field
 * Result: PASSED
 */



public class AnswerScreenHebrewLetters extends DriverManager {

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

        //flow
        answerScreen[0].typeAnswer("1","גכדגדג");
        answerScreen[0].typeAnswer("2","דגדגדג");
        answerScreen[0].typeAnswer("3","דגדגדג");
        answerScreen[0].typeAnswer("4","דגדגדשגדג");

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
