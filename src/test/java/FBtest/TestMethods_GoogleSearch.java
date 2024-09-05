package FBtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import FBproject.Facebookpage;
import FBproject.GoogleSearchpage;

public class TestMethods_GoogleSearch {
		 
		WebDriver driver;
		 
		GoogleSearchpage objectrepo;
		 
		Facebookpage objectrepo2;
		 
		 
		@BeforeTest
		 
		public void beforetest() throws InterruptedException {
		 
		Thread.sleep(5000);
		 
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 	
	
		 
		driver.manage().window().maximize(); driver.get("https://www.google.com/");
		 
		}
		 
		@Test(priority = 0)
		 
	
		 
		public void SearchOperation() throws InterruptedException { 
			
			GoogleSearchpage page = new GoogleSearchpage (driver);
			
		page.searchgoogle("facebook");
		 
		}
		 
		//Suresh SDE
		 
		@Test(priority = 1)
		 
		
		 
		public void  Facebook() {
		 
		objectrepo= new GoogleSearchpage (driver);
		objectrepo.ClickFacebook();
		 
		}
		 
		
		 
		@Test(priority = 2)
	
		public void VerifyLoginfunctionality() throws InterruptedException {
		 
		objectrepo2 = new Facebookpage (driver);
		 
		
		objectrepo2.EnterUsername();
		 
		objectrepo2. EnterPassword();
		 
		objectrepo2.VerifyLogin();
		 
		}
		 
		@AfterTest
		 
		public void aftertest() {
		 
		//driver.quit();
		 
		}}


