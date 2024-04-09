package autoexer;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutoExerPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Test23 {
    @Test
    public void test() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("auto"));
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("https://www.automationexercise.com/"));
        AutoExerPage autoExerPage = new AutoExerPage();
        autoExerPage.loginSignup.click();
        Thread.sleep(3000);
        autoExerPage.signUpname.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys("Robert").sendKeys(Keys.TAB).
                sendKeys("robert@gmail.com", Keys.ENTER).perform();
        Thread.sleep(2000);
        autoExerPage.genderMr.click();
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys("12345").sendKeys(Keys.TAB).
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
                sendKeys(Keys.TAB).sendKeys("07378755477", Keys.ENTER).perform();
        Thread.sleep(2000);
        Driver.getDriver().findElement(By.xpath("//*[@class='title text-center']")).isDisplayed();
        Thread.sleep(2000);
        Driver.getDriver().findElement(By.xpath("//*[@class='btn btn-primary']")).click();
        Thread.sleep(2000);
        Driver.getDriver().findElement(By.xpath("//*[text()=' Logged in as ']")).isDisplayed();
        autoExerPage.inProductsSecondAddTheCart.click();
        Thread.sleep(7000);
        autoExerPage.viewCartButton.click();
        Thread.sleep(4000);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("https://www.automationexercise.com/view_cart"));
        autoExerPage.proToCheckout.click();

        String actualDeliveryAddress = Driver.getDriver().findElement(By.xpath("//*[@class='address item box']")).getText();
        String expectedDeliveryAddress = "YOUR DELIVERY ADDRESS\n" +
                "Mr. Robert Liva\n" +
                "Royal of the Order\n" +
                "London\n" +
                "London\n" +
                "Toronto Québec BS3 4AR\n" +
                "Canada\n" +
                "07378755477";
        Assert.assertEquals(actualDeliveryAddress, expectedDeliveryAddress);

        String actualBillingAddress = Driver.getDriver().findElement(By.xpath("//*[@id='address_invoice']")).getText();
        String expectedBillingAddress = "YOUR BILLING ADDRESS\n" +
                "Mr. Robert Liva\n" +
                "Royal of the Order\n" +
                "London\n" +
                "London\n" +
                "Toronto Québec BS3 4AR\n" +
                "Canada\n" +
                "07378755477";
        Assert.assertEquals(actualBillingAddress, expectedBillingAddress);
        autoExerPage.deleteAccount.click();
        Driver.getDriver().findElement(By.xpath("//*[@class='title text-center']")).isDisplayed();
        autoExerPage.continueButton.click();
        Driver.quitDriver();

    }
}
