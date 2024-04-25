package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		// text ---> getText()
		// attribute --->getAttribute()

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		String fn_placeholder = driver.findElement(By.id("input-firstname")).getAttribute("placeholder");
		System.out.println(fn_placeholder);

		String fn = driver.findElement(By.id("input-firstname")).getAttribute("name");
		System.out.println(fn);

		String fntest = driver.findElement(By.id("input-firstname")).getAttribute("type");
		System.out.println(fntest);

		// List<WebElement> allLinks = driver.findElements(By.tagName("a"));

		By firstName = By.id("input-firstname");
		By registerLink = By.linkText("Register");

		String fn_type = doElementgetAttribute(firstName, "type");
		System.out.println(fn_type);

		String fn_class = doElementgetAttribute(firstName, "class");
		System.out.println(fn_class);
		
		String rgn_href = doElementgetAttribute(registerLink,"href");
		System.out.println(rgn_href);

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static String doElementgetAttribute(By locator, String attName) {
	  return getElement(locator).getAttribute(attName);
	}
	

}