package tests2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.TestBaseBeforeMethodAfterMethod;

public class Test40 extends TestBaseBeforeMethodAfterMethod {
    @Test
    public void test() throws InterruptedException {
        driver.navigate().to("https://www.gov.uk/");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        WebElement findAJob = driver.findElement(By.xpath("//*[@data-track-dimension='Find a Job']"));
        jse.executeScript("arguments[0].scrollIntoView(true);", findAJob);
        Thread.sleep(4000);
        jse.executeScript("arguments[0].click();", findAJob);
        Thread.sleep(4000);
    }
}
