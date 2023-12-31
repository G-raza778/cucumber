package ScrollBar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUsingRefernce {

	public static void main(String[] args) throws InterruptedException 
	{
		  WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.amazon.com/");
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	      WebElement Toys = driver.findElement(By.xpath("//img[@alt='New arrivals in Toys']"));
          JavascriptExecutor js = (JavascriptExecutor)driver;
          js.executeScript("arguments[0].scrollIntoView(true)", Toys);
          Thread.sleep(2000);
          driver.quit();
	}
}
