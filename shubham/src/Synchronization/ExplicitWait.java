package Synchronization;

	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class ExplicitWait {

		public static void main(String[] args) {

			

			System.setProperty("webdriver.chrome.driver", "C:\\\\Browser drivers\\\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			//Implicit wait always applied globally and it's available for all web element on the web page
			
			driver.manage().window().maximize();
			
			driver.get("https://www.redbus.in/");
			
			WebElement Src =driver.findElement(By.xpath("//input[@id=\"src\"]"));

			WebElement dest =driver.findElement(By.xpath("//input[@id=\"dest\"]"));


//			new WebDriverWait(driver, Duration.ofSeconds(20)).
//			until(ExpectedConditions.elementToBeClickable(Src))
//			.sendKeys("Pune");
//			
//		//	new WebDriverWait(driver,Duration.ti).until(ExpectedConditions.visibilityOf(Src)).sendKeys("mumbai");
//			
//			new WebDriverWait(driver, Duration.ofSeconds(20)).
//			until(ExpectedConditions.elementToBeClickable(dest))
//			.sendKeys("Mumbai");
//			
			Redbuswait(driver, Src,null, "Pune");
			Redbuswait(driver, dest,null, "Mumbai");
		}

		public static void Redbuswait(WebDriver driver, WebElement element,Duration timeout, String Value) {
			
			new WebDriverWait(driver, timeout).
			until(ExpectedConditions.elementToBeClickable(element))
			.sendKeys(Value);
		}
		
	
}
