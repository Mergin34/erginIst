package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class Test08 extends TestBaseBeforeMethodAfterMethod {
    @Test
    public void test() {
        driver.navigate().to("https://id.heroku.com/login");
        WebElement email = driver.findElement(By.cssSelector("#email"));
        WebElement password = driver.findElement(By.cssSelector("#password"));
        WebElement logIn = driver.findElement(By.cssSelector("#login > form > button"));

        email.sendKeys("testtechproed@gmail.com", Keys.ENTER);
        password.sendKeys("Test1234!", Keys.ENTER);
        logIn.click();

    }
}
