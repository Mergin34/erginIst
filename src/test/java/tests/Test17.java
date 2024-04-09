package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ZeroPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseBeforeClassAfterClass;

import java.time.Duration;

public class Test17 extends TestBaseBeforeClassAfterClass {
    @Test
    public void test() throws InterruptedException {
        driver.navigate().to("http://zero.webappsecurity.com/");
        driver.findElement(By.xpath("//*[@id='signin_button']")).click();
        Actions actions = new Actions(driver);
        WebElement login = driver.findElement(By.xpath("//*[@id='user_login']"));
        login.sendKeys("username");
        actions.sendKeys(Keys.TAB).sendKeys("password").
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).perform();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='online-banking']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='pay_bills_link']")).click();
        Thread.sleep(3000);
        WebElement pfc = driver.findElement(By.xpath("//*[text()='Purchase Foreign Currency']"));
        pfc.click();
//        actions.sendKeys(Keys.TAB).sendKeys("Eurozone (euro)").
//                sendKeys(Keys.TAB).sendKeys("2000").perform();
        WebElement currency = driver.findElement(By.xpath("//*[@id='pc_currency']"));
        Select select = new Select(currency);
        select.selectByVisibleText("Eurozone (euro)");
        WebElement amount = driver.findElement(By.xpath("//*[@id='pc_amount']"));
        amount.sendKeys("2000");
        Thread.sleep(3000);
        WebElement usDollar = driver.findElement(By.xpath("//*[@id='pc_inDollars_true']"));
        Assert.assertFalse(usDollar.isSelected());
        Thread.sleep(3000);
        WebElement selectedCurrency = driver.findElement(By.xpath("//*[@id='pc_inDollars_false']"));
        selectedCurrency.click();
        Thread.sleep(3000);
        actions.sendKeys(Keys.ENTER).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        driver.findElement(By.xpath("//*[@id='purchase_cash']")).click();
        WebElement resultSent = driver.findElement(By.xpath("//*[@id='alert_content']"));
        Thread.sleep(3000);
        //Assert.assertFalse(resultSent.isDisplayed());

    }
}
