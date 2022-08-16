package webdriverbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementsConcept {
	
	static WebDriver  driver;
public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
		
		ElementUtil el = new ElementUtil(driver);
		
		List<WebElement> footerLinkList = el.getWebElements(By.xpath("//footer//a"));
		for(WebElement e: footerLinkList)
		{
			e.click();
			Thread.sleep(1500);
			driver.navigate().back();
			//Thread.sleep(5000);
			footerLinkList = driver.findElements(By.xpath("//footer//a"));
		}
		
	}

}
