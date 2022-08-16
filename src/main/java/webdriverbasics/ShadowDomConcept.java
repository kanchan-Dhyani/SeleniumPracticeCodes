package webdriverbasics;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ShadowDomConcept {

	 static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {

			BrowserUtil brUtil = new BrowserUtil();
			
			driver = brUtil.initDriver("chrome");
			 ElementUtil el = new ElementUtil(driver);
			 brUtil.launchURL("https://selectorshub.com/xpath-practice-page/");
		   driver.manage().window().maximize();
			//	Thread.sleep(2000);  
		  Actions act = new Actions(driver);
		  
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  WebElement e = (WebElement) js.executeScript("return document.querySelector(\"#userName\").shadowRoot.querySelector('#kils')");
		  e.sendKeys("kanchna");
		  
		}

}
