package PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class NewCustomerPage
{
    WebDriver driver;
    By NewCustomer = By.xpath("//h1[@id=\"pageTitle\"]");
    By FirstName = By.id("firstName");
    By LastName = By.id("lastName");
    By StreetAddr = By.id("streetAddr1");
    By isMailingAddressYes= By.id("radMailingYesLabel");
    By HaveYouMoved = By.xpath("//*[@id=\"radMovedNoLabel\"]/span");
    By Gender = By.id("genderDropdown");
    By DobMonth = By.id("dobMonth");
    By DobDay = By.id("dobDay");
    By DobYear = By.id("dobYear");
    By YesStartQuote = By.id("continue");

    By Tellus = By.xpath("//*[@id=\"pageTitle\"]");
    public NewCustomerPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void setFirstName(String fname)
    {
        driver.findElement(FirstName).sendKeys(fname);
    }

    public void setLastName(String lname)
    {
        driver.findElement(LastName).sendKeys(lname);
    }

    public void setStreetAddr(String strAddr)
    {
        driver.findElement(StreetAddr).sendKeys(strAddr);
    }

    public void setIsMailingAddressYes()
    {
        driver.findElement(isMailingAddressYes).click();
    }
    public void setHaveYouMoved()
    {
        driver.findElement(HaveYouMoved).click();
    }
    public void setGender()
    {
        Select drpGender = new Select(driver.findElement(Gender));
        drpGender.selectByVisibleText("Male");
    }
    public void setDOB(String mon, String day, String year)
    {
        driver.findElement(DobMonth).sendKeys(mon);
        driver.findElement(DobDay).sendKeys(day);
        driver.findElement(DobYear).sendKeys(year);
    }

    public void clickYesStartQuote()
    {
        driver.findElement(YesStartQuote);
    }
    public boolean isMessagePresent() {
        return driver.findElement(NewCustomer).isDisplayed();
    }

    public boolean verifyTellUsPageDisplayed()
    {
        return driver.findElement(Tellus).isDisplayed();
    }
}
