package tests2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class Test27 extends TestBaseBeforeMethodAfterMethod {
    @Test
    public void test() throws InterruptedException {
        driver.navigate().to("https://webdriveruniversity.com/Actions/#");
        Actions actions = new Actions(driver);
        WebElement homf = driver.findElement(By.xpath("//*[@class='dropdown hover']"));
        actions.moveToElement(homf).perform();
        driver.findElement(By.xpath("(//*[@class='list-alert'])[1]")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        WebElement cAh = driver.findElement(By.xpath("//*[text()='Click and Hold!']"));
        actions.clickAndHold(cAh).perform();
        Thread.sleep(3000);
        System.out.println(driver.findElement(By.xpath("//*[@id='click-box']")).getText());
        WebElement dch = driver.findElement(By.xpath("(//*[@id='div-drag-drop-thumbnail'])[2]"));
        actions.doubleClick(dch).perform();
        Thread.sleep(3000);


    }
}
