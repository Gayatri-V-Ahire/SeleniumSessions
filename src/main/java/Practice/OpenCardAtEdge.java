package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenCardAtEdge {

	public static void main(String[] args) {
    
		WebDriver driver = new EdgeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		String Title = driver.getTitle();
		System.out.println("Title:"+ Title);
		
		if(Title.equals("Your Store")) {
			System.out.println("PASSED");
		}
		else
		{
			System.out.println("FAILED");
		}
		
		String Url = driver.getCurrentUrl();
		System.out.println("URL:"+ Url);
		
		if(Url.contains("https://naveenautomationlabs.com/opencart/")) {
			System.out.println("PASSED");
		}
		else
		{
			System.out.println("FAILED");
		}
	    driver.close();

	}
	

}
