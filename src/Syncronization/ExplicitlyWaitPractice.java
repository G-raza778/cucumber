package Syncronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWaitPractice {

	public static void main(String[] args)  {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		// to wait until title appears
		wait.until(ExpectedConditions.titleContains("actiTime"));
		
		WebElement username = driver.findElement(By.id("username"));
		//to wait until username textfield appears
		wait.until(ExpectedConditions.visibilityOf(username)).sendKeys("admin");
		
		
		WebElement password = driver.findElement(By.name("pwd"));
		// to wait until password textfield is appear
		wait.until(ExpectedConditions.visibilityOf(password)).sendKeys("manager");
		
		WebElement loginbutton= driver.findElement(By.id("loginButton"));
		// to wait until login button appears
        wait.until(ExpectedConditions.elementToBeClickable(loginbutton)).click();
        
        
        // to wait until title is appears
        wait.until(ExpectedConditions.titleContains("Enter Time-Track"));
        driver.quit();
	}

}
