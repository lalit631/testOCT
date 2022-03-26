package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy (xpath = "//input[@name='username']")
	private WebElement userName;
	
	@FindBy (xpath = "//input[@name='pwd']")
	private WebElement password;
	
	@FindBy (xpath = "//div[text()='Login ']")
	private WebElement login;

	@FindBy (xpath = "//input[@type='checkbox']")
	private WebElement keepMeLoginCheckBox;
	
	public LoginPage(WebDriver driver)		//driver123 = driver = object of chrome browser
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//one way to 
//	public void sendUserName()
//	{
//		userName.sendKeys("admin");
//	}
//	public void sendPassword()
//	{
//		password.sendKeys("manager");
//	}
//	public void clickOnLoginButton()
//	{
//		login.click();
//	}
	
	//another way
	public void sendUserName(String userID)
	{
		userName.sendKeys(userID);
	}
	
	public void sendPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public String getTextOfLoginbutton()
	{
	String text =	login.getText();
	return text;
	}

	public void clickOnLoginButton()
	{
		login.click();
	}

	
	
	
	public void clickOnKeepMeLoginCheckBox()
	{
		keepMeLoginCheckBox.click();
	}
	
	
}
