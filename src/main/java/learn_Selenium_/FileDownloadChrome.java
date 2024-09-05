package learn_Selenium_;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileDownloadChrome {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        String downloadPath = "D:\\downloadFILe";
        options.addArguments("download.default_directory=" + downloadPath);
        options.addArguments("download.prompt_for_download=false");
        options.addArguments("safebrowsing.enabled=true");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://demo.automationtesting.in/FileDownload.html");

        WebElement xyz =driver.findElement(By.xpath("//a[@type='button']"));
        
       xyz.click();
    }
}
