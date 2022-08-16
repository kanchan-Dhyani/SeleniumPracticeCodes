package webdriverbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FrameHandling {
	 static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {

			BrowserUtil brUtil = new BrowserUtil();
			
			driver = brUtil.initDriver("chrome");
			 ElementUtil el = new ElementUtil(driver);
			 
			 
			driver.get("https://www.formsite.com/templates/education/class-registration-form/");
			
			By img = By.xpath("//img[@alt='Class Registration Form Templates']");
			driver.findElement(img).click();
			
			//driver.switchTo().frame(0); //index
			//driver.switchTo().frame("frame-one185709863"); // id
			By firstName = By.xpath("//label[contains(text(),'First Name')]/following-sibling::input"); // we are not using id as id looks dynamic
			By lastName = By.xpath("//label[contains(text(),'Last Name')]/following-sibling::input");
			By id = By.xpath("//label[contains(text(),'Student ID')]/following-sibling::input");
			By grade = By.xpath("//label[contains(text(),'Grade')]/following-sibling::select");
			By email = By.id("//label[contains(text(),'Email Address')]/following-sibling::input");
			
			
			driver.findElement(firstName).sendKeys("kanchan");
			driver.findElement(lastName).sendKeys("Dhyani");
			driver.findElement(id).sendKeys("45667");
			driver.findElement(grade).sendKeys("7");
			driver.findElement(email).sendKeys("kanchan@123");
			driver.switchTo().defaultContent();
			

	}

}
