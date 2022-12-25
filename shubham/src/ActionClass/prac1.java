package ActionClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class prac1 {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\\\Browser drivers\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  
		
		driver.manage().window().maximize();
		
		driver.get("https://www.demo.guru99.com/test/simple_context_menu.html");
		
		Thread.sleep(3000);
		
		WebElement rc =	driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
	
		rc.click();
		
		Actions action =new Actions(driver);
		
		action.contextClick(rc).build().perform();
		
	    driver.findElement(By.xpath("//span[contains(text(),'Quit')]")).click();
	       
	      System.out.println( driver.switchTo().alert().getText());
	      
	      driver.switchTo().alert().accept();
	      
	      Thread.sleep(2000);
	      
	     WebElement Dclick = driver.findElement(By.xpath("//button[contains(text(),'Dou')]"));
	     
	     action.doubleClick(Dclick).build().perform();
	     System.out.println(driver.switchTo().alert().getText());
	     driver.switchTo().alert().accept();
	     
	     Thread.sleep(2000);
	      driver.close();
	       
		
}
}