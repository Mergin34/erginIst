package tests2;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Test26 {
    @Test
    public void test() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));
        FacebookPage facebookPage = new FacebookPage();
        facebookPage.create.click();
        Faker faker = new Faker();
        Actions actions = new Actions(Driver.getDriver());
        facebookPage.name.sendKeys(faker.name().firstName());
        actions.sendKeys(Keys.TAB).sendKeys(faker.name().lastName()).
                sendKeys(Keys.TAB).sendKeys("mer@gmail.com").perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.TAB).sendKeys("mer@gmail.com").
                sendKeys(Keys.TAB).sendKeys(faker.internet().password()).
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys("13").sendKeys(Keys.TAB).sendKeys("Jan").sendKeys(Keys.TAB).sendKeys("1989").sendKeys(Keys.TAB).
                perform();
        facebookPage.male.click();
        Thread.sleep(2000);
        Assert.assertTrue(facebookPage.male.isSelected());//normalde cinsiyet secildigi halde secilmedi diyor. NEDEN??
        actions.sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).perform();
        Thread.sleep(2000);
        Driver.closeDriver();

    }
}
