package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot2 {

	public static void main(String[] args) throws InterruptedException, IOException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Browser drivers\\chromedriver.exe");
			
				
				WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
			
				driver.get("https://www.redbus.in/");
				
			    Thread.sleep(5000);
			    
			 File source =   ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 
			String random =RandomString.make(3);
			 
			 String file ="fb";
			    
			 File dest = new File("H:\\9th July Software Testing Class\\Automation Testing\\Screenshots\\"+""+file+" "+random+".jpg");
			 
			 FileHandler.copy(source, dest);
			 
			 driver.close();
			    
}
}