package Practice_Package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.mysql.cj.jdbc.Driver;



public class Rmgyantra {

	@Test
	public void rmgYantra() throws Throwable {

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://rmgtestingserver:8084/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		SoftAssert soft = new SoftAssert();
		driver.findElement(By.id("usernmae")).sendKeys("rmgyantra");
		driver.findElement(By.id("inputPassword")).sendKeys("rmgy@9999");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();

		driver.findElement(By.xpath("//a[text()='Projects']")).click();

		driver.findElement(By.xpath("//span[text()='Create Project']")).click();

		String header = driver.findElement(By.xpath("//h2[text()='Welcome To Project Management System']")).getText();
		soft.assertEquals(header, "Welcome To Project Management System");
		String expected = "HRApplication";
		driver.findElement(By.name("projectName")).sendKeys(expected);

		driver.findElement(By.name("createdBy")).sendKeys("Deepak Sir");

		WebElement dropdown = driver.findElement(By.name("status"));
		Select s = new Select(dropdown);
		s.selectByVisibleText("Created");

		driver.findElement(By.xpath("//input[@value=\"Add Project\"]")).click();

		Driver driver1 = new Driver();
		DriverManager.registerDriver(driver1);
		Connection con = DriverManager.getConnection("jdbc:mysql://rmgtestingserver:3333/projects", "root@%", "root");
		Statement state = con.createStatement();
		String query = "select * from project;";

		ResultSet r = state.executeQuery(query);
		boolean flag = false;
		while (r.next()) {
			String actual = r.getString(4);
			System.out.println(actual);
			if (actual.equals(expected)) {
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println("project create successfully");
		} else {
			System.out.println("project is not created");
		}
		soft.assertAll();
	}
}
