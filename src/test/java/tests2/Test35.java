package tests2;

import org.openqa.selenium.Cookie;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.Set;

public class Test35 {
    @Test
    public void test() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        Set<Cookie> cookiesList = Driver.getDriver().manage().getCookies();
        System.out.println(cookiesList);

        int cookieCount = Driver.getDriver().manage().getCookies().size();
        Assert.assertTrue(cookieCount > 6);

        for (Cookie w : cookiesList) {
            if (w.getName().equals("i18n-prefs")) {
                Assert.assertEquals(w.getValue(), "JPY");
            }
        }

        Cookie newCookie = new Cookie("en sevdigim cookie", "cikolatali");
        Driver.getDriver().manage().addCookie(newCookie);
        cookiesList = Driver.getDriver().manage().getCookies();
        Assert.assertTrue(cookiesList.contains(newCookie));

        Driver.getDriver().manage().deleteCookieNamed("skin");
        Assert.assertFalse(cookiesList.contains("skin"));
        cookiesList = Driver.getDriver().manage().getCookies();

        Driver.getDriver().manage().deleteAllCookies();
        cookiesList = Driver.getDriver().manage().getCookies();
        Assert.assertTrue(cookiesList.isEmpty());

        Driver.closeDriver();
    }
}
