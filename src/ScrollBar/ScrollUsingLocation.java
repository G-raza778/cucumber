package ScrollBar;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUsingLocation {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.amazon.com/");
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	     WebElement Toys = driver.findElement(By.xpath("//img[@alt='New arrivals in Toys']"));
	     Point p = Toys.getLocation();
	     int x = p.getX();
	     int y = p.getY();
	     
	     JavascriptExecutor js = (JavascriptExecutor)driver;
	     js.executeScript("window.scrollBy("+x+","+y+")");
	     Thread.sleep(2000);
	     
	}

}
