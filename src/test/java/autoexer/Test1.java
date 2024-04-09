package autoexer;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutoExerPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Test1 {
    @Test
    public void test() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("auto"));
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://www.automationexercise.com/");
        AutoExerPage autoExerPage = new AutoExerPage();
        autoExerPage.loginSignup.click();
        Driver.getDriver().findElement(By.xpath("//*[text()='New User Signup!']")).isDisplayed();
        autoExerPage.signUpname.sendKeys("Robert");
        autoExerPage.signUpMail.sendKeys("liv@gmail.com", Keys.ENTER);
        Thread.sleep(2000);
        Driver.getDriver().findElement(By.xpath("(//*[@class='title text-center'])[1]")).isDisplayed();
        autoExerPage.genderMr.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys("12345!").sendKeys(Keys.TAB).
                sendKeys("13").sendKeys(Keys.TAB).
                sendKeys("January").sendKeys(Keys.TAB).
                sendKeys("1989").sendKeys(Keys.TAB).perform();
        Driver.getDriver().findElement(By.xpath("//*[@id='newsletter']")).click();
        Driver.getDriver().findElement(By.xpath("//*[@id='optin']")).click();
        autoExerPage.firstName.sendKeys("Robert");
        actions.sendKeys(Keys.TAB).sendKeys("Liva").sendKeys(Keys.TAB).sendKeys("Royal of the Order").
        sendKeys(Keys.TAB).sendKeys("London").sendKeys(Keys.TAB).sendKeys("London").
                sendKeys(Keys.TAB).sendKeys("Canada").sendKeys(Keys.TAB).sendKeys("Québec").
                sendKeys(Keys.TAB).sendKeys("Toronto").sendKeys(Keys.TAB).sendKeys("BS3 4AR").
                sendKeys(Keys.TAB).sendKeys("07378755477",Keys.ENTER).perform();
        Thread.sleep(2000);
        Driver.getDriver().findElement(By.xpath("//*[@class='title text-center']")).isDisplayed();
        Driver.getDriver().findElement(By.xpath("//*[@class='btn btn-primary']")).click();
        Driver.getDriver().findElement(By.xpath("//*[text()=' Logged in as ']")).isDisplayed();
        Driver.getDriver().findElement(By.xpath("//*[text()=' Delete Account']")).click();
        Driver.getDriver().findElement(By.xpath("//*[text()='Account Deleted!']")).isDisplayed();
        Driver.getDriver().findElement(By.xpath("//*[@class='btn btn-primary']")).click();
        Driver.closeDriver();
    }
}
