package Practice_Package;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvid {
	
	
	@DataProvider
	public Object[][] data() {
		
		 Object[][] obj = new Object[3][2];
		 
		 obj[0][0]="java";
		 obj[0][1]="manjunath";
		 
		 obj[1][0]="python";
		 obj[1][1]="chitambaram";
		 
		 obj[2][0]="manual";
		 obj[2][1]="uma";
		 
		 return obj;
		 
		
	}

}
