package webdriverbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchConcept {

	public static void main(String[] args) throws InterruptedException
	{
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.initDriver("chrome");
		By suggListLoc ;
		By searchLoc ;
		ElementUtil el = new ElementUtil(driver);
		
		// GOOGLE SEARCH 
		driver.get("https://www.google.com");
		 suggListLoc = By.xpath("//ul[@class='erkvQe']//div[@class='wM6W7d']");
		 searchLoc = By.xpath("//input[@class='gLFyf gsfi']");
		
		el.performSearch(searchLoc, suggListLoc, "faballey", "jumpsuit");
		
		
		// automationPractice.com search
		//driver.get("https://automationPractice.com");
		//searchLoc = By.id("search_query_top");
		//suggListLoc =By.xpath("//div[@class='ac_results']//li");
		
		//el.performSearch(searchLoc, suggListLoc, "dress", "Chiffon");
		
		
		
	
	}
	
	
}
