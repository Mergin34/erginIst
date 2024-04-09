package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.TestBaseBeforeClassAfterClass;

import java.time.Duration;

public class Test19Sorunlu extends TestBaseBeforeClassAfterClass {
    @Test
    public void test() throws InterruptedException {
        driver.get("https://demo.guru99.com/test/guru99home/");

        System.out.println(driver.findElements(By.tagName("iframe")).size());

        WebElement youtube = driver.findElement(By.xpath("//*[@src='https://www.youtube.com/embed/RbSlW8jZFe8']"));
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(youtube));
        driver.switchTo().frame(youtube);

        WebElement play = driver.findElement(By.xpath("//*[@class='ytp-cued-thumbnail-overlay-image']"));
        play.click();

        driver.switchTo().defaultContent();

        WebElement jmeter = driver.findElement(By.xpath("//*[@id='a077aa5e']"));
        driver.switchTo().frame(jmeter);
        driver.findElement(By.xpath("//*[@src='Jmeter720.png']")).click();
        driver.switchTo().defaultContent();

    }
}
