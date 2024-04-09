package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseBeforeClassAfterClass;

import java.util.ArrayList;
import java.util.List;

public class Test16 extends TestBaseBeforeClassAfterClass {
    @Test
    public void test() {
        driver.get("https://www.amazon.co.jp");
        List<WebElement> ddm = driver.findElements(By.xpath("//option"));
        System.out.println(ddm.size());

        Assert.assertFalse(ddm.size() == 45);

        WebElement ddmBox = driver.findElement(By.xpath("//*[@id='searchDropdownBox']"));
        ddmBox.sendKeys("English Books", Keys.ENTER);
        WebElement seacrchBox = driver.findElement(By.id("twotabsearchtextbox"));
        seacrchBox.sendKeys("Java", Keys.ENTER);

        WebElement resultPage = driver.findElement(By.xpath("(//*[@class='sg-col-inner'])[1]"));
        System.out.println(resultPage.getText());

        Assert.assertTrue(resultPage.getText().contains("Java"));

    }
}
