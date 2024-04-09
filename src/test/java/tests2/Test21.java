package tests2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

import java.util.ArrayList;
import java.util.List;

public class Test21 extends TestBaseBeforeMethodAfterMethod {
    @Test
    public void test() throws InterruptedException {
        driver.navigate().to("https://the-internet.herokuapp.com/context_menu");
        WebElement area = driver.findElement(By.id("hot-spot"));
        Actions actions = new Actions(driver);
        actions.contextClick(area).perform();
        String actualText = driver.switchTo().alert().getText();
        String expectedText = "You selected a context menu";
        Assert.assertEquals(actualText, expectedText);
        driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//*[text()='Elemental Selenium']")).click();

        List<String> windows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(1));
        Thread.sleep(3000);
        String expectedText2 = "Elemental Selenium";
        WebElement sen2 = driver.findElement(By.xpath("//*[text()='Elemental Selenium']"));
        String actualText2 = sen2.getText();
        Assert.assertEquals(actualText2, expectedText2);
    }
}
