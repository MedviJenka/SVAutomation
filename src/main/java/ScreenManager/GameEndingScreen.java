package ScreenManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;


public class GameEndingScreen {

    WebDriver driver;
    public GameEndingScreen(WebDriver driver) {

        this.driver = driver;

    }

    By text = By.id("mark");
    By quitBtn = By.xpath("//*[@id=\"fackBook2\"]/img");
    By tryBtn = By.cssSelector("#markpage > center > button:nth-child(8)");

    public void assertPage() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(text));
        String expectedText = driver.findElement(text).getText();
        Assert.assertEquals(expectedText, "Sucsses");

    }

    public void clickOnQuitButton() {

        driver.findElement(quitBtn).click();

    }

    public void clickOnTryAgainButton() {

        driver.findElement(tryBtn).click();

    }



    public void clickOnShareButton() {

        By xpath = By.xpath("//*[@id=\"fackBook2\"]/img");
        By byLink = By.cssSelector("#fackBook2 > img");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.visibilityOfElementLocated(xpath));
        driver.findElement(xpath).click();

    }



}
