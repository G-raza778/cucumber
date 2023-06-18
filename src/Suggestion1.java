import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Suggestion1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		//System.setProperty("webdriver.chrome.driver", "D:\\workspace\\Learning\\src\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("dress");
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='autocomplete-results-container']"));
        for(WebElement ele:list) {
        	Thread.sleep(2000);
        	System.out.println(ele.getText());
        }
       driver.close();
	}

}
