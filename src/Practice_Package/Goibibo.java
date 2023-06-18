package Practice_Package;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Goibibo {

	@Test
	public void goibibo() {

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//span[@class=\"logSprite icClose\"]")).click();
		driver.findElement(By.xpath("//p[@class=\"sc-jlwm9r-1 dRQhOp\"]")).click();
		//driver.findElement(By.xpath("//span[text()='Round-trip']")).click();
		driver.findElement(By.xpath("//span[text()='From']/following-sibling::p")).click();
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("banglore");
		driver.findElement(By.xpath("//p[text()='Bengaluru International Airport']")).click();
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("ranchi");
		driver.findElement(By.xpath("//p[text()='Birsa Munda Airport']")).click();

		String tmonth = "Jan", tdate = "27", tyear = "2024";
		String rmonth = "Mar", rdate = "30", ryear = "2023";
		WebElement next = driver.findElement(By.xpath("//span[@aria-label=\"Next Month\"]"));
		boolean flag = false;
		boolean flag1 = false;

		while (true) {

			List<WebElement> list = driver
					.findElements(By.xpath("//div[contains(@class,'DayPicker-Day') and @aria-disabled=\"false\"]"));
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getAttribute("aria-label")
						.contains(tmonth.substring(0, 3) + " " + tdate + " " + tyear)) {
					list.get(i).click();
					driver.findElement(By.xpath("//span[text()='Done']")).click();
					flag = true;
					break;
				}
			}

//			for (int i = 0; i < list.size(); i++) {
//				if (list.get(i).getAttribute("aria-label")
//						.contains(rmonth.substring(0, 3) + " " + rdate + " " + ryear)) {
//					list.get(i).click();
//					driver.findElement(By.xpath("//span[text()='Done']")).click();
//					flag1 = true;
//					break;
//				}
//			}

			if (flag == false && next.isDisplayed()) {
				next.click();
				break;
			}

		}
//		driver.findElement(By.xpath("//a[@class=\"sc-jQrDum gMuQGX\"]")).click();
//		driver.findElement(By.xpath("//span[text()='SEARCH FLIGHTS']")).click();
	}
}
