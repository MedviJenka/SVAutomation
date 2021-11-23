package ScreenManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;


public class FinalScreen {

    WebDriver driver;
    public FinalScreen(WebDriver driver) {
        this.driver = driver;

    }


    By page = By.cssSelector("#needBackGround");
    By play = By.cssSelector("button.playCB");
    By exit = By.xpath("//*[@id=\"secondepage\"]/center/button[2]");


    public void assertPage() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(page));
        String pageName = driver.findElement(page).getText();
        Assert.assertEquals(pageName, "You finished to build the test - lets play!!");

    }

    public void clickOnPlayButton() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(play));

        driver.findElement(play).click();

    }

    public void clickOnQuitButton() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(exit));
        driver.findElement(exit).click();

    }

}



