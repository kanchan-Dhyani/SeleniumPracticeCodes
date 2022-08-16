package webdriverbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class waitForURL {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		BrowserUtil brUtil = new BrowserUtil();
		
		driver = brUtil.initDriver("chrome");
		 ElementUtil el = new ElementUtil(driver);
		 
		 Actions act = new Actions(driver);
		 driver.get("https://www.amazon.com/");
	
		
		
		//wait for url
				el.doClickWithWait(By.xpath("//a[text()='Registry1']"),20);
				System.out.println(el.waitForURL(20, "ref_=nav_cs_registry"));
	}

}
