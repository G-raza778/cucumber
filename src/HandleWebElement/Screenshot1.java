package HandleWebElement;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot1 {

	public static void main(String[] args) throws IOException {

     WebDriver driver = new ChromeDriver();
     Dimension d = new Dimension(1024,768);
     driver.manage().window().setSize(d);
     driver.get("https://www.amazon.com/");
     
     TakesScreenshot ts = (TakesScreenshot)driver;
     File src = ts.getScreenshotAs(OutputType.FILE);
     File dest = new File("./Amazon/java.png");
     FileUtils.copyFile(src, dest);
     driver.close();
     
	}

}
