package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookLoginScript {

	public static void main(String[] args) throws IOException {

      FileInputStream fis = new FileInputStream("./testresources/commondata.properties");

      Properties p = new Properties();
      
      p.load(fis);
      
      String url= p.getProperty("url");
      long time = Long.parseLong(p.getProperty("timeouts"));
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get(url);
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      
      driver.findElement(By.id("email")).sendKeys(p.getProperty("username"));
      driver.findElement(By.id("pass")).sendKeys(p.getProperty("password"));
      driver.findElement(By.name("login")).click();
      
//      WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));      
//      WebElement button = driver.findElement(By.xpath("//span[text()='Marketplace']"));
//      wait.until(ExpectedConditions.visibilityOf(button));
//      if(button.isDisplayed())
//      {
//    	  System.out.println("pass");
//      }
//      else
//      {
//    	  System.out.println("fail");
//      }
      driver.close();
	}
}
