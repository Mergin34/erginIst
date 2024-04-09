package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeClassAfterClass;

public class Test07 extends TestBaseBeforeClassAfterClass {
    @Test
    public void test() {
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        driver.findElement(By.xpath("//*[text()='Add Element']")).click();
        WebElement deleteButton = driver.findElement(By.xpath("//*[text()='Delete']"));
        System.out.println(deleteButton.isDisplayed());
        deleteButton.click();
        System.out.println(driver.findElement(By.xpath("//*[@id='content']/h3")).isDisplayed());
    }
}
