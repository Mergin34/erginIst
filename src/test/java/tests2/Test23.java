package tests2;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Test23 {
    @Test
    public void test() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        AmazonPage amazonPage = new AmazonPage();
        Actions actinos = new Actions(Driver.getDriver());
        actinos.moveToElement(amazonPage.accountList).perform();
        Thread.sleep(5000);
        amazonPage.createWishList.click();

        String expected = "Your Lists";
        String actual = amazonPage.yourList.getText();
        Assert.assertEquals(expected, actual);

        Driver.quitDriver();
    }
}
