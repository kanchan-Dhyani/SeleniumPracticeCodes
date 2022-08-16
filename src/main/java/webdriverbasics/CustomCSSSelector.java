package webdriverbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomCSSSelector {
	static WebDriver driver ;
	public static void main(String[] args) {

		BrowserUtil br = new BrowserUtil();
		 driver = br.initDriver("chrome");
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
		ElementUtil el = new ElementUtil(driver);

		fetchDetails("div#leftcontainer table[class='dataTable'] >tbody>tr > td ", "Responsive Industrie");
	}
	
	// CSS method to print the details of a webtable..we cna print all the details together but selective would be difficult as there is no backward, forward traversing
	public static void fetchDetails(String selector, String companyName)
	{
		By ele = By.cssSelector(selector);
		List<WebElement> list = driver.findElements(ele);
		int counter = 0;
		for(WebElement e :list)
		{
			
			   System.out.print("" + e.getText());
			   System.out.println();
			
		}
	}

}



