package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Custom click method with wait included
    public void click(WebElement element) {
        waitToBeClickable(element).click();
    }

    // Custom method for sending text to WebElement with wait included
    public void writeText(WebElement element, String text) {
        waitVisibility(element).sendKeys(text);
    }

    // Custom method for getting element text with wait included
    public String readText(WebElement element) {
        return waitVisibility(element).getText();
    }

    // Helper method for checking visibility of element
    private WebElement waitVisibility(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    // Helper method for wait for element to be clickable
    private WebElement waitToBeClickable(WebElement element) {
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}