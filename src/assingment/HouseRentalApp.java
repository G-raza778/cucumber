package assingment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HouseRentalApp {
	
	@Test
	public void loginToHouseRentalApp() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://rmgtestingserver/domain/House_Rental_Application/auth/login.php");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    driver.findElement(By.name("username")).sendKeys("admin",Keys.TAB,"admin",Keys.ENTER);
	    driver.findElement(By.xpath("//b[text()='Registered Users: ']")).click();
	   
	    
	}
}
