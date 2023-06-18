package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel1 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	
		//Step 1: Convert physical file into java readable object
		FileInputStream fis = new FileInputStream("./testresources/Data.xlsx");

		//Step 2: Open workbook
		//Workbook, WorkbookFactory,sheet,Row,Cell should be imported from apache.poi.ss.usermodel
		//EncryptedDocumentException and IOException
		Workbook wb = WorkbookFactory.create(fis);
	
		 String data = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		 System.out.println(data);
			//Step 7: Close workbook
			//IOException it throw
		
			wb.close();
		}
	}

