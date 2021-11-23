package FunctionalityTests;

import SanityTest. * ;
import ScreenManager. * ;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


/*
 * In this case we will test all radio buttons functionality
 * Steps: Bouncing from screen 1 and back to test each radio button
 * Result: PASSED
 */

public class RadioButton extends DriverManager {


    @Test
    public void setUpScreens() {

        Sanity sanity = new Sanity();
        sanity.setUp();
        sanity.introScreen();
        sanity.firstQuestion();


        answerScreen[0] = new AnswerScreen(driver);
        // assert you're on the right screen
        answerScreen[0].assertPage("question number: 1");

        answerScreen[0].typeAnswer("1","2");
        answerScreen[0].typeAnswer("2","0");
        answerScreen[0].typeAnswer("3","0");
        answerScreen[0].typeAnswer("4","0");
        answerScreen[0].clickOnRadioButton("1");
        answerScreen[0].clickOnRadioButton("2");
        answerScreen[0].clickOnRadioButton("3");
        answerScreen[0].clickOnRadioButton("4");

    }


    @AfterTest
    public void tearDown() {

        driver.close();
        driver.quit();

    }

}
