package webdriverbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class XPATHAmazonFooterText {

	static WebDriver driver ;
	public static void main(String[] args) {

		BrowserUtil br = new BrowserUtil();
		 driver = br.initDriver("chrome");
		driver.get("https://www.amazon.com");
		ElementUtil el = new ElementUtil(driver);
		
		System.out.println(getHeaderValue("About Amazon"));

		System.out.println(getHeaderValue("Amazon Currency Converter"));

		System.out.println(getHeaderValue("Stream 4K Video\r\n"
				+ "in Every Room"));
		

	}


// if we havea child link and we want to find out under which header its falling

public static String getHeaderValue(String child)
{
	By ele = By.xpath("//a[text() = '"+child+"']/ancestor::div[@class= 'navFooterLinkCol navAccessibility']/div");
	return driver.findElement(ele).getText();
}
}