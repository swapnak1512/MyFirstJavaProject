package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    WebDriver driver;

    By AcceptButton = By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]");
    //By Zipcode = By.xpath("//*[@id=\"zip-code-single638496549899230845\"]");
    By Zipcode = By.xpath("//input[contains(@id,\"zip-code-single\")]");

    //By StartAQuoteBtn = By.xpath("//*[@id=\"Auto_cf502a0c-9304-455d-8897-b91f7baa45b9\"]/section/button");

    By StartAQuoteBtn = By.xpath("//div[starts-with(@id,\"Auto\")]/section/button");

    By LetsGetStarted = By.xpath("//*[@id=\"welcomePageTitle\"]");

    //Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void setZipcode(String zip) {
        if(driver.findElement(AcceptButton).isDisplayed())
            driver.findElement(AcceptButton).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(Zipcode));
        driver.findElement(Zipcode).sendKeys(zip);
    }

    public void clickStartAQuote() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.elementToBeClickable(StartAQuoteBtn));
        driver.findElement(StartAQuoteBtn).click();
    }


    public boolean verifySuccessfulLanding() {
        return driver.findElement(LetsGetStarted).isDisplayed();
    }
}
