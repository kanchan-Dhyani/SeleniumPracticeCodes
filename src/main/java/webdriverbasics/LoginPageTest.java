package webdriverbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageTest {

	public static void main(String[] args) {
		
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.initDriver("chrome");
		br.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		// way1
		By emailId = By.id("input-email");
		By password = By.id("input-password");
		
		ElementUtil el = new ElementUtil(driver);
				
       el.doSendKeys(emailId, "kanchan.dhyani@gmailcom");
        el.doSendKeys(password, "hello123");
		
		// way 2
//		String email_id = "input-email";
//		String pwd = "input-password";
//		
//		ElementUtil el = new ElementUtil(driver);
//		el.doSendKeys("id", email_id, "kanchan.dhyani@gmail.com");
//		el.doSendKeys("id", pwd, "hello123");
		
        
       
		
	}

}
