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

public class Screenshot7 {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Browser drivers\\chromedriver.exe");
	
	
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();

	driver.get("https://poi.apache.org/download.html");
	
    Thread.sleep(5000);
    
    ss("1");
  
    ss("2");
    
    driver.close();
}
	public static void ss(String s) throws IOException {
		
	WebElement screen= 	driver.findElement(By.xpath("//div[@class=\"projectlogo\"]"));
	
	System.out.println(screen.getText());
	
	File source =((TakesScreenshot)screen).getScreenshotAs(OutputType.FILE);
	
	String random =	RandomString.make(2);
	String file ="Logo";
	
    File dest1 = new File("H:\\9th July Software Testing Class\\Automation Testing\\Screenshots\\"+file+random+".jpg");
    
    FileHandler.copy(source, dest1);
    
  

	
	}
}