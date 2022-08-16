package webdriverbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		//WebDriverManager.chromedriver().setup();
		
		//WebDriverManager.chromedriver().driverVersion("85.0.4183.38").setup();
		//WebDriver driver = new ChromeDriver();
		//WebDriverManager.firefoxdriver().setup();
		//WebDriverManager.safaridriver().setup();
		WebDriver driver = new SafariDriver();
		
		//WebDriver driver = new FirefoxDriver();
		
		
		
		driver.get("https://naveenautomationlabs.com/opencart");
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		//driver.close();
		System.out.println(driver.getCurrentUrl());
		

	}
	
	static void printme (RemoteWebDriver obj)
	{
		System.out.println("fgfg");
	}

}
