package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Getter4 {

	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement element=driver.findElement(By.id("u_0_0_Qw"));
		System.out.println(element.getAccessibleName());
		System.out.println(element.getCssValue("color"));
		System.out.println(element.getCssValue("background-color"));
		
		Rectangle r=element.getRect();
		System.out.println("Height: "+r.getHeight());
		System.out.println("width :"+r.getWidth());
		System.out.println("x coordinate :"+r.getX());
		System.out.println("y coordinate :"+r.getY());
		driver.quit();
		
		

	}

}
