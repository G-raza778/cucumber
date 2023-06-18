import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FlipkartAddToCartScenario 
{
	public static void main(String[] args) throws InterruptedException 
	{	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("bike");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		String parentId = driver.getWindowHandle();
		driver.findElement(By.linkText("Hero Xpulse 200 4V Booking for Ex-showroom Price")).click();
		Thread.sleep(3000);
		Set<String> window = driver.getWindowHandles();
		
		for(String session:window) {
			driver.switchTo().window(session);	
		}
		driver.findElement(By.xpath("//*[text()='Add to cart']")).click();
		Thread.sleep(3000);
		WebElement placeorder = driver.findElement(By.xpath("//span[text()='Place Order']"));
		if(placeorder.isDisplayed())
		{
		System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		driver.close();
		driver.switchTo().window(parentId);
		element.clear();
		element.sendKeys("oil");
		driver.findElement(By.xpath("//button[@type='submit']")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
		driver.quit();
	}
}

