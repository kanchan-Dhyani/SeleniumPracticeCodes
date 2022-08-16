package webdriverbasics;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForAlert {


	 static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {

			BrowserUtil brUtil = new BrowserUtil();
			
			driver = brUtil.initDriver("chrome");
			 ElementUtil el = new ElementUtil(driver);
			 
			driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	        By confirm = By.xpath("//button[text()='Click for JS Prompt']");
	        
	      //  el.getWebElement(confirm).click();
	        
	      //  Alert al = driver.switchTo().alert();
	      //  al.sendKeys("kanchan");
	      //  System.out.println(al.getText());
	      //  al.accept();
	        
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	       Alert alert= wait.until(ExpectedConditions.alertIsPresent());
	       
	       System.out.println(alert.getText());
	       alert.accept();
	        		
	        		
	}

}
