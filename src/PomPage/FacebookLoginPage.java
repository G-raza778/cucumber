package PomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage 
{
	//Step 1: Declaration
	@FindBy(id = "email") private WebElement usernameTF;
	@FindBy(name="pass") private WebElement passwordTF;
	@FindBy(name="login") private WebElement loginButton;
	@FindBy(linkText = "Forgotten password?") private WebElement forgotPasswordLink;
	@FindBy(linkText = "Create new account") private WebElement createNewAccountLink;
	@FindBy(linkText = "Create a Page") private WebElement createPageLink;
	
	//Initialization
	public FacebookLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//Utilization
	public void setUserName(String username)
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
	public void clickForgotPasswordLink()
	{
		forgotPasswordLink.click();
	}
	public void clickCreateNewAcoount()
	{
		createNewAccountLink.click();
	}
	public void clickCreatePageLink()
	{
		createPageLink.click();
	}
}
