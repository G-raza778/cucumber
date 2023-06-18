import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement drop = driver.findElement(By.xpath(
				"//b[.='Multiselect drop down']/parent::p/following-sibling::div[contains(@class,\"css-2b097c-container\")]/descendant::div[contains(@class,\"css-1hwfws3\")]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", drop);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(drop)).click();

		List<WebElement> ele = driver.findElements(By.xpath("//div[contains(@id,'react-select-4')]"));
		for (int i = 0; i < ele.size(); i++) {
			String colour = ele.get(i).getText();
			if (colour.equalsIgnoreCase("blue") || colour.equalsIgnoreCase("red") || colour.equalsIgnoreCase("green")) {
				ele.get(i).click();
			}
		}

		
		WebElement dropdown = driver.findElement(By.id("cars"));
		Select s = new Select(dropdown);
		System.out.println(s.isMultiple());
		s.selectByVisibleText("Volvo");
		s.selectByVisibleText("Saab");
		s.selectByVisibleText("Opel");
		s.selectByVisibleText("Audi");
		s.deselectAll();

	}
}
