package assingment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test3 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[text()='X']")).click();
		driver.findElement(By.name("q")).sendKeys("core java for selenium",Keys.ENTER);
		driver.findElement(By.xpath("//a[text()='X']")).click();
		driver.findElement(By.xpath("//a[text()=\" Core Java For Selenium Trainin\"]")).click();
		driver.findElement(By.xpath("//a[text()='X']")).click();
		driver.switchTo().frame(0);
		
		WebElement e = driver.findElement(By.xpath("//div[@class=\"vp-shade vp-shade-invisible\"]"));
		Actions a = new Actions(driver);
		a.moveToElement(e).perform();
		driver.findElement(By.xpath("//button[@aria-label=\"Play\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@aria-label=\"Pause\"]")).click();
	
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//span[text()='Add To Wishlist']")).click();
	    
	    driver.close();
	    
	}

}
