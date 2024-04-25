package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenCardRegister {

	public static void main(String[] args) {

		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.launchBrowser("Edge");

		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		String title = brUtil.getPageTitle();
		System.out.println(title);

		String url = brUtil.getPageURL();
		System.out.println(url);
		
		ElementUtil eleUtil = new ElementUtil(driver);
		By fName= By.id("input-firstname");
		By LName= By.id("input-lastname");
		By Email= By.id("input-email");
		By Telephone= By.id("input-telephone");
		By PassWord= By.id("input-password");
		By CpassWord= By.id("input-confirm");
		

		eleUtil.doSendKeys(fName, "test A");
		eleUtil.doSendKeys(LName, "jast");
		eleUtil.doSendKeys(Email, "testr@gmail.com");
		eleUtil.doSendKeys(Telephone, "9812334570");
		eleUtil.doSendKeys(PassWord, "TestA@");
		eleUtil.doSendKeys(CpassWord, "QA@12");
		
	}

}
