package Popup;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {

	public static void main(String[] args) {
		
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://skillrary.com/");
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      
      driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
     
      
      driver.findElement(By.xpath("//ul[@class='dropdown-menu gear_menu']/descendant::a[text()=' SkillRary Essay']")).click();
      String parentId = driver.getWindowHandle();
      Set<String> windows = driver.getWindowHandles();
      
      for (String id : windows) 
      {
    	  driver.switchTo().window(id);	
	  }
      driver.findElement(By.id("mytext")).sendKeys("selenium");
      driver.findElement(By.xpath("//input[@value=\"Yes It's My Name\"]")).click();
      driver.close();
      driver.switchTo().window(parentId);
      driver.quit();
	}
}
