package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) {
    
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		String a = driver.getTitle();
		System.out.println(a);
		
		if(a.equals("Google")) {
			System.out.println("Provided title is correct");
		}
		else
		{
			System.out.println("Provided title is not correct");
		}
		
		String url = driver.getCurrentUrl();
	    System.out.println(url);
	    
	    if(url.contains("https://www.google.com")) {
	    	System.out.println("url is correct");
	    }
	    else
	    {
	    	System.out.println("url is not correct");
	    }
	    
	    driver.close(); 
		
	}

}
