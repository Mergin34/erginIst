package autoexer;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutoExerPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class Test14 {
    @Test
    public void test() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("auto"));
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://www.automationexercise.com/");
        AutoExerPage autoExerPage = new AutoExerPage();
        autoExerPage.inProductsFirstAddTheCart.click();
        Thread.sleep(5000);
        autoExerPage.viewCartButton.click();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("https://www.automationexercise.com/view_cart"));
        autoExerPage.proToCheckout.click();
        Thread.sleep(5000);
        autoExerPage.registerLogin.click();
        Thread.sleep(5000);
        autoExerPage.signUpname.sendKeys("Robert");
        autoExerPage.signUpMail.sendKeys("rbt@yahoo.com", Keys.ENTER);
        Thread.sleep(4000);

        autoExerPage.genderMr.click();
        Actions actions = new Actions(Driver.getDriver());
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
        Assert.assertTrue(autoExerPage.searchProductText.isDisplayed());
        autoExerPage.continueButton.click();
        Thread.sleep(3000);
        Assert.assertTrue(autoExerPage.loginInAs_UserName.isDisplayed());
        autoExerPage.cartButton.click();
        Thread.sleep(3000);
        autoExerPage.proToCheckout.click();
        Thread.sleep(3000);
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[@id='address_delivery']")).isDisplayed());
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[@id='cart_info']")).isDisplayed());
        autoExerPage.descriptionArea.sendKeys("Please bring to delivery right address");
        autoExerPage.placeOrder.click();
        Thread.sleep(7000);
        autoExerPage.nameOfCard.sendKeys("Robert Liva");
        actions.sendKeys(Keys.TAB).sendKeys("1234 1234 1234 1234").
                sendKeys(Keys.TAB).sendKeys("111").
                sendKeys(Keys.TAB).sendKeys("08").
                sendKeys(Keys.TAB).sendKeys("2028", Keys.ENTER).perform();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
        wait.until(d -> d.findElement(By.xpath("(//*[@class='alert-success alert'])[1]")).isDisplayed());
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("(//*[@class='alert-success alert'])[1]")).isDisplayed());
        autoExerPage.deleteAccount.click();
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[text()='Account Deleted!']")).isDisplayed());
        autoExerPage.continueButton.click();
        Driver.closeDriver();

    }
}
