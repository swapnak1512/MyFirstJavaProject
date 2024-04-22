package shoppingpageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class ShoppingPages {
    private WebDriver driver;

    private By item1 = By.xpath("//a[@href='prod.html?idp_=1']");
    private By item2 = By.xpath("//a[@href='prod.html?idp_=2']");
    private By item3 = By.xpath("//a[@href='prod.html?idp_=3']");
    private By addbutton = By.linkText("Add to cart");
    private By home = By.xpath("//div[@id='navbarExample']/ul/li/a[contains(text(), 'Home ')]");

    public ShoppingPages(WebDriver driver) {
        this.driver = driver;
    }
    public void clickItem1() {
        driver.findElement(item1).click();
    }

    public void clickItem2() {
        driver.findElement(item2).click();
    }

    public void clickItem3() {
        driver.findElement(item3).click();
    }

    public void addItemstoCart() {
        driver.findElement(addbutton).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

    }

    public void clickHome() {
        driver.findElement(home).click();
    }
}