package webdriverbasics;

import org.openqa.selenium.WebDriver;

public class CustomXpath {

	public static void main(String[] args) {
		
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.initDriver("chrome");
		driver.get("");
		ElementUtil el = new ElementUtil(driver);
		

	}

}
