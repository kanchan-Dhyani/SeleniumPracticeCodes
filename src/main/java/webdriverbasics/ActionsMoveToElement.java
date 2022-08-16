package webdriverbasics;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsMoveToElement {


	static public WebDriver driver;
	public static ElementUtil el;
	static Actions act;
	public static void main(String[] args) throws InterruptedException {
		
		BrowserUtil br = new BrowserUtil();
		 driver = br.initDriver("chrome");
			driver.get("https://www.bigbasket.com/");
		//driver.get("https://jqueryui.com/droppable/");
			act = new Actions(driver);
		 el = new ElementUtil(driver);
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		
		 //clickOnMenuLink( "Foodgrains, Oil & Masala",  "Dry Fruits",  "Almonds");
		 clickOnMenuLink( "Baby Care",  "Baby Accessories",  "Baby Toys");

	}
	
	public static void clickOnMenuLink(String parent, String child, String subChild) throws InterruptedException
	{
		 WebElement TopNode = el.getWebElement(By.xpath("//a[contains(text(), 'Category')]"));
		// act = new Actions(driver);
		
				
		 WebElement parentEle = el.getWebElement(By.xpath("//div[@id ='navbar']//a[text()='"+parent+"']"));
		
		 
		 act.moveToElement(TopNode).perform();
		 act.moveToElement(parentEle).perform();
		 WebElement childEle = el.getWebElement(By.xpath("//div[@id ='navbar']//a[text()='"+child+"']"));
		 act.moveToElement(childEle).perform();
		 WebElement subChildEle = el.getWebElement(By.xpath("//div[@id ='navbar']//a[text()='"+subChild+"']"));
		 act.moveToElement(subChildEle).click().perform();
		 
		ArrayList list = new ArrayList();
		
		list.addAll(driver.getWindowHandles());
		
		driver.switchTo().window((String) list.get(1));
		
		Thread.sleep(2000);
		
		driver.switchTo().window((String) list.get(0));
		
	}

}




