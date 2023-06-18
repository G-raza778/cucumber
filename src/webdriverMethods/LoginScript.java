package webdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScript {
  // login script for demo.actitime.com
	//using xpath by attribute
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("manager");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id=\"loginButton\"]")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		if(driver.getTitle().contains("actiTIME - Login"))
			System.out.println("pass");
		else
			System.out.println("fail");
		Thread.sleep(3000);
		driver.close();
	}

}
