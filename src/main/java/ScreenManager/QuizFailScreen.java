package ScreenManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class QuizFailScreen {

    WebDriver driver;
    public QuizFailScreen(WebDriver driver) {

        this.driver = driver;

    }

    By page = By.id("mark");
    By quitBtn = By.xpath("//*[@id=\"fackBook2\"]/img");
    By tryBtn = By.cssSelector("#markpage > center > button:nth-child(8)");
    By facebook = By.cssSelector("#fackBook2 > img");

    public void assertPage() {

        String pageText = driver.findElement(page).getText();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.visibilityOfElementLocated(page));
        Assert.assertEquals(pageText, "Failed");

    }

    public void clickOnQuitButton() {

        driver.findElement(quitBtn).click();

    }

    public void clickOnTryAgainButton() {

        driver.findElement(tryBtn).click();

    }


    public void shareOnFacebook() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOfElementLocated(facebook));
        driver.findElement(facebook).click();

    }


}
