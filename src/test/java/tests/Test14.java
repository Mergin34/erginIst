package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeClassAfterClass;

public class Test14 extends TestBaseBeforeClassAfterClass {
    @Test
    public void test() {
        driver.navigate().to("https://www.bestbuy.com/");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.bestbuy.com/");
        Assert.assertFalse(driver.getTitle().contains("Rest"));
        driver.findElement(By.xpath("(//*[@class='logo'])[1]")).isDisplayed();
        driver.findElement(By.xpath("//*[text()='Français']")).isDisplayed();
    }
}
