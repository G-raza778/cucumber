package assingment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[text()=' GEARS '] ")).click();
		driver.findElement(By.xpath("//ul[@class=\"dropdown-menu gear_menu\"]/descendant::a[text()=' SkillRary Demo APP']")).click();
		
		String parentid = driver.getWindowHandle();
		Set<String> childBrowser = driver.getWindowHandles();
		for (String string : childBrowser) {
			driver.switchTo().window(string);
		}
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@class=\"chosen-select\"]"));
		Select s = new Select(dropdown);
		s.selectByIndex(1);
		
		WebElement src = driver.findElement(By.id("java"));
		WebElement dest = driver.findElement(By.id("cartArea"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(src, dest).perform();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement facebookIcon = driver.findElement(By.xpath("//ul[@class=\"list-socialicons\"]/descendant::i[@class=\"fa fa-facebook\"]"));
		js.executeScript("arguments[0].scrollIntoView(true)",facebookIcon);
		Thread.sleep(2000);
		facebookIcon.click();
		driver.close();
		driver.quit();
		
		
		
		
		

	}

}
