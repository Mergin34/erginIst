package tests3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Test51 {
    @DataProvider
    public Object[][] data(){
        return new Object[][] {{"Nutella"},{"Pencil"}, {"Milk"}, {"Tomatoes"}, {" Popcorn"}};
    }

    @Test(dataProvider = "data")
    public void test(String find) {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        AmazonPage amazonPage = new  AmazonPage();
        amazonPage.searchBox.sendKeys(find,Keys.ENTER);
        System.out.println(amazonPage.searchResults.getText());
        Driver.quitDriver();
    }
}
