package testNG;

import org.testng.annotations.Test;

public class InvocationCount 
{
	@Test(invocationCount = 2)
	public void demo1()
	{
		System.out.println("demo1");
	}                                        
	@Test(invocationCount = 0)
	public void demo2()
	{
		System.out.println("demo2");
	}
	@Test(invocationCount = -2)
	public void demo3()
	{
		System.out.println("demo3");
	}
	@Test
	public void demo4()
	{
		System.out.println("demo4");
	}

}
