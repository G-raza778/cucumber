package testNG;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGPractice1 
{
	@Test
	public void demo()
	{
	   Reporter.log("demo", true);
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.google.com/");
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
	   WebElement google = driver.findElement(By.xpath("//img[@alt='Camera search']"));
	   Assert.assertTrue(google.isDisplayed());
	   driver.quit();
	}
}
