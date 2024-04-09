package tests3;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class Test41 extends TestBaseBeforeMethodAfterMethod {

    @Test
    public void test() {
        driver.get("https://www.youtube.com/");
        Assert.assertEquals(driver.getTitle(), "YouTube");
        Assert.assertTrue(driver.findElement(By.xpath("(//*[@id='logo-icon'])[1]")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[@name='search_query']")).isEnabled());
        Assert.assertFalse(driver.getTitle().contains("youtube"));

    }

}
