package IntegrationTest;

import SanityTest. * ;
import ScreenManager.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


/*
* in this test case we will check the system reaction to integration
* result: FAILED (404)
* the test is passing but with bug error
*/

public class Integration extends DriverManager {

    //Sanity sanity = new Sanity();
    Sanity sanity = new Sanity();
    @Test(priority = 1)
    public void generateBasicSanityTest() {


        sanity.setUp();
        sanity.introScreen();
        sanity.firstQuestion();
        sanity.firstAnswer();
        sanity.secondQuestion();
        sanity.secondAnswer();
        sanity.thirdQuestion();
        sanity.thirdAnswer();
        sanity.finalScreen();
        sanity.gamePlayScreen1();
        sanity.gamePlayScreen2();
        sanity.gamePlayScreen3();

    }


    @Test(priority = 2)
    public void facebookShareTest() throws InterruptedException {

        GameEndingScreen gameEndingScreen = new GameEndingScreen(driver);
        gameEndingScreen.assertPage();
        gameEndingScreen.clickOnShareButton();
        driver.switchTo().alert().accept();
    }


    @AfterTest
    public void tearDown() {

        driver.close();
        driver.quit();
        System.out.println("sanity done");

    }

}




