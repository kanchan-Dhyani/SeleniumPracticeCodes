package webdriverbasics;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class POPUPCricInfo {


	static public WebDriver driver;
	public static ElementUtil el;
	static Actions act;
	public static void main(String[] args) throws InterruptedException {
		
		
		BrowserUtil br = new BrowserUtil();
		 driver = br.initDriver("chrome");
		 
			driver.get("https://www.espncricinfo.com/");
			Thread.sleep(20000);
			WebElement ele = driver.findElement(By.xpath("//div[@class='wzrk-alert wiz-show-animate']"));
			WebElement ele1 = driver.findElement(By.id("wzrk-cancel"));
			ArrayList<String> list = new ArrayList();
			
			Set<String> set =  driver.getWindowHandles();
		
			//list.addAll(set);
		//	driver.switchTo().window(list.get(1));
			
		//	driver.close();
			
			ele1.click();
			
			
			

	}
	
	
	

}
