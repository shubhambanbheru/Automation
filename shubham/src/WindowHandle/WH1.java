package WindowHandle;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WH1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Browser drivers\\\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
			driver.manage().window().maximize();
				
		driver.get("https://cetcell.mahacet.org/");	
				
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//i[@class=\"fa fa-facebook\"]")).click();
		
		Thread.sleep(5000);
		
		Set<String> winid =driver.getWindowHandles();

		Iterator<String> it =winid.iterator();
		
	String pw =	it.next();
	
	String cw=it.next();
	
	System.out.println(pw);
	
	System.out.println(cw);
//	
//	driver.switchTo().window(cw);
//	
//WebElement Logo =driver.findElement(By.xpath("//div[@class=\"x15sbx0n x1xy773u x390vds xb2vh1x x14xzxk9 x18u1y24 xs6kywh x5wy4b0\"]"));
//
//	File src =((TakesScreenshot)Logo).getScreenshotAs(OutputType.FILE);
//	
//	File dest =new File("H:\\\\9th July Software Testing Class\\\\Automation Testing\\\\Screenshots\\\\sample3.png");
//	
//	org.openqa.selenium.io.FileHandler.copy(src, dest);
//	
//	Thread.sleep(2000);
	
//	System.out.println("Text :"+Logo.getText());
	
	driver.switchTo().window(pw);
	
	Thread.sleep(2000);
	
	WebElement Logo1 =driver.findElement(By.xpath("//div[@class=\"col-md-6 intro-message text-center\"]"));
	
	File src1 =((TakesScreenshot)Logo1).getScreenshotAs(OutputType.FILE);
	
	File dest1 =new File("H:\\\\\\\\9th July Software Testing Class\\\\\\\\Automation Testing\\\\\\\\Screenshots\\\\\\\\sample4.png");
	
	org.openqa.selenium.io.FileHandler.copy(src1, dest1);
	Thread.sleep(2000);
	


	for( String ID : winid ) {
		
	String Title =	driver.switchTo().window(ID).getTitle();
	
	System.out.println(Title);
		
if(Title.equals("Welcome to State Common Entrance Test Cell Maharashtra State Official Portal") || Title.equals("STATE CET CELL Mumbai | Facebook"
			+ "")) {
		
		System.out.println("Title Correct");
		
			}
	
//	else {
//		System.out.println("Title Incorrect");
//	}
//	
//	
	
	
	}
	
	
	driver.quit();
	
	
		
		
}
}