package pages;

import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.logs.Log;

public class CheckoutCompletionPage extends BasePage {

    public CheckoutCompletionPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@id='checkout_complete_container']/h2")
    private WebElement thankYouMessage;

    @FindBy(id = "back-to-products")
    WebElement buttonBackHome;

    public boolean isAtCheckoutCompletionPage() {
        return driver.getCurrentUrl().equals(Urls.CHECKOUT_COMPLETION_PAGE);
    }

    public String getThankYouMessage() {
        return readText(thankYouMessage);
    }

    public ProductsPage clickHomeButton() {
        click(buttonBackHome);
        Log.info("Open Products Page " + driver.getCurrentUrl());
        return new ProductsPage(driver);
    }


}