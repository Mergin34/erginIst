package autoexer;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutoExerPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Test12 {
    @Test
    public void test() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("auto"));
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://www.automationexercise.com/");
        AutoExerPage autoExerPage = new AutoExerPage();
        autoExerPage.products.click();
        Thread.sleep(5000);
        autoExerPage.inProductsFirstAddTheCart.click();
        Thread.sleep(4000);
        autoExerPage.continueShopping.click();
        autoExerPage.inProductsSecondAddTheCart.click();
        Thread.sleep(4000);
        autoExerPage.viewCartButton.click();
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[@id='cart_info_table']")).isDisplayed());
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("(//*[@class='cart_price'])[1]")).isDisplayed());
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("(//*[@class='cart_price'])[2]")).isDisplayed());
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("(//*[@class='cart_quantity'])[1]")).isDisplayed());
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("(//*[@class='cart_quantity'])[2]")).isDisplayed());
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("(//*[@class='cart_total'])[1]")).isDisplayed());
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("(//*[@class='cart_total'])[2]")).isDisplayed());
        Driver.closeDriver();
    }
}
