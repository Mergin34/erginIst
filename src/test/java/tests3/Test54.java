package tests3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeClassAfterClass;

import java.util.ArrayList;
import java.util.List;

public class Test54 extends TestBaseBeforeClassAfterClass {
    @Test
    public void test() throws InterruptedException {
        driver.get("https://webdriveruniversity.com/");
        WebElement login = driver.findElement(By.xpath("//*[text()='LOGIN PORTAL']"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true);", login);
        Thread.sleep(2000);
        jse.executeScript("arguments[0].click();", login);
        Thread.sleep(2000);
        //driver.findElement(By.xpath("//*[text()='LOGIN PORTAL']")).click();
        List<String> windows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(1));
        WebElement username = driver.findElement(By.xpath("//*[@placeholder='Username']"));
        WebElement password = driver.findElement(By.xpath("//*[@placeholder='Password']"));
        username.sendKeys("robert");
        password.sendKeys("12345!");
        driver.findElement(By.xpath("//*[@id='login-button']")).click();
        Assert.assertEquals(driver.switchTo().alert().getText(), "validation failed");
        driver.switchTo().alert().accept();
        driver.switchTo().window(windows.get(0));
        Assert.assertEquals(driver.getCurrentUrl(), "https://webdriveruniversity.com/");
    }
}
