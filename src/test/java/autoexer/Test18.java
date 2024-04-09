package autoexer;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class Test18 {
    @Test
    public void test() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("auto"));
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[@class='left-sidebar']")).isDisplayed());
        Driver.getDriver().findElement(By.xpath("(//*[@data-toggle='collapse'])[1]")).click();
        Thread.sleep(2000);
        Driver.getDriver().findElement(By.xpath("(//*[text()='Dress '])[1]")).click();
        Assert.assertNotEquals(Driver.getDriver().findElement(By.xpath("//*[text()='Women - Dress Products']")).getText(), "WOMEN - TOPS PRODUCTS");
        Driver.getDriver().findElement(By.xpath("(//*[@data-toggle='collapse'])[2]")).click();
        Thread.sleep(2000);
        Driver.getDriver().findElement(By.xpath("//*[text()='Jeans ']")).click();
        Thread.sleep(3000);
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[@class='title text-center']")).isDisplayed());
        Driver.closeDriver();
    }
}
