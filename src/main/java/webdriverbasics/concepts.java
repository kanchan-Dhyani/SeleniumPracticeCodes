package webdriverbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class concepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.initDriver("chrome");
		
		ElementUtil el = new ElementUtil(driver);
		driver.get("https://automationPractice.com");
		
		By centerLoc = By.id("center_column1");
		
				
					
		WebElement ele = driver.findElement(By.xpath("//*[@id='footer']/div/div[10]"));
		System.out.println(driver.findElement(By.id("center_column")).isDisplayed());
		
		
		
	}

}
