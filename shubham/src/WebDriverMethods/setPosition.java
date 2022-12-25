package WebDriverMethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setPosition {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Browser drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
	//	Thread.sleep(4000);
		
		Thread.sleep(2000);
		
		Point p1=new Point(200, 200);
		
	Thread.sleep(2000);
		
		driver.manage().window().setPosition(p1);
		
		Thread.sleep(5000);
		
		System.out.println(driver.manage().window().getPosition());
		
		driver.close();
		
		
	}

}
