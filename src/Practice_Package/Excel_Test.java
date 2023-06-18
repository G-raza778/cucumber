package Practice_Package;

import org.testng.annotations.Test;

public class Excel_Test {
	
	@Test(dataProviderClass = FetchDataFromExcel.class, dataProvider = "data")
	public void demo(String subject, String faculty) {
		System.out.println(subject+" "+faculty);
	}
}
