package Data_drive_testing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Enter_single_data {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
FileInputStream fis = new FileInputStream("./Excel/selenium.xlsx");
Workbook book = WorkbookFactory.create(fis);
Sheet sh = book.getSheet("Sheet1");
Row ro = sh.createRow(1);
Cell cel = ro.createCell(1);
cel.setCellValue("rashmi");
 FileOutputStream fout = new FileOutputStream("./Excel/selenium.xlsx");
book.write(fout);

	}

}
