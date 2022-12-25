package Assignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign5 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Browser drivers\\\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
			driver.manage().window().maximize();
				
		driver.get("https://the-internet.herokuapp.com/windows");	
				
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		
		Thread.sleep(2000);

	Set<String> WinID =	driver.getWindowHandles();
	
	Iterator<String> it =WinID.iterator();
	
	String pw =it.next();
	
	String cw =it.next();
	
	System.out.println("Parent WIndow :"+pw);
	
	System.out.println("Child WIndow :"+cw);
	
	driver.switchTo().window(cw);
	
	Thread.sleep(2000);
	
	System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText());
	
	driver.switchTo().window(pw);
	
	Thread.sleep(2000);
	
	System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'Opening a new window')]")).getText());
	
	
	driver.quit();

		
	}
}