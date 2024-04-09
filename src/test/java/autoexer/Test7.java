package autoexer;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutoExerPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Test7 {
    @Test
    public void test() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("auto"));
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Automation Exercise"));
        AutoExerPage autoExerPage = new AutoExerPage();
        autoExerPage.testCases.click();
        Thread.sleep(5000);
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),"https://www.automationexercise.com/test_cases");
        Driver.closeDriver();

    }
}
