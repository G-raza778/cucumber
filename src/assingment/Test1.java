package assingment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[text()=' GEARS '] ")).click();
		
		String parentid = driver.getWindowHandle();
		driver.findElement(By.xpath("//ul[@class=\"dropdown-menu gear_menu\"]/descendant::a[text()=' SkillRary Demo APP']")).click();
		Set<String> childBrowser = driver.getWindowHandles();
		for (String string : childBrowser) {
			driver.switchTo().window(string);
		}
		WebElement coursetab = driver.findElement(By.id("course"));
		Actions action = new Actions(driver);
		action.moveToElement(coursetab).perform();
		driver.findElement(By.xpath("//span[@class='wrappers']/a[text()='Selenium Training']")).click();
		WebElement doubleClick = driver.findElement(By.id("add"));
		action.doubleClick(doubleClick).perform();
		driver.findElement(By.xpath("//button[text()=' Add to Cart']")).click();
		driver.switchTo().alert().accept();
		driver.close();
		driver.switchTo().window(parentid);
		driver.quit();
		
		
	}

}
