package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.logs.Log;

public class CheckoutInfoPage extends BasePage {

    public CheckoutInfoPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "first-name")
    private WebElement inputFirstName;

    @FindBy(id = "last-name")
    private WebElement inputLastName;

    @FindBy(id = "postal-code")
    private WebElement inputPostalCode;

    @FindBy(id = "continue")
    private WebElement buttonContinue;

    public CheckoutOverviewPage submitUserInfo(String first, String last, String email) {
        writeText(inputFirstName, first);
        writeText(inputLastName, last);
        writeText(inputPostalCode, email);
        click(buttonContinue);
        Log.info("Open Checkout Overview Page " + driver.getCurrentUrl());
        return new CheckoutOverviewPage(driver);
    }


}