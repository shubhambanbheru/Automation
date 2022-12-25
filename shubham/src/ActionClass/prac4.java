package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class prac4 {


	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\\\Browser drivers\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://text-compare.com/");
		
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		act.keyDown(Keys.LEFT_CONTROL);
		
		act.keyDown(Keys.LEFT_SHIFT);
		act.sendKeys("c");
//		act.keyUp(Keys.CONTROL);
//		
//		act.keyUp(Keys.SHIFT);
//		act.keyUp("i");
		act.build().perform();
		

//		driver.findElement(By.id("inputText1")).sendKeys("You entered: BACK_SPACE");
//		
//		driver.findElement(By.id("inputText2"));
		
		
		
//		//Ctrl+A
//		
//		action.keyDown(Keys.CONTROL);
//		action.sendKeys("a");
//		action.keyUp(Keys.CONTROL);
//		action.build().perform();
//		
//		
//
//		//Ctrl+c
//		
//		action.keyDown(Keys.CONTROL);
//		action.sendKeys("c");
//		action.keyUp(Keys.CONTROL);
//		action.build().perform();
//		

//		action.keyDown(Keys.BACK_SPACE).build().perform();
		
		
//		//Tab
//		
//		action.keyDown(Keys.TAB);
//		action.build().perform();
//
//		
//		
//
//		//ctrl+v
//		
//		action.keyDown(Keys.CONTROL);
//		action.sendKeys("v");
//		action.keyUp(Keys.CONTROL);
//		action.build().perform();
//
//		
//		
//		//	action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
//		
	
//		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
//		
//		action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
//		
//		action.keyDown(Keys.TAB).build().perform();
//		
//		action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();

		

		
		
		
	
	
	
	
	}
	
}