package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox2 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Browser drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://www.facebook.com/#");
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		
		Thread.sleep(2000);
		
		WebElement day =driver.findElement(By.id("day"));
		
		WebElement month =driver.findElement(By.id("month"));
		WebElement year =driver.findElement(By.id("year"));
		
		//Select by Visible Text -
		
//		Select s1 =new Select(day);
//		s1.selectByVisibleText("12");
//		
//		Select s2 =new Select(month);
//		s2.selectByVisibleText("Oct");
//		
//		Select s3 =new Select (year);
//		s3.selectByVisibleText("1999");
		
		//Select by Index -
//		
//		Select s4 =new Select(day);
//		s4.selectByIndex(10);
//		
//		Select s5 =new Select(month);
//		s5.selectByIndex(10);
//		
//		Select s6 =new Select(year);
//		s6.selectByIndex(10);
//		
		//Select by value -
		
		Select s7 =new Select(day);
		s7.selectByValue("26");
		
		Select s8 =new Select(month);
		s8.selectByValue("10");
		
		Select s9 =new Select(year);
		s9.selectByValue("1999");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.close();
	}

}
