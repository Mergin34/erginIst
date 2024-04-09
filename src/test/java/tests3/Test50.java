package tests3;

import com.fasterxml.jackson.databind.deser.DataFormatReaders;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Test50 {
    @DataProvider
    public static Object[][] data() {
        return new Object[][] {{"iphone"},{"tea pot"}, {"flower"}};
    }

    @Test(dataProvider = "data")
    public void testName(String words) {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.searchBox.sendKeys(words, Keys.ENTER);
        Assert.assertTrue(amazonPage.searchResults.isDisplayed());
        System.out.println(amazonPage.searchResults.getText());
        Driver.closeDriver();
    }
}
