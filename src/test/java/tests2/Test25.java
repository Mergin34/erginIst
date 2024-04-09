package tests2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Test25 {
    @Test
    public void test() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));
        FacebookPage facebookPage = new FacebookPage();
        facebookPage.create.click();
        facebookPage.name.sendKeys("Robert");
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).
                sendKeys("Levi").sendKeys(Keys.TAB).
                sendKeys("robert@gmail.com").sendKeys(Keys.TAB).
                sendKeys("12345").sendKeys(Keys.TAB).perform();
        facebookPage.signInButton.click();
        Driver.closeDriver();

    }
}
