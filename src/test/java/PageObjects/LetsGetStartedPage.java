package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LetsGetStartedPage {


    WebDriver driver;
    By No = By.xpath(" //label[@id=\"currentTrvCustomerNo\"]");
    By Yes = By.xpath("//label[@id=\"currentTrvCustomerYes\"]");

    By ContinueQuote = By.xpath("//button[@id=\"continue\"]");

    By CurrentCustomer = By.xpath("//*[@id=\"pageTitle\"]");

    By NewCustomer = By.xpath("//h1[@id=\"pageTitle\"]");
    By LetsGetStarted = By.xpath("//*[@id=\"welcomePageTitle\"]");
    public LetsGetStartedPage(WebDriver driver) {
        this.driver = driver;
    }

    public void AreyoucurrentlyaTravelerscustomerNo() {
        driver.findElement(No).click();
    }

    public void AreyoucurrentlyaTravelerscustomerYes() {
        driver.findElement(Yes).click();
    }

    public void clickContinueQuote()
    {
        driver.findElement(ContinueQuote).click();
    }

    public boolean verifyOldCustomer()
    {
        return driver.findElement(CurrentCustomer).isDisplayed();
    }

    public boolean verifyNewCustomer()
    {
        return driver.findElement(NewCustomer).isDisplayed();
    }
    public boolean isMessagePresent() {
        return driver.findElement(LetsGetStarted).isDisplayed();
    }
}
