package Practice_Package;

import org.testng.annotations.Test;

public class Practice {
	
	@Test(enabled = true)
	public static void create() {
		System.out.println(1/0);
	}
	
	@Test(dependsOnMethods = "create")
	public static void edit() {
		System.out.println("demo2");
	}
}



