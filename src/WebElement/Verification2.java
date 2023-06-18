package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verification2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement chechbox=driver.findElement(By.id("keepLoggedInCheckBox"));
		chechbox.click();
		Thread.sleep(2000);
		System.out.println(chechbox.isSelected());
		if(chechbox.isSelected())
			System.out.println("Selected");
		else
			System.out.println("not Selected");
		driver.quit();
	}
}


