package webdriverbasics;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDependsOnMethds {


	WebDriver driver;
	ElementUtil el;
	BrowserUtil br;
	
	@BeforeTest
	public void setUp()
	{
		br = new BrowserUtil();
		driver = br.initDriver("chrome");
		el= new ElementUtil(driver);
		
		br.launchURL("https://www.google.com");
	}
	
	@Test (dependsOnMethods= {"Tc2"})
	public void Tc1()
	{
		System.out.println("TC1");
	}
	
	
	@Test  
	public void Tc2() 
	{
		int x = 5/0;
		System.out.println("TC2");
	}
	
	@Test  (dependsOnMethods= {"Tc1"})
	public void Tc3() 
	{
		System.out.println("TC3");
	}
	
	@Test 
	public void Tc4() 
	{
		System.out.println("TC4");
	}
	
	@AfterTest
	public void tearDown()
	{
		
		driver.quit();
	}
}
