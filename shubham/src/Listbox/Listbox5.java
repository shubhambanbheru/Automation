package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox5 {

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
		
//		Listbox(day,"10");
//		Listbox(month, "10");
//		Listbox(year,"1976");
		
		String DOB ="12-10-1999";
		
		String date[]=DOB.split("-");
		
		//0-12    ;   1-10    ;   2-1999
		dropdown(day,date[0]);
		dropdown(month,date[1]);
		dropdown(year,date[2]);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type=\"radio\" and @value=\"2\"]")).click();
	Thread.sleep(2000);

	}

//	public static void Listbox(WebElement Text ,String string) {
//		Select s1 =new Select(Text);
//		s1.selectByValue(string);
//	}
	
	public static void dropdown(WebElement list,String value) {
		Select s2 =new Select(list);
		s2.selectByValue(value);
		
	}
}
