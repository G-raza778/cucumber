package Practice_Package;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class SpiceJet {

	public static void main(String[] args) {
		
		
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//div[text()='one way']")).click();
		driver.findElement(By.xpath("//div[text()='From']")).click();
		driver.findElement(By.xpath("//div[@data-testid=\"to-testID-origin\"]/descendant::input")).sendKeys("bengaluru");
		
		
	    driver.findElement(By.xpath("//div[text()='To']")).click();
	    driver.findElement(By.xpath("//div[text()='To']/ancestor::div[@data-testid=\"to-testID-destination\"]/descendant::input")).sendKeys("ranchi");
	   
	    String mon = "April";
	    String yr = "2023";
	    String date = "24";
	    String fdate = mon+" "+yr;
	    
	    String monthyear = driver.findElement(By.xpath("//div[@data-testid=\"undefined-month-"+mon+"-"+yr+"\"]/descendant::div[text()='March ']")).getText();
	    String a[] =monthyear.toString().split(" ");
	    String month = a[0];
	    String year = a[1];
	    
	   
	    while(true) {
	    	
	    	if(fdate.equalsIgnoreCase(monthyear)) {
	    WebElement e = driver.findElement(By.xpath("//div[@data-testid=\"undefined-calendar-picker\"]/descendant::div[@data-testid=\"undefined-month-"+mon+"-"+yr+"\"]/descendant::div[@data-testid=\"undefined-calendar-day-"+date+"\"]"));
	    e.click();
	    driver.findElement(By.xpath("//div[@class=\"css-76zvg2 r-jwli3a r-ubezar r-16dba41\"]")).click();
	   break;
	    	}
	    	else
	    	{
	    		driver.findElement(By.xpath("//div[@class=\"css-1dbjc4n r-1loqt21 r-u8s1d r-11xbo3g r-1v2oles r-1otgn73 r-16zfatd r-eafdt9 r-1i6wzkk r-lrvibr r-184en5c\"]")).click();
	    	}
	    
	    }
	    
	  
	    
	    
	
	
	}

}
