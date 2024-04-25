package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadLessConcept {

	public static void main(String[] args) {
      
		//headless vs headed
		//headless: no browser visibility
		//faster
		//run tcs on CI CD/Jenkins/Linux: headless
		//recommended: not recommeded
		//local: 
		//problems: its not an actual user simulation
		//complex apps/HTML DOM: 
		//alerts popups:could be a problem
		
	   ChromeOptions co = new ChromeOptions();
	    co.addArguments("--headless");
	   co.addArguments("--incognito");
	    
	  WebDriver driver = new ChromeDriver(co);
		
//		FirefoxOptions co = new FirefoxOptions();
//		co.addArguments("--headless");
//	    WebDriver driver = new FirefoxDriver(co);
	    
//	    EdgeOptions co = new EdgeOptions();
//	    co.addArguments("--headless");
//	    WebDriver driver = new EdgeDriver(co);
	    
	    
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
        System.out.println(driver.getCurrentUrl());
	
        driver.quit();
		
        
        
		
	}

}
