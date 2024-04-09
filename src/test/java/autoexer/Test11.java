package autoexer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutoExerPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Test11 {
    @Test
    public void test() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("auto"));
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://www.automationexercise.com/");
        AutoExerPage autoPage = new AutoExerPage();
        autoPage.cartButton.click();
        Thread.sleep(5000);
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", autoPage.subscription);
        Thread.sleep(5000);
        Assert.assertEquals(autoPage.subscription.getText(), "SUBSCRIPTION");
        autoPage.subscriptionYourEmailAddresses.sendKeys("rbt@gmail.com", Keys.ENTER);
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[text()='You have been successfully subscribed!']")).isDisplayed());
        Driver.closeDriver();
    }
}
