package utils.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {

    // Method for setting WebDriver based on argument provided via command line
    public WebDriver setDriver(String browserType) {
        switch (browserType) {
            case "firefox" -> {
                return new FirefoxDriver();
            }
            case "chrome" -> {
                return new ChromeDriver();
            }
            default -> {
                throw new IllegalStateException("Unexpected value: " + browserType);
            }
        }
    }
}