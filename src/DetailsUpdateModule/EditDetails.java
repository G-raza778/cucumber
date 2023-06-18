package DetailsUpdateModule;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class EditDetails {

	@Test
	public void editDetails() throws Throwable {
		
		
		FileInputStream fis = new FileInputStream("./src/test/resources/CommonData.Properties");
		Properties p = new Properties();
		p.load(fis);
		
		String URL = p.getProperty("url");
		String USERNAME = p.getProperty("username");
		String PASSWORD = p.getProperty("password");
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		SoftAssert soft = new SoftAssert();
		
		driver.findElement(By.name("username")).sendKeys(USERNAME);
		driver.findElement(By.name("password")).sendKeys(PASSWORD);
		driver.findElement(By.name("login")).click();
		
		Random r = new Random();
		long m = r.nextInt(1000000000);
		Long mo = m;
		String mob = mo.toString();
		driver.findElement(By.xpath("//a[text()='Details/Update']")).click();
		
		String actual = driver.findElement(By.xpath("//h2[text()='List of Apartment Details']")).getText();
		String expexted = "List of Apartment Details";
		soft.assertEquals(actual, expexted);
		driver.findElement(By.xpath("//p[text()='mahantesh']/ancestor::div[@class=\"card-block\"]/child::a[text()='Edit']")).click();
		WebElement mobile = driver.findElement(By.name("mobile"));
		mobile.clear();
		mobile.sendKeys(mob);
        driver.findElement(By.name("register_apartment")).click();
        soft.assertAll();
        driver.close();
	}

}
