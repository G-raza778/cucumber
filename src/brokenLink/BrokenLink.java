package brokenLink;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class BrokenLink {

	@Test
	public void broken() throws IOException {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		List<WebElement> listofAlllink = driver.findElements(By.xpath("//a"));
		List<String> listofvalidlink = new ArrayList<>();
		List<String> brokenlink = new ArrayList<>();
		for (WebElement web : listofAlllink) {

			String link = web.getAttribute("href");
			if (link != null || link.contains("http")) {
				listofvalidlink.add(link);
			} else {
				brokenlink.add(link);
			}
		}
		
		for (String str : listofvalidlink) {
        
			URL url = new URL(str);
			URLConnection urlCon = url.openConnection();
			HttpURLConnection httpurlCon = (HttpURLConnection) urlCon;
			int statusCode = httpurlCon.getResponseCode();
			String responseMsg = httpurlCon.getResponseMessage();
			if (statusCode >= 400) {
				brokenlink.add("==> status code " + statusCode + "==> response message " + responseMsg);
			}
		}
		System.out.println(listofAlllink.size());
		System.out.println(brokenlink.size());
	}
}
