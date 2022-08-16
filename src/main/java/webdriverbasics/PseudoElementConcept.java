package webdriverbasics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class PseudoElementConcept {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		BrowserUtil brUtil = new BrowserUtil();
		
		driver = brUtil.initDriver("chrome");
		 ElementUtil el = new ElementUtil(driver);
		 brUtil.launchURL("https://selectorshub.com/xpath-practice-page/");
	   driver.manage().window().maximize();
	   //Thread.sleep(2000);
	   JavascriptExecutor js = (JavascriptExecutor)driver;
	   String s = js.executeScript("return window.getComputedStyle(document.querySelector(\"a#tablepress-1_previous\"),\"::before\").getPropertyValue(\"content\")").toString();
	   System.out.println(s);

	}

}
