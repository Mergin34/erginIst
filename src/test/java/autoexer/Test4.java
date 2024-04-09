package autoexer;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutoExerPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Test4 {
    @Test
    public void test() {
        Driver.getDriver().get(ConfigReader.getProperty("auto"));
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),"https://www.automationexercise.com/");
        AutoExerPage autoExerPage = new AutoExerPage();
        autoExerPage.loginSignup.click();
        autoExerPage.loginYourAccountText.isDisplayed();
        autoExerPage.loginEmail.sendKeys("rbt@yahoo.com");
        autoExerPage.loginPassword.sendKeys("12345", Keys.ENTER);
        autoExerPage.loginInAs_UserName.isDisplayed();
        autoExerPage.logout.click();
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),"https://www.automationexercise.com/login");
        Driver.closeDriver();
    }
}
