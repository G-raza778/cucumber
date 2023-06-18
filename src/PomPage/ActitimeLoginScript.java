package PomPage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeLoginScript {

	public static void main(String[] args) {

      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://demo.actitime.com/login.do");
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      
      ActitimeLoginpage a = new ActitimeLoginpage(driver);
      if(a.getLogo().isDisplayed())
    	  System.out.println("logo is display");
      else
    	  System.out.println("logo is not display");
      
      a.setUsername("admin");
      a.setPassword("manager");
      a.clickLoginButton();
      
      WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
      boolean status = wait.until(ExpectedConditions.titleContains("Enter Time-Track"));
      
      if(status)
    	  System.out.println("login test pass");
      else
    	  System.out.println("login test failed");
     
      driver.quit();

	}
}
