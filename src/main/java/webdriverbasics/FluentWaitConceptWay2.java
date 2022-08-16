package webdriverbasics;

import java.time.Clock;
import java.time.Duration;
import java.time.ZoneId;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitConceptWay2 {



	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		BrowserUtil brUtil = new BrowserUtil();
		
		driver = brUtil.initDriver("chrome");
		 ElementUtil el = new ElementUtil(driver);
		 
		 Actions act = new Actions(driver);
		driver.get("https://www.amazon.com/");
		By img = By.xpath("//a[text()='Sell1']");
		
		
		// fluent wait using its constructor...not used in industry
		FluentWait<WebDriver> fluentWait = new FluentWait(driver);
		fluentWait.pollingEvery(Duration.ofSeconds(5)).withTimeout(Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(img)).click();
		
		// WebDriver wait
		
		WebDriverWait webDrWait = new WebDriverWait(driver, null);
		webDrWait.pollingEvery(Duration.ofSeconds(5)).withTimeout(Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(img)).click();
		
	}

}
