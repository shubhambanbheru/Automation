package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2 {

			public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "C:\\Browser drivers\\chromedriver.exe");
					
				    WebDriver driver = new ChromeDriver();
				    
				    driver.manage().window().maximize();
				    
				    driver.get("https://www.instagram.com/accounts/emailsignup/");
				    Thread.sleep(2000);
				   driver.findElement(By.xpath("//input[@name=\"emailOrPhone\"]")).sendKeys("9049367649");
				   
				   
	}
}
