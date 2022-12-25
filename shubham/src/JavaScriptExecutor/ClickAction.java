package JavaScriptExecutor;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class ClickAction {

		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\\\Browser drivers\\\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();  
				
				driver.manage().window().maximize();
				
				driver.get("https://www.facebook.com/");
				
				Thread.sleep(4000);
				
				driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("QWERTY");
				
				driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("@#$%^");
				
				JavascriptExecutor Js = (JavascriptExecutor) driver;
				
				Js.executeScript("location.reload();", "");
				
				System.out.println(Js.executeScript("window.location.href", ""));
				
				Thread.sleep(2000);

				WebElement Click =driver.findElement(By.xpath("//button[@name=\"login\"]"));
				
				Js.executeScript("arguments[0].click()", Click);
				
				
		}

	
}
