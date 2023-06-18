package Practice_Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class hra {
	
	@Test
	public void clickOnEdit() {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://rmgtestingserver/domain/House_Rental_Application/auth/login.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.findElement(By.name("username")).sendKeys("admin", Keys.TAB, "admin", Keys.TAB, Keys.ENTER);
		driver.findElement(By.xpath("//a[text()='Details/Update']")).click();
		String fullname = "admin";
		String mob = "8426587596";
		driver.findElement(By.xpath("//p[contains(text(),'"+fullname+"')]/following-sibling::p[text()='"+mob+"']/ancestor::div[@class=\"card-block\"]/child::a")).click();
	}

}
