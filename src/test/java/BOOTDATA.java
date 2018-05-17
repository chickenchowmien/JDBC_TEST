import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BOOTDATA {


    public static void main(String[] args) {
        String file = "TESTDATA.XLSX";
        try(


                FileInputStream inputStream = new FileInputStream(file);
                Workbook workbook = new XSSFWorkbook(inputStream);

                XSSFWorkbook excellWBook = new XSSFWorkbook(inputStream);





                ) {

            



        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
