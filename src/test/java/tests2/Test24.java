package tests2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Test24 {
    @Test
    public void test() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        AmazonPage amazonPage = new AmazonPage();
        Actions actions = new Actions(Driver.getDriver());
        actions.click(amazonPage.searchBox).sendKeys("samsung A71", Keys.ENTER).perform();
        //String actual= amazonPage.resultPageForSamsungA71.getText();
        //String expected = "samsung A71";
        Assert.assertTrue(amazonPage.resultPageForSamsungA71.isDisplayed());
        Driver.closeDriver();
    }
}
