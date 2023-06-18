package crossBrowserParallelExecution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SeleniumTest extends BaseClass {
	
	@Test
	public void seleniumPageTest()
	{
		driver.get("https://www.selenium.dev/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    WebElement logo = driver.findElement(By.xpath("//*[name()='svg'][@id='selenium_logo']"));
	    if(logo.isDisplayed())
	    	System.out.println("pass");
	    else
	    	System.out.println("fail");
	}
}
