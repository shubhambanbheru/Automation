package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo5 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Browser drivers\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.google.co.in/");
	    
	    Thread.sleep(2000);
	  //  driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys("hi");
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//input[@data-ved=\"0ahUKEwiI-IC5vbH6AhXiELcAHYh8B7AQ4dUDCAc\"]")).click();
	}

}
