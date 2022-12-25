package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Browser drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://www.facebook.com/#");
		Thread.sleep(2000);
		
	boolean b =driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]")).isDisplayed();
	
	System.out.println(b);
	}
}
