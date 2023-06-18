package Practice_Package;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sh = wb.getSheet("Sheet1");
		
		int count = sh.getLastRowNum();
		
		for(int i=1;i<count-1;i++)
		{
		String org = sh.getRow(i).getCell(0).getStringCellValue();
		String loc = sh.getRow(i).getCell(1).getStringCellValue();
		
		System.out.println(org+" "+loc);
		}
		
		
		wb.close();

	}
}
