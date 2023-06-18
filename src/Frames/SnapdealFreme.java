package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapdealFreme {

	public static void main(String[] args) throws InterruptedException 
	{	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement sign = driver.findElement(By.xpath("//span[text()='Sign In']"));
		Actions a = new Actions(driver);
		a.moveToElement(sign).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='login']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.id("userName")).sendKeys("987654321");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[contains(@class,'sd-icon sd-icon-delete-sign fnt')]")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		WebElement dress = driver.findElement(By.name("keyword"));
		dress.sendKeys("dress");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'searchformButton')]")).click();
		Thread.sleep(2000);
		
		driver.close();
	}
}
