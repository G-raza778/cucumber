package Selenium;

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
		driver.get("http://rmgtestingserver/domain/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		List<WebElement> listoflink = driver.findElements(By.tagName("a"));
		List<String> validlink = new ArrayList<>();
		List<String> brokenlink = new ArrayList<>();

		for (WebElement str : listoflink) {
			String link = str.getText();
			if (link != null) {
				if (link.contains("http")) {
					validlink.add(link);
				} else {
					brokenlink.add(link + " without http link is added here ");
				}
			} else {
				brokenlink.add(link + "null link is added here ");
			}
		}

		for (String str : validlink) {

			URL url = new URL(str);
			URLConnection con = url.openConnection();
			HttpURLConnection httpcon = (HttpURLConnection) con;
			int responseCode = httpcon.getResponseCode();
			String responseMsg = httpcon.getResponseMessage();
			if (responseCode > 400) {
				brokenlink.add(responseMsg + responseCode);
			}
		}

	}
}
