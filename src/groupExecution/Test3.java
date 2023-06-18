package groupExecution;

import org.testng.annotations.Test;

public class Test3 {
	
	@Test(groups = "System")
	public void demo1()
	{
		System.out.println("Test3 - System");
	}
	@Test(groups = "Sanity")
	public void demo2()
	{
		System.out.println("Test3 - Sanity");
	}
	@Test(groups = "Sanity")
	public void demo3()
	{
		System.out.println("Test3 - Sanity");
	}
	@Test(groups = {"Sanity","System"})
	public void demo4()
	{
		System.out.println("Test3 - Sanity,System");
	}
	@Test
	public void demo5()
	{
		System.out.println("Test3 - no group");
	}

}
