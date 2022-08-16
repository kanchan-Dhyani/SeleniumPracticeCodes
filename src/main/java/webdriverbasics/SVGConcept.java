package webdriverbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SVGConcept {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		BrowserUtil brUtil = new BrowserUtil();
		
		driver = brUtil.initDriver("chrome");
		 ElementUtil el = new ElementUtil(driver);
		 
		 Actions act = new Actions(driver);
		driver.get("https://petdiseasealerts.org/forecast-map/#/");
		
		
		Thread.sleep(10000);
		List<WebElement> list = driver.findElements(By.xpath("//*[local-name()='svg' ]//*[name()='g' and @class='state']"));
		System.out.println(list.size());
	
		for(int count = 0; count < list.size();count++)
		{
			String cityName = list.get(count).getAttribute("id");
			
			System.out.println("*******************************************************************");
			System.out.println(cityName.toUpperCase());
			System.out.println("*******************************************************************");
			act.click(list.get(count)).perform();
			Thread.sleep(10000);
			List<WebElement> townlist = driver.findElements(By.xpath("//*[local-name()='svg']//*[name()='g' and @id='"+cityName+"']//*//*[name()='path']"));
			
			System.out.println(townlist.size());
			for(WebElement inEle : townlist)
			{
				act.moveToElement(inEle).perform();
				Thread.sleep(4000);
				System.out.println(driver.findElement(By.xpath("//div[@class='tooltip-text']")).getText());
				Thread.sleep(4000);
			}
			driver.navigate().refresh();
			Thread.sleep(10000);
			
			list = driver.findElements(By.xpath("//*[local-name()='svg' ]//*[name()='g' and @class='state']"));
			
			System.out.println(list.size());
			
		}

	}

}

