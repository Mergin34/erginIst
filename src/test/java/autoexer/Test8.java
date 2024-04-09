package autoexer;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutoExerPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Test8 {
    @Test
    public void test() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("auto"));
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://www.automationexercise.com/");
        AutoExerPage autoPage = new AutoExerPage();
        autoPage.products.click();
        Thread.sleep(5000);
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://www.automationexercise.com/products");
        Assert.assertTrue(autoPage.allProductsText.isDisplayed());
        autoPage.viewProductsInFirst.click();
        Thread.sleep(5000);
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[text()='Blue Top']")).isDisplayed());
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[text()='Category: Women > Tops']")).isDisplayed());
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/span")).isDisplayed());
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[text()=' In Stock']")).isDisplayed());
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[text()=' New']")).isDisplayed());
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[text()=' Polo']")).isDisplayed());
        Driver.closeDriver();
    }
}
