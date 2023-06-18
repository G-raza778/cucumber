package webdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EbaySearch {
// using path by attributes
	public static void main(String[] args) throws InterruptedException {
	 
	    WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"gh-ac\"]")).sendKeys("laptop");
		driver.findElement(By.xpath("//input[@id=\"gh-btn\"]")).click();
		Thread.sleep(3000);
		driver.close();
	
		
	}
}
