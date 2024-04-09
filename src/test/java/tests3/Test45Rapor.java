package tests3;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseBeforeMethodAfterMethod;
import utilities.TestBaseReport;

public class Test45Rapor extends TestBaseReport {
    @Test
    public void test() {
        extentTest= extentReports.createTest("Deneme Testi","Denememiz basariyla tamamlandi");
        Driver.getDriver().get("https://www.amazon.co.jp");
        extentTest.info("Amazon'a gidildi");
        System.out.println(Driver.getDriver().getTitle());
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Amazon"));
        extentTest.info("Basligin amazon oldugu test edildi");
        System.out.println(Driver.getDriver().getCurrentUrl());
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("amazon"));
        extentTest.info("Url'in amazon oldugu test edildi");
        System.out.println(Driver.getDriver().getWindowHandle());
        Assert.assertFalse(Driver.getDriver().getPageSource().contains("alisveris"));
        Driver.quitDriver();
        extentTest.pass("Deneme tamamlandi");
    }
}
