package tests;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class Test04 {
    @Test
    public void test() {
        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));

        String actual = Driver.getDriver().getTitle();
        String expected = "facebook";
        if (actual.equals(expected)) {
            System.out.println("Pass");
        } else {
            System.out.println(Driver.getDriver().getTitle());
        }

        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "facebook";

        if (actualUrl.contains(expectedUrl)) {
            System.out.println("Pass");
        } else {
            System.out.println(Driver.getDriver().getCurrentUrl());
        }
        Driver.getDriver().get(ConfigReader.getProperty("walmartUrl"));
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().refresh();
        Driver.getDriver().manage().window().fullscreen();
        Driver.quitDriver();
    }

}
