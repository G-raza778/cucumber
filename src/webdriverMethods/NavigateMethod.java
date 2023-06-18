package webdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{	
		//All navigation method are used in program
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.flipkart.com/");
		  Thread.sleep(2000);
		  driver.get("https://www.amazon.com/");
		  driver.navigate().back();
		  Thread.sleep(2000);
		  driver.navigate().forward();
		  Thread.sleep(2000);
		  driver.navigate().refresh(); 
		  driver.navigate().to("https://www.ebay.com/");//String url
		  Thread.sleep(2000);	 
		  
		  
	}
}
