package webdriverMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Amazon {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		String title=driver.getTitle();
		System.out.println(title);
		
	
		if(title.contains("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"))       
		{
		System.out.println("validate");
		}
	    else 
		{
		System.out.println("not validate");
		}
		driver.close();
	}
}
