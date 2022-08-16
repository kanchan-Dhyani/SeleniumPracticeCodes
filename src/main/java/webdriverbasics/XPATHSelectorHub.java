package webdriverbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class XPATHSelectorHub {

	static public WebDriver driver;
	public static ElementUtil el;
	public static void main(String[] args) throws InterruptedException {
		
		BrowserUtil br = new BrowserUtil();
		 driver = br.initDriver("chrome");
		driver.get("https://selectorshub.com/xpath-practice-page/");
		 el = new ElementUtil(driver);
		 
		// getUsersTable("John.Smith");
		 //getUsersTable("Jasmine.Morgan");
		 
		 checkOut("Join Training");  // NOT WORKING, ElementNotInteractableException: element not interactable
		// selectCar("Audi");
		 
		// inputData();
		// selectSystemDistributionDetailsByName("India");
		 //selectSystemDistributionDetailsByName("India");
	}
	
	
	
	 public static void  getUsersTable(String playerName)
	  {
		 System.out.println("******************************************");
		 By preLoc = By.xpath("//a[text() ='"+playerName+"']/parent::td/preceding-sibling::td");
		By loc = By.xpath("//a[text() ='"+playerName+"']/parent::td/following-sibling::td");
		List<WebElement> list = driver.findElements(loc);
		
		System.out.println(playerName);
		//System.out.println(list.size());
		for(WebElement e : list)
		{
			System.out.println(e.isDisplayed()+ "  " + e.getText());
			
		}
		
		el.doClick(preLoc);
		
	  }
	 
	 
	  public static void checkOut(String value) throws InterruptedException
	  {
		 // By ele= By.linkText(value);
		  WebElement source = el.getWebElement(By.xpath("//button[contains(text(),'Checkout here')]"));
		  Actions act = new Actions(driver);
		  act.moveToElement(source).perform();
		  
		  Thread.sleep(3000);
		  By ele= By.xpath("//a[text()='"+value+"']");
		  el.doClick(ele);
	  }
	  
	  public static void selectCar(String carName)
	  {
		By ele = By.xpath("//select[@id='cars']/option[text() ='"+carName+"' ]");
		 el.doClick(ele);
	  }
	  
	  /**
	   * this method will filter the System Distribution details by the searchkey and clock checkboxes of all the filtered rows.
	   * It needs to be updated to loop through the size of the EleList later.
	   * @param searchKey
	   * @throws InterruptedException
	   */
	  
	  public static void selectSystemDistributionDetailsByName(String searchKey ) throws InterruptedException
	  {
		  Thread.sleep(3000);
		By searchLoc= By.xpath("//label//input[@type='search']");
		el.doSendKeys(searchLoc, searchKey);
		
		Thread.sleep(3000);
		By listsLoc = By.xpath("//td[text()='"+searchKey+"']/parent::tr/child::td");
		 
		List<WebElement> EleList = el.getWebElements(listsLoc);
				
		System.out.println("EleList.size() " + EleList.size());
		
		for(int i =1; i <= 10;i++) // currently since the page shows only 10 numbers, so looping though only maximum 10 times..later it shoudl be replaced with the size
		{
			WebElement ele = el.getWebElement(By.xpath("(//td[text()='"+searchKey+"']/parent::tr)["+i+"]/td/input"));
			ele.click();
		}
	  }
	  
	  
	  
	  public static void inputData()
	  {
		  WebElement userEmail = el.getWebElement(By.id("userId"));
		  WebElement password = el.getWebElement(By.id("pass"));
		  WebElement company = el.getWebElement(By.xpath("//div[@class='element-companyId']//input[@placeholder='Enter your company']"));
		  WebElement submit = el.getWebElement(By.xpath("//input[@type='submit']"));
		  WebElement firstCrush1 = el.getWebElement(By.xpath("(//input[@id='inp_val'])[1]"));
		  WebElement dnldLink = el.getWebElement(By.linkText("DownLoad Link"));
		  
		  userEmail.sendKeys("kanchan.dhyani@gmail.com");
		  password.sendKeys("hello123");
		  company.sendKeys("Self");
		  firstCrush1.sendKeys("Myself");
		  submit.click();
		  
		  
		  
		  
	  }

	  public static void getElementByPlaceholder(String attrValue)
	  {
		  
	  }
}
