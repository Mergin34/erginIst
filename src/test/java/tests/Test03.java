package tests;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class Test03 {
    @Test
    public void test() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        System.out.println(Driver.getDriver().manage().window().getSize());
        System.out.println(Driver.getDriver().manage().window().getPosition());
        Driver.getDriver().manage().window().setPosition(new Point(20,20));
        Driver.getDriver().manage().window().setSize(new Dimension(600,300));
        Driver.quitDriver();
    }
}
