package Popup;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadUsingAutoIt1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.foundit.in/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		        
		driver.findElement(By.xpath("//div[contains(text(),'Upload Resume')]")).click();
		driver.findElement(By.xpath("//input[@type='file']"));
		Thread.sleep(2000);
       // Runtime.getRuntime().exec("C:\\Users\\waris ansari\\Desktop\\AutoIt\\Auto2.exe");
	}
}
