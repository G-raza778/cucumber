package Practice_Package;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationTest {
	
	@BeforeSuite
	public void getConnection() {
		System.out.println("get connection");
	}
	
	@BeforeTest
	public void parallelExecution() {
		System.out.println("parallel Execution");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("launch browser");
	}
	
	@BeforeMethod
	public void loginApp() {
		System.out.println("login app");
	}
	
	@Test
	public void execute() {
		System.out.println("execute test script");
	}
	
	@AfterMethod
	public void logoutApp() {
		System.out.println("logout app");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("close browser");
	}
	
	
	

	@AfterSuite
	public void disconnectDatabase() {
		System.out.println("disconnect database");
	}

	
}
