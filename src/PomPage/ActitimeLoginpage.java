package PomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeLoginpage 
{	
		//Declaration
		@FindBy(xpath="//div[@class='atLogoImg']")
		private WebElement logo;
		
		@FindBy(id="username")
		private WebElement usernameTF;
		
		@FindBy(name="pwd")
		private WebElement passwordTF;
		
		@FindBy(id="loginButton")
		private WebElement loginButton;
		
		@FindBy(id="keepLoggedInCheckBox")
		private WebElement checkbox;
		
		@FindBy(id="toPasswordRecoveryPageLink")
		private WebElement forgotPasswordLink;
		
		//Initialization
		public ActitimeLoginpage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		//utilization
		public WebElement getLogo()
		{
			return logo;
		}
		public void setUsername(String username)
		{
			usernameTF.sendKeys(username);
		}
		public void setPassword(String password)
		{
			passwordTF.sendKeys(password);
		}
		public void clickLoginButton()
		{
			loginButton.click();
		}
		public void clickCheckbox()
		{
			checkbox.click();
		}
		public void forgotPasswordLink()
		{
			forgotPasswordLink.click();
		}
	}


