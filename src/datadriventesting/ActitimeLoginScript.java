package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeLoginScript 
{
	public static void main(String[] args) throws IOException 
	{	
		FileInputStream fis = new FileInputStream("./testresources/commondata.properties");
        Properties property = new Properties();
        property.load(fis);
        String url = property.getProperty("url");
        long time = Long.parseLong(property.getProperty("timeouts"));
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
        
        driver.findElement(By.id("username")).sendKeys(property.getProperty("username"));
        driver.findElement(By.name("pwd")).sendKeys(property.getProperty("password"));
        driver.findElement(By.id("loginButton")).click();
        
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
        boolean status = wait.until(ExpectedConditions.titleContains("Enter Time-Track"));
        
        if(status)
        	System.out.println("pass");
        else
        	System.out.println("fail");
        
        driver.quit(); 
	}
}
