package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verification {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement loginButton=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		
		if(loginButton.isEnabled())
			System.out.println("Enabled");
		else
			System.out.println("Disabled");
		
		driver.quit();

	}
}
