package PomPage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class InstaLoginPage {

	
      //declaration
	  @FindBy(xpath="//div[contains(@class,'xamitd3')]") private WebElement logo;
      @FindBy(name="username") private WebElement usernameTF;
      @FindBy(name="password") private WebElement passwordTF;
      @FindBy(xpath="//div[text()='Log in']") private WebElement loginButton;
      @FindBy(xpath ="//a[@href='/accounts/password/reset/']") private WebElement forgotPassword;
      @FindBy(xpath="//span[text()='Sign up']") private WebElement singup;
      
      //Initialization
      public InstaLoginPage(WebDriver driver)
      {
    	  PageFactory.initElements(driver, this);
      }
      
      //utilization;
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
      public void clickForgotPassword()
      {
    	  forgotPassword.click();
      }
      public void clickSingUp()
      {
    	  singup.click();
      }
      

	}


