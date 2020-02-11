package com.qa;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics2 {
	

	  @BeforeTest
	  public void launchBrowser() {
		  System.out.println("@BeforeTest::TestNgBasics2:::: launch chrome browser");
	  }
	  
	  @AfterTest
	  public void deleteAllCookies() {
		  
		  System.out.println("@AfterTest::TestNgBasics2 ::: Delete all the cookies");
	  }
	  
	  @BeforeClass
	  public void login() {
		  System.out.println("TestNgBasics2@BeforeClass :::Login to the application");
	  }
	  
	  @AfterClass
	  public void closeBrowser() {
		  System.out.println("TestNgBasics2@AfterClass :::CloseBrowser");
	  }
	  
	 // testcases - starting with @Test
	  @Test
	  public void googleTitleTest() {
		  System.out.println("google title test");
	  }


}
