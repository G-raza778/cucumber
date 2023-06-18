package DropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice3 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
        WebElement drop = driver.findElement(By.id("searchDropdownBox"));
        Select s = new Select(drop);
        s.selectByIndex(5);
        if(s.getFirstSelectedOption().getText().contains("Books"))
        {
        	System.out.println("selected");
        }
        else
        {
        	System.out.println("not seleted");
        }
        driver.close();
	}

}
