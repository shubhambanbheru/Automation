package ActionClass;

	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class KeyBoardActions {

		@SuppressWarnings("deprecation")
		public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "C:\\\\Browser drivers\\\\chromedriver.exe");
					
					WebDriver driver = new ChromeDriver();  
					
					driver.manage().window().maximize();
					
					driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
					
					driver.get("https://www.facebook.com/");				
			
					Thread.sleep(2000);
					
					Actions act =new Actions(driver);
					
					WebElement fb = driver.findElement(By.id("email"));
					fb.sendKeys("hiebajv");
					
					Thread.sleep(2000);
					act.keyDown(Keys.CONTROL);
					
					act.keyDown(Keys.SHIFT);
					act.sendKeys("t");
					act.keyUp(Keys.CONTROL);
					
					act.keyUp(Keys.SHIFT);
//					act.keyUp("i");
					act.build().perform();
//					driver.findElement(By.xpath("//a[contains(text(),'Create a Page')]")).click();
//					Thread.sleep(4000);
//					
//					act.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys("i").build().perform();
//					
//					WebElement Input1 =driver.findElement(By.xpath("//textarea[@id=\"inputText1\"]"));
//					WebElement Input2 =driver.findElement(By.xpath("//textarea[@id=\"inputText2\"]"));
//					
//					Input1.sendKeys("This is my first java program");
//					
//					Actions Act =new Actions(driver);
//					
//					//CTRL +A
//					Act.keyDown(Keys.CONTROL);
//					Act.sendKeys("a");
//					Act.keyUp(Keys.CONTROL);
//					Act.build().perform();
//					
//					//CTRL +C;
//					
//					Act.keyDown(Keys.CONTROL);
//					Act.sendKeys("c");
//					Act.keyUp(Keys.CONTROL);
//					Act.build().perform();
//					
//					//Tab
//					Act.keyDown(Keys.TAB);
//					Act.build().perform();
//					
//					//CTRL + V
//					Act.keyDown(Keys.CONTROL);
//					Act.sendKeys("v");
//					Act.keyUp(Keys.CONTROL);
//					Act.build().perform();
//					
					
					 
					
					
					
		}

	
}
