package ScreenManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class GamePlayAnswerScreen {

    WebDriver driver;
    public GamePlayAnswerScreen(WebDriver driver) {

        this.driver = driver;

    }


    // screen header
    By header = By.id("testpage");
    By headerCss = By.cssSelector("#testpage > center > h1 > u");

    // buttons
    By next = By.id("btnnext");
    By back = By.id("btnback");

    public void assertPage() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.visibilityOfElementLocated(headerCss));
        String expectedString = driver.findElement(headerCss).getText();
        Assert.assertEquals(expectedString, "Test");

    }

    public void clickOnRadioButton(String screenNumber, String radioButton) {

        String choice = String.format("/html/body/div/section[3]/div[%s]/input[%s]", screenNumber, radioButton);
        driver.findElement(By.xpath(choice)).click();
    }

    public void clickOnNextButton() {

        driver.findElement(next).click();

    }

    public void clickOnBackButton() {

        driver.findElement(back).click();

    }



}
