package Practice_Package;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteMultipleDataInExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		
		ArrayList<String> org = new ArrayList<String>();
		org.add("pyspider");
		org.add("jspider");
		ArrayList<String> loc = new ArrayList<String>();
		loc.add("hebbal");
		loc.add("btm");
		
		for(int i=0; i<org.size();i++) {
			
			FileInputStream fis = new FileInputStream("./src/test/resources/TestData.xlsx");
		    
			Workbook wb = WorkbookFactory.create(fis);
			FileOutputStream fos = new FileOutputStream("./src/test/resources/TestData.xlsx");
			
			wb.getSheet("Sheet1").createRow(i+1).createCell(0).setCellValue(org.get(i));
			wb.write(fos);
			wb.close();
			
			fis = new FileInputStream("./src/test/resources/TestData.xlsx");
			wb = WorkbookFactory.create(fis);
			fos = new FileOutputStream("./src/test/resources/TestData.xlsx");
			
			wb.getSheet("Sheet1").getRow(i+1).createCell(1).setCellValue(loc.get(i));
			wb.write(fos);
			wb.close();
			
		}
	}
}
