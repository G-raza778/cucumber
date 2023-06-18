package ScrollBar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisabledElement {

	public static void main(String[] args) throws InterruptedException {
		
		  WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      driver.get("file:///C:/Users/waris%20ansari/Desktop/new1.html");
	      
	      WebElement element = driver.findElement(By.id("abc"));
	      
	      
	      JavascriptExecutor js = (JavascriptExecutor)driver;
	      js.executeScript("arguments[0].value=arguments[1]", element, "Slenium");
	      Thread.sleep(2000);
	      driver.quit();
	}

}
