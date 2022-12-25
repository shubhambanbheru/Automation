package Popup;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class p5 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		ChromeOptions option =new ChromeOptions();
		
		option.addArguments("--disable-notifications");

		System.setProperty("webdriver.chrome.driver", "C:\\Browser drivers\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver(option);
		
		driver.manage().window().maximize();
	
		driver.get("https://www.hdfcbank.com/");
				
	    Thread.sleep(2000);

File source  =	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

	String random =RandomString.make(2);
	
	String file ="hdfc";
	
    File dest1 = new File("H:\\9th July Software Testing Class\\Automation Testing\\Screenshots\\"+file+random+".jpg");
	
	FileHandler.copy(source, dest1);
	
	
	}
	
}