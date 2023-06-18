package RegisterModule;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class UserRegister {

	@Test
	public void userRegister() throws IOException{
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://rmgtestingserver/domain/House_Rental_Application/index.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		
		FileInputStream fis = new FileInputStream("./src/test/resources/Data.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet2");
		int count = sh.getLastRowNum();
		HashMap<String, String> map = new HashMap<String, String>();
		for(int i=0; i<=count;i++)
		{
			String key = sh.getRow(i).getCell(0).getStringCellValue();
			String value = sh.getRow(i).getCell(1).getStringCellValue();
			map.put(key, value);
		}
		SoftAssert soft = new SoftAssert();
		
		Random r = new Random();
		long ran = r.nextInt(1000000000);
		Long random = ran;
		String mob = random.toString();
		for ( Entry<String, String> e : map.entrySet()) {
			driver.findElement(By.id(e.getKey())).sendKeys(e.getValue());
			
		}
//		driver.findElement(By.id("fullname")).sendKeys("suresh kumar");
//		driver.findElement(By.id("username")).sendKeys("suresh119");
//		driver.findElement(By.id("mobile")).sendKeys(mob);
//		driver.findElement(By.id("email")).sendKeys("xyz122@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("123");
//		driver.findElement(By.id("c_password")).sendKeys("123");
		driver.findElement(By.name("register")).click();
		
//		 String actual = driver.findElement(By.xpath("//div[text()='Registration successfull. Now you can login']")).getText();
//		 String expected = "Registration successfull. Now you can login";
//		 soft.assertEquals(actual, expected);
		 soft.assertAll();
		 driver.close();
		 
	}

}
