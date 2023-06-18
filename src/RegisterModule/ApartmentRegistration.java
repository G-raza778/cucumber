package RegisterModule;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class ApartmentRegistration {

	@Test
	public void apartmentRegistration() throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://rmgtestingserver/domain/House_Rental_Application/auth/login.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.xpath("//a[text()='Apartment Registration']")).click();
		SoftAssert soft = new SoftAssert();
		String actual = driver.findElement(By.xpath("//h2[@class=\"text-center\" and text()='Apartment Room']")).getText();
		String expected = "Apartment Room";
		soft.assertEquals(actual, expected);
		
		Random r = new Random();
		long ran = r.nextInt(100000000);
		Long random = ran;
		String mob = random.toString();
		r = new Random();
		int rand = r.nextInt(100);
		Integer rando = rand;
		String mobnumber = random.toString();
		
		driver.findElement(By.id("apartment_name")).sendKeys("Lake View");
		driver.findElement(By.xpath("//h2[text()='Apartment Room']/parent::div/descendant::input[@name=\"mobile\"]")).sendKeys(mob);
 		driver.findElement(By.xpath("//h2[text()='Apartment Room']/parent::div/descendant::input[@name=\"alternat_mobile\"]")).sendKeys(mob);
		driver.findElement(By.xpath("//h2[text()='Apartment Room']/parent::div/descendant::input[@name=\"email\"]")).sendKeys("abc"+mobnumber+"@gmail.com");
		driver.findElement(By.xpath("//h2[text()='Apartment Room']/parent::div/descendant::input[@name=\"plot_number\"]")).sendKeys(mobnumber);
		driver.findElement(By.xpath("//h2[text()='Apartment Room']/parent::div/descendant::input[@name=\"country\"]")).sendKeys("India");
		driver.findElement(By.xpath("//h2[text()='Apartment Room']/parent::div/descendant::input[@name=\"state\"]")).sendKeys("Karnataka");
		driver.findElement(By.xpath("//h2[text()='Apartment Room']/parent::div/descendant::input[@name=\"city\"]")).sendKeys("Bengaluru");
		driver.findElement(By.xpath("//h2[text()='Apartment Room']/parent::div/descendant::input[@name=\"landmark\"]")).sendKeys("near bus stand");
		driver.findElement(By.xpath("//h2[text()='Apartment Room']/parent::div/descendant::input[@name=\"address\"]")).sendKeys("bengaluru karnataka");
		driver.findElement(By.name("image")).sendKeys("C:\\Users\\waris ansari\\Desktop\\waterfall model advantage and disadvantage.jpg");
		driver.findElement(By.xpath("//a[text()='Add More(Plat Number/Description)']")).click();
		
		//Add More(Plat Number/Description)
		driver.findElement(By.name("fullname[]")).sendKeys("raja");
		driver.findElement(By.name("ap_number_of_plats[]")).sendKeys(mobnumber);
		driver.findElement(By.name("rooms[]")).sendKeys("3BHK");
		driver.findElement(By.name("area[]")).sendKeys("hebbal");
		WebElement dropdown = driver.findElement(By.name("purpose[]"));
		Select s = new Select(dropdown);
		s.selectByVisibleText("Residential");
		
		WebElement floor = driver.findElement(By.name("floor[]"));
		s = new Select(floor);
		s.selectByVisibleText("2nd");
		
		WebElement owner = driver.findElement(By.name("own[]"));
		s = new Select(owner);
		s.selectByVisibleText("Rented");
		
		driver.findElement(By.name("rent[]")).sendKeys("20000");
		driver.findElement(By.name("deposit[]")).sendKeys("50000");
		driver.findElement(By.name("accommodation[]")).sendKeys("semifurnished");
		driver.findElement(By.name("description[]")).sendKeys("good");
		
		
		WebElement vacant = driver.findElement(By.name("vacant[]"));
		s = new Select(vacant);
		s.selectByVisibleText("Vacant");
		
		driver.findElement(By.name("register_apartment")).click();
		
		String confirm = driver.findElement(By.xpath("//div[text()='Registration successfull. Thank you']")).getText();
		String confirm1= "Registration successfull. Thank you";
		soft.assertEquals(confirm, confirm1);
		Thread.sleep(3000);
		soft.assertAll();
		driver.close();
		
	}
}
