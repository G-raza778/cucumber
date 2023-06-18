package RegisterModule;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class RegisterAnInduvidualHomeAndSendAnSmsToTheUser {

	@Test
	public void sendSms() throws InterruptedException, Throwable {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://rmgtestingserver/domain/House_Rental_Application/auth/login.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		
		FileInputStream fis = new FileInputStream("./src/test/resources/Data.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		int count = sh.getLastRowNum();
		HashMap<String, String> map = new HashMap<String, String>();
		for(int i=0;i<count-1;i++) {
			String key = sh.getRow(i).getCell(0).getStringCellValue();
			String value = sh.getRow(i).getCell(1).getStringCellValue();
			map.put(key, value);
		}
		Random ran = new Random();
		int ra = ran.nextInt(100);
		Integer random =ra;
		String email = random.toString();
		Random r = new Random();
		long mob = r.nextInt(1000000000);
		Long m=mob;
		String mobnumber = m.toString();
		SoftAssert soft = new SoftAssert();
		String actual = driver.findElement(By.xpath("//h2[@class='text-center' and text()='Register Room']")).getText();
		String expected = "Register Room";
		soft.assertEquals(actual, expected);
		
		for ( Entry<String, String> ele : map.entrySet()) {
			 driver.findElement(By.id(ele.getKey())).sendKeys(ele.getValue());
			
		}
//		driver.findElement(By.id("fullname")).sendKeys("manojkumarram");
//		driver.findElement(By.id("mobile")).sendKeys(mobnumber);
//		driver.findElement(By.id("alternat_mobile")).sendKeys(mobnumber);
//		driver.findElement(By.id("email")).sendKeys("fkh"+email+"@gmail.com");
//		driver.findElement(By.id("plot_number")).sendKeys(email);
//		driver.findElement(By.id("rooms")).sendKeys("2BHK");
//		driver.findElement(By.id("country")).sendKeys("India");
//		driver.findElement(By.id("state")).sendKeys("Karnataka");
//		driver.findElement(By.id("city")).sendKeys("Bengaluru");
//		driver.findElement(By.id("rent")).sendKeys("15000");
//		driver.findElement(By.id("sale")).sendKeys("50000");
//		driver.findElement(By.id("deposit")).sendKeys("25000");
//		driver.findElement(By.id("accommodation")).sendKeys("Semifurnished");
//		driver.findElement(By.id("description")).sendKeys("good facility");
//		driver.findElement(By.id("landmark")).sendKeys("near nagwara bus stand");
//		driver.findElement(By.id("address")).sendKeys("nagwara bengaluru karnataka");
		
		WebElement dropdown = driver.findElement(By.id("vacant"));
		Select s = new Select(dropdown);
		s.selectByVisibleText("Vacant");
		
		driver.findElement(By.id("image")).sendKeys("C:\\Users\\waris ansari\\Desktop\\waterfall model advantage and disadvantage.jpg");
		Thread.sleep(5000);
		driver.findElement(By.name("register_individuals")).click();
		
		
//		String confirm = driver.findElement(By.xpath("//div[text()='Registration successfull. Thank you']")).getText();
//		String confirm1= "Registration successfull. Thank you";
//		soft.assertEquals(confirm, confirm1);
//		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[text()='Send SMS']")).click();
		driver.findElement(By.id("selectAll$key")).click();
		driver.findElement(By.name("message")).sendKeys("offer");
		driver.findElement(By.name("sms_alert")).click();
		soft.assertAll();
		driver.close();


	}

}
