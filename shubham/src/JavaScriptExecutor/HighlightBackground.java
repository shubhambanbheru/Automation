package JavaScriptExecutor;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class HighlightBackground {

		public static void main(String[] args) throws InterruptedException {

			 System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();  
				
				driver.manage().window().maximize();
				
				driver.get("https://www.facebook.com/");
				
		    	WebElement Name=driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
			    WebElement Login  = driver.findElement(By.xpath("//button[@name=\"login\"]"));
			    WebElement LPassword=driver.findElement(By.id("passContainer"));
			    Thread.sleep(3000);
			   
			   Highlight(Name, driver);
			   Highlight(Login, driver);
			   Highlight(LPassword, driver);
			   		   	
		}
		
		public static void Highlight(WebElement element, WebDriver text) {
			
			JavascriptExecutor Js = (JavascriptExecutor) text;
			   
			Js.executeScript("arguments[0].style.background ='red'", element);
			
			
		}
	
}
