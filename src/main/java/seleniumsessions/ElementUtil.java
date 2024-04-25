package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

//SRP: Single Responsibility Principle
public class ElementUtil {

	private WebDriver driver;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}

	private void nullBlankCheck(String value) {
		if (value == null || value.length() == 0) {
			throw new MyElementException(value + "value text can not be null or blank");
		}
	}

	public By getBy(String locatorType, String locatorValue) {
		By locator = null;
		switch (locatorType.toLowerCase().trim()) {
		case "id": {
			locator = By.id(locatorValue);
			break;
		}

		case "name": {
			locator = By.name(locatorValue);
			break;
		}
		case "classname": {
			locator = By.className(locatorValue);
			break;
		}

		case "xpath": {
			locator = By.xpath(locatorValue);
			break;
		}
		case "cssselector": {
			locator = By.cssSelector(locatorValue);
			break;
		}

		case "linktext": {
			locator = By.linkText(locatorValue);
			break;
		}
		case "partialtext": {
			locator = By.partialLinkText(locatorValue);
			break;
		}
		case "tagname": {
			locator = By.tagName(locatorValue);
			break;
		}
		default: {
			System.out.println("Please provided proper locatortype");
			break;
		}
		}
		return locator;

	}

	public WebElement getElement(By locator) {
		WebElement element = null;
		try {
			element = driver.findElement(locator);
		} catch (NoSuchElementException e) {
			System.out.println("Element is ot present on the page");
			e.printStackTrace();
			return null;
		}
		return element;
	}

	public WebElement getElement(String locatorType, String locatorValue) {
		return driver.findElement(getBy(locatorType, locatorValue));
	}

	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public void doSendKeys(String locatorType, String locatorValue, String value) {
		nullBlankCheck(value);
		getElement(locatorType, locatorValue).sendKeys(value);
	}

	public void doclick(By locator) {
		getElement(locator).click();
	}

	public void doclick(String locatorType, String locatorValue) {
		getElement(locatorType, locatorValue).click();
	}

	public String doGetElementText(By locator) {
		return getElement(locator).getText();
	}

	public String doGetElementText(String locatorType, String locatorValue) {
		return getElement(locatorType, locatorValue).getText();
	}

	public String doElementgetAttribute(By locator, String attrName) {
		return getElement(locator).getAttribute(attrName);
	}

	public boolean isElementDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}

	// ***************** Select based Drop Down Utils *******************

	public void doSelectByIndex(By locator, int index) {

		Select select = new Select(getElement(locator));
		select.selectByIndex(index);

	}

	public void doSelectByVisibleText(By locator, String visibleText) {
		nullBlankCheck(visibleText);

		Select select = new Select(getElement(locator));
		select.selectByVisibleText(visibleText);
	}

	public void doSelectByValue(By locator, String value) {
		nullBlankCheck(value);
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}

	public List<String> getDropDownOptionsText(By locator) {
		List<WebElement> optionList = getDropDownOptionList(locator);
		List<String> optionTextList = new ArrayList<String>();

		for (WebElement e : optionList) {
			String optionText = e.getText();
			optionTextList.add(optionText);
		}
		return optionTextList;
	}

	public int getDropDownValuesCount(By locator) {
		return getDropDownOptionList(locator).size();

	}

	public List<WebElement> getDropDownOptionList(By locator) {
		Select select = new Select(getElement(locator));
		return select.getOptions();

	}

	public void doSelectDropDownValue(By locator, String value) {
		nullBlankCheck(value);
		List<WebElement> optionList = getDropDownOptionList(locator);

		for (WebElement e : optionList) {
			String text = e.getText();

			if (text.equals(value)) {
				e.click();
				break;
			}
		}
	}

	public void printSelectDropDownValue(By locator) {
		List<WebElement> optionList = getDropDownOptionList(locator);

		for (WebElement e : optionList) {
			String text = e.getText();
			System.out.println(text);
		}
	}
	
	public void DoSelectValueFromDropDown(By locator, String value) {
		List<WebElement> optionsList = getElements(locator);
		System.out.println(optionsList.size());
		
		for(WebElement e:optionsList) {
			String text = e.getText();
			if(text.equals("value")) {
				e.click();
				break;
			}
		}
		
	}
	
	public void doSearch(By search, By locator, String searchtext, String value) throws InterruptedException {
        doSendKeys(search,searchtext);
        Thread.sleep(2000);
		List<WebElement> suggList = getElements(locator);

		for (WebElement e : suggList) {
			String text = e.getText();
			System.out.println(text);
			if (text.contains(value)) {
				e.click();
				break;
			}
		}
	}
}