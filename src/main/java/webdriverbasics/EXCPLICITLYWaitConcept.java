package webdriverbasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EXCPLICITLYWaitConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		BrowserUtil brUtil = new BrowserUtil();
		
		driver = brUtil.initDriver("chrome");
		 ElementUtil el = new ElementUtil(driver);
		 
		 Actions act = new Actions(driver);
		driver.get("https://www.amazon.com/");
		By img = By.xpath("//img[@alt='Class Registration Form Templates']");
		
    //    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      // WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(img));
	
	//	driver.findElement(img).click();
		
		//el.doClickWithWait(img, 10); // same as above commneted lines
		
		
		
		// wait for title
		//System.out.println(el.waitForTitleContains(5, "Amazon"));
		
		
		
		
		
	}

}
