package webdriverbasics;

import org.openqa.selenium.WebDriver;

public class NavigationConcept {

	 static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {

			BrowserUtil brUtil = new BrowserUtil();
			
			driver = brUtil.initDriver("chrome");
			driver.get("http://www.ideafarms.com");
	        ElementUtil el = new ElementUtil(driver);
	        
	        driver.navigate().to("http://www.amazon.in");
	}

}
