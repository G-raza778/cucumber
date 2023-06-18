package Practice_Package;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Practice2 {
	
	@Test(dataProvider = "getDataFromExcel")
	public void data(String subject, String faculty) {
		
		System.out.println(subject+" "+faculty);
	}
	
	
	@DataProvider
	public void getDataFromExcel() throws Throwable {
		
		
		//Object[][] value = eLib.readMultipleSetOfDataFromExcel();
		
	//	clone() value;
	}
}
