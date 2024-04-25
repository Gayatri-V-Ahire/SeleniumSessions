package testngsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTest {
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@Test
	public void titleTest() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	@Test 
	public void imgTest() {
		boolean flag= driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
		System.out.println(flag);
	}
	
	@Test
	public void urlTest() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
	} 
    
	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
