package testNG;

import org.testng.annotations.Test;

public class DisableTestScripts {

	@Test
	public void demo()
	{
		System.out.println("hello");
	}
	@Test(enabled=false)
	public void demo1()
	{
		System.out.println("world");
	}
}
