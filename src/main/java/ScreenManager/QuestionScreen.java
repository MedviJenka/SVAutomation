package ScreenManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class QuestionScreen {

    WebDriver driver;
    public QuestionScreen(WebDriver driver) {

        this.driver = driver;

    }


    By header = By.id("questhead");
    By field = By.name("question");
    By button = By.id("nextquest");
    By back = By.id("backquest");

    public void assertPage(String text) {
        WebElement page = driver.findElement(header);
        Assert.assertEquals(page.getText(), text);
    }


    public void typeQuestion(String text) {
        driver.findElement(field).sendKeys(text);
    }


    public void clickNextButton() {
        driver.findElement(button).click();
    }

    public void clickBackButton() {
        driver.findElement(back).click();
    }
}
