package tests3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class Test42 {
    AmazonPage amazonPage = new AmazonPage();

    @Test
    public void test() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @Test(dependsOnMethods = "test")
    public void test2() {
        amazonPage.searchBox.sendKeys("Nutella", Keys.ENTER);
        Assert.assertTrue(amazonPage.searchResults.isDisplayed());
    }


    @Test(dependsOnMethods = "test2")
    public void test3() {
        Assert.assertEquals(Driver.getDriver().findElement(By.xpath("(//*[@class='a-color-price'])[1]")).getText(), "¥1,660");
    }

    @Test(dependsOnMethods = "test2")
    public void test4() throws InterruptedException {
        amazonPage.firstResult.click();

        List<String> windowlist = new ArrayList<>(Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(windowlist.get(1));
        Thread.sleep(3000);

        Assert.assertEquals(Driver.getDriver().findElement(By.xpath("//*[text()='FERRERO(フェレロ)']")).getText(),"FERRERO(フェレロ)");

        Driver.quitDriver();
    }
}
