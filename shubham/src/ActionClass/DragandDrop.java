package ActionClass;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class DragandDrop {

		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\\\Browser drivers\\\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();  
			
			driver.manage().window().maximize();
			
			driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
			
			Thread.sleep(3000);
			
			Actions action =new Actions(driver);
			
			WebElement Source = driver.findElement(By.id("box3"));
			WebElement Dest = driver.findElement(By.id("box103"));
			
			Thread.sleep(3000);
			
			action.dragAndDrop(Source, Dest).build().perform();
			
			
		}

	}

