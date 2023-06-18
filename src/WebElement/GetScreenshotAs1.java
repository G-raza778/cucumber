package WebElement;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetScreenshotAs1 {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement button =driver.findElement(By.xpath("//div[text()='Login ']"));
	    File src=button.getScreenshotAs(OutputType.FILE);
	    File dest= new File("./ElementScreenshot/"+button.getText()+".png");
	    FileUtils.copyFile(src, dest);
	    driver.close();
	    

	}
}
