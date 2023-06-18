package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getter2 {

	public static void main(String[] args) {

    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.myntra.com/");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    WebElement tagname=driver.findElement(By.xpath("//div[contains(@class,\"desktop-navLink\")]/a[contains(text(),'Living')]"));
    System.out.println(tagname.getText());
    System.out.println(tagname.getTagName());
    System.out.println(tagname.getAttribute("data-group"));
    driver.close();

	}

}
