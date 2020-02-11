package com.qa;

import org.testng.annotations.Test;

public class NewTest {
 
  @Test(groups={"orderBo", "save"})
	public void testMakeOrder() {  
	  System.out.println("testMakeOrder");
	}  

	@Test(groups={"orderBo", "save"})
	public void testMakeEmptyOrder() {  
	  System.out.println("testMakeEmptyOrder");
	}  
	
	@Test(groups="orderBo")
	public void testUpdateOrder() {  
		System.out.println("testUpdateOrder");
	}  

	@Test(groups="orderBo")
	public void testFindOrder() {  
		System.out.println("testFindOrder");
	} 
	

	@Test(groups = "db")
	public void testConnectOracle() {
		System.out.println("testConnectOracle()");
	}

	@Test(groups = "db")
	public void testConnectMsSQL() {
		System.out.println("testConnectMsSQL");
	}

	@Test(groups = "db-nosql")
	public void testConnectMongoDB() {
		System.out.println("testConnectMongoDB");
	}

	@Test(groups = { "db", "brokenTests" })
	public void testConnectMySQL() {
		System.out.println("testConnectMySQL");
	}
}
