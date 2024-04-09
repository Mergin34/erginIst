package tests2;

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

public class Test29 {
    @Test
    public void test() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @Test(dependsOnMethods = "test")
    public void test2() {
        List<WebElement> ddm = Driver.getDriver().findElements(By.xpath("//option"));
        System.out.println(ddm.size());
        Assert.assertTrue(ddm.size() == 40);
    }

    @Test(dependsOnMethods = "test")
    public void test3() throws InterruptedException {
        WebElement ddmBox = Driver.getDriver().findElement(By.xpath("//*[@id='searchDropdownBox']"));
        ddmBox.sendKeys("Electronics & Cameras", Keys.ENTER);
        WebElement seacrchBox = Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
        seacrchBox.sendKeys("iphone", Keys.ENTER);
        WebElement resultPage = Driver.getDriver().findElement(By.xpath("(//*[@class='sg-col-inner'])[1]"));
        System.out.println(resultPage.getText());
        Assert.assertTrue(resultPage.getText().contains("iphone"));
        Driver.getDriver().findElement(By.xpath("(//*[@class='s-image'])[2]")).click();

        List<String> wH = new ArrayList<>(Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(wH.get(1));
        Thread.sleep(3000);

        System.out.println(Driver.getDriver().getTitle());
        String title = Driver.getDriver().getTitle();
        WebElement price = Driver.getDriver().findElement(By.xpath("(//*[text()='¥18,800'])[3]"));
        String priceText = price.getText();
        Driver.closeDriver();

    }

    @Test(dependsOnMethods = "test")
    public void test4() throws InterruptedException {
        WebElement ddmBox = Driver.getDriver().findElement(By.xpath("//*[@id='searchDropdownBox']"));
        ddmBox.sendKeys("Baby & Maternity", Keys.ENTER);
        WebElement seacrchBox = Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
        seacrchBox.sendKeys("puset", Keys.ENTER);
        WebElement resultPage = Driver.getDriver().findElement(By.xpath("(//*[@class='sg-col-inner'])[1]"));
        System.out.println(resultPage.getText());
        Assert.assertTrue(resultPage.getText().contains("puset"));
        Driver.getDriver().findElement(By.xpath("(//*[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();

        List<String> wH = new ArrayList<>(Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(wH.get(1));
        Thread.sleep(3000);

        // System.out.println(Driver.getDriver().getTitle());
        // String title = Driver.getDriver().getTitle();
        // WebElement price = Driver.getDriver().findElement(By.xpath("(//*[text()='¥1,880'])[5]"));
        // String priceText = price.getText();

        Driver.quitDriver();

    }
}
