package webdriverbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BrowserUtil {

	private WebDriver driver;
	
	/**
	 * This method is used to initialize the driver.
	 * @param browserName
	 * @return
	 */
	public WebDriver initDriver(String browserName)
	{
		System.out.println("Browser name is " + browserName);
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("safari")) // only runs on Mac...not in windows...and it doenst need drivermanager setup
		{
			driver = new SafariDriver();
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else
			System.out.println("Please pass the right browser " );
		
		return driver;
	}
	
	
	public void launchURL(String url) 
	{
		if(driver != null && url != null  )
		{
			 if((url.indexOf("http")== -1 && url.indexOf("https")== -1) || url.length() == 0)
			 {
				 System.out.println("Either http/https missing or null is passed. " );
				  return;
			 }		  
			driver.get(url);
		}
		else
		{
			System.out.println("Please pass the right browser " );
		}
	}
	
	/**
	 * 
	 * @return
	 */
	public String getPageTitle()
	{
		if(driver == null)
		{
		     return null;
		}
		String title = driver.getTitle();
		System.out.println("Page title is : " + title);
	  return title;
		
	}
	
	/**
	 * 
	 * @return
	 */
	
	public String getPageURL()
	{
		String url = driver.getCurrentUrl();
		System.out.println("Current url is : " + url);
		return url;
	}
	
	
	/**
	 * 
	 * @return
	 */
	public String getPageSource()
	{
		String pageSource = driver.getPageSource();
		return pageSource;
	}
	
	/**
	 * 
	 * @param info
	 * @return
	 */
	
	public boolean isInfoExistsInPageSource(String info)
	{
		if(getPageSource().contains(info))
			 return true;
		else
			 return false;
					 
	}
	
	/**
	 * 
	 * @param fraction
	 * @return
	 */
	
	
	public boolean isUrlFractionExists(String fraction)
	{
		if(driver.getCurrentUrl().contains(fraction))
			return true;
		else
			return false;
	}
	
	
	
	
	public void quitBrowser()
	{
		driver.quit();
	}
	
	
	public void closeBrowser()
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
