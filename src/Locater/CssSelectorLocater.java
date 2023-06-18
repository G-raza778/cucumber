package Locater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocater {

		public static void main(String[] args) throws InterruptedException {
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.actitime.com/login.do");
			driver.findElement(By.cssSelector("input#username")).sendKeys("admin");
			driver.findElement(By.cssSelector("input.pwdfield")).sendKeys("manager");
			driver.findElement(By.cssSelector("a[class='initial']")).click();
			Thread.sleep(2000);
			if(driver.getTitle().equals("actiTIME - Enter Time-Track"))
				System.out.println("pass");
			else
				System.out.println("fail");
			driver.close();
		}
	}
