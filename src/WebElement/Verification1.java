package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verification1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vtiger.com/crm-demo/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement logo=driver.findElement(By.xpath("//img[@alt=\"vtiger crm\"]"));
		
		if(logo.isDisplayed())
			System.out.println("Diplayed");
		else
			System.out.println("not Displayed");
		
		System.out.println(logo.isDisplayed());
		
		driver.quit();
	}
}


