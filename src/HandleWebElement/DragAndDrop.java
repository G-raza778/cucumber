package HandleWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop 
{
	public static void main(String[] args) throws InterruptedException 
	{
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

       WebElement source = driver.findElement(By.xpath("//h1[text()='Block 1']"));
       WebElement target = driver.findElement(By.xpath("//h1[text()='Block 4']"));
 
       Actions a= new Actions(driver);
       a.dragAndDrop(source, target).perform();

       Thread.sleep(2000);
       driver.quit();
	}
}
