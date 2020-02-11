package com.qa;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNgBasics {
  
	  @BeforeTest
	  public void launchBrowser() {
		  System.out.println("@BeforeTest:TestNgBasics:::: launch chrome browser");
	  }
	  
	  @AfterTest
	  public void deleteAllCookies() {
		  
		  System.out.println("@AfterTest:TestNgBasics ::: Delete all the cookies");
	  }
	  
	  @BeforeClass
	  public void login() {
		  System.out.println("TestNgBasics@BeforeClass :::Login to the application");
	  }
	  
	  @AfterClass
	  public void closeBrowser() {
		  System.out.println("TestNgBasics@AfterClass :::CloseBrowser");
	  }
	  
	  @BeforeMethod
	  public void enterURL() {
		  System.out.println("TestNgBasics: @BeforeMethod ");
	  }
	  @AfterMethod
	  public void logOut() {
		  
		  System.out.println("TestNgBasics: @AfterMethod");
	  }
	  
	 // testcases - starting with @Test
	  @Test
	  public void googleTitleTest() {
		  System.out.println("google title test");
	  }
	  
	  @Test
	  public void googleLoginTest() {
		  System.out.println("googleLoginTest");
	  }

	  
/*
//Pre-condition Annotations - Starting with @Before
  @BeforeSuite
  public void setUp() {
	  
	  System.out.println("First::::Set the system property for chrome");
  }
  
  @BeforeTest
  public void launchBrowser() {
	  System.out.println("launch chrome browser");
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
	  
	  System.out.println("Delete all the cookies");
  }
 
  @AfterSuite
  public void generateTestReports() {
	  System.out.println("Generate TestReports");
  }*/

}
