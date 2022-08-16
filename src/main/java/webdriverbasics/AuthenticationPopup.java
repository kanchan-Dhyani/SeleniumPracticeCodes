package webdriverbasics;

import org.openqa.selenium.WebDriver;

public class AuthenticationPopup {

	 static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {

			BrowserUtil brUtil = new BrowserUtil();
			
			driver = brUtil.initDriver("chrome");
			 ElementUtil el = new ElementUtil(driver);
			 
			 
			driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}

}
