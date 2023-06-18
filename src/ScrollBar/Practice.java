package ScrollBar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Practice {

	@Test
	public void validate() throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		SoftAssert soft = new SoftAssert();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String url = "https://www.yatra.com/";
		js.executeScript("window.location=arguments[0]", url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement element = driver.findElement(By.xpath("//span[text()='Popular International Flight Routes']"));
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		Thread.sleep(3000);
		String actual = "java";
		String expected = "java3";
		soft.assertEquals(actual, expected);
		js.executeScript("window.scrollBy(0,5000)");
		System.out.println(js.executeScript("return document.title"));
		System.out.println(js.executeScript("return document.URL"));
		js.executeScript("history.go(0)");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

	}
}
