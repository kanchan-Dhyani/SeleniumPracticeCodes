package webdriverbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TotalLinks {

	public static void main(String[] args) {
		
		BrowserUtil br =   new BrowserUtil();
		WebDriver driver = br.initDriver("chrome");
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
		ElementUtil el = new ElementUtil(driver);
		
		
		//TOTAL COUNT OF LINKS AND THEIR TEXTS, LINKS WITHOUT TEXT, LINKS WITH TEXT
		By anchorLocator = By.tagName("a");
		System.out.println("total number of links  " +el.getPageElementsCount(anchorLocator));
		
			
		List<String> linksTexts = el.getElementsTextList(anchorLocator);
		//System.out.println(linksTexts.toString());
		
		System.out.println("total number of links with text " + linksTexts.size());
		System.out.println("total number of links without text " +el.getEmptyElementsTextSize(anchorLocator));
		
		
		// HREF LIST OF THE LINKS
		System.out.println(el.getElementAttributeList(anchorLocator, "href"));
		
		//TOTAL NO OF IMAGES ON THE PAGE
		By imageLocator = By.tagName("img");
		System.out.println("total number of images " +el.getPageElementsCount(imageLocator));
		
		
		//TOTAL NO OF TEXT FIELDS
		By textLocator = By.tagName("input");
		System.out.println("total number of text fields " + el.getPageElementsCount(textLocator));
		
		
		//PRINT TEXT OF ALL THE LINK FIELDS
		
		// TOTAL NO OF LINKS WITH HREF ATTRIBUTE
		By anchorHrefLocator = By.xpath("//a[@href]");
		System.out.println("total number of links with href " +el.getPageElementsCount(anchorHrefLocator));
		
		
		//IDS of all text fields
		System.out.println("ids of text fields " + el.getElementAttributeList(textLocator, "id"));
		
		// FOR ALL IMAGES FETCH ALT ATTRIBUTE
		System.out.println("alt of images  " + el.getElementAttributeList(imageLocator, "alt"));
		
		// FOR ALL IMAGES FETCH src ATTRIBUTE
		System.out.println("src of images  " + el.getElementAttributeList(imageLocator, "src"));
	     
		
		// PLACEHOLDER VALUES OF ALL INPUT FIELDS
		System.out.println("Placeholder of text fields " + el.getElementAttributeList(textLocator, "placeholder"));
		
	}

}
