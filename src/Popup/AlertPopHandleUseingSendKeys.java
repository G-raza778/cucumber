package Popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopHandleUseingSendKeys {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[contains(text(),'JS Prompt')]")).click();
		Alert a= driver.switchTo().alert();
		System.out.println(a.getText());
		a.sendKeys("ABCD");
		Thread.sleep(3000);
		a.accept();
		//a.dismiss();
		Thread.sleep(3000);
		driver.quit();
		
	}
}
