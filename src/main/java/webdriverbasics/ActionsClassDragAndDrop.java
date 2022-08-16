package webdriverbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassDragAndDrop {


	static public WebDriver driver;
	public static ElementUtil el;
	public static void main(String[] args) throws InterruptedException {
		
		BrowserUtil br = new BrowserUtil();
		 driver = br.initDriver("chrome");
			driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		//driver.get("https://jqueryui.com/droppable/");
		 el = new ElementUtil(driver);
		 
		 WebElement source = el.getWebElement(By.id("draggable"));
		 WebElement target = el.getWebElement(By.id("droppable"));
		 
		 Actions act = new Actions(driver);
		// act.clickAndHold(source).moveToElement(target).release().perform();
		 
		 act.dragAndDrop(source, target).perform();
		 
		 
	}

}
