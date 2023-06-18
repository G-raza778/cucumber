package Abstract;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Iphone {

	public static void main(String[] args) {

        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(option);
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        
        driver.findElement(By.xpath("//button[.='✕']")).click();
        driver.findElement(By.name("q")).sendKeys("iphone");
        driver.findElement(By.xpath("//button[@class=\"L0Z3Pu\"]")).click();
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        //WebElement ele =  driver.findElement(By.xpath("//span[contains(text(),'Apple iPhone 12 Mini, 128GB')]/ancestor::div[contains(@class,'a-section a-spacing-small')]/descendant::span[@class=\"a-price\"]"));
        // System.out.println(ele.getText());
        
        WebElement ele = driver.findElement(By.xpath("//div[.='APPLE iPhone 14 (Midnight, 128 GB)']/ancestor::div[@class=\"_3pLy-c row\"]/descendant::div[@class=\"_30jeq3 _1_WHN1\"]"));
        System.out.println(ele.getText());
        wait.until(ExpectedConditions.visibilityOf(ele)).click();
        
	}
}
