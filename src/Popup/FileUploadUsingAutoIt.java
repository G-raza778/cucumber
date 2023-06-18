package Popup;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadUsingAutoIt 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		        
	    driver.findElement(By.id("register_Layer")).click();
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		Thread.sleep(4000);
	    Runtime.getRuntime().exec("C:\\Users\\waris ansari\\Desktop\\AutoIt\\Auto2.exe");
	   // driver.quit();
			}
		}

	


