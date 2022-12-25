package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign3 {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\\\Browser drivers\\\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
		driver.manage().window().maximize();
			
	driver.get("https://demoqa.com/frames");	
	
	Thread.sleep(2000);
	
	driver.switchTo().frame("frame1");
	
		
String Text =	driver.findElement(By.xpath("//html//body//h1[@id=\"sampleHeading\"]")).getText();

System.out.println("Frame1 : "+Text);

Thread.sleep(2000);

driver.switchTo().frame("frame2Wrapper");

String Text1 =	driver.findElement(By.xpath("//html//body//h1[@id=\"sampleHeading\"]")).getText();

System.out.println("Frame2 : "+Text1);
driver.close();
	
	

	}
}