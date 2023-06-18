package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataToExcel 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{	
		Workbook wb = null;
		try
		{
          FileInputStream fis = new FileInputStream("./testresources/Data.xlsx");
          wb = WorkbookFactory.create(fis);
          List<String> list = new ArrayList<>();
          for(int i=4 ;i<6;i++)
          {
           	  wb.getSheet("Sheet1").createRow(i).createCell(0).setCellValue("class");
          }
          
          
          FileOutputStream fos = new FileOutputStream("./testresources/Data.xlsx");
          wb.write(fos);
		}
		finally
		{
          wb.close();
		}
	}
}
