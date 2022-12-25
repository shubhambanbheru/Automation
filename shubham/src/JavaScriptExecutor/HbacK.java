package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.javac.main.Arguments;

public class HbacK {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Browser drivers\\\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();  
			
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com/");
					
//		JavascriptExecutor js=(JavascriptExecutor) driver;
//		
//		js.executeScript("arguments[0].style.background='brown'", line);
	
	WebElement logo =	driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
	WebElement line =	driver.findElement(By.id("reg_pages_msg"));
	WebElement line1 =driver.findElement(By.xpath("//h2[@class=\"_8eso\"]"));
	
	Thread.sleep(2000);
	
	border(logo, driver);
	border(line, driver);
	border(line1, driver);

	Thread.sleep(2000);
	
	backg(logo, driver);
	backg(line, driver);
	backg(line1, driver);
	
	Thread.sleep(2000);

		
			
	}
	
	public static void border(WebElement element ,WebDriver driver) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	
	
	}
	public static void backg(WebElement element ,WebDriver driver) {
		
		JavascriptExecutor js1 =(JavascriptExecutor) driver;
		
		js1.executeScript("arguments[0].style.background='yellow'",element);
	}
}
