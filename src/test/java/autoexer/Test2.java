package autoexer;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutoExerPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Test2 {
    @Test
    public void test() {
        Driver.getDriver().get(ConfigReader.getProperty("auto"));
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://www.automationexercise.com/");
        AutoExerPage autoExerPage = new AutoExerPage();
        autoExerPage.loginSignup.click();
        Driver.getDriver().findElement(By.xpath("//*[text()='Login to your account']")).isDisplayed();
        autoExerPage.loginEmail.sendKeys("rbt@yahoo.com");
        autoExerPage.loginPassword.sendKeys("12345", Keys.ENTER);
        Driver.getDriver().findElement(By.xpath("//*[text()=' Logged in as ']")).isDisplayed();
        Driver.getDriver().findElement(By.xpath("//*[text()=' Delete Account']")).click();
        Driver.getDriver().findElement(By.xpath("//*[@data-qa='account-deleted']")).isDisplayed();
        Driver.closeDriver();
    }
}
