package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableElementClickSendKeys {
	
 static WebDriver driver;
 
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		
		driver.findElement(By.id("pass")).click(); //no exception
		
		driver.findElement(By.id("pass")).sendKeys("testing");
		//ElementNotInteractableException: element not interactable
	
	    driver.findElement(By.id("pass")).sendKeys(null);
	    //InllgalArgumentException: Keys to send be a not null CharSequence
	    
	}

}
