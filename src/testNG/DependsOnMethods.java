package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods 
{
	WebDriver driver = null;
	@Test
	public void navigateToActitime()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement logo = driver.findElement(By.xpath("//div[@class='atLogoImg']"));
	    Assert.assertTrue(logo.isDisplayed());
	}
	@Test(dependsOnMethods = "navigateToActitime")
	public void loginToActtime()
	{
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		boolean status =wait.until(ExpectedConditions.titleContains("Enter Time-Track"));
		Assert.assertTrue(status);
		driver.close();
	}
}
