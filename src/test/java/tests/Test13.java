package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseBeforeMethodAfterMethod;

public class Test13 extends TestBaseBeforeMethodAfterMethod {
    @Test
    public void test() {
        driver.get("https://www.facebook.com");
        driver.findElement(By.xpath("(//*[@role='button'])[2]")).click();
        WebElement radio = driver.findElement(By.xpath("(//*[@value='2'])[3]"));
        radio.click();
    }
}
