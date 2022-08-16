package webdriverbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathAxes {
	static WebDriver driver ;
	static ElementUtil el;
	public static void main(String[] args) {

		BrowserUtil br = new BrowserUtil();
		 driver = br.initDriver("chrome");
		driver.get("https://www.espncricinfo.com/series/india-in-ireland-2022-1303299/ireland-vs-india-2nd-t20i-1303308/full-scorecard");
		 el = new ElementUtil(driver);
		
		//System.out.println(getDetailsOfPlayerAsString("Deepak Hooda"));
		 getScoreCardOfPlayer("Deepak Hooda");
		
		 
		 
		

	}

	  public static String  getDetailsOfPlayerAsString(String playerName)
	  {
		return el.doElementGetText(By.xpath("(//span[text() ='"+playerName+"']/ancestor::tr)[1]"));
	  }
	  
	  public static void  getScoreCardOfPlayer(String playerName)
	  {
			  
		By loc = By.xpath("//span[text() ='"+playerName+"']/ancestor::td/following-sibling::td");
		List<WebElement> list = driver.findElements(loc);
		System.out.println(playerName);
		System.out.println(list.size());
		for(WebElement e : list)
		{
			System.out.println( e.getAttribute("innerText"));
			
		}
		
		
	  }
	  
	
}
