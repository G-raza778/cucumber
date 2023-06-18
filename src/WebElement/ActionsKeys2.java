package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionsKeys2 
{
	public static void main(String[] args) throws InterruptedException
	{	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement tab = driver.findElement(By.id("email"));
		tab.sendKeys("admin"+Keys.TAB+"manager"+Keys.TAB);
		Thread.sleep(2000);
		tab.click();
		driver.close();
	}
}
