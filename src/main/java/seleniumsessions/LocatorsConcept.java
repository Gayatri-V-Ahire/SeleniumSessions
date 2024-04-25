package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// Chrome Dev tools:
		// Elements section called DOM(Document Object Models)
		// create a webelement + perform an action on it(click, sendKeys, gettext,
		// isDisplayed)

		// 1.
//		driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("Password@123");

		// 2.
//		WebElement email = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));
//		
//		email.sendKeys("test@gmail.com");
//		password.sendKeys("Password@123");

		// 3. By locator
//		By emailid = By.id("input-email");
//		By pwd= By.id("input-password");
//		
//		WebElement email = driver.findElement(emailid));
//		WebElement password = driver.findElement(By.id(pwd)); 
//		
//		email.sendKeys("test@gmail.com");
//		password.sendKeys("Password@123");

		// 4.By locator with some utility:
//		By emailid = By.id("input-email");
//		By pwdid = By.id("input-password");
//
//		WebElement email = getElement(emailid);
//		WebElement pwd = getElement(pwdid);
//
//		email.sendKeys("test12@gmail.com");
//		pwd.sendKeys("pwd23");
     
		//5. By locator with element util and action util:
			
//		By emailid = By.id("input-email");
//		By pwdid = By.id("input-password");
//		
//		dosendKeys(emailid, "test@gmail.com");
//		dosendKeys(pwdid, "test@");
    
		//6. By locator and create a common util class for element
		// Page By Locators: OR - Object Respository
//		By emailid = By.id("input-email");
//      	By pwdid = By.id("input-password");
//      	
//      	ElementUtil eleUtil = new ElementUtil(driver);
//      	eleUtil.doSendKeys(pwdid, "grd123");
//      	eleUtil.doSendKeys(emailid, "testqw@gmail.com");
      	
      	//7. BrUtil + eleUtil
      	
      	//8. By Util + String locators
      	String username_id = "input-email";
      	String pwd_id = "input-password";
        
      	ElementUtil eleUtil = new ElementUtil(driver);
      	eleUtil.doSendKeys("id", username_id, "anu@gmail.com");
      	eleUtil.doSendKeys("id", pwd_id, "p@12");
	}
 

}
