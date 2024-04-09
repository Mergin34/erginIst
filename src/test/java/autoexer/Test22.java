package autoexer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutoExerPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class Test22 {
    @Test
    public void test() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("auto"));
        AutoExerPage autoExerPage = new AutoExerPage();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", autoExerPage.recomendedItem);
        Thread.sleep(5000);
        Assert.assertTrue(autoExerPage.recomendedItem.isDisplayed());
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@data-product-id='1'])[3]")));
        element.click();
        Thread.sleep(5000);
        autoExerPage.viewCartButton.click();
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[@class='cart_description']")).isDisplayed());
        Driver.closeDriver();
    }
}
