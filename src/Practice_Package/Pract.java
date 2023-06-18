package Practice_Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Pract {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();
		driver.get("http://rmgtestingserver/domain/House_Rental_Application/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("history.go(0)");
		System.out.println(js.executeScript("return document.title"));
		System.out.println(js.executeScript("return document.URL"));

		WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));

		js.executeScript("arguments[0].click()", login);

		WebElement uTF = driver.findElement(By.name("username"));
		WebElement pTF = driver.findElement(By.name("password"));
		WebElement loginButton = driver.findElement(By.name("login"));

		js.executeScript("arguments[0].value=arguments[1]", uTF, "admin");
		js.executeScript("arguments[0].value=arguments[1]", pTF, "admin");
		js.executeScript("arguments[0].click()", loginButton);

		WebElement send = driver.findElement(By.xpath("//a[text()='Send SMS']"));
		Point p = send.getLocation();
		int x = p.getX();
		int y = p.getY();
		js.executeScript("arguments[0].click()", send);
		// js.executeScript("window.scrollBy(0,5000)");
                     //or
		js.executeScript("window.scrollBy(" + x + " , " + y + ")");

	}
}
