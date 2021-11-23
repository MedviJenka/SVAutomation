package CompatibilityTestCase;

import SanityTest. * ;
import ScreenManager.DriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.time.Duration;


/*
* in this case we will test firefox compatibility
*/

public class FireFoxCompatibilityTest extends DriverManager {

    Sanity sanity  = new Sanity();

    @Test(priority=1)
    public void setup() {

        System.setProperty("webdriver.gecko.driver", FIREFOX_PATH);
        driver = new FirefoxDriver();
        driver.get("https://shemsvcollege.github.io/Trivia/");
        driver.manage().window().maximize();

    }

    @Test(priority=2)
    public void generateSanity() {


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
        sanity.gameEndingScreen();

    }


    @AfterTest
    public void tearDown() {
        
        driver.close();
        driver.quit();

    }

}
