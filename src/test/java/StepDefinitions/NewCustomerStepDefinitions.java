package StepDefinitions;

import PageObjects.HomePage;
import PageObjects.LetsGetStartedPage;
import PageObjects.NewCustomerPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class NewCustomerStepDefinitions {
    WebDriver driver;
    ChromeOptions opt;
    HomePage homeObj;
    LetsGetStartedPage letsGetStartedObj;
    NewCustomerPage newCustomerObj;

    @Given("user is already New Customer Page")
    public void user_is_already_New_Customer_Page()
    {
        Assert.assertTrue(newCustomerObj.isMessagePresent());
        System.out.println("User is on new customer page");
    }

    @When("user enters all mandatory fields")
    public void user_enters_all_mandatory_fields()
    {
        newCustomerObj.setFirstName("Sam");
        newCustomerObj.setLastName("Lee");
        newCustomerObj.setStreetAddr("1 SAINT MARC CIR");
        newCustomerObj.setIsMailingAddressYes();
        newCustomerObj.setHaveYouMoved();
        newCustomerObj.setGender();
        newCustomerObj.setDOB("11","11","1986");
    }

    @And("user click on Yes start Quote button")
    public void user_click_on_Yes_start_Quote_button()
    {
        newCustomerObj.clickYesStartQuote();
    }

    @Then("Tell us page should be displayed")
    public void Tell_us_page_should_be_displayed()
    {
        newCustomerObj.verifyTellUsPageDisplayed();
    }


}
