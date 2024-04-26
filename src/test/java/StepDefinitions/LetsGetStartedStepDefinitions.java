package StepDefinitions;

import PageObjects.HomePage;
import PageObjects.LetsGetStartedPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import java.time.Duration;

public class LetsGetStartedStepDefinitions {
    WebDriver driver;
    ChromeOptions opt;
    LetsGetStartedPage letsGetStartedObj;
    HomePage homeObj;


    @Given("user is already LetsGetStarted Page")
    public void user_is_already_LetsGetStarted_Page() {
        Assert.assertTrue(letsGetStartedObj.isMessagePresent());
        System.out.println("On the Lets Get Started Page");
    }

    @When("user selects No for Are you currently a Travelers customer?")
    public void user_selects_No_for_Are_you_currently_a_Travelers_customer() {
        System.out.println("Before clicking No");
        letsGetStartedObj.AreyoucurrentlyaTravelerscustomerNo();
        System.out.println("After clicking No");
    }

    @And("user click on Continue Quote button")
    public void user_click_on_Continue_Quote_button() {
        System.out.println("Before clicking button");
        letsGetStartedObj.clickContinueQuote();
        System.out.println("After clicking button");
    }

    @Then("new user page should be displayed")
    public void new_user_page_should_be_displayed() {
        letsGetStartedObj.verifyNewCustomer();
    }


}
