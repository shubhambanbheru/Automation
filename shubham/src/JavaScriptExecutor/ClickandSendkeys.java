package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickandSendkeys {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Browser drivers\\\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();  
			
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com/");
	
		WebElement username =	driver.findElement(By.id("email"));
		
		
	
		WebElement pass =	driver.findElement(By.id("pass"));
		
		WebElement click =driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
//		js.executeScript("arguments[0].value='shubham'", username);
//		
//		js.executeScript("arguments[0].value='S@123'", pass);
		
	js.executeScript("document.getElementById('email').value='Shubham';");
	
	js.executeScript("document.getElementById('pass').value='S@123';");
		Thread.sleep(4000);
		
		js.executeScript("arguments[0].click()", click);

	
	
	}
}
