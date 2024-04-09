package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class Test15 extends TestBaseBeforeMethodAfterMethod {
    @Test
    public void test() {
        driver.navigate().to("https://www.youtube.com/");
        Assert.assertTrue(driver.getTitle().equals("YouTube"));
        driver.findElement(By.xpath("(//*[@id='logo-icon'])[1]")).isDisplayed();
        driver.findElement(By.xpath("(//*[@id='search'])[3]")).isEnabled();
        Assert.assertFalse(driver.getTitle().equals("youtube"));
    }
}
