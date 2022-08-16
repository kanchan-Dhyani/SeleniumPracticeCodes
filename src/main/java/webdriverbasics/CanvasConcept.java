package webdriverbasics;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class CanvasConcept {
	
	 static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {

			BrowserUtil brUtil = new BrowserUtil();
			
			driver = brUtil.initDriver("chrome");
			 ElementUtil el = new ElementUtil(driver);
			 //**********************************************************************
		 brUtil.launchURL("https://kitchen.applitools.com/ingredients/canvas");
		 
		 WebElement ele = driver.findElement(By.id("burger_canvas"));
		 Actions act = new Actions(driver);
		 
		 
		Dimension dm =  ele.getSize();
		int height = dm.getHeight();
		int width = dm.getWidth();
		
	//	act.moveToElement(ele,  width/3,height/3).click().perform();
		
		Action ac = act.moveToElement(ele,  width/3,height/3).click().build();
		
		 

}
}
