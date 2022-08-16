package webdriverbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class WaitMethodRaw {


	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		BrowserUtil brUtil = new BrowserUtil();
		
		driver = brUtil.initDriver("chrome");
		 ElementUtil el = new ElementUtil(driver);
		 
		 Actions act = new Actions(driver);
		 driver.get("https://www.amdocs.com/");
		 
		By locator = By.xpath("//a[text()='Registry1']");
	
	//	System.out.println(el.waitForURL(20, "ref_=nav_cs_registry"));

		 el.retryingElement(10, locator, 500).click();
	

	}

}
