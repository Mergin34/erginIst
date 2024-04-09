package tests3;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Test44 {
    @Test
    public void test() {
        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));
        Actions actions = new Actions(Driver.getDriver());
        Faker faker = new Faker();
        FacebookPage facebookPage = new FacebookPage();
        facebookPage.email.click();
                facebookPage.email.sendKeys(faker.internet().emailAddress());

        actions.sendKeys(Keys.TAB).sendKeys(faker.internet().password()).
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

        System.out.println(Driver.getDriver().findElement(By.xpath("//*[@class='_9ay7']")).getText());
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[@class='_9ay7']")).isDisplayed());
    }
}
