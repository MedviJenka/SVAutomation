package FunctionalityTests;


import SanityTest. * ;
import ScreenManager.DriverManager;
import ScreenManager.QuestionScreen;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class NextWithNoStringQuestionScreen extends DriverManager {

    Sanity sanity = new Sanity();

    @Test
    public void generateTest() {

        sanity.setUp();
        sanity.introScreen();

        QuestionScreen question = new QuestionScreen(driver);
        question.clickNextButton();
    }


    @AfterTest
    public void tearDown() {

        driver.close();
        driver.quit();

    }

}
