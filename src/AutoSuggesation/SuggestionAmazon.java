package AutoSuggesation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuggestionAmazon {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.className("desktop-searchBar")).sendKeys("dress");
		List<WebElement> search = driver.findElements(By.xpath("//li[@class='desktop-suggestion null']"));
		for(WebElement element:search)
		{
			System.out.println(element.getText());
		}
	}
}
