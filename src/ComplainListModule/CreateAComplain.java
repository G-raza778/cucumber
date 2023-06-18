package ComplainListModule;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class CreateAComplain {

	@Test
	public void createComplain() throws Throwable {
		
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
		
		driver.findElement(By.xpath("//a[text()='Details/Update']")).click();

		driver.findElement(By.xpath("//p[text()='mahantesh']/ancestor::div[@class=\"card card-inverse card-info mb-3\"]/following-sibling::a")).click();
	
	    driver.findElement(By.id("name")).sendKeys("1213");
	    driver.findElement(By.id("cmp")).sendKeys("wifi is not working");
	    driver.findElement(By.name("register")).click();
	    
	    String actual = driver.findElement(By.xpath("//div[text()='Sent Successfully']")).getText();
	    String expected = "Sent Successfully";
	    soft.assertEquals(actual, expected);
	    
	    soft.assertAll();
	    driver.close();
	
	}

}
