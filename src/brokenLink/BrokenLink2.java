package brokenLink;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class BrokenLink2 {

	@Test
	public void skillTest() throws Throwable {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://skillrary.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		List<WebElement> listoflink = driver.findElements(By.tagName("a"));
		List<String> validlink = new ArrayList<>();
		List<String> brokenlink = new ArrayList<>();
		System.out.println(listoflink.size());
		for (WebElement web : listoflink) {

			String link = web.getAttribute("href");
			if (link != null) {
				if (link.contains("http")) {
					validlink.add(link);
				}else {
					brokenlink.add(link+"==> ");
				}
			}
			else {
				brokenlink.add(link+"==> here we store all the null url");
			}
		}

		for (String str : validlink) {
			URL url = new URL(str);
			URLConnection urlCon = url.openConnection();
			HttpURLConnection urlhttp = (HttpURLConnection) urlCon;
			int statusCode = urlhttp.getResponseCode();
			String responeMsg = urlhttp.getResponseMessage();
			if (statusCode > 400) {
				brokenlink.add("==> status code " + statusCode + "==> response message " + responeMsg);
				System.out.println(brokenlink.size());
			}
		}
	}
}
