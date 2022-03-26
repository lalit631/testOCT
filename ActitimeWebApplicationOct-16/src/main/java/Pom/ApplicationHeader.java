package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ApplicationHeader {
	private WebDriver driverABC;
	private WebDriverWait wait;
	
	
	@FindBy (xpath = "(//td[@class='navItem relative'])[1  ]")
	private WebElement timeTrack;
	
	@FindBy (xpath = "(//td[@class='navItem relative'])[2]")
	private WebElement tasks;
	
	@FindBy (xpath = "(//td[@class='navItem relative'])[3]")
	private WebElement reports;
	
	@FindBy (xpath = "(//td[@class='navItem relative'])[4]")
	private WebElement users;
	
	@FindBy (xpath = "//a[text()='Logout']")
	private WebElement logout;
	
	public ApplicationHeader(WebDriver driver123)	//driver123= driver=object of chrome browser
	{
		PageFactory.initElements(driver123, this);
		driverABC = driver123;
		wait  = new WebDriverWait(driverABC, 20);
	}
	
	public void clickOnTimeTrack()
	{
		timeTrack.click();
	}
	
	public void clickOnTasks()
	{
		
		wait.until(ExpectedConditions.visibilityOf(tasks)); 
		tasks.click();
	}
	
	public void clickOnReports()
	{
		WebDriverWait wait = new WebDriverWait(driverABC, 20);
		wait.until(ExpectedConditions.visibilityOf(reports)); 
		reports.click();
	}
	
	public void clickOnUsers()
	{
		users.click();
	}
	
	public void clickOnLogout()
	{
		logout.click();
	}
	
	
	
	
	
}
