package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox7 {

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
		
		Select s1=new Select(day);
		
		List<WebElement>listday =s1.getOptions();
		
		System.out.println("total days= "+ listday.size());
		
		for(WebElement str1:listday) {
			//System.out.println(str1.getText());
			
			String days =str1.getText();
			System.out.println(days);
		}
		
		
		
		System.out.println("==================================================");
		
		Select s2 =new Select(month);
	List<WebElement> listmonth =s2.getOptions();
	
	System.out.println("total months ="+ listmonth.size());
	
	//By using FOr each loop -
	
	for(WebElement str :listmonth) {
		System.out.println(str.getText());
	}
	
	driver.close();
	
	
	
	}

}
