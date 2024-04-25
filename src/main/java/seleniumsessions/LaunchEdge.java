package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdge {

	public static void main(String[] args) {
    
		WebDriver driver = new EdgeDriver();
		driver.get("https:www.facebook.com");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Facebook – log in or sign up")){
			System.out.println("title is correct");
		}
		else
		{
			System.out.println("title is not correct");
		}
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		if(url.contains("https://www.facebook.com/")){
				System.out.println("url is correct");

	}
		else {
			System.out.println("url is not correct");

		}
	}
}
