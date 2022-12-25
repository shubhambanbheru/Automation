package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox11 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Browser drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
				
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		
		WebElement year =driver.findElement(By.id("yearbox"));
		
	WebElement month =driver.findElement(By.id("monthbox"));
		
	WebElement day =driver.findElement(By.id("daybox"));
	
	String DOB ="12-October-1999";
		String date[]=DOB.split("-");
		list(day,date[0]);
		
		list(month,date[1]);
	
		list(year,date[2]);
		Thread.sleep(2000);
		driver.close();
	}
	
	public static void list(WebElement Text,String value) {
		Select s1 =new Select(Text);
		s1.selectByValue(value);
	}
}
