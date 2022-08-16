package webdriverbasics;

public class AmazonTest {

	public static void main(String[] args) {
		
		BrowserUtil brUtil = new BrowserUtil();
		
		brUtil.initDriver("opera");
        brUtil.launchURL("http://www.amazon.in");
        
       // System.out.println(brUtil.isUrlFractionExists("amazoN".toLowerCase()));
       // System.out.println(brUtil.getPageTitle());
	}

}
