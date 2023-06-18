package webdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice18 {

	public static void main(String[] args) throws InterruptedException {
		//basic relative xpath
		//xpath by attributes
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@placeholder=\"Email address or phone number\"]")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@data-testid=\"royal_pass\"]")).sendKeys("manager");
        driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
        Thread.sleep(2000);
        driver.close();
	}
}
