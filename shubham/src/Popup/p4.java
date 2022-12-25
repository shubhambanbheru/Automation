package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p4 {

	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Browser drivers\\chromedriver.exe");
	
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();

	driver.get("https://the-internet.herokuapp.com/upload");
	
    Thread.sleep(2000);
    
    driver.findElement(By.id("file-upload")).sendKeys("H:\\9th July Software Testing Class\\Automation Testing\\Screenshots\\LogoPp.jpg");

    Thread.sleep(2000);
    
    driver.findElement(By.id("file-submit")).click();
    
    driver.close();
    }
}