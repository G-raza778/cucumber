package Practice_Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class LoginToApp {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://rmgtestingserver/domain/House_Rental_Application/app/list.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		String data = driver.findElement(By.xpath("//p[text()='sureshWaris94409']/following-sibling::p[text()='majastik']")).getText();
		System.out.println(data);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		driver.findElement(By.name("username")).sendKeys("admin");
//		driver.findElement(By.name("password")).sendKeys("admin");
//		driver.findElement(By.name("login")).click();
//		

	}

}
