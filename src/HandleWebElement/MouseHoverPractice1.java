package HandleWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverPractice1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement Electronics = driver.findElement(By.xpath("//li[contains(@class,\"hl-cat-nav__js-tab\")]/a[text()='Electronics']"));
		
        Actions action = new Actions(driver);
        action.moveToElement(Electronics).perform();
        
        driver.findElement(By.xpath("//a[text()='Smart watches']")).click();
        driver.quit();
        
        
	}

}
