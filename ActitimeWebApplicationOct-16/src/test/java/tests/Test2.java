package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Test2 {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before suite Test2 ");
	}
	
	@BeforeTest
	@Parameters ("testData")
	public void beforeTest(String data ) {
		System.out.println(data);
		System.out.println("before test Test2");
	}
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("before Class Test2");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before method Test2");
	}
	
	@Test
	public void testC()
	{
		System.out.println("test C Test2");
	}
		
	@Test
	public void testD()
	{
		System.out.println("test D Test2");
	}
	
	@Test
	public void testF()
	{
		System.out.println("test F Test2");
	}
	
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after method Test2");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("after class Test2");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("after test Test2");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("after suite Test2");
	}
}
