package webdriverbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavascriptExecutorConcept {

	 static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		BrowserUtil brUtil = new BrowserUtil();
		
		driver = brUtil.initDriver("chrome");
		JavaScriptUtil js = new JavaScriptUtil(driver);
		//driver.get("http://www.amazon.com");
        brUtil.launchURL("http://www.ideafarms.com");
        ElementUtil el = new ElementUtil(driver);

        
        
      //   String title = (String) js.executeScript("return document.title;");
         
      //   brUtil.launchURL("http://www.flipcart.com");
        // driver.get("http://www.flipcart.com");
        // Thread.sleep(2000);
       //  js.goForwardByJs();
      //   Thread.sleep(2000);
       //  js.goBackwardByJs();
         
        // System.out.println(js.getPageInnerText());
        
        
        
        
        
        //************************************************************************
        
        
        
        WebElement ele = el.getWebElement(By.xpath("//p[starts-with(text(),\"Design Thinking is a quick\")]"));
      
         ((JavascriptExecutor)driver).executeScript("arguments[0].style.border=arguments[1];", ele, "3px solid red");
        
        js.drawBorder(ele);
        
        js.scrollPageDown();
        Thread.sleep(2000);
       js.scrollToView(ele);
	}

}
