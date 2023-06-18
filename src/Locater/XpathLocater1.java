package Locater;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocater1 
{
	public static void main(String[] args) 
	{	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[text()=\"Men's Fashion\"]")).click();
		driver.findElement(By.xpath("//span[text()=\"Women's Fashion\"]")).click();
		driver.findElement(By.xpath("//span[text()=\"Home & Kitchen\"]")).click();
        driver.findElement(By.xpath("//a[text()='Help Center']")).click();
        driver.findElement(By.xpath("//a[text()='Gift Cards']")).click();
        driver.close();
	}
}
