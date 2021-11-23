package FunctionalityTests;

import SanityTest.Sanity;
import ScreenManager.DriverManager;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class RefreshScreen extends DriverManager {

    Sanity sanity = new Sanity();

    @Test
    public void reloadScreen() {

        // partial sanity flow
        sanity.setUp();
        sanity.introScreen();

        //refresh
        driver.navigate().refresh();



    }

    @AfterTest
    public void tearDown() {

        driver.switchTo().alert().accept();
        driver.close();
        driver.quit();
        System.out.println("sanity done");

    }


}
