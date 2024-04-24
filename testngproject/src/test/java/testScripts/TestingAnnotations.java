package testScripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestingAnnotations extends Base{
	@Test
	public void testCase()
	{
		System.out.println("Testcase");
	}
	@Test
	public void testCase2()
	{
		System.out.println("Testcase2");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Beforemethod");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("Aftermethod");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("BeforeClass");
	}
	@AfterClass
	public void aferClass()
	{
		System.out.println("Afterclass");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("BeforeTest");
	}
	@AfterTest
	public void aferTest()
	{
		System.out.println("AfterTest");
	}
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("BeforeSuite");
	}
	@AfterSuite
	public void aferSuite()
	{
		System.out.println("AfterSuite");
	}
	
	
}
