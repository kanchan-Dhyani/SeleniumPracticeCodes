package webdriverbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocators {

	 static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {

			BrowserUtil brUtil = new BrowserUtil();
			
			driver = brUtil.initDriver("chrome");
			 ElementUtil el = new ElementUtil(driver);
			 //**********************************************************************
		 brUtil.launchURL("https://www.aqi.in/dashboard/Canada");
//				printCitySiblings("Langley, Canada");
//			  By baseEle = By.xpath("//a[text()='Manitoba']");
//			 printRelativeLocators(baseEle,By.tagName("td"));
			 
			 //****************************************************************
			 
			// driver.get("https://www.espncricinfo.com/series/india-in-ireland-2022-1303299/ireland-vs-india-2nd-t20i-1303308/full-scorecard");
			// driver.get("https://www.espncricinfo.com/series/india-in-ireland-2022-1303299/ireland-vs-india-2nd-t20i-1303308/match-report");
		
			 driver.manage().window().maximize();
			 Thread.sleep(2000);
			 By baseEle = By.xpath("//a[text() = 'Alberta']");
			// printRelativeLocators(baseEle,By.tagName("td"));
			 
			 WebElement rightEle = driver.findElement(RelativeLocator.with(By.tagName("td")).toRightOf(baseEle));
			 WebElement R = driver.findElement(RelativeLocator.with(By.tagName("td")).toRightOf(rightEle));
			 WebElement B = driver.findElement(RelativeLocator.with(By.tagName("td")).toRightOf(R));
			// WebElement M = driver.findElement(RelativeLocator.with(By.tagName("td")).toRightOf(B));
			// WebElement _4s = driver.findElement(RelativeLocator.with(By.tagName("td")).toRightOf(M));
			// WebElement _6s = driver.findElement(RelativeLocator.with(By.tagName("td")).toRightOf(_4s));
			// WebElement _sr = driver.findElement(RelativeLocator.with(By.tagName("td")).toRightOf(_6s));
			
			 System.out.println("rightEle " + rightEle.getAttribute("innerText"));
			 System.out.println("R " + R.getText());
			 System.out.println("B " + B.getText());
			// System.out.println("M " + M.getText());
			// System.out.println("4s " + _4s.getText());
			// System.out.println("6s " + _6s.getText());
			 
			
			 
			 

	}
		
		// without RelativeLocators
		public static void printCitySiblings(String cityName)
		{
			int index=  getCityIndex(cityName);
			By preSib = By.xpath("((//a[text()='"+cityName+"']/ancestor::div[@id='most_pollutedCitiesRank'])[1]/preceding-sibling::div/p)["+index+"]");
			By follSib = By.xpath("((//a[text()='"+cityName+"']/ancestor::div[@id='most_pollutedCitiesRank'])[1]/following-sibling::div/p)["+index+"]");
			System.out.print("Rank :" + driver.findElement(preSib).getText());
			System.out.print(" AQI US :" + driver.findElement(follSib).getText());
		}

		public static int getCityIndex(String cityName)
		{
			List<WebElement> list = driver.findElements(By.xpath("//div[@id='most_pollutedCitiesRank']/p"));
			int index = 0;
			for(int i = 0; i <list.size(); i++)
			{
				
				
				if(list.get(i).getText().equalsIgnoreCase(cityName))
				{
					
					index = i+1;
					break;
				}
					
					
			}
			
			return index;
			
		}
		
		//with Relative Locators
		
		public static void printRelativeLocators(By  baseEleLocator, By TagLoc)
		{
		
		
			WebElement leftEle = driver.findElement(RelativeLocator.with(TagLoc).toLeftOf(baseEleLocator));
			WebElement rightEle = driver.findElement(RelativeLocator.with(TagLoc).toRightOf(baseEleLocator));
			WebElement belowEle = driver.findElement(RelativeLocator.with(By.tagName("a")).below(baseEleLocator));
			WebElement nearEle = driver.findElement(RelativeLocator.with(By.tagName("a")).near(baseEleLocator));
			WebElement aboveEle = driver.findElement(RelativeLocator.with(By.tagName("a")).above(baseEleLocator));
			
			
			System.out.println("left :" +leftEle.getText());
			System.out.println("right :" + rightEle.getText());
			System.out.println("Below :" + belowEle.getText());
			
			System.out.println("aboveEle :" + aboveEle.getText());
			System.out.println("nearEle :" + nearEle.getText());
			
		}

}



