package DropDown;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelect {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dropdown = driver.findElement(By.id("cars"));
		
		Select s = new Select(dropdown);
		System.out.println(s.isMultiple());
		
		s.selectByIndex(2);
		s.selectByValue("99");
		s.selectByVisibleText("INR 100 - INR 199 ( 16 )");
		
		s.deselectByIndex(2);
		s.deselectByValue("99");
		
		s.deselectByVisibleText("INR 100 - INR 199 ( 16 )");
		driver.quit();
		
		
	}
}
