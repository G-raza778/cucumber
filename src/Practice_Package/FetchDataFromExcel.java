package Practice_Package;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class FetchDataFromExcel {
	
	@DataProvider
	public Object[][] data() throws Throwable {
		
		FileInputStream fis = new FileInputStream("");
	    Workbook wb = WorkbookFactory.create(fis);
	    Sheet sh = wb.getSheet("DP");
	    
	    int lastRow = sh.getLastRowNum()+1;
	    int lastCell = sh.getRow(0).getLastCellNum();
	    
	    System.out.println(lastRow);
		System.out.println(lastCell);
		
	    Object[][] obj = new Object[lastRow][lastCell];
	    
	    for(int i=0;i<lastRow;i++) {
	    	for(int j=0;j<lastCell;j++) {
	    		obj[i][j]= sh.getRow(i).getCell(j).getStringCellValue();
	    	}
	    }
	    return obj;
	
	
	}

}
