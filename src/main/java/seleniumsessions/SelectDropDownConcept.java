package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownConcept {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
	//	WebElement country = driver.findElement(By.id("Form_getForm_Country"));

//		Select select = new Select(country);
//		select.selectByIndex(3);
//		select.selectByValue("Cambodia");
//		select.selectByVisibleText("India");
//		List<WebElement> options = select.getOptions();
//		for (WebElement e : options) {
//			String text = e.getText();
//			System.out.println(text);
		
		By country = By.id("Form_getForm_Country");
		doSelectByIndex(country, 8);
		}
	

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSelectByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	public static void doSelectByValue(By locator, String value) {
		if(value==null||value.length()==0) {
			throw new MyElementException("Value text can not be Null");
		}
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	public static void doSelectByVisibleText(By locator, String VisibleText) {
		if(VisibleText==null||VisibleText.length()==0) {
			throw new MyElementException("Visible text can not be Null");
		}
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(VisibleText);
	}
	

	
}
