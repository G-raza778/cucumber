package Locater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocater1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.cssSelector("input[id=\"email\"]")).sendKeys("admin");
		//driver.findElement(By.cssSelector("input[id=\"pass\"]")).sendKeys("manager");
		//driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
		driver.quit();

	}

}
