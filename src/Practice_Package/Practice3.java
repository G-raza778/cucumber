package Practice_Package;

import org.testng.annotations.DataProvider;

public class Practice3 {
	
	

	@DataProvider
	public Object[][] demo() {
		
		Object [][] obj=new Object[2][3];
		
		obj[0][0]="java";
		obj[0][1]="manjunath";
		obj[0][2]="hebbal";
		
		obj[1][0]="manual";
	    obj[1][1]="uma";
	    obj[1][2]="hebbal";
		
		return obj;
		
		
	}
}
