package PomPage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InstaLoginPageScript 
{
	public static void main(String[] args) throws InterruptedException 
	{
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.instagram.com/");
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      
      InstaLoginPage login = new InstaLoginPage(driver);
      Thread.sleep(3000);
      login.setUsername("admin");
      login.setPassword("manager");
     //driver.close();
	}
}
