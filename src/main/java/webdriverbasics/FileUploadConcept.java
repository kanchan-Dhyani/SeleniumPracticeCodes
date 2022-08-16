package webdriverbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FileUploadConcept {

	 static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {

			BrowserUtil brUtil = new BrowserUtil();
			
			driver = brUtil.initDriver("chrome");
			 ElementUtil el = new ElementUtil(driver);
			 
			 
			driver.get("https://the-internet.herokuapp.com/upload");
			
			WebElement file = driver.findElement(By.id("file-upload"));
			System.out.println(file.getText());
			
			file.sendKeys("C:\\Zerodha\\Pi\\splash.png");
			
			driver.findElement(By.id("file-submit")).click();
	}

}
