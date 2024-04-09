package autoexer;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutoExerPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Test5 {
    @Test
    public void test() {
        Driver.getDriver().get(ConfigReader.getProperty("auto"));
        Assert.assertEquals(Driver.getDriver().getTitle(),"Automation Exercise");
        AutoExerPage autoPage = new AutoExerPage();
        autoPage.loginSignup.click();
        autoPage.newUserSignUpText.isDisplayed();
        autoPage.signUpname.sendKeys("Robert");
        autoPage.signUpMail.sendKeys("rbt@yahoo.com", Keys.ENTER);
        Assert.assertTrue(autoPage.yourEmailAdressAlExText.isDisplayed());
        Driver.closeDriver();

    }
}
