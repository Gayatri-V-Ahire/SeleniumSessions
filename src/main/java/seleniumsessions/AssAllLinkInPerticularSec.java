package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssAllLinkInPerticularSec {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		By xpath = By.xpath("//div[@class='list-group']/a[@class='list-group-item']");
		ArrayList<String> eleList = getElementsTextList(xpath);
		System.out.println(eleList);


		// FEsUtil fUtil = new FEsUtil();

		// fUtil.getElementAttributeList(null, null)

	
	}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	
	public static ArrayList<String> getElementsTextList(By locator) {
		List<WebElement> eleList = getElements(locator);
		
		ArrayList<String> eleTextList = new ArrayList<String>();

		for (WebElement e : eleList) {
			String text = e.getText();
			if (text.length() != 0) {
				eleTextList.add(text);
			}
		}
		return eleTextList;
	}
	
	
}

