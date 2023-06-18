import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://skillrary.com/");
		driver.findElement(By.xpath("//li[@class='dropdown'][2]/child::a")).clear();
		driver.findElement(By.xpath("//ul[@class='dropdown-menu gear_menu']/descendant::a[text()=' SkillRary Essay']")).click();
		String parent = driver.getWindowHandle();
		
		Set<String> window = driver.getWindowHandles();
		
		for (String id : window) {
			driver.switchTo().window(id);
		}
		driver.findElement(By.id("mytext")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@value=\"Yes It's My Name\"]")).click();
		
		driver.close();
		
		driver.switchTo().window(parent);
		driver.quit();
		

	}

}
