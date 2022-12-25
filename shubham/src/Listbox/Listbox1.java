package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listbox1 {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver","C:\\Browser drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://www.facebook.com/#");
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Shubham");
		
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Banbheru");
		
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("abcd@gmail.com");
		
		driver.findElement(By.xpath("//input[@id=\"password_step_input\"]")).sendKeys("@12345");
		
		driver.findElement(By.id("day")).click();
		
		driver.findElement(By.xpath("//option[@value=\"20\"]")).click();
		
		driver.findElement(By.id("month")).click();
		
		driver.findElement(By.xpath("//option[contains(text(),'Nov')]")).click();
		
		driver.findElement(By.id("year")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[contains(text(),'1999')]")).click();
		
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id=\"u_p_5_AI\"]")).click();
//		Thread.sleep(2000);
//		
//		String Expected ="People who use our service may have uploaded your contact information to Facebook. ";
//		String Text =driver.findElement(By.xpath("//p[contains(text(),'People who use ')]")).getText();
//		
//		System.out.println(Text.equals(Expected));
//		
		
		
		
		
		
		
		
		
		
		
		driver.close();
	}

}
