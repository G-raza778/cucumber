package Practice_Package;

import org.testng.annotations.Test;

public class Practice4 {

	
	@Test(dataProviderClass = Practice3.class, dataProvider = "demo")
	public void getdata(String subject, String faculty, String palce) {
		
		System.out.println(subject+" "+faculty+" "+palce);
	}
}
