package assingment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/core-java-for-selenium-training");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.xpath("//a[text()='X']")).click();
		driver.findElement(By.xpath("//a[text()=' GEARS '] ")).click();
		driver.findElement(By.xpath("//ul[@class=\"dropdown-menu gear_menu\"]/li[7]")).click();
        String parent = driver.getWindowHandle();
        Set<String> child = driver.getWindowHandles();
        for (String string : child) {
			driver.switchTo().window(string);
		}
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,5000)");
        
        driver.findElement(By.xpath("//a[text()='Contact Us']")).click();
        
        driver.findElement(By.name("name")).sendKeys("jhon",Keys.TAB,"abc@gmail.com",Keys.TAB,"histroy",Keys.TAB,"how are you tell me something about you");
        
        driver.findElement(By.xpath("//button[text()='Send us mail']")).submit();
	}

}
