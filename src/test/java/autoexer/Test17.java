package autoexer;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutoExerPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Test17 {
    @Test
    public void test() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("auto"));
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://www.automationexercise.com/");
        AutoExerPage autoExerPage = new AutoExerPage();
        autoExerPage.inProductsFirstAddTheCart.click();
        Thread.sleep(3000);
        autoExerPage.viewCartButton.click();
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[@id='cart_info']")).isDisplayed());
        autoExerPage.removeProduct.click();
        Thread.sleep(3000);
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("(//*[@class='text-center'])[3]")).isDisplayed());
        Driver.closeDriver();
    }
}
