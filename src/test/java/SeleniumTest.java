import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class SeleniumTest {
    WebDriver driver = new ChromeDriver();

    @BeforeTest
    void setup()
    {
        System.setProperty("WebDriver.chrome.driver",System.getProperty("user.dir")+"/src/test/Resources/chromedriver.exe");

        driver.get("https://www.demoblaze.com/index.html");
    }

    @Test
    void createAndUpdateOrder()
    {
        try{

        driver.manage().window().maximize();
        WebElement home = driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a"));
        home.click();
        driver.findElement(By.xpath("//*[@id=\"itemc\"]")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/a/img")));
        driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/a/img")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"tbodyid\"]/h3")));
        String priceOfPhone = driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/h3")).getText();
        System.out.println("Price:"+priceOfPhone);

            String[] splitPrice = priceOfPhone.split(" ",2);
            int priceInInt = Integer.parseInt(splitPrice[0].substring(1));
            System.out.println(priceInInt);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")));
        driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//*[@id=\"cartur\"]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"tbodyid\"]/tr/td[3]")));
        String priceOfPhoneInCart = driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/tr/td[3]")).getText();
        System.out.println("Price of phone in the cart"+priceOfPhoneInCart);

            Assert.assertEquals(Integer.parseInt(priceOfPhoneInCart), priceInInt);

      /*  if(priceInInt == Integer.parseInt(priceOfPhoneInCart))
            System.out.println("Pass");
        else
            System.out.println("Failed");
      */



        driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a")).click();

            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@onclick=\"byCat('notebook')\"]")));
        driver.findElement(By.xpath("//*[@onclick=\"byCat('notebook')\"]")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a/img")));
        driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a/img")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"tbodyid\"]/h3")));
        String priceLaptop = driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/h3")).getText();
        System.out.println("Price of laptop "+priceLaptop);
        driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//*[@id=\"cartur\"]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"tbodyid\"]/tr[2]/td[3]")));
        String priceOfLaptopInCart = driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/tr[1]/td[3]")).getText();
        System.out.println("Price of Laptop in Cart:"+priceOfLaptopInCart);
        //home.click();
        driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a")).click();
        WebElement monitor =  driver.findElement(By.xpath("//*[@onclick=\"byCat('monitor')\"]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("monitor.scrollIntoView();”, monitor);
              //  js.executeScript(“arguments[0].scrollIntoView();”, webElement);
        js.executeScript("window.scrollBy(0,50)");
        monitor.click();
        js.executeScript("window.scrollBy(0,50)");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")));
        driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"tbodyid\"]/h3")));
        String priceOfMonitor = driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/h3")).getText();
        System.out.println("price of monitor"+priceOfMonitor);
        driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
            wait.until(ExpectedConditions.alertIsPresent());
            driver.switchTo().alert().accept();
            driver.findElement(By.xpath("//*[@id=\"cartur\"]")).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"tbodyid\"]/tr[3]/td[3]")));
            String priceOfMonitorInCart = driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/tr[3]/td[3]")).getText();
            System.out.println("Price of Monitor in Cart:"+priceOfMonitorInCart);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"totalp\"]")));

            String price1 = driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/tr[1]/td[3]")).getText();
            System.out.println("Price1:"+price1);
            String price2 = driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/tr[2]/td[3]")).getText();
            System.out.println("Price2:"+price2);
            String price3 = driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/tr[3]/td[3]")).getText();
            System.out.println("Price3:"+price3);
            int expectedTotal = Integer.parseInt(price1) + Integer.parseInt(price2) + Integer.parseInt(price3);
            System.out.println("Expected Total:"+expectedTotal);


            String actualTotal = driver.findElement(By.xpath("//*[@id=\"totalp\"]")).getText();
            System.out.println("Total Price:"+ Integer.parseInt(actualTotal));
            Assert.assertEquals(Integer.parseInt(actualTotal),expectedTotal);
            /*if(expectedTotal == Integer.parseInt(actualTotal))
            {
                System.out.println("Pass");

            }
            else
                System.out.println("Fail");
*/
            driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/tr[1]/td[4]/a")).click();
            Thread.sleep(1000);
            String updatedTotal = driver.findElement(By.xpath("//*[@id=\"totalp\"]")).getText();
            System.out.println("updated total:"+updatedTotal);
            price1 = driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/tr[1]/td[3]")).getText();
            System.out.println("price1:"+price1);
            price2 = driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/tr[2]/td[3]")).getText();
            System.out.println("price2:"+price2);
            Assert.assertEquals(Integer.parseInt(updatedTotal),Integer.parseInt(price1) + Integer.parseInt(price2));
            /*if(Integer.parseInt(price1) + Integer.parseInt(price2) == Integer.parseInt(updatedTotal))
                System.out.println("Pass");
            else
                System.out.println("Failed");

             */


        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}