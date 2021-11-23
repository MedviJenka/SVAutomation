package FunctionalityTests;


import SanityTest. * ;
import ScreenManager. * ;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

/*
 * in this test case we will check the quit button functionality
 */

public class QuitButton extends DriverManager {

    @Test
   public void quitButtonTest() {
       // partial sanity flow
        Sanity sanity = new Sanity();
        // partial sanity flow
        sanity.setUp();
        sanity.introScreen();
        sanity.firstQuestion();
        sanity.firstAnswer();
        sanity.secondQuestion();
        sanity.secondAnswer();
        sanity.thirdQuestion();
        sanity.thirdAnswer();
        // final screen object
        finalScreen = new FinalScreen(driver);
        // assert you're on the right page
        finalScreen.assertPage();

        // catching error
        try {
            finalScreen.clickOnQuitButton();
        } catch(Exception e) {
            Assert.assertNull(driver);
        }

   }


    @AfterTest
    public void tearDown() {
        driver.close();
        driver.quit();

    }

}
