package Practice_Package;

import org.testng.annotations.Test;

public class Show1 {
	
	@Test(dataProviderClass = Show.class, dataProvider = "readMultipleDataFromExcel")
	public void data(String subject, String faculty) {
		System.out.println(subject+" "+faculty);
	}
}
