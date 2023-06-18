package crossBrowserParallelExecution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SwiggyTest extends BaseClass {

	@Test
	public void swiggyPageTest()
	{
		driver.get("https://www.swiggy.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement logo = driver.findElement(By.xpath("//*[name()='svg'][@class='_1envo']"));
		if(logo.isDisplayed())
			System.out.println("pass");
		else
			System.out.println("fail");
	}
}
