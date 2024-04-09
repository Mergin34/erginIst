package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

import java.util.ArrayList;
import java.util.List;

public class Test20 extends TestBaseBeforeMethodAfterMethod {
    @Test
    public void test() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/windows");
        WebElement open = driver.findElement(By.xpath("//*[text()='Opening a new window']"));
        String actual = open.getText();
        Assert.assertEquals(actual, "Opening a new window");
        Assert.assertEquals(driver.getTitle(), "The Internet");
        driver.findElement(By.xpath("//*[text()='Click Here']")).click();

        List<String> windowlist = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windowlist.get(1));
        Thread.sleep(3000); // <<<<------This method is very important
        Assert.assertEquals(driver.getTitle(), "New Window");
        WebElement pageSen = driver.findElement(By.xpath("(//*[text()='New Window'])[2]"));
        String actualSecondText = pageSen.getText();
        Assert.assertEquals(actualSecondText, "New Window");
        driver.switchTo().window(windowlist.get(0));
        Thread.sleep(3000);
        Assert.assertEquals(driver.getTitle(), "The Internet");
    }
}
