package crossBrowserParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	protected WebDriver driver;
	@Parameters("BROWSER")
	@BeforeMethod
	public void methodSetup(String browser)
	{
		    if(browser.equals("chrome"))
		    {
		    ChromeOptions option = new ChromeOptions();
		    option.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(option);
		    }
			else if(browser.equals("edge"))
			{
				driver = new EdgeDriver();
			}
			else
			{
			System.out.println("invalid browse");
			}
			driver.manage().window().maximize();
		   }
	@AfterMethod
	public void methodTeardown()
	{
	   driver.quit();	
	}
}


