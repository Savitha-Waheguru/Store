package com.dev;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics1 {

	//Pre-condition Annotations - Starting with @Before
	  @BeforeSuite
	  public void setUp() {
		  
		  System.out.println("SECOND::::::Set the system property for chrome");
	  }
	  
	  @BeforeTest
	  public void launchBrowser() {
		  System.out.println("TestNgBasics1:::launch chrome browser");
	  }
	  
	  @BeforeClass
	  public void login() {
		  System.out.println("Login to the application");
	  }
	  
	  @BeforeMethod
	  public void enterURL() {
		  System.out.println("enter url");
	  }
	  
	  // testcases - starting with @Test
	  @Test
	  public void googleTitleTest() {
		  System.out.println("google title test");
	  }
	  
	  
	  //Post-conditions Annotations - Starting with @After

	  @AfterMethod
	  public void logOut() {
		  
		  System.out.println("Logout from the application");
	  }
	  
	  @AfterClass
	  public void closeBrowser() {
		  System.out.println("CloseBrowser");
	  }
	  
	  @AfterTest
	  public void deleteAllCookies() {
		  
		  System.out.println("TestNgBasics1::Delete all the cookies");
	  }
	 
	  @AfterSuite
	  public void generateTestReports() {
		  System.out.println("Generate TestReports");
	  }

}
