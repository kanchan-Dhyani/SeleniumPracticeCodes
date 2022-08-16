package webdriverbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class fetchingLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.initDriver("chrome");
		
		ElementUtil el = new ElementUtil(driver);
		driver.get("https://automationPractice.com");
		
		
		System.out.println(el.getWebElement(By.xpath("//div[@id = 'cmsinfo_block']//div[@class='type-text']")).getText());
		// ALL FOOTER LINKS
		

		By newsletterBlock = By.xpath("//*[@id='footer']/div/div[1]");
		By socialBlock = By.xpath("//section[@id='social_block']//li//a");
		By categoriesBlock = By.xpath("//*[@id='footer']/div/section[2]/div/div/ul/li/a");
		By informationBlock = By.xpath("//*[@id='footer']/div/section[3]/ul/li");
		
		By ecommerceBlock = By.xpath("//*[@id='footer']/div/section[4]");
		By myAccountBlock = By.xpath("//*[@id='footer']/div/section[5]");
		By storeInfoBlock = By.xpath("//*[@id='footer']/div/section[6]");
		By storeInfoBlocklis = By.xpath("//*[@id='footer']/div/section[6]/div/ul/li");
		// GET INFORMATION BLOCK LINKS AND PERFORM ACTION ON THEM
		 List<WebElement> infoBlockLinksList = el.getWebElements(informationBlock);
		// System.out.println(infoBlockLinksList.size());
		 for(WebElement e : infoBlockLinksList)
		 {
			 String txt = e.getText();
			 //System.out.println(txt);
			 if(txt.equalsIgnoreCase("Contact us"))
			 {
				// e.click();
			 //  break;
			 }
			 
			 
			
		 }
		
		 
		 
		 
		// GET SOCIAL BLOCK LINKS AND CLICK ON FACEBOOK
		 List<WebElement> socialBlockList = el.getWebElements(socialBlock);
		 System.out.println("social block size : " +socialBlockList.size());
		 for(WebElement e : socialBlockList)
		 {
			 String txt = e.getText(); // WHY I DONT GET TEXT HERE????????????? WHERE THE FACEBOOK IMAGE IS COMING FROM?????????????????????
			 System.out.println(txt);
			 //if(txt.equalsIgnoreCase("facebook"))
			// {
			//	 e.click();
			  // break;
			// }
			
		 }
		 
		 
		         // GET STORE INFORMATION
		        // System.out.println(el.doElementGetText(storeInfoBlock));
				 List<WebElement> storeInfoBlockList = el.getWebElements(storeInfoBlocklis);
				 System.out.println("**********************************************************");
				// System.out.println(storeInfoBlockList.size());
				 for(WebElement e : storeInfoBlockList)
				 {
					 String txt = e.getText();
					 System.out.println(txt);
				    if(txt.contains("support@seleniumframework.com"))
					  {
					    e.click(); // This e is the li element which has the <a> tag inside it, if we want to perform click on the this <a> which is support@seleniumframework.com, do w ehave to create another webelement of the <a>?????????????????????????????????????????
					     break;
					  }
					
				 }
				
	}
}

