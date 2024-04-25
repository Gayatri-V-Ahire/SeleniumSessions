package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownALLOptions {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/book-a-free-demo/");

		By cty = By.id("Form_getForm_Country");
		doSelectDropDownValue(cty, "India");

		//getDropDownValuesCount(cty);
		// getDropDownOptionsText(cty);
		getDropDownOptionsText(cty);

//    
//    WebElement country = driver.findElement(By.id("Form_getForm_Country"));
//    Select select = new Select(country);
//    
//    List<WebElement> countyOptions = select.getOptions(); // All option is getting select
//    System.out.println(countyOptions.size());
//    
//    for(WebElement e:countyOptions ) {
//    	String cty = e.getText();
//    	System.out.println(cty);
//
//    	
//    	if(cty.equals("India")) {
//    		e.click();
//    		break;
//    	}
//    }
	}
	public static List<WebElement> getDropDownList(By locator) {
		WebElement element = driver.findElement(locator);
		Select select = new Select(element);
		return select.getOptions();
	}
	
	public static void getDropDownValueCount(By locator) {
		getDropDownList(locator).size();	
	}
	
   public static void doSelectDropDwnValue(By locator, String value) {
	   List<WebElement>optionList = getDropDownList(locator);
	  
	  for(WebElement e:optionList) {
		 String text = e.getText();
		 System.out.println(text);
		 
		 if(text.equals(value)) {
			 e.click();
			 break;
		 }
	  }
   }
	
	public static List<String> getDropDwnOptionsTextList(By locator) {
		List<WebElement> optionList = getDropDownOptionList(locator);
		
		List<String> List = new ArrayList<String>();
		for(WebElement e:optionList) {
			String text = e.getText();
		    List.add(text);
		}
		return List;
	}
	
	

	public static List<String> getDropDownOptionsText(By locator) {
		List<WebElement> optionList = getDropDownOptionList(locator);
		List<String> optionTextList = new ArrayList<String>();

		for (WebElement e : optionList) {
			String optionText = e.getText();
			optionTextList.add(optionText);
		}
		return optionTextList;
	}

	public static int getDropDownValuesCount(By locator) {
		return getDropDownOptionList(locator).size();

	}

	public static List<WebElement> getDropDownOptionList(By locator) {
		WebElement element = driver.findElement(locator);
		Select select = new Select(element);
		return select.getOptions();

	}

	public static void doSelectDropDownValue(By locator, String value) {
		List<WebElement> optionList = getDropDownOptionList(locator);

		for (WebElement e : optionList) {
			String text = e.getText();

			if (text.equals(value)) {
				e.click();
				break;
			}
		}
	}
	

	public static void printSelectDropDownValue(By locator) {
		List<WebElement> optionList = getDropDownOptionList(locator);

		for (WebElement e : optionList) {
			String text = e.getText();
			System.out.println(text);
		}
	}

}
