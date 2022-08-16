package webdriverbasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class POPUPNaukri {


	static public WebDriver driver;
	public static ElementUtil el;
	static Actions act;
	public static void main(String[] args) throws InterruptedException {
		
		BrowserUtil br = new BrowserUtil();
		 driver = br.initDriver("chrome");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 
		 String url= "";
			 By locator;	 
			 
		 // NAUKRI
			url= "https://www.naukri.com/";
			 locator = By.xpath("//div[@id='bottom-left-section.inventory-1']");
			//loadURLAndClosePopUpsByLocators( url,  locator);
			
			// SOFTONIC
			url= "https://en.softonic.com/downloads/pdf";
			 locator = By.xpath("//button[@id='slide-in-close']");
			//loadURLAndClosePopUpsByLocators( url,  locator);
			
			
			
			//https://www.pdfdrive.com/
			//url= "https://www.pdfdrive.com/";
			// locator = By.xpath("//i[@class='fas fa-times']");
			
			
			
			
		
		

	}
	
	public static void loadURLAndClosePopUpsByLocators(String url, By locator) throws InterruptedException
	{
		
		driver.get(url);

		driver.manage().window().maximize();;
		act = new Actions(driver);
		WebElement ele = driver.findElement(locator);
		act.moveToElement(ele).click().build().perform();
		
		     
		
		
		
	}
	

}
