package tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test11Bakilacak {
    @Test
    public void test() {
        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));

        Assert.assertTrue(Driver.getDriver().getTitle().contains("Google"));

        GooglePage googlePage = new GooglePage();
        googlePage.searchBox.sendKeys("Nutella", Keys.ENTER);

        System.out.println(googlePage.searchResults.getText());
        String sonucYazisi = googlePage.searchResults.getText();

        String[] arr = sonucYazisi.split(" ");
        List<String> list = Arrays.asList(arr);
        System.out.println(list.get(1));
        int yeniDeger = Integer.valueOf(list.get(1));
        //10 milyonadan fazla oldugunu bulamadim.

        Assert.assertTrue(yeniDeger > 1000000);

        Driver.getDriver().quit();
        /*
        1
        C01_TekrarTesti isimli bir class olusturun
        2
        https://www.google.com/ adresine gidin
        3
        cookies uyarisini kabul ederek kapatin
        4
        Sayfa basliginin “Google” ifadesi icerdigini test edin
        5
        Arama cubuguna “Nutella” yazip aratin
        6
        Bulunan sonuc sayisini yazdirin
        7
        sonuc sayisinin 10 milyon’dan fazla oldugunu test edin
        8
        Sayfayi kapatin
         */
    }
}
