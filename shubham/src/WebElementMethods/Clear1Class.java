package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear1Class {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Browser drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://www.facebook.com/#");
		Thread.sleep(2000);
		
		WebElement web  = driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]"));
		
		WebElement email =driver.findElement(By.id("email"));
		WebElement pass=driver.findElement(By.id("pass"));
	
		
		email.sendKeys("shubham");
		email.clear();
		
		pass.sendKeys("1233");
		Thread.sleep(2000);
		driver.findElement(By.className("_9lsa")).click();
		Thread.sleep(2000);
		pass.clear();
	
		//web.click();
		
		
	
	}

}
