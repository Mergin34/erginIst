package tests2;

import org.apache.poi.ss.usermodel.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test37Tamamlanacak {
    @Test
    public void test() throws IOException {
        String fileWay = "src/resources/countries.xlsx";
        FileInputStream fis = new FileInputStream(fileWay);
        Workbook workbook = WorkbookFactory.create(fis);

        Sheet sheet = workbook.getSheet("Sayfa1");
        Row row = sheet.getRow(1);
        Cell cell = row.getCell(2);
        System.out.println(cell);

        Sheet sheet2 = workbook.getSheet("Sayfa1");
        Row row2 = sheet2.getRow(1);
        Cell cell2 = row2.getCell(2);

        String str = cell2.getStringCellValue();
        System.out.println(str);

        Sheet sheet1 = workbook.getSheet("Sayfa1");
        Row row1 = sheet1.getRow(1);
        Cell cell1 = row1.getCell(1);
        String str2 = cell1.getStringCellValue();
        String str1 = "Kabul";
        Assert.assertEquals(str2, str1);

        int lastRow = workbook.getSheet("Sayfa1").getLastRowNum();
        System.out.println(lastRow);

        //Fiziki olarak kullanilan satir sayisini bulun?

        //Ingilizce Ulke isimleri ve baskentleri bir map olarak kaydedelim?
    }
}
