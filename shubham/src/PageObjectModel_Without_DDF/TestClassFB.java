package PageObjectModel_Without_DDF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestClassFB {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--disable-notifications");
		
System.setProperty("webdriver.chrome.driver","C:\\Browser drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/#");
		
		fblogin login =new fblogin(driver);
		login.userid();
		login.pass();
		login.loginclick();
		
		homepage HP =new homepage(driver);
		HP.home();
		HP.Name();
		
		Thread.sleep(3000);
		
		
		
		
	
		driver.quit();
	}
}
