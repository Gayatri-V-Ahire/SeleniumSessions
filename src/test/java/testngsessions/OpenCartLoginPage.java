package testngsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenCartLoginPage {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void searchTest() {
		boolean search = driver.findElement(By.name("search")).isDisplayed();
		System.out.println(search);
	}
    
	@Test
	public void loginIsPresentTest() {
		boolean loginDrp = driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Login']")).isDisplayed();
		System.out.println(loginDrp);
	}
	
	@Test
	public void registerTest() {
		boolean register = driver.findElement(By.linkText("Register")).isDisplayed();
		System.out.println(register);
	}
}
