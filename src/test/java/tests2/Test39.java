package tests2;

import com.aventstack.extentreports.reporter.configuration.Theme;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseBeforeMethodAfterMethod;

import java.io.File;
import java.io.IOException;

public class Test39 {
    @Test
    public void test() throws IOException, InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://www.amazon.co.jp/");

       TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
       File temp = ts.getScreenshotAs(OutputType.FILE);
       FileUtils.copyFile(temp, new File("target/pics/.jpeg"));

        AmazonPage amazonPage = new AmazonPage();
        amazonPage.searchBox.sendKeys("Nutella", Keys.ENTER);
        Assert.assertTrue(amazonPage.searchResults.getText().contains("Nutella"));
        Thread.sleep(2000);

        WebElement nutellaPic = Driver.getDriver().findElement(By.xpath("(//*[@class='s-image'])[1]"));
        File tempForNut = nutellaPic.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(tempForNut, new File("target/pics/pic-of-logo.jpeg"));

        Driver.closeDriver();
        /*
         TakesScreenshot ts = (TakesScreenshot) driver;
        File fullScreenShot = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(fullScreenShot, new File("target/screen-shot/allPage" + tarih + ".jpeg"));
         */
    }
}
