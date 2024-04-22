package shoppingcarttest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import shoppingpageobjects.ShoppingCart;
import shoppingpageobjects.ShoppingPages;

import java.time.Duration;

public class ShoppingCartTest {
    private WebDriver driver;
    private String url = "https://www.demoblaze.com/index.html";
    private ShoppingPages shop;
    private ShoppingCart cart;

    @BeforeClass
    public void browserSetUp() {
       // System.setProperty("WebDriver.chrome.driver",System.getProperty("user.dir")+"/src/test/Resources/chromedriver.exe");
        driver = WebDriverManager.chromedriver().create();
        //driver.get("https://www.demoblaze.com/index.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        shop = new ShoppingPages(driver);
        cart = new ShoppingCart(driver);
    }

    @Test (priority = 1)
    public void addItemsandVerifyPrice() {
        driver.get(url);
        shop.clickItem1();
        shop.addItemstoCart();
        shop.clickHome();
        shop.clickItem2();
        shop.addItemstoCart();
        shop.clickHome();
        shop.clickItem3();
        shop.addItemstoCart();
        cart.clickcartlink();
        cart.priceofitem();
        cart.verifyprice();
    }

    @Test (priority = 2)
    public void removeItemsandVerifyPrice() {
        cart.removeitem();
        cart.priceofitem();
        cart.verifyprice();
    }

    @AfterClass
    public void closeAllBrowsers() {
        driver.close();
        driver.quit();
    }
}