package webdriverbasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertConcept {

	 static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {

			BrowserUtil brUtil = new BrowserUtil();
			
			driver = brUtil.initDriver("chrome");
			 ElementUtil el = new ElementUtil(driver);
			 
			 
			 
			 //*****************************************************************
			//driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			// el.getWebElement(By.name("proceed")).click();
			 //Alert al = driver.switchTo().alert();
		     //  System.out.println(al.getText());
		      //  al.accept();
			 
			 //*****************************************************************
			driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	        By confirm = By.xpath("//button[text()='Click for JS Prompt']");
	        
	        el.getWebElement(confirm).click();
	        
	        Alert al = driver.switchTo().alert();
	        al.sendKeys("kanchan");
	        System.out.println(al.getText());
	        al.accept();
	        
	        

	}

}
