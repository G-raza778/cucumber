package Practice_Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;



public class Yatra {

	@Test
	public void yatra() throws InterruptedException {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@title=\"One Way\"]")).click();
	    driver.findElement(By.xpath("//label[@for=\"BE_flight_origin_city\"]")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@class=\"required_field cityPadRight ac_input origin_ac\"]")).sendKeys("bangalore");
	    driver.findElement(By.xpath("//li[@class=\"active ac_over\"]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@class=\"required_field cityPadLeft ac_input dest_ac\"]")).sendKeys("ranchi");
	   
	    driver.findElement(By.xpath("//p[text()='Birsa Munda']")).click();
		
		driver.findElement(By.xpath("//input[@class=\"custom-date-input BE_flight_origin_date\"]")).click();
		
		String fmonth="02", fday="10", fyear="2024";
		
		driver.findElement(By.id(""+fday+"/"+fmonth+"/"+fyear+"")).click();
	     
		WebElement searchFight = driver.findElement(By.id("BE_flight_flsearch_btn"));
		 
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",searchFight );
		
		searchFight.click();
        
		
		
	}
}
