package tests2;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test38 {
    @Test
    public void test() throws IOException {
        String fileWay = "src/resources/countries.xlsx";
        FileInputStream fis = new FileInputStream(fileWay);
        Workbook workbook = WorkbookFactory.create(fis);

        workbook.getSheet("Sayfa1").getRow(0).createCell(4).setCellValue("Nufus");
        workbook.getSheet("Sayfa1").getRow(1).createCell(4).setCellValue("1.500.000");
        workbook.getSheet("Sayfa1").getRow(9).createCell(4).setCellValue("250.000");
        workbook.getSheet("Sayfa1").getRow(14).createCell(4).setCellValue("54.000");

        FileOutputStream fos = new FileOutputStream(fileWay);
        workbook.write(fos);
        fos.close();
        fis.close();
        workbook.close();

    }
}
