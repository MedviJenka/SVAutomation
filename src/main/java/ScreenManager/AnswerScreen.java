package ScreenManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;


public class AnswerScreen {

    WebDriver driver;
    public AnswerScreen(WebDriver driver) {

        this.driver = driver;

    }


    // buttons
    By page = By.id("answerhead");
    By nextb = By.id("nextquest");
    By backb = By.id("backquest");



    // page header
    public void assertPage(String text) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.visibilityOfElementLocated(page));
        Assert.assertEquals(text, driver.findElement(page).getText());

    }


    public void typeAnswer(String fieldNumber, String text) {
        String xpathString = String.format("/html/body/div/section[1]/main/div/form/div/div/div[%s]/div[2]/input", fieldNumber);
        driver.findElement(By.xpath(xpathString)).sendKeys(text);
    }

    public void clickOnRadioButton(String number) {

        String xpathString = String.format("/html/body/div/section[1]/main/div/form/div/div/div[%s]/div[1]/input", number);
        driver.findElement(By.xpath(xpathString)).click();

    }


    public void clickNextButton() {
        driver.findElement(nextb).click();
    }

    public void clickBackButton() {
        driver.findElement(backb).click();
    }

}
