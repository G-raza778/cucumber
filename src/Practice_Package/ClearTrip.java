package Practice_Package;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class ClearTrip {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//div[@style=\"border-radius: 14px;\"]")).click();
		driver.findElement(By.xpath("//div[contains(@class,\"field-1\")]")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"Where from?\"]")).sendKeys("bangalore");
		driver.findElement(By.xpath("//p[text()='Bangalore, IN - Kempegowda International Airport (BLR)']")).click();
	
	    driver.findElement(By.xpath("//div[contains(@class,\"field-2 flex\")]")).click();
	    driver.findElement(By.xpath("//input[@placeholder=\"Where to?\"]")).sendKeys("ranchi");
	    driver.findElement(By.xpath("//p[text()='Ranchi, IN - Birsa Munda (IXR)']")).click();
	    
	    driver.findElement(By.xpath("//div[@class=\"flex flex-middle p-relative homeCalender\"]")).click();
	   
	    String date = "31";
	    String day = "Fri";
	    String month = "Mar";
	    String year = "2023";
	    
	    String e = driver.findElement(By.xpath("//div[@class=\"flex-1 ta-left\"]")).getText();
	  
	    System.out.println(e);
	    
//	    List<WebElement> d = driver.findElements(By.xpath("//div[@class=\"Day-grid flex flex-middle flex-column flex-top\"]"));
//	    
//	    for(WebElement ele:d)
//	    {
//	    	String dat = ele.getText();
//	    	if(date.equalsIgnoreCase(dat));
//	    	{
//	    		
//	    	}
//	    }
	   
   }
}


