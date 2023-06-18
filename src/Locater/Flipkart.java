package Locater;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.flipkart.com/");
		driver.findElement(By.className("_2doB4z")).click();
	    driver.findElement(By.name("q")).sendKeys("iphone");
	    driver.findElement(By.xpath("//button[contains(@type,\"submit\")]")).click();
	    String mainpage=driver.getWindowHandle();
	    driver.findElement(By.xpath("//div[text()='APPLE iPhone 14 (Midnight, 128 GB)']")).click();
	    Set<String> allpage = driver.getWindowHandles();
	    for(String page:allpage) {
	    	if(page!=mainpage) 
	    	{
	    		driver.switchTo().window(page);
	    	}
	    }
	    driver.findElement(By.xpath("//*[name()='svg' and @class='_1KOMV2']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[text()='Place Order']")).click();
	    Thread.sleep(2000);
	    driver.quit();
	   
	}
}
