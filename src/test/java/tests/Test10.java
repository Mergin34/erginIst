package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class Test10 {
    @Test
    public void test() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        WebElement searchBox = Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Samsung headphones", Keys.ENTER);
        WebElement seachResult = Driver.getDriver().findElement(By.xpath("(//*[@class='a-section a-spacing-small a-spacing-top-small'])[1]"));
        System.out.println(seachResult.getText());
        Driver.getDriver().findElement(By.xpath("(//*[@class='s-image'])[1]")).click();
        List<WebElement> titles = Driver.getDriver().findElements(By.xpath("//*[@id='nav-progressive-subnav']"));
        for (WebElement w : titles) {
            System.out.println(w.getText());
        }
        Driver.getDriver().quit();
    }
}
