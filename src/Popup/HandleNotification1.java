package Popup;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleNotification1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		HashMap<String, Integer> contentSettings=new HashMap();
		contentSettings.put("geolocation", 1);
		
		HashMap<String, Object> profile = new HashMap();
		profile.put("managed_default_content_settings", contentSettings);
		
		HashMap<String, Object> preference=new HashMap();
		preference.put("profile", profile);
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", preference);
		
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		Thread.sleep(3000);

	}

}
