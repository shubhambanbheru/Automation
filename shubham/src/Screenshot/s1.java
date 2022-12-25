package Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class s1 {

	public static void main(String[] args) throws InterruptedException, IOException {

System.setProperty("webdriver.chrome.driver", "C:\\\\Browser drivers\\\\chromedriver.exe");
		
		WebDriver web = new ChromeDriver();
		
		web.manage().window().maximize();
		
web.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	

WebElement image = web.findElement(By.xpath("//div[@class=\"orangehrm-login-branding\"]"));

//image.click();
		Thread.sleep(7000);

		File src =((TakesScreenshot)image).getScreenshotAs(OutputType.FILE);
		
		File dest =new File("C:\\Users\\shubh\\OneDrive\\Desktop\\logo.jpg");
		
	org.openqa.selenium.io.FileHandler.copy(src, dest);
	
		web.close();
	}

}
