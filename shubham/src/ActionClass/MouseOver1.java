package ActionClass;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class MouseOver1 {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\\\Browser drivers\\\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();  
				
				driver.manage().window().maximize();
				
				driver.get("https://www.flipkart.com/");
				
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
				
				Actions action = new Actions(driver);
				
				WebElement Login=driver.findElement(By.xpath("//a[@class=\"_1_3w1N\"]"));
				
				
				//driver.findElement(By.xpath(null))
				action.moveToElement(Login).build().perform();
				
		}

	
}
