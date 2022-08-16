package webdriverbasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {

	 @BeforeSuite
	 public void connectWithDB()
	 {
		// System.out.println("Before Suite method");
	 }
	 
	 @BeforeTest
	 public void createUser()
	 {
		// System.out.println("Before Test method");
		
	 }
	 
	 @BeforeClass
	 public void launchBrowser()
	 {
		//System.out.println("Before class method");
	 }
	 
	 @BeforeMethod
	 public void login()
	 {
		//System.out.println("Before method method");
	 }
	 
	 @Test(priority= 0)
	 public void homePageTest()
	 {
		 System.out.println("Home page test");
	 }
	 
	 @Test
	 public void searchTest()
	 {
		 System.out.println("search test");
	 }
	 
	 
	 @Test(priority=0)
	 public void NameTest()
	 {
		 System.out.println("Name test");
	 }
	 
	 
	 @Test(priority=0)
	 public void addToCartTest()
	 {
		 System.out.println("add to cart test");
	 }
	 
	
	 
//	 @BeforeClass
//	 public void launchBrowser1()
//	 {
//		 System.out.println("Before class method 2");
//	 }
//	 
//	 @BeforeMethod
//	 public void login1()
//	 {
//		 System.out.println("Before method method 2");
//	 }
	 
	 
	 @AfterClass
	 public void closeBrowser()
	 {
		//System.out.println("After class method");
	 }
	 
	 @AfterMethod
	 public void logout()
	 {
		// System.out.println("After method method");
	 }
	 
	 @AfterTest
	 public void deleteUser()
	 {
		// System.out.println("After Test method");
	 }
	 
	 @AfterSuite
	 public void disconnectWithDB()
	 {
		// System.out.println("After Suite method");
	 }
	 
}
