package AutoSuggesation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SuggestionYouTube {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.findElement(By.name("search_query")).sendKeys("cricket");
		List<WebElement> You = driver.findElements(By.xpath("//div[text()='cricket']"));
		//wait.until(ExpectedConditions.visibilityOfAllElements(You));
		Thread.sleep(10000);
		for(WebElement element:You)
		{
			System.out.println(element.getText());
		}
        // driver.quit();
	}

}
