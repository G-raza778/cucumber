package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actions1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement search = driver.findElement(By.id("gh-ac"));
		search.sendKeys("laptops");
		Thread.sleep(2000);
		search.clear();
		search.sendKeys("smart watch");
		driver.findElement(By.id("gh-btn")).click();
		Thread.sleep(2000);
		driver.close();
		
	}
}
