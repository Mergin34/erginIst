package tests;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class Test02 {
    @Test
    public void test() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        System.out.println(Driver.getDriver().manage().window().getSize());
        System.out.println(Driver.getDriver().manage().window().getPosition());
        Driver.getDriver().manage().window().minimize();
        Thread.sleep(3000);
        Driver.getDriver().manage().window().maximize();
        System.out.println(Driver.getDriver().manage().window().getSize());
        System.out.println(Driver.getDriver().manage().window().getPosition());
        Driver.getDriver().manage().window().fullscreen();
        System.out.println(Driver.getDriver().manage().window().getSize());
        System.out.println(Driver.getDriver().manage().window().getPosition());
        Driver.quitDriver();
    }
}
