package tests3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class Test52 extends TestBaseBeforeMethodAfterMethod {
    @Test
    public void test() throws InterruptedException {
        driver.get("https://editor.datatables.net/");
        driver.findElement(By.xpath("(//*[@type='button'])[1]")).click();
        Actions actions = new Actions(driver);
        WebElement firstName = driver.findElement(By.xpath("//*[@id='DTE_Field_first_name']"));
        firstName.click();
        actions.sendKeys("Robert").sendKeys(Keys.TAB).
                sendKeys("Levi").sendKeys(Keys.TAB).
                sendKeys("QA").sendKeys(Keys.TAB).
                sendKeys("Irland").sendKeys(Keys.TAB).
                sendKeys("Nothing").sendKeys(Keys.TAB).
                sendKeys("2022-05-25").sendKeys(Keys.TAB).
                sendKeys("4000").sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        Thread.sleep(3000);
        WebElement search = driver.findElement(By.xpath("//*[@type='search']"));
        search.click();
        search.sendKeys("Robert");
        Thread.sleep(3000);
        Assert.assertEquals(driver.findElement(By.xpath("//*[text()='Robert Levi']")).getText(), "Robert Levi");
    }
}
