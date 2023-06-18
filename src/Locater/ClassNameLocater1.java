package Locater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocater1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.className("inputtext")).sendKeys("admin");
		driver.findElement(By.className("_9npi")).sendKeys("manager");
		driver.findElement(By.className("selected")).click();
		driver.close();
	}
}
