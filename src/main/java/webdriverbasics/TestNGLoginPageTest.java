package webdriverbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGLoginPageTest {
	
	WebDriver driver;
	ElementUtil el;
	@BeforeTest
	public void setUp()
	{
	  BrowserUtil br = new BrowserUtil();
	  this.driver=  br.initDriver("chrome");
	  el = new ElementUtil(driver);
	 br.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	 
	 
	}
	
	
	@Test
	public void logoTest()
	{
		By locator = By.xpath("//img[@title='naveenopencart']");
		boolean flag = el.getWebElement(locator).isDisplayed();
		//Assert.assertEquals(flag, true); //same as below
		Assert.assertTrue(flag);
		System.out.println("kanchan");
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

}
