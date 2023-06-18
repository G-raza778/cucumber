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

public class BrokenLink3 {

	@Test
	public void broken() throws IOException {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.vtiger.com/home/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		List<WebElement> listoflink = driver.findElements(By.tagName("a"));
		List<String> validlink = new ArrayList<>();
		List<String> brokenlink = new ArrayList<>();
		for (WebElement web : listoflink) {
			String link = web.getAttribute("href");
			if (link != null) {
				if (link.contains("http")) {
					validlink.add(link);
				}
			} else {
				brokenlink.add(link);
			}
		}

		for (String str : validlink) {

			URL url = new URL(str);
			URLConnection urlCon = url.openConnection();
			HttpURLConnection httpurl = (HttpURLConnection) urlCon;
			int statusCode = httpurl.getResponseCode();
			String responseMsg = httpurl.getResponseMessage();
			if (statusCode > 400) {
				brokenlink.add(responseMsg + statusCode);
			}
		}
		System.out.println(validlink.size());
		System.out.println(listoflink.size());
	}
}
