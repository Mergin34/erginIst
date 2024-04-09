package tests3;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

import java.time.Duration;

public class Test56 extends TestBaseBeforeMethodAfterMethod {
    @Test
    public void test() throws InterruptedException {
        driver.get("https://demoqa.com/browser-windows");
        driver.findElement(By.xpath("(//*[@id='item-1'])[2]")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='timerAlertButton']")))).click();
        Assert.assertEquals(driver.switchTo().alert().getText(), "This alert appeared after 5 seconds");
        driver.switchTo().alert().accept();
    }
}
