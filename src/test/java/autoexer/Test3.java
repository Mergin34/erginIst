package autoexer;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutoExerPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Test3 {
    @Test
    public void test() {
        Driver.getDriver().get(ConfigReader.getProperty("auto"));
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://www.automationexercise.com/");
        AutoExerPage autoExerPage = new AutoExerPage();
        autoExerPage.loginSignup.click();
        Driver.getDriver().findElement(By.xpath("//*[text()='Login to your account']")).isDisplayed();
        autoExerPage.loginEmail.sendKeys("roberto@gmail.com");
        autoExerPage.loginPassword.sendKeys("54321", Keys.ENTER);
        Driver.getDriver().findElement(By.xpath("//*[@style='color: red;']")).isDisplayed();
        Driver.closeDriver();
    }
}
