package Practice_Package;

import org.testng.annotations.Test;

public class Data_Test {
	
	@Test(dataProviderClass = DataProvid.class, dataProvider = "data")
	public void demo(String subject, String faculty) {
		System.out.println(subject+" "+faculty);
	}
}
