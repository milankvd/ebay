package steps;

import Base.BasePage;
import Utils.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class StepDefinition {

    @Given("User should be on Google home page")
    public void user_should_be_on_google_home_page() {
        BasePage.driverUtils.navigateToUrl(DriverFactory.prop.getProperty("url"));
        BasePage.homePage.clickOnIAgree();
    }
    @When("User search ebay in google search bar and press enter")
    public void user_search_ebay_in_google_search_bar_and_press_enter() {
        BasePage.homePage.enterTextInSearchBar(DriverFactory.prop.getProperty("searchText"));
        Actions actions =new Actions(DriverFactory.driver);
        actions.sendKeys(BasePage.homePage.googleSearchBar, Keys.ENTER).build().perform();
    }
    @When("User click on correct result of ebay page from search result")
    public void user_click_on_correct_result_of_ebay_page_from_search_result() {
        BasePage.homePage.clickOnEbayUrl();
    }

    @Then("User should navigate to ebay homepage")
    public void user_should_navigate_to_ebay_homepage() {
        String ActualPageTitle= DriverFactory.driver.getTitle();
        Assertions.assertEquals(DriverFactory.prop.getProperty("expectedEbayHomePageTitle"),ActualPageTitle);

    }
    @Then("user should able to see ebay logo")
    public void user_should_able_to_see_ebay_logo() {
        BasePage.homePage.verifyEbayLogo();

    }
}
