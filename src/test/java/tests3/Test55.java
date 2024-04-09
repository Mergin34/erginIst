package tests3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Test55 extends TestBaseBeforeMethodAfterMethod {
    @Test
    public void test() {
        driver.get("https://demo.guru99.com/test/web-table-element.php");
        List<WebElement> companies = new ArrayList<>(driver.findElements(By.xpath("//tbody//tr//td//a")));
        for (WebElement w : companies) {
            String companyName = w.getText();
            System.out.println(w.getText());
            Assert.assertFalse(companyName.contains("DBC Bank"));
        }
    }
}
