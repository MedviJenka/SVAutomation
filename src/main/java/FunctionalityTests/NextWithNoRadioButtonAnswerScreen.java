package FunctionalityTests;

import SanityTest.Sanity;
import ScreenManager.AnswerScreen;
import ScreenManager.DriverManager;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class NextWithNoRadioButtonAnswerScreen extends DriverManager {

    Sanity sanity = new Sanity();

    @Test
    public void generateTest() {

        sanity.setUp();
        sanity.introScreen();
        sanity.firstQuestion();


        try{

            AnswerScreen answerScreen = new AnswerScreen(driver);
            answerScreen.clickNextButton();

        }
        catch(Exception e) {

            e.getCause();
            System.out.println(e.getMessage());

        }

    }


    @AfterTest
    public void tearDown() {
        driver.switchTo().alert().accept();
        driver.close();
        driver.quit();

    }

}
