package Syncronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWaitPractice1 {

	public static void main(String[] args)  {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
	   wait.until(ExpectedConditions.titleContains("Facebook – log in or sign up"));
	
    WebElement user=driver.findElement(By.name("email"));
    wait.until(ExpectedConditions.visibilityOf(user)).sendKeys("admin");
    
    
    WebElement pass=driver.findElement(By.id("pass"));
    wait.until(ExpectedConditions.visibilityOf(pass)).sendKeys("manager");
    
    
    WebElement login=driver.findElement(By.name("login"));
    wait.until(ExpectedConditions.elementToBeClickable(login)).click();
    
    driver.close();
    
    
    
	}

}
