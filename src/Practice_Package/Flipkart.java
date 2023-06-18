package Practice_Package;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Flipkart {

	@Test
	public void fetchData() throws Throwable {

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		driver.findElement(By.name("q")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[@class=\"L0Z3Pu\"]")).click();

		WebElement next = driver.findElement(By.xpath("//span[text()='Next']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		while (true) {
			Thread.sleep(5000);
			List<WebElement> data = driver.findElements(By.xpath("//div[@class=\"_4rR01T\"]"));

			for (int i = 0; i < data.size(); i++) {

				String mobile = data.get(i).getText();
				System.out.println(mobile);
				js.executeScript("window.scrollBy(0,4500)");
				if (next.isDisplayed()) {
					
					next.click();
				} else {
					break;
				}
			}
		}
	}
}
