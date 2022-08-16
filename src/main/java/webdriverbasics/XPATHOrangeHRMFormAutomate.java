package webdriverbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XPATHOrangeHRMFormAutomate {
	static WebDriver driver ;
	public static void main(String[] args) {

		BrowserUtil br = new BrowserUtil();
		 driver = br.initDriver("chrome");
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		ElementUtil el = new ElementUtil(driver);
		
		WebElement firstName = getInputElementBasedOnLabel("First Name");
		firstName.sendKeys("kanchan");
		
		WebElement lastName = getInputElementBasedOnLabel("Last Name");
		lastName.sendKeys("Dhyani");
		
		
		WebElement email = getInputElementBasedOnLabel("Email");
		email.sendKeys("kanchan.Dhyani@gmail.com");
		
		
		WebElement no = getInputElementBasedOnLabel("Phone Number");
		no.sendKeys("567890345");
		
		
	}
	// we assume that the input text has no attributes to use.. we can automate this way, write the xpath only once and use for all the fields inside that grid...
	
	
	public static WebElement getInputElementBasedOnLabel(String label)
	{
		return driver.findElement(By.xpath("//label[text()='"+label+"']/parent::div//input"));
	}
	
}
