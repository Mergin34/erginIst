package tests;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Test06 {
    @Test
    public void test() {
        AmazonPage amazonPage = new AmazonPage();
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        amazonPage.searchBox.sendKeys("city bike", Keys.ENTER);
        System.out.println(amazonPage.searchResults.getText());
        amazonPage.firstResult.click();
        Driver.quitDriver();
    }
}
