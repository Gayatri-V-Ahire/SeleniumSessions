package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenCardAtFirefox {

	public static void main(String[] args) {
    
	    WebDriver driver = new FirefoxDriver();
	    driver.get("https://naveenautomationlabs.com/opencart/");
	    
	    String title = driver.getTitle();
	    System.out.println("Title:" + title);
	    
	    if(title.equals("Your Store")) {
	    	System.out.println("PASSED");
	    }
	    else
	    {
	    	System.out.println("FAILED");
	    }
	    
	    
	    String url = driver.getCurrentUrl();
	    System.out.println("URL:"+url);
	    
	    if(url.contains("https://naveenautomationlabs.com/opencart/")) {
	    	System.out.println("PASSED");
	    }
	    else
	    {
	    	System.out.println("FAILED");
	    }
	    
	    driver.close();
	}

}
