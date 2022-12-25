package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot5 {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Browser drivers\\chromedriver.exe");
	
	
	 driver = new ChromeDriver();
	
	driver.manage().window().maximize();

	driver.get("https://www.redbus.in/");
	
    Thread.sleep(2000);
    
    TakeScreenshot("fb");
    TakeScreenshot("fb1");
    TakeScreenshot("fb2");
    
    
    
	driver.quit();

    
    
    
}
	public static void TakeScreenshot(String filename) throws IOException {
		
		File source=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String random=RandomString.make(3);
	
		String file ="demo";
		
		File dest =new File("H:\\\\\\\\9th July Software Testing Class\\\\\\\\Automation Testing\\\\\\\\Screenshots\\\\\\\\"+file+random+".jpg");
	
		FileHandler.copy(source, dest);

	}
	
	
}