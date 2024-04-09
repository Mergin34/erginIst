package tests2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

import java.util.ArrayList;
import java.util.List;

public class Test34 extends TestBaseBeforeMethodAfterMethod {
    @Test
    public void test() {
        driver.get("https://webdriveruniversity.com/");
        driver.findElement(By.xpath("//*[text()='LOGIN PORTAL']")).click();
        List<String> windows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(1));
        WebElement username = driver.findElement(By.xpath("//*[@placeholder='Username']"));
        WebElement password = driver.findElement(By.xpath("//*[@placeholder='Password']"));
        WebElement login = driver.findElement(By.xpath("//*[@id='login-button']"));
        username.sendKeys("Robert");
        password.sendKeys("12345!");
        login.click();
        Assert.assertEquals(driver.switchTo().alert().getText(), "validation failed");
        driver.switchTo().alert().accept();
        driver.switchTo().window(windows.get(0));
        Assert.assertEquals(driver.getCurrentUrl(),"https://webdriveruniversity.com/");
    }
}
