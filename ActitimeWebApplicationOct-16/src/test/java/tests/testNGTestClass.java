package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Base.Browser;
import Pom.ApplicationHeader;
import Pom.LoginPage;
import utils.Utility;

public class testNGTestClass  extends Browser{
	private	WebDriver driver;
	private ApplicationHeader applicationHeader;
	//private SoftAssert softassert ;
	private LoginPage loginpage ;
	
	@BeforeTest
	@Parameters("browser")
	public void launchBrowser(String browser) {
		System.out.println(browser);
		if(browser.equalsIgnoreCase("chrome")) {
			driver = launchChromeBrowser();
		}	
	}	
	@BeforeClass()
	public void createPOMObjects() {
		System.out.println("before class");
	     loginpage = new LoginPage(driver);
		applicationHeader = new ApplicationHeader(driver);
	}
	
	@BeforeMethod()
	public void logInToApplication() {
		System.out.println("before method");
		driver.get("http://localhost/login.do");
		
	String userName =	Utility.getDataFromExcelSheet("Sheet1", 1, 0);
		loginpage.sendUserName(userName);
	
	String password =	Utility.getDataFromExcelSheet("Sheet1", 1, 1);
		loginpage.sendPassword(password);
		loginpage.clickOnLoginButton();
		System.out.println("-----------------------");
	}
	
	@Test()
	public void toVerifyTaskButton() {
		
		applicationHeader.clickOnTasks();
		String url = driver.getCurrentUrl();
		String tital = driver.getTitle();
		
		//one way
//		if(url.equals("http://localhost/tasks/otasklist.do"))
//		{
//			System.out.println("url is correct");
//		}
//		else
//		{
//			System.out.println("url is incorrect");
//		}
		
		//Another way
		
//		//Both are same ==> PASS , Both are not same ==>FAIL
	Assert.assertEquals(url, "http://localhost/tasks/otasklist.do", "url of task button not found");
		Assert.assertEquals(tital, "actiTIME - Open Tasks", "title of task button not found");
//					
//		//Both are same ==> FAIL , Both are not same ==>PASS
//		Assert.assertNotEquals(url, "http://localhost/tasks/otasklist.");
//		
//		//if result = true ==> PASS, result = false ==>FAIL
//				boolean result =	url.equals("http://localhost/tasks/otasklist.do");;
//				Assert.assertTrue(result);
//				
//				//if result = true ==> FAIL, result = false ==>PASS
//			//	Assert.assertFalse(result);
//				
//				//it is forcefully false
//				Assert.fail()	;
		
		//NO of method of softassert
//		SoftAssert softassert = new SoftAssert();
//		softassert.assertEquals(false, false);
//		softassert.assertNotEquals(false, false);
//		softassert.assertTrue(false);
//		softassert.assertFalse(false);
//		softassert.fail();		//forcefully fail the  test cases
	
//		softassert = new SoftAssert();
//		softassert.assertEquals(url, "http://localhost/tasks/otasklist.do" , "url of task button not found");
//		softassert.assertEquals(tital,  "actiTIME - Open Tasks", "title of task button not found");
//		
//		softassert.assertAll();
		
		
			
		
				
	}
//	@Test()
//	public void toVerifyUserButton() {
//		applicationHeader = new ApplicationHeader(driver);
//		applicationHeader.clickOnUsers();
//		String ur = driver.getCurrentUrl();
//		String title = driver.getTitle();
//		
//		
//		Assert.assertEquals(title, "actiTIME -  User List", "title of user button not found");
//		Assert.assertEquals(ur, "http://localhost/administration/userlist.do", "url of user button not found");
//	
//		softassert = new SoftAssert();
//		softassert.assertEquals(ur, "http://localhost/administration/userlist.do" , "url of user button not found");
//		softassert.assertEquals(title,  "actiTIME - User List", "title of user button not found");
//		softassert.fail();
//		softassert.assertAll();
//		
//	}
	@AfterMethod()
	public void logOutFromApplication() {
		System.out.println("after method");
		applicationHeader.clickOnLogout();
	}
	@AfterClass()
	public void afterClass() {
		loginpage = null;
		applicationHeader = null;
	}
	@AfterTest
	public void afterTest() {
		System.out.println("after test");
		driver.quit();
		driver = null;
		System.gc();		//delete all objects for memory free
	}
	
	
	

}
