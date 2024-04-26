package StepDefinitions;

import PageObjects.HomePage;
import PageObjects.LetsGetStartedPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.cucumber.java.en.Given;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class HomepageStepDefinitions {
    WebDriver driver;
    ChromeOptions opt;
    HomePage homeObj;
    LetsGetStartedPage letsGetStartedObj;

    @Given("user is navigated to home page with url {string}")
    public void user_is_navigated_to_home_page_with_url(String url) {
        opt = new ChromeOptions();
        opt.addArguments("start-maximized");
        opt.setImplicitWaitTimeout(Duration.ofSeconds(5));
        driver = WebDriverManager.chromedriver().capabilities(opt).create();

        letsGetStartedObj = new LetsGetStartedPage(driver);
        homeObj = new HomePage(driver);

        driver.get(url);
    }

    @When("user enters the {string} zip code and click on starts a quote button")
    public void user_enters_the_zip_code_and_click_on_starts_a_quote_button(String value) {
        try {
            System.out.println("Before scrolling");
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,200)");
            System.out.println("After scrolling");


            homeObj.setZipcode(value);
            System.out.println("After entering zip code");
            homeObj.clickStartAQuote();
            System.out.println("After clicking on the button");

        } catch (Exception e) {
            throw new AssertionError("Exception Occurred when Entering zip code or clicking button=>" + e);
//            e.printStackTrace();
        }
    }

    @Then("user should be in lets get started page")
    public void user_should_be_in_lets_get_started_page() {
        homeObj.verifySuccessfulLanding();
        }


    }
