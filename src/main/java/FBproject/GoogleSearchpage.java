package FBproject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearchpage {
		 
		WebDriver driver;
		 
		public GoogleSearchpage (WebDriver driver) {
			
			PageFactory.initElements(driver, this);
		 
	
		 
		}
		 
	//	Suresh SDET A
		 
	private	By searchbox = By.xpath("//textarea[@title='Search']"); 
		 
	private	By Search_btn = By.xpath("//div[@class='lJ9FBc']/descendant::input[@class='gNO89b']"); 

	
		 
	private	By Facebook_link = By.xpath("//h3[text()='Facebook - log in or sign up']");
		 
		public void searchgoogle (String Searchinput) {
		 
		// TODO Auto-generated method stub
		 
		try {
		 
		driver.findElement(searchbox).sendKeys (Searchinput);
		 
		driver.findElement(Search_btn).click();
		 
		} catch (Exception e) {
		 
		System.out.println("Exceptions Caught" + e.getMessage());
		 
		}
		 
		}
	
		 
		public void ClickFacebook(){
		try {
		 
		driver.findElement (Facebook_link).click();
		 
		Thread.sleep(2000);
		 
		} catch (Exception e) {
		 
		// TODO: handle exception
		 
		System.out.println("Exceptions Caught" + e.getMessage());
		 
		}
		 
		}

}
