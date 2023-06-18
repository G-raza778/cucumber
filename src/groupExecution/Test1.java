package groupExecution;

import org.testng.annotations.Test;

public class Test1 {
	
	@Test(groups = "Smoke")
	public void demo1()
	{
		System.out.println("Test1 - Smoke");
	}
	@Test(groups = "Sanity")
	public void demo2()
	{
		System.out.println("Test1 - Sanity");
	}
	@Test(groups = "Regression")
	public void demo3()
	{
		System.out.println("Test1 - Regression");
	}
	@Test(groups = {"Smoke","Sanity","Regression"})
	public void demo4()
	{
		System.out.println("Test1 - Smoke,Sanity,Regression");
	}
}
