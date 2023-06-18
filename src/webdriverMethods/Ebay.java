package webdriverMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		String src=driver.getPageSource();
		String title=driver.getTitle();
		
		
		if(src.contains("More | eBay"))
		{
			System.out.println("page display");
		}
		else
		{
			System.out.println("page not found");
		}
		driver.manage().window().maximize();
		driver.close();
		
		
		
		

	}
}
