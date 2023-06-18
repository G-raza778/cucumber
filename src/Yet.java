import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Yet
{
	public static void main(String[] args) 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//div[@style=\"border-radius: 14px;\"]")).click();
		driver.findElement(By.xpath("//div[contains(@class,\"field-1\")]")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"Where from?\"]")).sendKeys("bangalore");
		driver.findElement(By.xpath("//p[text()='Bangalore, IN - Kempegowda International Airport (BLR)']")).click();
	
	    driver.findElement(By.xpath("//div[contains(@class,\"field-2 flex\")]")).click();
	    driver.findElement(By.xpath("//input[@placeholder=\"Where to?\"]")).sendKeys("ranchi");
	    driver.findElement(By.xpath("//p[text()='Ranchi, IN - Birsa Munda (IXR)']")).click();
	   
	   
	    driver.findElement(By.xpath("//div[@class=\"fs-4 fw-500 c-inherit flex flex-nowrap ml-4\"]")).click();
	    
	    
	    Date d = new Date();
	    String[] date = d.toString().split(" ");
	    
	    String day = date[0];
	    String month = date[1];
	    String todaydate = date[2];
	    String year = date[5];
	    String fdate = day+" "+month+" "+todaydate+" "+year;
	    System.out.println(fdate);
	    
	    driver.findElement(By.xpath("//div[@aria-label=\"Thu Mar 30 2023\"]")).click();
//	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//	    wait.until(ExpectedConditions.visibilityOf(e)).click();
	    
	    
	    
	    
	}
}


