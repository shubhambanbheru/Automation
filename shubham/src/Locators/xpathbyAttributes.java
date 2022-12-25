package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbyAttributes {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Browser drivers\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	  	driver.get("https://www.facebook.com/");
	  	
	  	driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("hi");
	  	
	  	driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys("bye");
	  	
	  	Thread.sleep(2000);
	  	
	  	
	  	driver.findElement(By.xpath("//div[@class=\"_9lsb _9ls8\"]")).click();
	  	
	  	Thread.sleep(2000);
	    
	  	driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
	//    driver.get("https://www.amazon.in/");
	    
	 //   driver.findElement(By.xpath("//a[@href=\"/gp/buyagain?ie=UTF8&ref_=nav_cs_buy_again\"]")).click();

	   // driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("mi 11 5g");
	    
	    Thread.sleep(2000);
	    
	 //   driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	    
	
	    driver.close();
	
	}

}
