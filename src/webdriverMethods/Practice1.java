package webdriverMethods;
import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//launching the browser by user desire choice
		ChromeDriver driver=null;
		FirefoxDriver driver1=null;
		EdgeDriver driver2=null;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the browser name");
		String browser=sc.next();
		if(browser.equals("chrome"))
		driver=new ChromeDriver();
		else if(browser.equals("firefox"))
			driver1=new FirefoxDriver();
		else if(browser.equals("edge"))
			driver2=new EdgeDriver();
		else
			System.out.println("enter valid browser");
	}
}
