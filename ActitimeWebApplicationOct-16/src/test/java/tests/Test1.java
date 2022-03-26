package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before suite Test1");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("before test Test1 ");
	}
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("before Class Test1");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before method Test1");
	}
	
	@Test
	public void testB()
	{
		System.out.println("test B Test1");
	}
		
	@Test
	public void testA()
	{
		System.out.println("test A Test1");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after method Test1");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("after class Test1");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("aftet test Test1");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("after suite Test1");
	}
	
	
	
	
	
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@Test(invocationCount =2)  //to repeat the test cases for specific no. of time
//	public void testD() {
//		System.out.println("test d");
//	}
	
//	@Test(invocationCount =0)  //it  out of the execution(invocation = 0/-1,-2 etc
//	public void testE() {
//		System.out.println("test e");
//	}
	
	
}
