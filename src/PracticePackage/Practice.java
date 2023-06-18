package PracticePackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{	
		FileInputStream fis = new FileInputStream("./testresources/commondata.properties");
		Properties p = new Properties();
		p.load(fis);
		String url = p.getProperty("url");
		String user = p.getProperty("username");
		String pass = p.getProperty("password");
		long time = Long.parseLong(p.getProperty("timeouts"));
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		
		driver.findElement(By.id("username")).sendKeys(user,Keys.TAB,pass,Keys.ENTER);
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));	
		boolean status = wait.until(ExpectedConditions.titleContains("Enter Time-Track"));
		if(status)
		{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Acti/time.png");
		FileUtils.copyFile(src, dest);
		driver.close();
		}	
	}
}
