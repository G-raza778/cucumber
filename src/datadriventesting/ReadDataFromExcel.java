package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel 
{
	public static void main(String[] args) throws IOException 
	{
		Workbook wb = null;
		try
		{
		//Step 1: Convert physical file into java readable object
		FileInputStream fis = new FileInputStream("./testresources/Data.xlsx");

		//Step 2: Open workbook
		//Workbook, WorkbookFactory,sheet,Row,Cell should be imported from apache.poi.ss.usermodel
		//EncryptedDocumentException and IOException
		 wb = WorkbookFactory.create(fis);
		
		//Step 3: Get Control over particular sheet
		Sheet sh = wb.getSheet("Sheet1");
		
		//Step 4: Get control over particular row
		Row r = sh.getRow(1);
		
		//Step 5:Get Control over particular cell
		Cell c = r.getCell(1);
		
		//Step 6: Read data from the cell
		System.out.println(c.getStringCellValue());
		}
		finally
		{
			//Step 7: Close workbook
			//IOException it throw
			wb.close();
		}	
	}
}
