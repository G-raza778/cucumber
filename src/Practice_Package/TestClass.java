package Practice_Package;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestClass {
	
	
	@Test(dataProvider = "method")
	public void main(String subject, int faculty) {
		System.out.println(subject+" "+faculty);
	}
	
	
	@DataProvider
	public Object[][] method() {
		
		Object[][] obj = new Object[2][2];
		
		
		
		obj[0][0]="java";
		obj[0][1]=10;
		
		obj[1][0]="python";
		obj[1][1]=20;
		
		return obj;
	}
}
