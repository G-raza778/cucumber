package PracticePackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice5 {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.amazon.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	    WebElement image = driver.findElement(By.xpath("//img[@class='landscape-image' and @alt='Dresses']"));
	    wait.until(ExpectedConditions.visibilityOf(image));
	   
	    File src = image.getScreenshotAs(OutputType.FILE);
	    File dest = new File("./ElementScreenshot/screen.png");
	    Thread.sleep(2000);
	    FileUtils.copyFile(src, dest);
	    Thread.sleep(2000);
	    driver.quit();
	    

	}

}
