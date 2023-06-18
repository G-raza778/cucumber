package Practice_Package;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Practice1 {
	
	@Test(dataProvider = "data")
	public void getdata(String subject, String faculty, String place) {
		
		System.out.println(subject+" "+faculty+" "+place);
	}
	
	@DataProvider
	public Object[][] data() {
		
		 Object[][] obj = new Object[4][3];
		 
		 obj[0][0]="java";
		 obj[0][1]="manjunath";
		 obj[0][2]="hebbal";
		 
		 obj[1][0]="core java";
		 obj[1][1]="chitambaram";
		 obj[1][2]="hebbal";
		 
		 obj[2][0]="manual";
		 obj[2][1]="uma";
		 obj[2][2]="hebbal";
		 
		 obj[3][0]="selenium";
		 obj[3][1]="srivalli";
		 obj[3][2]="hebbal";
		 
		 return obj;
	}
}
