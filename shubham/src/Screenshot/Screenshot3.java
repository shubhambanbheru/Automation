package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot3 {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Browser drivers\\chromedriver.exe");
	
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();

	driver.get("https://www.redbus.in/");
	
    Thread.sleep(5000);
    
  File source =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
  
  			String file =	"redbus";
  
  		String random =	RandomString.make(3);
  
  		File dest =new File("H:\\\\9th July Software Testing Class\\\\Automation Testing\\\\Screenshots\\\\"+file+random+".png");
  		
  		File dest1 =new File("./Screenshots/"+file+random+".png");
  		
  		System.out.println(dest);
  		
  		System.out.println(dest1);
  		FileHandler.copy(source, dest);
  		
  		driver.quit();
    
    
}

}
