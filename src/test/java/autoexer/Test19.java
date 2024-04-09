package autoexer;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutoExerPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Test19 {
    @Test
    public void test() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("auto"));
        AutoExerPage autoExerPage = new AutoExerPage();
        autoExerPage.products.click();
        Thread.sleep(4000);
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[text()='Brands']")).isDisplayed());
        Driver.getDriver().findElement(By.xpath("//*[text()='Polo']")).click();
        Thread.sleep(4000);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("https://www.automationexercise.com/brand_products/Polo"));
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[@class='features_items']")).isDisplayed());
        Driver.getDriver().findElement(By.xpath("//*[text()='H&M']")).click();
        Thread.sleep(4000);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("https://www.automationexercise.com/brand_products/H&M"));
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[@class='features_items']")).isDisplayed());
        Driver.closeDriver();
    }
}
