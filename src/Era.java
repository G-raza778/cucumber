import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Era {
	
	
	public static void main(String[] args) {
		
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		driver.findElement(By.xpath("//b[text()='Multiselect drop down']/parent::p/following-sibling::div[@class=\" css-2b097c-container\"]")).click();
		
	}
//	@Test
//	public void m1() {
//		
//		System.out.println(1/0);
//	}
//	
//	@Test(dependsOnMethods = "m1")
//	public void m2() {
//		System.out.println("m2");
//	}
}
