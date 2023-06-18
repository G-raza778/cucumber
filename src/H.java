import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class H {
	@Test
	public void m2() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		JavascriptExecutor  js = (JavascriptExecutor)driver;
		WebElement x = driver.findElement(By.xpath("//button[text()='✕']"));
		//x.click();
		js.executeScript("arguments[0].click();", x);
		
		WebElement search = driver.findElement(By.name("q"));
		//search.sendKeys("toy");
		js.executeScript("arguments[0].value = arguments[1]", search, "toy");
		
		WebElement button = driver.findElement(By.xpath("//button[@type=\"submit\" and @class=\"L0Z3Pu\"]"));
		
		js.executeScript("document.getElementById('button').click();");
		
	}
}
