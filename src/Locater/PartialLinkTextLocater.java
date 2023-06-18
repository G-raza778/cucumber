package Locater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTextLocater 
{
	public static void main(String[] args) 
	{	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.partialLinkText("Forgotten")).click();
		driver.findElement(By.cssSelector("input#identify_email")).sendKeys("9876543210");
		driver.findElement(By.id("did_submit")).click();
		driver.close();
	}
}
