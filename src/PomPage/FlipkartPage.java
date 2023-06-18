package PomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartPage {

	
   @FindBy(xpath="//button[text()='✕']") private WebElement cross;
   @FindBy(name="q") private WebElement searchTF;
   @FindBy(xpath="//button[@class=\"L0Z3Pu\"]") private WebElement searchButton;
   
   
	public FlipkartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void cross()
	{
		cross.click();
	}
	public void searchTF()
	{
		searchTF.sendKeys("oil");
	}
	public void searchButton()
	{
		searchButton.click();
	}

}
