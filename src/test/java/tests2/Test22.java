package tests2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class Test22 extends TestBaseBeforeMethodAfterMethod {
    @Test
    public void test() {
        driver.navigate().to("https://demoqa.com/droppable");

        WebElement dragMe = driver.findElement(By.xpath("//*[@id='draggable']"));
        WebElement dragHere = driver.findElement(By.xpath("(//*[@id='droppable'])[1]"));
        Actions action = new Actions(driver);
        action.dragAndDrop(dragMe, dragHere).build().perform();

        String expected = "Dropped!";
        String actual = driver.findElement(By.xpath("(//*[@id='droppable'])[1]")).getText();
        Assert.assertEquals(actual, expected);
    }
}
