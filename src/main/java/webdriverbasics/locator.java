package webdriverbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locator {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
	  // driver.findElement(By.id("input-email")).sendKeys("abc");
		// driver.findElement(By.id("input-password")).sendKeys("abc");
		ElementUtil el = new ElementUtil(driver);
		
		
		
		 //name locator ****************************************************************
		 //		 By email = By.name("email");
//		 By pwd = By.name("password");
//		 
//		 el.doSendKeys(email, "kanchan.dhyani@gmail.com");
//		 el.doSendKeys(pwd, "abc.com");

		
		
		
		
		   // class name locator *****************************************************
//		By textField = By.className("form-control");
//		el.doSendKeys(textField, "india is great");
		
		
		
		
		
		//XPATH LOCATOR*******************************************************
		
//		By email = By.xpath("//*[@id=\"input-email\"]");
//		By pwd = By.xpath("//*[@id=\"input-password\"]");
//		By submitButton = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
//		
//		el.doSendKeys(email, "kanchan.dhyani@gmail.com");
//		 el.doSendKeys(pwd, "abc.com");
//		el.getWebElement(submitButton).click(); // this or below one we can use
    //    el.doClick(submitButton)		
		
		
		
		
		
		// CSS SELECTOR *****************************************************
		
		//By email = By.cssSelector("h2"); // WORKED
		//By email = By.cssSelector("input[name=password]"); // WORKED
//		By email = By.cssSelector("#input-email"); // WORKED
		//	By email = By.cssSelector(".form-control"); // WORKED
	//	By email = By.cssSelector("input[class=form-control]");// WORKED
		
		//By email = By.cssSelector("p[class=text-center]") ;//NOTWORKING
		By email = By.cssSelector("p strong") ;//NOTWORKING
	
			
		System.out.println(el.getWebElement(email).getText()); 
		//el.doSendKeys(email, "kanchan. dhyani@gmail.com");
		
		
		//  LINK SELECTOR****************************************************************
		
//		By link = By.linkText("Register");
//		el.doClick(link);
		
		
		// TAG LOCATOR *********************************************************************
	//	By elem  = By.tagName("p"); //NOTWORKING, as printed in the below code, there are 5 p tags and all have data in them..but is empty is returning true.....
	//	printElementsText("p", driver);
	//	By elem  = By.tagName("h2");
	//	By elem  = By.tagName("li");
	//	By elem  = By.tagName("aside"); // works even tough the data is inside the div inside the tag aside
//		printElementsText("aside", driver); // it shows size 1 but prints a big list ???????????????
	//	By elem  = By.tagName("button");
		//By elem  = By.tagName("span");
		
		//By elem  = By.tagName("html");
		
		
	
		
		//System.out.println(el.getWebElement(elem).getText().isEmpty());
		
		//System.out.println(el.getWebElement(elem).getText());
		
		
		
		
		
		 // GETATTRIBUTE ******************************************************************************
		
		//By item = By.cssSelector("#top-links > ul > li:nth-child(5) > a");
		//By item = By.linkText("Continue"); 
	//	System.out.println(el.getWebElement(item).getAttribute("href"));
		
	}
	
	
	public static void printElementsText(String selector, WebDriver driver)
	{
		List<WebElement> spans = driver.findElements(By.tagName(selector));
		 System.out.println(spans.size());
		for(int j=0; j<spans.size(); j++)
	   {
	       //Printing the links
	       System.out.println(spans.get(j).getText());
	   }
	}

}


