package tests2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

import java.util.ArrayList;
import java.util.List;

public class Test33Sorunlu extends TestBaseBeforeMethodAfterMethod {
    @Test
    public void test() throws InterruptedException {
        driver.get("https://webdriveruniversity.com/IFrame/index.html");
        List<WebElement> iframeList = new ArrayList<>(driver.findElements(By.xpath("//iframe")));
        driver.switchTo().frame(iframeList.get(0));
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[text()='Our Products']")).click();

        driver.findElement(By.xpath("//*[@id='container-product1']")).click();

        //Popup i alert ile çalıştıramadım nedenini bilmiyorum
        //System.out.println(driver.switchTo().alert().getText());
        //driver.switchTo().alert().dismiss();

        driver.findElement(By.xpath("//*[@id='nav-title']")).click();
        String page = driver.getCurrentUrl();
        Assert.assertEquals(page, "https://webdriveruniversity.com/index.html");
        //driver.switchTo().defaultContent();

    }
}
