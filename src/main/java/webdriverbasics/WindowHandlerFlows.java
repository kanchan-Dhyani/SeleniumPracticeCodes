package webdriverbasics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
// it opens 3 links on the webiste and one by one driver goes to each. If its facebook then it opens one more link and get back to fb
// thereafter it moves to rest of 2 links and closes them one by one and at last comes back to main page.

public class WindowHandlerFlows {

	static public WebDriver driver;
	public static ElementUtil el;
	static Actions act;
	public static void main(String[] args) throws InterruptedException {
		
		BrowserUtil br = new BrowserUtil();
		 driver = br.initDriver("chrome");
		 Thread.sleep(2000);
			driver.get("http://automationpractice.com/index.php");
			driver.manage().window().maximize();
			 By fb = By.xpath("//li[@class=\"facebook\"]//a");
			 By twitter =  By.xpath("//li[@class=\"twitter\"]//a");
			 By youtube =  By.xpath("//li[@class=\"youtube\"]//a");
			
			 driver.findElement(youtube).click();
			 driver.findElement(twitter).click();
			 driver.findElement(fb).click();
			 Set<String> winHandles= driver.getWindowHandles();
			Iterator<String> itr = winHandles.iterator();
			String parentHandle ="" ;
			ArrayList<String> childhandles = new ArrayList<String>();
			int loop = 0;
			while(itr.hasNext())
			{
				String temphandlee = itr.next();
				if(loop == 0)
					parentHandle = temphandlee;
				
				childhandles.add(temphandlee);
				loop++;
			}
			
			 traverseChildhandlesAndReturn( parentHandle ,  childhandles);
			
	}
	
	public static void  traverseChildhandlesAndReturn(String parentHandle , ArrayList<String> childhandles) throws InterruptedException
	{
		for(String handle :childhandles )
		{
			if(parentHandle != handle)
			{
			driver.switchTo().window(handle);
			 System.out.println("driver.getTitle() " + driver.getTitle());
			if(driver.getCurrentUrl().contains("facebook"))
			{
				Thread.sleep(2000);
				 String newInnerParentHandle=handle;
				 By innerChildLoc = By.linkText("www.seleniumframework.com");
				 driver.findElement(innerChildLoc).click();
				 
				 Set<String> innerWinhandles = driver.getWindowHandles();
				 System.out.println("innerWinhandles " + innerWinhandles.toString());
				 System.out.println("childhandles " + childhandles.toString());
				
				
				 ArrayList<String> innerChildhandles = new ArrayList<String>();
				 Iterator<String> itr =innerWinhandles.iterator();
				
					while(itr.hasNext())
					{
						innerChildhandles.add(itr.next());
					}
					innerChildhandles.removeAll(childhandles);
					 System.out.println("******************************************************************* " );
					 System.out.println("innerWinhandles " + innerChildhandles.toString());
					 System.out.println("childhandles " + childhandles.toString());
					Thread.sleep(2000);
				 traverseChildhandlesAndReturn(newInnerParentHandle , innerChildhandles);
			}
			Thread.sleep(5000);
			driver.close();
		}
		}
		
		if(parentHandle != null)
		{
			driver.switchTo().window(parentHandle);
		}
	}

}
