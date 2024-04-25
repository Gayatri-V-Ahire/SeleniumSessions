package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationGetTextValue {
    static WebDriver driver;
	public static void main(String[] args) {
    
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		driver.findElement(By.id("input-firstname")).sendKeys("Gayatri");
		String fn = driver.findElement(By.id("input-firstname")).getAttribute("value");
		System.out.println(fn);
		
		driver.findElement(By.id("input-lastname")).sendKeys("Ahire");
		String ln = driver.findElement(By.id("input-lastname")).getAttribute("value");
		System.out.println(ln);
		
		driver.findElement(By.id("input-email")).sendKeys("gayatriahire21@gmail.com");
		String email = driver.findElement(By.id("input-email")).getAttribute("value");
		System.out.println(email);
		
		driver.findElement(By.id("input-telephone")).sendKeys("7255912");
		String Telephone = driver.findElement(By.id("input-telephone")).getAttribute("value");
		System.out.println(Telephone);
		
		driver.findElement(By.id("input-password")).sendKeys("Testg@21");
		String pwd = driver.findElement(By.id("input-password")).getAttribute("value");
		System.out.println(pwd);
		
		driver.findElement(By.id("input-confirm")).sendKeys("Testg@21");
		String cpwd = driver.findElement(By.id("input-confirm")).getAttribute("value");
		System.out.println(cpwd);
		
	}

}
