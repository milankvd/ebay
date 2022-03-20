package PageObject;

import Utils.DriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;


    @FindBy(id = "L2AGLb")
    public WebElement iagrree;

    @FindBy(xpath = "//input[@class='gLFyf gsfi']")
    public WebElement googleSearchBar;

    @FindBy(xpath = "(//cite[@class='iUh30 tjvcx'])[1]")
    // @FindBy(xpath = "//h3[text()='eBay - Wikipedia']")
    public WebElement ebayLink;

    @FindBy(id = "gh-la")
    public WebElement ebayLogo;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnIAgree() {
        iagrree.click();

    }

    public void enterTextInSearchBar(String text) {
        googleSearchBar.sendKeys(text);
    }

    public void clickOnEbayUrl() {
        ebayLink.click();
    }

    public boolean verifyEbayLogo() {
       boolean status=    ebayLogo.isDisplayed();
        System.out.println(status);
        return status;

    }
}


