package Data_drive_testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class fetch_data{
	

public static String getdata(String Sheet,int r,int c) 
{
FileInputStream fis;
 Workbook book = null;

try {
	fis=new FileInputStream("./Excel/selenium.xlsx");
	book = WorkbookFactory.create(fis);
} catch (Exception e) {
	System.out.println("file not found");
} 

Sheet sh = book.getSheet("Sheet");
Row ro = sh.getRow(r);
Cell cel = ro.getCell(c);
String value = cel.toString();
return value;
}
}