package tests3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBaseBeforeClassAfterClass;
import utilities.TestBaseBeforeMethodAfterMethod;

import java.util.ArrayList;
import java.util.List;

public class Test43 extends TestBaseBeforeMethodAfterMethod {
    @Test
    public void test() throws InterruptedException {
        driver.get("http://zero.webappsecurity.com/");
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
        WebElement currency = driver.findElement(By.xpath("//*[@id='pc_currency']"));
        Select select = new Select(currency);
        select.selectByVisibleText("Eurozone (euro)");

        SoftAssert softAssert = new SoftAssert();
        System.out.println(driver.findElement(By.xpath("//option[7]")).getText());
        softAssert.assertEquals(driver.findElement(By.xpath("//option[7]")).getText(), "Eurozone (euro)");

        List<WebElement> ddC = new ArrayList<>(driver.findElements(By.xpath("//option")));
        for (int i = 0; i < ddC.size(); i++) {
            System.out.println(ddC.get(i).getText());
           // softAssert.assertEquals(ddC.get(i).getText(),"" );
        }

        softAssert.assertAll();
    }
}
