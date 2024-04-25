package testngsessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenCartTest {

	//priority start from -1,0,1
	//priority for duplicate (1,1)--> follow alphabetically  
	//if priority is not mentioned means default 0 
	//before annotations:
	
	//1
	@BeforeSuite
	public void dbConnection() {
		System.out.println("BS--DB connection");
	}
	
	//2
	@BeforeTest
	public void createUser() {
		System.out.println("BT--create user");
	}
	
	//3
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC--launch Browser");
	}
	
	//4,7,10
	@BeforeMethod
	public void login() {
		System.out.println("BM--login to app");
	}
	
	//5
	@Test
	public void titleTest() {
		System.out.println("title test");
	}
	
	//8
	@Test 
	public void headerTest() {
		System.out.println("header test");
	}
	
	//11
	@Test
	public void urlTest() {
		System.out.println("url test");
	}
	
	//after annotations:
	//6,9,12
	@AfterMethod
	public void logout() {
		System.out.println("logout");
	}
	
	//13
	@AfterClass
	public void closeBrowser() {
		System.out.println("closeBrowser");
	}
	
	//14
	@AfterTest
	public void deleteUser() {
		System.out.println("user is deleted");
	}
	
	//15
	@AfterSuite
	public void disconnectWithDB() {
		System.out.println();
	}
	
	
	
}
