package tests3;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.BlueRentalCarPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Test46 {


    @DataProvider
    public static Object[][] userss() {
        return new Object[][]{{"mergin@gmail.com", "237555"}, {"ljublajana@gmail.com", "990007776"}};
    }

    @Test(dataProvider = "userss")
    public void test(String userEmail, String password) {
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        BlueRentalCarPage blueRentalCarPage = new BlueRentalCarPage();
        blueRentalCarPage.loginButton.click();
        blueRentalCarPage.emailBox.sendKeys(userEmail);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(password).sendKeys(Keys.ENTER).perform();
        Assert.assertTrue(blueRentalCarPage.secondPagelogin.isDisplayed());
        Driver.closeDriver();

    }
}
