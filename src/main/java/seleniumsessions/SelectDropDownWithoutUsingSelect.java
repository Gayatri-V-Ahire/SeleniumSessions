package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDropDownWithoutUsingSelect {
	static WebDriver driver;

	public static void main(String[] args) {
		// not allowed to use select class and select value from drop down

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
        
		By country = By.id("Form_getForm_Country");
		By options = By.xpath("//select[@id='Form_getForm_Country']/option");
	}
	  
	
	public static void DoSelectValueFromDropDown(By locator, String value) {
		List<WebElement> optionsList = driver.findElements(locator);
		System.out.println(optionsList.size());
		
		for(WebElement e:optionsList) {
			String text = e.getText();
			if(text.equals("value")) {
				e.click();
				break;
			}
		}
		
	
	}

}
