package webdriverbasics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class PageLoadTimeOut {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		BrowserUtil brUtil = new BrowserUtil();
		
		driver = brUtil.initDriver("chrome");
		 ElementUtil el = new ElementUtil(driver);
		
		 Actions act = new Actions(driver);
		
		 driver.get("https://renthia.com/?gclid=EAIaIQobChMItKr-y-OO-QIVYJFmAh03HQqLEAAYASAAEgI8H_D_BwE");
		 el.waitForPageLoadUsingJS(1);
		

	}

}
