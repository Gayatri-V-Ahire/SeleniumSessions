package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchSuggestions {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();

		driver.get("https://www.google.com");
		By search1 = By.name("q");
        By searchFeild = By.xpath("//ul[@class='G43f7e']//div[@class='wM6W7d']/span");
        ElementUtil eleUtil = new ElementUtil(driver);
        eleUtil.doSearch(search1,searchFeild,"selenium","ide");
	}

	

}
