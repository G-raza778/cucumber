package testNG;

import org.testng.annotations.Test;

public class EnabledFalse 
{
	@Test(enabled = false)
	public void demo1()
	{
		System.out.println("demo1");
	}
	@Test
	public void demo2()
	{
		System.out.println("demo2");
	}
}
