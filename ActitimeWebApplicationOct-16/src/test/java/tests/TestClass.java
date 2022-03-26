package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pom.ApplicationHeader;
import Pom.LoginPage;

public class TestClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		driver.get("http://localhost/login.do");
		
	
		
		//Login pom class object
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.sendUserName("admin");
		loginPage.sendPassword("manager");
		
		String loginText = loginPage.getTextOfLoginbutton();
		if(loginText.equals("Log IN"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		
		loginPage.clickOnKeepMeLoginCheckBox();
		loginPage.clickOnLoginButton();
		
		//Applicationheader pom  class object
		Thread.sleep(3000);
		
		ApplicationHeader applicationheader = new ApplicationHeader(driver);
		applicationheader.clickOnUsers();
		applicationheader.clickOnTimeTrack();
		applicationheader.clickOnTasks();
		
		
	
	
	
	
	
	}
}
