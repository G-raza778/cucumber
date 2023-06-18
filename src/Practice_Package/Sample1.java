package Practice_Package;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Sample1 {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://olympics.com/en/olympic-games/tokyo-2020/medals");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//button[text()='No, manage settings']")).click();
		driver.findElement(By.xpath("//button[text()='Reject All']")).click();
		List<WebElement> country = driver.findElements(By.xpath("//span[@data-cy=\"country-name\"]"));
		List<WebElement> gold = driver.findElements(By.xpath("//div[@title=\"Gold\"]"));
		List<WebElement> silver = driver.findElements(By.xpath("//div[@title=\"Silver\"]"));
		List<WebElement> bronze = driver.findElements(By.xpath("//div[@title=\"Bronze\"]"));

		for (int i = 0; i < country.size(); i++) {

			Integer h = i + 1;
			String num = h.toString();
			String total = driver.findElement(By.xpath("//div[@data-medal-id=\"total-medals-row-"+num+"\"]"))
					.getText();
			System.out.println("Country-" + country.get(i).getText() + " " + "Gold medal-" + gold.get(i).getText() + " "
					+ "Silver medal-" + silver.get(i).getText() + " " + "Bronze medal-" + bronze.get(i).getText() + " "
					+ "total medal-" + total);
			driver.close();
		}
	}
}
