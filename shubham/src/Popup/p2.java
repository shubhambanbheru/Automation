package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Browser drivers\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
	    Thread.sleep(2000);
	    
	WebElement rr =    driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]"));
	
	 rr.click();
	 
	 Thread.sleep(2000);
	 
	 driver.switchTo().alert().dismiss();

	 WebElement result =driver.findElement(By.id("result"));
	String Expected ="You clicked: Cancel";
	
	if(result.getText().equals(Expected)) {
		System.out.println(rr.getText());
		
	}
	   driver.close();
	    
	    
	    
}
}
