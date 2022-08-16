package webdriverbasics;

import java.time.Clock;
import java.time.ZoneId;
import java.util.TimeZone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Sleeper;

public class FluentWaitConceptWay1 {



	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		BrowserUtil brUtil = new BrowserUtil();
		
		driver = brUtil.initDriver("chrome");
		 ElementUtil el = new ElementUtil(driver);
		 
		 Actions act = new Actions(driver);
		driver.get("https://www.amazon.com/");
		By img = By.xpath("//a[text()='Sell']");
		
		
		// fluent wait using its constructor...not used in industry
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver, Clock.tickSeconds(ZoneId.of("Asia/Karachi")), Sleeper.SYSTEM_SLEEPER);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(img)).click();

	
		/// fluent wait othewr way
         
}
}
