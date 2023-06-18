package ScrollBar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToApp 
{
	public static void main(String[] args) 
	{	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.location=arguments[0]","https://www.amazon.com/");
		System.out.println(js.executeScript("return document.title"));
		System.out.println(js.executeScript("return document.URL"));
		
		WebElement searchTF = driver.findElement(By.id("twotabsearchtextbox"));
		js.executeScript("arguments[0].value=arguments[1]",searchTF, "Smart Watch");
		
		WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
		js.executeScript("arguments[0].click()", searchButton);
		try 
		{
		   Thread.sleep(2000);
		}
		catch(Exception e)
		{
		   System.out.println(e.getMessage());
		}
		
		driver.quit();

	}

}
