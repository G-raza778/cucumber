package testNG;

import org.testng.annotations.Test;

public class Priority1 {
	
	@Test(invocationCount=3)
	public void demo1()
	{
		System.out.println("demo1");
	}
	@Test(invocationCount=0)
	public void demo2()
	{
		System.out.println("demo2");
	}
	@Test
	public void demo3()
	{
		System.out.println("demo3");
	}
	@Test(invocationCount=-3)
	public void demo4()
	{
		System.out.println("demo4");
	}

}
