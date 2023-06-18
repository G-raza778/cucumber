package assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertPractice {
	@Test
	public void demo() {
		SoftAssert soft = new SoftAssert();

		String s1 = "hello";
		String s2 = "World";

		soft.assertSame(s1, s2);
		System.out.println(s1);
		soft.assertAll();
	}

	@Test(enabled=false)
	public void demo1() {
		String s1 = "hello";
		String s2 = "World";
		System.out.println(s1);
		System.out.println(s2);
	}
}
