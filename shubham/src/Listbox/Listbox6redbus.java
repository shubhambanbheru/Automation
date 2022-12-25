package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listbox6redbus {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Browser drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//input[@id=\"src\"]")).sendKeys("Pune");
	//	driver.findElement(By.id("src")).sendKeys("Pune");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//li[contains(text(),'Swargate, Pune')]")).click();
		
		driver.findElement(By.id("dest")).sendKeys("Mumbai");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//li[contains(text(),'Borivali East, Mumbai')]")).click();

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//td[@class=\"next\"]")).click();
		
		driver.findElement(By.xpath("//td[@class=\"wd day\" and contains(text(),'4')]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id=\"search_btn\"]")).click();

		
		
		
		Thread.sleep(2000);
		
		
//		
//		WebElement day =driver.findElement(By.id("day"));
//		
//		WebElement month =driver.findElement(By.id("month"));
//		WebElement year =driver.findElement(By.id("year"));
		
		driver.close();
	}
	
	

}
