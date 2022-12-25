package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C://Browser drivers//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
//	1.	By id -
	
		driver.findElement(By.id("email")).sendKeys("1234");
		
		driver.findElement(By.id("pass")).sendKeys("abc");
		
	//	driver.findElement(By.id("u_0_5_6B")).click();
		
		driver.close();
		
//	2.	By Class name - 
		
	    
	    
	    
		
	}
	
}
