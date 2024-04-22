package shoppingpageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class ShoppingCart {
    private WebDriver driver;
    private By cart = By.linkText("Cart");
    private By table = By.xpath("//tbody[@id='tbodyid']/tr");
    private By totalprice = By.xpath("//h3[@id='totalp']");
    private By delete = By.linkText("Delete");

    String actualtotalprice, totalpricefromtable;
    int sumprice = 0;

    public ShoppingCart(WebDriver driver) {
        this.driver = driver;
    }

    public void clickcartlink() {
        driver.findElement(cart).click();
    }

    public void priceofitem() {
        sumprice=0;
        driver.navigate().refresh();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(delete));
        List<WebElement> totalrows = driver.findElements(table);
        int row = totalrows.size();
        System.out.println("The total number of rows are " +totalrows.size());
        for (int i=0; i<row; i++) {
            int j = i+1;
            String price = driver.findElement(By.xpath("//tbody[@id='tbodyid']/tr["+j+"]/td[3]")).getText();
            sumprice = sumprice+Integer.parseInt(price);
            System.out.println("The Total Price is " +sumprice);

            if(i==row) {
                break;
            }
        }
    }

    public void verifyprice() {
        driver.navigate().refresh();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(delete));
        actualtotalprice = driver.findElement(totalprice).getText();
        totalpricefromtable = String.valueOf(sumprice);
        System.out.println("The Total price calculated from table is "+totalpricefromtable);
        System.out.println("The Actual price available is "+totalpricefromtable);
        Assert.assertEquals(actualtotalprice,totalpricefromtable);
    }

    public void removeitem() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(delete));
        driver.findElement(delete).click();
    }
}