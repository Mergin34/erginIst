package autoexer;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutoExerPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Test9 {
    @Test
    public void test() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("auto"));
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://www.automationexercise.com/");
        AutoExerPage autoPage = new AutoExerPage();
        autoPage.products.click();
        Thread.sleep(5000);
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://www.automationexercise.com/products");
        Assert.assertTrue(autoPage.allProductsText.isDisplayed());
        autoPage.searchProductButton.sendKeys("blue");
        Driver.getDriver().findElement(By.xpath("//*[@id='submit_search']")).click();
        Thread.sleep(5000);
        Assert.assertTrue(autoPage.allProductsText.isDisplayed());
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[@class='col-sm-9 padding-right']")).isDisplayed());
        Driver.closeDriver();
    }
}
