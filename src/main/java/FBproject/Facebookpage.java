package FBproject;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class Facebookpage {
		 
		WebDriver driver;
		 
		 
		 
	
	private	By Username = By.xpath("//input[@name='email']"); 
	private	By password = By.xpath("//input[@id='pass']");
		private By Login = By.name("login");
		
		
		public Facebookpage (WebDriver driver) {
			 
			PageFactory.initElements(driver, this);	
				 
				}
				 
		 
		public void EnterUsername() {
		 
		driver.findElement(Username).sendKeys("Testuser");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Login)));
		 
		}
		 
		public void EnterPassword() {
		 
		driver.findElement(password).sendKeys("Tester123");
		 
		}
		 
		public void VerifyLogin() {
		 
		driver.findElement(Login).click(); 
		
		String title = driver.getTitle(); 
		SoftAssert ass = new SoftAssert();
		
		ass.assertEquals(title, "Login page");
		 
		}
		 
		}
		 


