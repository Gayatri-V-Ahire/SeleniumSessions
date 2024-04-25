package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsStrategy {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		// create a webelement + perform an action on it(click, sendKeys, gettext,
		// isDisplayed)

		// 1. id: unique attribute: can not be duplicate
//				driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
//				driver.findElement(By.id("input-password")).sendKeys("Password@123");

		// 2. name: can be duplicate
//		       driver.findElement(By.name("firstname")).sendKeys("test");
//		       driver.findElement(By.name("lastname")).sendKeys("Ahire");
//		       
//		       By fn = By.name("firstname");
//		       By ln = By.name("lastname");
//              
//		       ElementUtil eleUtil = new ElementUtil(driver);
//		       eleUtil.doSendKeys(ln, "test");
//		       eleUtil.doSendKeys(fn, "QA");

//    	   String fn = "firstname";
//	       String ln = "lastname";
//       
//	       ElementUtil eleUtil = new ElementUtil(driver);
//	       eleUtil.doSendKeys("name", fn, "Raj");
//         eleUtil.doSendKeys("name", ln,"test");		

		// 3. class name: it is not unique
		//driver.findElement(By.className("form-control")).sendKeys("yash");
		
		// 4. xpath:(xpath is address of the specific webelement in html dom ) its not an attribute
        //driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("arjun");
        //driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("shri");

//        By fn = By.xpath("//input[@id='input-firstname']");
//        By ln = By.xpath("//input[@name='lastname']");
//        
//        ElementUtil eleUtil = new ElementUtil(driver);
//        
//        eleUtil.doSendKeys(fn, "tushar");
//        eleUtil.doSendKeys(ln, "ahire");
	
//		String fn = "//input[@id='input-firstname']";
//		String ln = "//input[@name='lastname']";
//		
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doSendKeys("xpath", fn, "tanu");
//		eleUtil.doSendKeys("xpath", ln,"singh");
		
		//5. CSS: casacaded style sheet: its not an attribute:
//		driver.findElement(By.cssSelector("#input-firstname")).sendKeys("automation");
//		driver.findElement(By.cssSelector("#input-lastname")).sendKeys("testing");
		
//	     By fn = By.cssSelector("#input-firstname");
//	     By ln = By.cssSelector("#input-lastname");
//	     
//	     ElementUtil eleUtil = new ElementUtil(driver);
//	     eleUtil.doSendKeys(fn, "sameer");
//	     eleUtil.doSendKeys(ln, "yadav");
	     
//	     String fn = "#input-firstname";
//	     String ln = "#input-lastname";
//         
//	     ElementUtil eleUtil = new ElementUtil(driver);
//	     
//	     eleUtil.doSendKeys("cssSelector", fn, "shruti");
//	     eleUtil.doSendKeys("cssSelector", ln, "sharma");
//	     
		//6. linkText: Only for links: for the text of the link
	     //driver.findElement(By.linkText("Login")).click();
	     
//		By fn = By.linkText("Login");
//		ElementUtil eleUtil = new ElementUtil(driver);
//		
//	   eleUtil.doclick(fn);
//		  
//		String fn = "Login";
//		ElementUtil eleUtil = new ElementUtil(driver);
//		
//		eleUtil.doclick("LinkText", fn);
		
		//7. partialLinkText:Only for links: for the text of the link
		//driver.findElement(By.partialLinkText("log")).click();
		
//		By fn = By.partialLinkText("Log");
//		ElementUtil eleUtil = new ElementUtil(driver);
//		
//		eleUtil.doclick(fn);
		
		//8. tagName: 
//		String header = driver.findElement(By.tagName("h1")).getText();
//		System.out.println(header);
		
//     	By pageHeader = By.tagName("h1");
//     	ElementUtil eleUtil = new ElementUtil(driver);
//     	
//     	String header = eleUtil.doGetElementText(pageHeader);
//     	System.out.println(header);
		
		String pageHeader = "h1";
		ElementUtil eleUtil = new ElementUtil(driver);
		
		String header = eleUtil.doGetElementText("tagname", pageHeader);
		System.out.println(header);
	} 

}
