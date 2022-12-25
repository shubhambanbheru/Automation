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

public class Screenshot4 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Browser drivers\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	
		driver.get("https://cetcell.mahacet.org/");
		
	    Thread.sleep(2000);
	
	    WebElement Logo =driver.findElement(By.xpath("//div[@class=\"col-md-6 intro-message text-center\"]"));
	    
//	    System.out.println(Logo.getText());
	    
	    File source =((TakesScreenshot)Logo).getScreenshotAs(OutputType.FILE);
	    
	  String random =  RandomString.make(3);
	
	String file=  "Logo";
	
		File dest =new File("H:\\\\9th July Software Testing Class\\\\Automation Testing\\\\Screenshots\\\\"+file+random+".png");
	
		FileHandler.copy(source, dest);
		
		driver.quit();
	
	}
}
