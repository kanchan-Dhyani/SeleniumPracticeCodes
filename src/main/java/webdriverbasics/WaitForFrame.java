package webdriverbasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForFrame {

	 static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {

			BrowserUtil brUtil = new BrowserUtil();
			
			driver = brUtil.initDriver("chrome");
			 ElementUtil el = new ElementUtil(driver);
			 
			 
			driver.get("https://www.formsite.com/templates/education/class-registration-form/");
			
			By img = By.xpath("//img[@alt='Class Registration Form Templates']");
			driver.findElement(img).click();
		
			el.waitForFrameUsingIndexAndSwitchToIt(10, 0);
			By firstName = By.xpath("//label[contains(text(),'First Name')]/following-sibling::input"); // we are not using id as id looks dynamic
			By lastName = By.xpath("//label[contains(text(),'Last Name')]/following-sibling::input");
			driver.findElement(firstName).sendKeys("kanchan");
			driver.findElement(lastName).sendKeys("Dhyani");
			
			//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			// wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElement(firstName),driver.findElement(lastName)));
			
			driver.switchTo().defaultContent();
			
			
			
			
	}

}
