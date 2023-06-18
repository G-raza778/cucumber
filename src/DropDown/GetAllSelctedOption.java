package DropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelctedOption {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
       WebElement drop = driver.findElement(By.id("cars"));
       Select s = new Select(drop);
       s.selectByIndex(0);
       s.selectByIndex(1);
       s.selectByIndex(2);
       List<WebElement> e = s.getAllSelectedOptions();
       for (WebElement web : e) {
		System.out.println(web.getText());
       }
		driver.close();
	}
}


