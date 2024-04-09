package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseBeforeMethodAfterMethod;

public class Test01 extends TestBaseBeforeMethodAfterMethod {
    @Test
    public void test() {
        Driver.getDriver().get("https://www.amazon.com");
        System.out.println(Driver.getDriver().getTitle());
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Amazon"));
        System.out.println(Driver.getDriver().getCurrentUrl());
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("amazon"));
        System.out.println(Driver.getDriver().getWindowHandle());
        Assert.assertFalse(Driver.getDriver().getPageSource().contains("alisveris"));
        Driver.quitDriver();
    }
}
