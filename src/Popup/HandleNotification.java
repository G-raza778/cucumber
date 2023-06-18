package Popup;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleNotification 
{
	public static void main(String[] args) throws InterruptedException 
	{	
		HashMap<String, Integer> contentSettings=new HashMap();
		contentSettings.put("notifications", 2);
		
		HashMap<String, Object> profile = new HashMap();
		profile.put("managed_default_content_settings", contentSettings);
		
		HashMap<String, Object> preference=new HashMap();
		preference.put("profile", profile);
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", preference);
		
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");
		Thread.sleep(3000);
		//driver.close();
		
	}
}
