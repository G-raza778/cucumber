package DropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Power {

	
		@Test(invocationCount=1)
		public void m1() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

		WebElement e = driver.findElement(By.xpath("//iframe[contains(@class,\"demo-frame lazyloaded\")]"));
	    driver.switchTo().frame(e);
		Actions a = new Actions(driver);
		WebElement drag = driver.findElement(By.xpath("//h5[text()='High Tatras']"));
		WebElement drop = driver.findElement(By.id("trash"));
	    a.dragAndDrop(drag, drop).perform();
	    driver.quit();
	    
	}
}
