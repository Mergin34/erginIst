package tests2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test31 extends TestBaseBeforeMethodAfterMethod {
    @Test
    public void test() {
        driver.navigate().to("https://the-internet.herokuapp.com/upload");
        WebElement uploadButton = driver.findElement(By.xpath("//*[@id='file-upload']"));
        String fileWay = "C:\\Users\\mergi\\Downloads\\random_data.txt";
        uploadButton.sendKeys(fileWay);
        driver.findElement(By.xpath("//*[@id='file-submit']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='File Uploaded!']")).isDisplayed());

        Assert.assertTrue(Files.exists(Paths.get(fileWay)));
    }
}
