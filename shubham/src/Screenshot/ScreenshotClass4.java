package Screenshot;
	
	import java.io.File;
	import java.io.IOException;

	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.io.FileHandler;

	import net.bytebuddy.utility.RandomString;

	public class ScreenshotClass4 {

		public static void main(String[] args) throws InterruptedException, IOException {


			System.setProperty("webdriver.chrome.driver", "C:\\Browser drivers\\chromedriver.exe");
				
				//	System.setProperty("webdriver.chrome.driver", "chromedriver");
					
					WebDriver driver = new ChromeDriver();
					
					driver.manage().window().maximize();
				
					driver.get("https://www.facebook.com/");
								
					Thread.sleep(3000);
	 
			        WebElement Screen = driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
					
					File Source=((TakesScreenshot)Screen).getScreenshotAs(OutputType.FILE);
									
					String random = RandomString.make(5);
					
					String file  = "Facebook";

			  		File dest =new File("H:\\\\9th July Software Testing Class\\\\Automation Testing\\\\Screenshots\\\\"+file+random+".png");
					
					FileHandler.copy(Source,dest);
									
					driver.quit();

								
		}

	

}
