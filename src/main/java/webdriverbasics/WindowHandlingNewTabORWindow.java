package webdriverbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;

public class WindowHandlingNewTabORWindow {

	static public WebDriver driver;
	public static ElementUtil el;
	static Actions act;
	public static void main(String[] args) throws InterruptedException {
		
		BrowserUtil br = new BrowserUtil();
		 driver = br.initDriver("chrome");
			driver.get("https://www.bigbasket.com/");
			String parentHandle= driver.getWindowHandle();
			
			driver.switchTo().newWindow(WindowType.TAB);
			Thread.sleep(2000);
			driver.get("https://www.ideafarms.com");
			Thread.sleep(2000);
			
			driver.switchTo().window(parentHandle);
			driver.close();
			

	}

}
