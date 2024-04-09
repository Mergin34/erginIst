package tests2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class Test28 extends TestBaseBeforeMethodAfterMethod {
    @Test
    public void test() throws InterruptedException {
        driver.get("https://html.com/tags/iframe/");
        WebElement youTube = driver.findElement(By.xpath("//*[@src='https://www.youtube.com/embed/owsfdh4gxyc']"));
        driver.switchTo().frame(youTube);
        driver.findElement(By.xpath("//*[@aria-label='Oynat']")).click();
        Thread.sleep(5000);
        WebElement playButton= driver.findElement(By.xpath("//*[@class='ytp-play-button ytp-button']"));
        Assert.assertTrue(playButton.isEnabled());
    }
}
