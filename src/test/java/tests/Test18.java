package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class Test18 extends TestBaseBeforeMethodAfterMethod {
    @Test
    public void test() throws InterruptedException {
       driver.navigate().to("https://the-internet.herokuapp.com/iframe");
        WebElement iframe = driver.findElement(By.xpath("//h3"));
        Assert.assertTrue(iframe.isDisplayed());
        System.out.println(iframe.getText());

        WebElement iframeText = driver.findElement(By.xpath("//*[@title='Rich Text Area']"));
        driver.switchTo().frame(iframeText);
        WebElement textBoxFrame = driver.findElement(By.xpath("//p"));
        textBoxFrame.clear();
        iframeText.sendKeys("Dobrodocli");

        driver.switchTo().defaultContent();

        WebElement elementSelenium = driver.findElement(By.xpath("//*[text()='Elemental Selenium']"));
        Assert.assertTrue(elementSelenium.isDisplayed());
        System.out.println(elementSelenium.getText());

    }
}
