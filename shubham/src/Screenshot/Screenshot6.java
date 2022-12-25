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

public class Screenshot6 {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Browser drivers\\chromedriver.exe");
		
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	
		driver.get("https://www.cricbuzz.com/");
		
	    Thread.sleep(2000);
	    
	    
	    
	TS("1");
	TS("2");
	TS("3");
	driver.quit();
	
	}
	public static void TS(String filename) throws IOException {
		
		WebElement Screen =driver.findElement(By.id("cb-qck-navbar"));
		
		File source =((TakesScreenshot)Screen).getScreenshotAs(OutputType.FILE);
	
		System.out.println("Text :" +"  "+Screen.getText());
	String random =	RandomString.make(3);
	
	String file ="Cricbuzz";
	
	File dest =new File("H:\\\\\\\\9th July Software Testing Class\\\\\\\\Automation Testing\\\\\\\\Screenshots\\\\\\\\"+file+random+".jpg");
	
	FileHandler.copy(source, dest);
	

	
	}
	
}
