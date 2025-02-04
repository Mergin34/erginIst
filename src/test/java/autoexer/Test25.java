package autoexer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutoExerPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class Test25 {
    @Test
    public void test() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("auto"));
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("https://www.automationexercise.com"));
        AutoExerPage autoExerPage = new AutoExerPage();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", autoExerPage.subscription);
        Assert.assertTrue(autoExerPage.subscription.isDisplayed());
        Thread.sleep(5000);
        Driver.getDriver().findElement(By.xpath("//*[@id='scrollUp']")).click();
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Full-Fledged practice website for Automation Engineers']")));
        Assert.assertTrue(element.isDisplayed());
        Driver.closeDriver();
    }
}
