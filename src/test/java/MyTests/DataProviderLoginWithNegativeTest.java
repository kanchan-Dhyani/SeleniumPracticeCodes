package MyTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import webdriverbasics.BrowserUtil;
import webdriverbasics.ElementUtil;

public class DataProviderLoginWithNegativeTest {
	
	
	WebDriver driver;
	ElementUtil el;
	BrowserUtil br;
	
	
	
	
	
	@BeforeTest
	public void setUp()
	{
		br = new BrowserUtil();
	 driver = br.initDriver("chrome");
	 el = new ElementUtil(driver);
	 br.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	 
	}
	
	
    @DataProvider
	public Object[][] getLoginNegativeData()
	{
    	return new Object[][]
    			{
    		     { "",""},
    		     { "abc.com",""},
    		     { "","tets123"},
    		     { "abc.com","test123"},
    		     { "abc.com","dfdds"},
    		     { "abcdffg.com","test123"},
    		       
    			};
	}
	 
	 
	@Test(dataProvider="getLoginNegativeData")
	public void loginNegativeTest(String user, String pwd) {
		driver.findElement(By.id("input-email")).sendKeys(user);
		driver.findElement(By.id("input-password")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		String errorMesg = driver.findElement(By.cssSelector("div.alert-dismissible")).getText().trim();
		System.out.println(errorMesg);

		Assert.assertEquals(errorMesg, "Warning: No match for E-Mail Address and/or Password.");
	}
	
	
	

	
	 @AfterTest
	 public void tearDown()
	 {
		 driver.quit();
	 }

}
