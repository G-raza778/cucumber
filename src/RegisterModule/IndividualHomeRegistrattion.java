package RegisterModule;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Properties;
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



public class IndividualHomeRegistrattion {

	@Test
	public void registerPage() throws InterruptedException, Throwable {
		
		
		
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
		
		driver.findElement(By.name("username")).sendKeys(USERNAME);
		driver.findElement(By.name("password")).sendKeys(PASSWORD);
		driver.findElement(By.name("login")).click();
		
		
		FileInputStream fi = new FileInputStream("./src/test/resources/Data.xlsx");
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sh = wb.getSheet("Sheet1");
		
		HashMap<String, String> map = new HashMap<String, String>();
		for(int i=0;i<sh.getLastRowNum()-1;i++)
		{
			String keys = sh.getRow(i).getCell(0).getStringCellValue();
			String values = sh.getRow(i).getCell(1).getStringCellValue();
			map.put(keys, values);
			
		}
		
		
		
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		
//		Random ran = new Random();
//		int ra = ran.nextInt(100);
//		Integer random =ra;
//		String email = random.toString();
//		Random r = new Random();
//		long mob = r.nextLong(1000000000l);
//		Long m=mob;
//		String mobnumber = m.toString();
		
		SoftAssert soft = new SoftAssert();
		String actual = driver.findElement(By.xpath("//h2[@class='text-center' and text()='Register Room']")).getText();
		String expected = "Register Room";
		soft.assertEquals(actual, expected);
		
		for (Entry<String, String> set : map.entrySet()) {
			driver.findElement(By.id(set.getKey())).sendKeys(set.getValue());
		}
//		driver.findElement(By.id("fullname")).sendKeys("manojkumarrana");
//		driver.findElement(By.id("mobile")).sendKeys(mobnumber);
//		driver.findElement(By.id("alternat_mobile")).sendKeys(mobnumber);
//		driver.findElement(By.id("email")).sendKeys("abc"+email+"@gmail.com");
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
		
		
		String confirm = driver.findElement(By.xpath("//div[text()='Registration successfull. Thank you']")).getText();
		String confirm1= "Registration successfull. Thank you";
		soft.assertEquals(confirm, confirm1);
		Thread.sleep(5000);
		
		soft.assertAll();
		wb.close();
		driver.close();

	}
}
