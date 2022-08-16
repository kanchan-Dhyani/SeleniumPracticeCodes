package webdriverbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class WaitForTitle {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		BrowserUtil brUtil = new BrowserUtil();
		
		driver = brUtil.initDriver("chrome");
		 ElementUtil el = new ElementUtil(driver);
		 
		 Actions act = new Actions(driver);
		driver.get("https://petdiseasealerts.org/forecast-map/#/");
		By img = By.xpath("//img[@alt='Class Registration Form Templates']");
	
		System.out.println(el.waitForTitleContains(5, "Disease"));

	}

}
