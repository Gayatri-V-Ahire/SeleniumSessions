package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
    
		//open browser: chrome
		//enter url
		//get the title
		//verfiy the title - act vs exp
		
		
		//automation steps
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		String title = driver.getTitle();
		System.out.println("page title: "+title);
		
		
		//checkpoint
		if(title.equals("Google"))
		{
			System.out.println("title: PASSED");
		}
		else {
			System.out.println("title: FAILED");
		}
		
		//automation steps + verification point ---> Automation Testing
		//test steps + verification point --- test case
		
		String url = driver.getCurrentUrl();
		System.out.println("page title: "+url);
		
		if(url.contains("https://www.google.com")) {
			System.out.println("url: PASSED");
		}
		else {
			System.out.println("url: FAILED");
		}
		
		//close the browser: quit() and close()
		driver.close();
		
	}

}
