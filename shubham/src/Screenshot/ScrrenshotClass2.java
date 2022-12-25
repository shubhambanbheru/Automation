package Screenshot;


	import java.io.File;
	import java.io.IOException;

	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.io.FileHandler;

	import net.bytebuddy.utility.RandomString;

	public class ScrrenshotClass2 {

	
		public static void main(String[] args) throws InterruptedException, IOException {
			
			

			System.setProperty("webdriver.chrome.driver", "C:\\Browser drivers\\chromedriver.exe");
				
				//	System.setProperty("webdriver.chrome.driver", "chromedriver");
					
					WebDriver driver = new ChromeDriver();
					
					driver.manage().window().maximize();
				
					driver.get("https://kite.zerodha.com/");

					Thread.sleep(3000);
					
					 File Src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					 
					String Random= RandomString.make(10);
					
					String File = "Kite";
					 
					 File Des =new File("/Users/ranjeetkendre/Desktop/9July/"+File+""+Random+".jpg");
					 
					 FileHandler.copy(Src, Des);
					 
					 driver.quit();
		}

	}

