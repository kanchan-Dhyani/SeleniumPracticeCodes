package MyTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import webdriverbasics.BrowserUtil;
import webdriverbasics.ElementUtil;

public class BaseTest {
	
	WebDriver driver;
	ElementUtil el;
	BrowserUtil br;
	
	@Parameters({"url", "browser"})
	
	
	
	@BeforeTest
	public void setUp(String url, String gh)
	{
		br = new BrowserUtil();
	 driver = br.initDriver(gh);
	 el = new ElementUtil(driver);
	 br.launchURL(url);
	 
	}
	
	

	
	
	 @AfterTest
	 public void tearDown()
	 {
		 driver.quit();
	 }
}
