package webdriverbasics;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGExceptions {

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
	
	@Test (expectedExceptions= { ArithmeticException.class, NullPointerException.class})
	public void Tc2()
	{
		System.out.println("Hi");
		int x = 9/0;
		System.out.println("Helloooo");
        String s = null;
		s.chars();
		System.out.println("Hello");
	}
	
	
	
	
	
	@AfterTest
	public void tearDown()
	{
		
		driver.quit();
	}
	
}
