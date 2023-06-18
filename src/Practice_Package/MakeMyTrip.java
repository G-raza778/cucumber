package Practice_Package;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;



public class MakeMyTrip {

	@Test
	public void makeMyTrip() throws InterruptedException {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
	
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
		driver.findElement(By.xpath("//a[@class=\"close\"]")).click();
		
		Thread.sleep(3000);
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.visibilityOf(frame)).click();
//		wait.until(ExpectedConditions.invisibilityOf(frame));
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//li[@data-cy=\"roundTrip\"]")).click();

		driver.findElement(By.xpath("//label[@for=\"fromCity\"]")).click();
		WebElement from = driver.findElement(By.xpath("//input[@placeholder=\"From\"]"));
		from.sendKeys("banglore");
		driver.findElement(By.xpath("//p[text()='Bengaluru, India']")).click();

		driver.findElement(By.xpath("//label[@for=\"toCity\"]")).click();
		WebElement to = driver.findElement(By.xpath("//input[@placeholder=\"To\"]"));
		to.sendKeys("jharkhand");
		driver.findElement(By.xpath("//p[text()='Ranchi, India']")).click();

		WebElement next = driver.findElement(By.xpath("//span[@aria-label=\"Next Month\"]"));
		WebElement previous = driver.findElement(By.xpath("//span[@aria-label=\"Previous Month\"]"));

		String fmonth = "April", fdate = "15", fyear = "2023";
		String tmonth = "April", tdate = "20", tyear = "2023";
		boolean flag1 = false, flag2 = false;

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");

		
		while (true) {

			List<WebElement> list = driver
					.findElements(By.xpath("//div[contains(@class,\"DayPicker-Day\") and @aria-disabled=\"false\"]"));
			System.out.println(list);

			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getAttribute("aria-label")
						.contains(fmonth.substring(0, 3) + " " + fdate + " " + fyear)) {
					list.get(i).click();
					flag1 = true;
					break;
				}
			}

			Thread.sleep(3000);
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getAttribute("aria-label")
						.contains(tmonth.substring(0, 3) + " " + tdate + " " + tyear)) {
					list.get(i).click();
					flag2 = true;
					break;
				}
			}

			if ((flag1 == false || flag2 == false)  && next.isDisplayed()) {
				next.click();
			} else {
				break;
			}
		}

		driver.findElement(By.xpath("//label[@for=\"travellers\"]")).click();
		driver.findElement(By.xpath("//li[@data-cy=\"adults-5\"]")).click();
		driver.findElement(By.xpath("//button[text()='APPLY']")).click();
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		driver.quit();

	}
}
	
