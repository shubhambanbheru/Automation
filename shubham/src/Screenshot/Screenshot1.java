package Screenshot;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot1 {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Browser drivers\\\\chromedriver.exe");
		
		WebDriver web = new ChromeDriver();
		
		web.manage().window().maximize();
		
		web.get("https://www.google.com/search?q=what+is+downcasting+and+upcasting&sxsrf=ALiCzsaz986PPm6quj0c3Gn0aP3QzIYN_g:1666503202304&source=lnms&tbm=isch&sa=X&ved=2ahUKEwj6n4-b0PX6AhXVcGwGHUO-AdkQ_AUoAXoECAIQAw&biw=1280&bih=577&dpr=1.5#imgrc=J8MJO0S3IydIaM");
		
		Thread.sleep(2000);
		
		File src =((TakesScreenshot)web).getScreenshotAs(OutputType.FILE);
		
		System.out.println(src);
		File dest =new File("H:\\\\9th July Software Testing Class\\\\Automation Testing\\\\Screenshots\\\\Sample1.jpg");
	
		FileHandler.copy(src, dest);
		web.close();
		
	}

}
