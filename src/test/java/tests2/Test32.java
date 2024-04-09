package tests2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeClassAfterClass;

import java.time.Duration;

public class Test32 extends TestBaseBeforeClassAfterClass {
    @Test
    public void test() {
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[text()='Remove']")))).click();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='message']")).isDisplayed());
        Assert.assertFalse(driver.findElement(By.xpath("//*[@type='text']")).isEnabled());
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[text()='Enable']")))).click();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='message']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[@type='text']")).isEnabled());


    }
}
