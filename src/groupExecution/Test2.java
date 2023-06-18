package groupExecution;

import org.testng.annotations.Test;

public class Test2 {
	
	@Test(groups = "Smoke")
	public void demo1()
	{
		System.out.println("Test2 - Smoke");
	}
	@Test(groups = "System")
	public void demo2()
	{
		System.out.println("Test2 - System");
	}
	@Test(groups = "System")
	public void demo3()
	{
		System.out.println("Test2 - System");
	}
	@Test(groups = {"Smoke","System"})
	public void demo4()
	{
		System.out.println("Test2 - Smoke,System");
	}

}
