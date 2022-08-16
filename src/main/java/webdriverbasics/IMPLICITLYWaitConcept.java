package webdriverbasics;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class IMPLICITLYWaitConcept {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		BrowserUtil brUtil = new BrowserUtil();
		
		driver = brUtil.initDriver("chrome");
		 ElementUtil el = new ElementUtil(driver);
		 
		 Actions act = new Actions(driver);
		driver.get("https://petdiseasealerts.org/forecast-map/#/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.HOURS)  // deprecated in sel 4
		
		By img = By.xpath("//img[@alt='Class Registration Form Templates']");
		driver.findElement(img).click();

	}

}
