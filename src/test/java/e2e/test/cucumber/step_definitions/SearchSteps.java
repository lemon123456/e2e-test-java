package e2e.test.cucumber.step_definitions;

import config.helper;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import e2e.test.cucumber.Hooks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.SearchPage;


public class SearchSteps {
    private WebDriver driver;
    private static SearchPage searchPage;

    public SearchSteps() {
//        driver = Hooks.driver;
//        searchPage = PageFactory.initElements(driver, SearchPage.class);

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        searchPage = PageFactory.initElements(driver, SearchPage.class);
    }

    @Given("^I am on the search page$")
    public void i_am_on_the_search_page() throws Throwable {
        driver.get(helper.url);
    }

    @When("^I enter \"([^\"]*)\" into the search box$")
    public void i_enter_into_the_search_box(String arg1) throws Throwable {
        searchPage.input.sendKeys(arg1);
        Thread.sleep(2000);
    }

    @When("^I click the search button$")
    public void i_click_the_search_button() throws Throwable {
        searchPage.searchButton.click();
    }
}
