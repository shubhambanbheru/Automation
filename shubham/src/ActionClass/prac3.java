package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class prac3 {


	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\\\Browser drivers\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/key_presses?");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("target")).sendKeys("s");
		System.out.println(driver.findElement(By.id("result")).getText());
	
		Thread.sleep(2000);
		
		Actions action = new Actions(driver);
		
		action.keyDown(Keys.BACK_SPACE).build().perform();
		
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("result")).getText());
		
}
}