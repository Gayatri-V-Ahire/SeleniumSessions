package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultileSelectionWithSelectClass {

	public static void main(String[] args) {
    
		WebDriver driver = new ChromeDriver();
		driver.get("https://html.com/attributes/select-multiple/");
		
		WebElement dropDown = driver.findElement(By.xpath("//select[@multiple]"));
		Select select = new Select(dropDown);
		
		System.out.println(select.isMultiple());
		
     	if(select.isMultiple()) {
     		System.out.println("multi select is possible");
     		
     		select.selectByVisibleText("American flamingo");
     		select.selectByVisibleText("Andean flamingo");
     		select.selectByVisibleText("Chilean flamingo");
     		select.selectByVisibleText("Greater flamingo");
     		select.selectByVisibleText("James's flamingo");
     		select.selectByVisibleText("Lesser flamingo");
     		
     	}
     	select.deselectByVisibleText("James's flamingo");
     	select.deselectByVisibleText("Chilean flamingo");
     	select.deselectAll();
	}

}
