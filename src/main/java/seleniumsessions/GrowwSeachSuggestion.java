package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GrowwSeachSuggestion {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://groww.in/");

		By textbox = By.xpath("//div[@class='c-UazGY']//input[@id='globalSearch23']");
		By rrr = By.xpath("//div[@id='globalSearch23-suggestions']//div[@class='gsc23SuggestionText']");

		String suggtext = "tata";
		String clicktext = "Steel";

		searchSuggestion(textbox, rrr, suggtext, clicktext);

//		driver.findElement(By.xpath("//div[@class='c-UazGY']//input[@id='globalSearch23']")).sendKeys("tata");
//		Thread.sleep(2000);
//		List<WebElement> ElementList = driver
//				.findElements(By.xpath("//div[@id='globalSearch23-suggestions']//div[@class='gsc23SuggestionText']"));
//
//		for (WebElement e : ElementList) {
//			String text = e.getText();
//			// System.out.println(e.getSize());
//			System.out.println(text);
//
//			if (text.contains("Chemicals")) {
//				e.click();
//				break;
//
//			}
//		}
//
//	}

	}

	public static void searchSuggestion(By suggTextFeild, By suggDropDown, String suggText, String suggTextForClick)
			throws InterruptedException {
		driver.findElement(suggTextFeild).sendKeys(suggText);
		Thread.sleep(200);
		List<WebElement> Listn = driver.findElements(suggDropDown);

		System.out.println(Listn.size());

		for (WebElement e : Listn) {
			String text = e.getText();
			System.out.println(text);

			if (text.contains(suggTextForClick)) {
				e.click();
				break;
			}

		}
		
		
	}

}
