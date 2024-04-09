package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class Test09 {
    @Test
    public void test() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        Driver.getDriver().manage().window().fullscreen();
        Driver.getDriver().navigate().refresh();
        Assert.assertFalse(Driver.getDriver().getTitle().contains("Spend less"));
        Driver.getDriver().findElement(By.xpath("(//*[@class='nav-a  '])[8]")).click();
        Driver.getDriver().findElement(By.xpath("//*[@aria-label='Amazon Gift Card']")).click();
        Thread.sleep(3000);
        Driver.getDriver().findElement(By.xpath("(//*[text()='Birthdays'])[2]")).click();
        Driver.getDriver().findElement(By.xpath("//*[@class='s-image'][1]")).click();
        WebElement actualBesYen = Driver.getDriver().findElement(By.id("//*[@value='5000']"));
        actualBesYen.click();
        int expertBesyen = 5000;
        Assert.assertEquals(actualBesYen, expertBesyen);
        Driver.quitDriver();
    }
}
