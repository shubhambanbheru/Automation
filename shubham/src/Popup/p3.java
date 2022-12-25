package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Browser drivers\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
	    Thread.sleep(2000);
	    
	  driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]")).click();
	    
	   Thread.sleep(2000);
	   
	 Alert s = driver.switchTo().alert();
	 
	 System.out.println("Alertmessage :"+s.getText());
	   
	   s.sendKeys("hi");
	   
	   Thread.sleep(1000);
	   
	   s.accept();
	   
	    WebElement rr =driver.findElement(By.id("result"));

	   System.out.println(rr.getText());
	   
	}
}
