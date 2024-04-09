package tests3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class Test47DevamEdecek {
    @Test
    public void test() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        AmazonPage amazonPage = new AmazonPage();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", amazonPage.backToTop);
        Thread.sleep(3000);
        satirSayisi();
        sutunSayisi();
    }

    private void satirSayisi() {
        List<WebElement> rows = Driver.getDriver().findElements(By.xpath("//tbody//tr//td"));
        Assert.assertNotEquals(rows.size(), 10);
    }

    private void sutunSayisi() {
      //sutunSayisi() ve yazi olan sutun sayisinin 7 oldugunu test edin
    }


}
