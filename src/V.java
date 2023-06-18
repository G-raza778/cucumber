import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class V {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        List<WebElement> pos = driver.findElements(By.xpath("//tbody/tr/td[1]"));
        List<WebElement> teams = driver.findElements(By.xpath("//tbody/tr/td[2]"));
        List<WebElement> matchs = driver.findElements(By.xpath("//tbody/tr/td[3]"));
        List<WebElement> points = driver.findElements(By.xpath("//tbody/tr/td[4]"));        
        List<WebElement> rating = driver.findElements(By.xpath("//tbody/tr/td[5]"));
        for(int i=0;i<teams.size();i++) {
        	 System.out.println(pos.get(i).getText()+" "+teams.get(i).getText()+" "+matchs.get(i).getText()+" "+points.get(i).getText()+" "+rating.get(i).getText());
        	 
        }
	}
}
