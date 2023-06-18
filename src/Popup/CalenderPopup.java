package Popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CalenderPopup 
{
	public static void main(String[] args) throws InterruptedException 
	{	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
        driver.findElement(By.id("BE_flight_origin_date")).click();
        driver.findElement(By.id("23/02/2023")).click();
        Thread.sleep(2000);
        driver.quit();
	}
}
