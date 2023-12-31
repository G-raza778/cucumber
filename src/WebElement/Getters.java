package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getters {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement loginbutton = driver.findElement(By.name("login"));
		System.out.println(loginbutton.getText());
		System.out.println(loginbutton.getTagName());
		System.out.println(loginbutton.getAttribute("name"));
		driver.quit();
		

	}

}
