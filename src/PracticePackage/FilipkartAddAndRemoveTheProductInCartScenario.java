package PracticePackage;

import java.time.Duration;
import java.util.Set;
import java.util.Vector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilipkartAddAndRemoveTheProductInCartScenario {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement e =driver.findElement(By.name("q"));
		e.sendKeys("toys",Keys.TAB,Keys.ENTER);

		driver.findElement(By.xpath("//a[contains(text(),'Mayne Exceed Helicopter')]/ancestor::div[@class='_4ddWXP']/descendant::div[@class='_30jeq3']")).click();
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		
		for (String s : child) {
			driver.switchTo().window(s);
			}
		driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2U9uOA _3v1-ww')]")).click();
		Thread.sleep(2000);	
		WebElement place = driver.findElement(By.xpath("//span[text()='Place Order']"));
		if(place.isDisplayed())
		{
			System.out.println("The product has been add to cart successfully");
		}
		else
		{
			System.out.println("fail");
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Remove']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='td-FUv WDiNrH']/div[text()='Remove']")).click();
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(3000);
		driver.switchTo().window(parent);
		Thread.sleep(2000);
		e.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		Thread.sleep(2000);
		e.sendKeys("bike",Keys.TAB,Keys.ENTER);
		Thread.sleep(2000);
		driver.close();
		
	}
}
