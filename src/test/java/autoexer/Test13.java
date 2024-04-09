package autoexer;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutoExerPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Test13 {
    @Test
    public void test() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("auto"));
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://www.automationexercise.com/");
        AutoExerPage autoExerPage = new AutoExerPage();
        autoExerPage.viewProductsInFirst.click();
        Thread.sleep(4000);
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[@class='product-information']")).isDisplayed());
        autoExerPage.productQuantity.clear();
        autoExerPage.productQuantity.sendKeys("4");
        autoExerPage.addToCart.click();
        Thread.sleep(4000);
        autoExerPage.viewCartButton.click();
        Thread.sleep(4000);
        String numOfQuan = Driver.getDriver().findElement(By.xpath("//*[@class='disabled']")).getText();
        int newQuan = Integer.valueOf(numOfQuan);
        System.out.println(newQuan);
        Assert.assertEquals(newQuan, 4);
        Driver.quitDriver();
    }
}
