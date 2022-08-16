package webdriverbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PaginationConcept {

	 static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {

			BrowserUtil brUtil = new BrowserUtil();
			
			driver = brUtil.initDriver("chrome");
			 ElementUtil el = new ElementUtil(driver);
			 brUtil.launchURL("https://selectorshub.com/xpath-practice-page/");
		   driver.manage().window().maximize();
		
		  List<WebElement> resList;
		  Actions act = new Actions(driver);
		  
		  while(true)
		  {
			  Thread.sleep(2000);
			  resList= driver.findElements(By.xpath("//td[text()='India']//preceding-sibling::td/input[@type='checkbox']"));
			 
			  System.out.println("list size " + resList.size());
			  if(resList.size() > 0)
			  {
				
				for(WebElement e : resList)
				   {
				
				          e.click();
				   
				  }
				 
				  WebElement next = el.getWebElement(By.xpath("//a[text()='Next']"));
				 
				 if(!next.getAttribute("class").contains("disabled"))
				     act.click(next).perform();
				 else
					 break;
			  }
			  else
			  {
				  WebElement next = el.getWebElement(By.xpath("//a[text()='Next']"));
				 				  
				  if(!next.getAttribute("class").contains("disabled"))
					     act.click(next).perform();
					 else
						 break;
				  
			  }
			  
		  }
		  

	}

}
