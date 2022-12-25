package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Browser drivers\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.get("https://www.instagram.com/accounts/login/");
	    
	    Thread.sleep(2000);
	  	driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("rushii99");
	  	
	  	driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("bhaisabh123");
	  	
	  
	  	
 	Thread.sleep(7000);
 	
	driver.findElement(By.xpath("//a[@class=\"_2Lks6\"]")).click();
	  	
	  	driver.findElement(By.xpath("//button[@class=\"sqdOP yWX7d     _8A5w5    \"]")).click();


  	driver.findElement(By.xpath("//button[@class=\"sqdOP  L3NKy   y3zKF     \"]")).click();
	  	
	//	driver.get("https://www.facebook.com/");
	  	Thread.sleep(1000);
	  	
	 	driver.navigate().to("https://www.facebook.com/");
	  	
	  	Thread.sleep(2000);
	  	
driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("hi");
	  	
	  	driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys("bye");
	  	
  	Thread.sleep(1000);
	  	
	  	
  	driver.findElement(By.xpath("//div[@class=\"_9lsb _9ls8\"]")).click();
  	
	  	Thread.sleep(1000);

	  	driver.findElement(By.xpath("//div[@class=\"_9lsb _9ls9\"]")).click();
	  	
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		
		Thread.sleep(1000);
	  		  	
	  	driver.navigate().back();
	  	
	  	// 	driver.findElement(By.xpath("//input[@id=\"btnSignIn\"]")).click();
	
	  	driver.quit();
	
	
	}

}
