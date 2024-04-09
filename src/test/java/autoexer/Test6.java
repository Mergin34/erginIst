package autoexer;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutoExerPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Test6 {
    @Test
    public void test() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("auto"));
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("https://www.automationexercise.com/"));
        AutoExerPage autoExerPage = new AutoExerPage();
        autoExerPage.contactUs.click();
        autoExerPage.getInTouchContactUsText.isDisplayed();
        autoExerPage.contactUsName.sendKeys("<NAME>");
        autoExerPage.contactUsEmail.sendKeys("rbt@gmail.com");
        autoExerPage.contactUsSubject.sendKeys("Subject");
        autoExerPage.contactUsMessage.sendKeys("Message");
        String fileWay = "C:\\Users\\mergi\\Desktop\\Full Stack Automation Test Engineer\\selenium\\ulkeler.xlsx";
        autoExerPage.contactUsChoicesFile.sendKeys(fileWay);
        Thread.sleep(5000);
        autoExerPage.contactUsSubmit.click();
        Driver.getDriver().switchTo().alert().accept();
        autoExerPage.contactUsSuccText.isDisplayed();
        autoExerPage.contactUsHome.click();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("https://www.automationexercise.com/"));
        Driver.quitDriver();
    }
}
