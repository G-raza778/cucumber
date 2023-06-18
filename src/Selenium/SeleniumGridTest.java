package Selenium;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGridTest {
	
	@Test
	public void grid() throws MalformedURLException {
		
		String webMethod = "remote";
		WebDriver driver = null;
		if(webMethod.equalsIgnoreCase("remote")) {
		URL url = new URL("http://192.168.0.193:4444/wd/hub");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		
		 driver = new RemoteWebDriver(url, cap);
		 
		 
		}else if(webMethod.equalsIgnoreCase("local")) {
			
			
			driver = new ChromeDriver();
		}
		driver.get("http://rmgtestingserver/domain/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	}
}
