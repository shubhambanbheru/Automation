package Framework;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Example_Without_DDF {

		@SuppressWarnings("deprecation")
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\\\Browser drivers\\\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();  
			
			driver.manage().window().maximize();
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			//Enter Username
			
			driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
			Thread.sleep(2000);
			//Enter password
			driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
			Thread.sleep(2000);
			//Click on login button
			driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
			Thread.sleep(2000);
			String ExpectedUsername = "Paul Collin";
			
			String ActualUsername =driver.findElement(By.xpath("//p[@class=\"oxd-userdropdown-name\"]")).getText();
			Thread.sleep(2000);
	        if(ExpectedUsername.equals(ActualUsername)) {
	        	System.out.println("Correct username");
	        }
	        else {
	        	System.out.println("Incorrect username");
	        }
	        
	        driver.quit();
		}

	
}
