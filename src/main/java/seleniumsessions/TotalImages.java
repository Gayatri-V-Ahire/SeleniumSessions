package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");

		List<WebElement> Totalimg = driver.findElements(By.tagName("img"));
		System.out.println("Total images: " + Totalimg.size());

		for (int i = 0; i < Totalimg.size(); i++) {
			String totaltext = Totalimg.get(i).getAttribute("src");

			if (totaltext.length() != 0) {
				System.out.println(totaltext);

			}
		}
			System.out.println("----------------------");

			for (WebElement e : Totalimg) {
				String altText = e.getAttribute("alt");
				String srcText = e.getAttribute("src");
				if (altText.length() != 0) {
					System.out.println(altText + ":" + srcText);
				}

			}
			
			System.out.println("----------------------");

			//total text feilds on the page:
			
			List<WebElement> totalTextFeild = driver.findElements(By.className("form-control"));
			System.out.println(totalTextFeild.size());
			
		
	}
}
