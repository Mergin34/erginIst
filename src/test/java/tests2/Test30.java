package tests2;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeClassAfterClass;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Test30 extends TestBaseBeforeClassAfterClass {
    @Test
    public void test() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/download");
        driver.findElement(By.xpath("//*[text()='some-file.txt']")).click();
        String fileWay = "C:\\Users\\mergi\\Downloads\\some-file.txt";
        Assert.assertTrue(Files.exists(Paths.get(fileWay)));
    }
}
