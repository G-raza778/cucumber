package Practice_Package;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ReadDataFromPropertiesFile {

	public static void main(String[] args) throws IOException, InterruptedException {

		FileInputStream fis = new FileInputStream("./src/test/resources/CommonData.Properties");

		Properties p = new Properties();
		p.load(fis);

		String BROWSER = p.getProperty("browser");
		String URL = p.getProperty("url");
		String USERNAME = p.getProperty("username");
		String PASSWORD = p.getProperty("password");

		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);

		System.setProperty("WebDriver.driver.chrome", "C:\\Users\\waris ansari\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);


		driver.findElement(By.name("username")).sendKeys(USERNAME);
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(PASSWORD);
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();

	}
}
