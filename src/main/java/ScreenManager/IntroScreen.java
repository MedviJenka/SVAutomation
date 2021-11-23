package ScreenManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;


public class IntroScreen {

    public WebDriver driver;
    public IntroScreen(WebDriver driver) {
        this.driver = driver;
    }

    By button = By.id("startB");
    By introText = By.cssSelector("#headstart > legend");



    public void assertIntroPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.visibilityOfElementLocated(introText));
        String expectedText = driver.findElement(introText).getText();
        Assert.assertEquals(expectedText, "QA Test, to start the the test push the bottun below! good luck!");
    }


    public void clickOnStartButton() {
        driver.findElement(button).click();
    }
}
