package tests;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class Test05 {
    @Test
    public void test() {
        Driver.getDriver().get(ConfigReader.getProperty("youtubeUrl"));

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "youtube";

        if (actualTitle != expectedTitle) {

        } else {
            System.out.println(Driver.getDriver().getTitle());
        }
        String actualUrl = Driver.getDriver().getCurrentUrl();
        if (actualUrl.contains("youtube")) {

        } else {
            System.out.println(Driver.getDriver().getCurrentUrl());
        }
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().refresh();
        Driver.getDriver().navigate().forward();
        Driver.getDriver().manage().window().fullscreen();

        String actualTitleamazon = Driver.getDriver().getTitle();
        if (actualTitleamazon.contains("Amazon")) {

        } else {
            System.out.println(Driver.getDriver().getTitle());
        }
        String actualUrlamazon = Driver.getDriver().getCurrentUrl();
        if (actualTitleamazon.equals("https://www.amazon.com/")) {

        } else {
            System.out.println(Driver.getDriver().getCurrentUrl());
        }
        Driver.quitDriver();
    }
}
