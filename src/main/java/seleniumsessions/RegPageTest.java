package seleniumsessions;

import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegPageTest {

	public static String getRandomEmail() {
	     return "automation"+System.currentTimeMillis()+"@gmail.com";
		//return "automation"+ UUID.randomUUID()+"@opencart.com";
	}

	public static void main(String[] args) {
		 
	 BrowserUtil brUtil = new BrowserUtil();
	 
	 WebDriver driver =  brUtil.launchBrowser("chrome");
	 brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
     		
     By fn = By.id("input-firstname");
	 By ln = By.id("input-lastname");
     String email = "input-email";	
	 By Mob = By.id("input-telephone");
	 By Pwd = By.id("input-password");
	 By Cpwd = By.id("input-confirm");
	 By issSubscribeYes = By.xpath("//input[@name='newsletter' and @value='1']");
	 By policyCheck = By.xpath("//input[@name='agree' and @value='1']");
	 By continueBtn = By.xpath("//input[@type=\"submit\" and @value=\"Continue\"]");
	 By successMessgae = By.tagName("h1");
	 
	 ElementUtil eleUtil = new ElementUtil(driver);
	 eleUtil.doSendKeys(fn, "Test");
	 eleUtil.doSendKeys(ln, "Automation");
	 eleUtil.doSendKeys("id", email, getRandomEmail());
	 eleUtil.doSendKeys(Mob, "6543112334");
	 eleUtil.doSendKeys(Pwd, "a@453");
	 eleUtil.doSendKeys(Cpwd, "a@453");
	 eleUtil.doclick(issSubscribeYes);
	 eleUtil.doclick(policyCheck);
	 eleUtil.doclick(continueBtn);
	 
	 String msg = eleUtil.doGetElementText(successMessgae);
	 System.out.println(msg);
	 if(msg.equals("Your Account Has Been Created!")) {
		 System.out.println("user Reg--- PASSED");
	 }
	 else {
		 System.out.println("user reg --- FAILED");
	 }
	 
	 //brUtil.closeBrowser();
	}

}
