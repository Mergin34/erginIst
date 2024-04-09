package autoexer;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutoExerPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Test21 {
    @Test
    public void test() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("auto"));
        AutoExerPage autoExerPage = new AutoExerPage();
        autoExerPage.products.click();
        Thread.sleep(5000);
        System.out.println(Driver.getDriver().getCurrentUrl());
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("https://www.automationexercise.com/products"));
        autoExerPage.viewProductsInFirst.click();
        Thread.sleep(5000);
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[@class='active']")).isDisplayed());

        WebElement yourName = Driver.getDriver().findElement(By.xpath("//*[@id='name']"));
        WebElement email = Driver.getDriver().findElement(By.xpath("//*[@id='email']"));
        WebElement comment = Driver.getDriver().findElement(By.xpath("//*[@id='review']"));
        yourName.sendKeys("Robert Liva");
        email.sendKeys("rbt@yahoo.com");
        comment.sendKeys("Please send me right address");
        comment.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[text()='Thank you for your review.']")).isDisplayed());
        Driver.closeDriver();
    }
}
