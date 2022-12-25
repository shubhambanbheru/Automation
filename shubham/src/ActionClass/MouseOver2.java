package ActionClass;

	import java.util.List;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class MouseOver2 {

		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\\\Browser drivers\\\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();  
				
				driver.manage().window().maximize();
				
				driver.get("http://mrbool.com/");
				
				Thread.sleep(3000);
				
				List<WebElement> Con =driver.findElements(By.xpath("//a[@class=\"menulink\"]"));
							
				Actions action = new Actions(driver);
				action.moveToElement((WebElement) Con).build().perform();
				
			   WebElement Art=	driver.findElement(By.xpath("//a[contains(text(),'Articles')]"));
			   String Text = Art.getText();
			   System.out.println(Text);
		}

	
	
}
