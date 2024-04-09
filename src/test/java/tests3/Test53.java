package tests3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.TestBaseBeforeMethodAfterMethod;

import java.time.Duration;

public class Test53 extends TestBaseBeforeMethodAfterMethod {
    @Test
    public void test() throws InterruptedException {
        driver.navigate().to("https://the-internet.herokuapp.com/add_remove_elements/");
        driver.findElement(By.xpath("//*[@onclick='addElement()']")).click();
        WebElement delete = driver.findElement(By.xpath("//*[@class='added-manually']"));
        Assert.assertTrue(delete.isDisplayed());
        delete.click();
        Thread.sleep(3000);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@class='added-manually']"))));
        Assert.assertFalse(delete.isDisplayed());
    }
}
