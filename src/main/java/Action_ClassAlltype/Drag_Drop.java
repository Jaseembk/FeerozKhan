package Action_ClassAlltype;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {
	
	public static void main (String[] args) throws InterruptedException  {
		
		
		  WebDriver driver =new ChromeDriver();
	        driver.get("https://the-internet.herokuapp.com");
	        
	        driver.manage().window().maximize();
	    
	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     
	     driver.findElement(By.xpath("//a[normalize-space()='Drag and Drop']")).click();
	     Thread.sleep(5000);
	     WebElement src = driver.findElement(By.xpath("//div[@id='column-a']"));
	     WebElement dtn = driver.findElement(By.xpath("//div[@id='column-b']"));
	     
	     Actions act = new Actions(driver);
	     act.dragAndDrop(src,dtn).perform();
	   //  act.doubleClick(dtn).perform();
		
	}  
	

}
