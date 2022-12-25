package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {
		
		public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Browser drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://www.youtube.com/");

		Thread.sleep(2000);
		
		driver.navigate().to("https://www.youtube.com/watch?v=WjAPDofGg28&list=RDWjAPDofGg28&start_radio=1&ab_channel=SonyMusicIndia");

		Thread.sleep(2000);
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.close();



	}

}
