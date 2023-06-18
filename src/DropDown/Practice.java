package DropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice 
{
	public static void main(String[] args) throws InterruptedException 
	{	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		
		Select s = new Select(dropdown);
		
		System.out.println(s.isMultiple());
		
//		if(s.isMultiple())
//			System.out.println("multiselect");
//		else
//			System.out.println("singleselect");

		s.selectByIndex(3);
		Thread.sleep(2000);
		s.selectByValue("search-alias=baby-products-intl-ship");
		Thread.sleep(2000);
		s.selectByVisibleText("Books");
		Thread.sleep(2000);
		driver.quit();
		
	}
}
