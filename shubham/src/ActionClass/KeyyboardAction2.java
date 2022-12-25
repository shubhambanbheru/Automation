package ActionClass;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class KeyyboardAction2 {

		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\\\Browser drivers\\\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();  
				
				driver.manage().window().maximize();
				
				driver.get("https://www.facebook.com/?");				
		
				Thread.sleep(3000);
				
				
				driver.findElement(By.xpath("//a[contains(text(),'Create a Page')]")).click();
				Actions act =new Actions(driver);
				
				act.sendKeys(Keys.BACK_SPACE).build().perform();
				Thread.sleep(2000);
//				System.out.println(driver.findElement(By.id("result")).getText());
//				
//				act.sendKeys(Keys.ESCAPE).build().perform();
//				Thread.sleep(2000);
//				System.out.println(driver.findElement(By.id("result")).getText());

		}

	
}
