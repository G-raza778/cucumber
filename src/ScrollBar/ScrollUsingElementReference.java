package ScrollBar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUsingElementReference 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement electronics=driver.findElement(By.xpath("//h2[text()='Electronics']"));
		
		js.executeScript("arguments[0].scrollIntoView(true)", electronics);
		Thread.sleep(2000);
		driver.quit();
	}
}
